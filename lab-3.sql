CREATE TABLE STUDENT (
    Name VARCHAR(50),
    Student_number INT PRIMARY KEY,
    Class INT,
    Major VARCHAR(10)
);
CREATE TABLE COURSE (
    Course_name VARCHAR(100),
    Course_number VARCHAR(10) PRIMARY KEY,
    Credit_hours INT,
    Department VARCHAR(10)
);
CREATE TABLE SECTION (
    Section_identifier INT PRIMARY KEY,
    Course_number VARCHAR(10),
    Semester VARCHAR(10),
    Year INT,
    Instructor VARCHAR(50),
    FOREIGN KEY (Course_number) REFERENCES COURSE(Course_number)
);
CREATE TABLE GRADE_REPORT (
    Student_number INT,
    Section_identifier INT,
    Grade CHAR(1),
    PRIMARY KEY (Student_number, Section_identifier),
    FOREIGN KEY (Student_number) REFERENCES STUDENT(Student_number),
    FOREIGN KEY (Section_identifier) REFERENCES SECTION(Section_identifier)
);
CREATE TABLE PREREQUISITE (
    Course_number VARCHAR(10),
    Prerequisite_number VARCHAR(10),
    PRIMARY KEY (Course_number, Prerequisite_number),
    FOREIGN KEY (Course_number) REFERENCES COURSE(Course_number),
    FOREIGN KEY (Prerequisite_number) REFERENCES COURSE(Course_number)
);

INSERT INTO STUDENT VALUES
('Smith', 17, 1, 'CS'),
('Brown', 8, 2, 'CS');

INSERT INTO COURSE VALUES
('Intro to Computer Science', 'CS1310', 4, 'CS'),
('Data Structures', 'CS3320', 4, 'CS'),
('Discrete Mathematics', 'MATH2410', 3, 'MATH'),
('Database', 'CS3380', 3, 'CS');

INSERT INTO SECTION VALUES
(85, 'MATH2410', 'Fall', 2007, 'King'),
(92, 'CS1310', 'Fall', 2007, 'Anderson'),
(102, 'CS3320', 'Spring', 2008, 'Knuth'),
(112, 'MATH2410', 'Fall', 2008, 'Chang'),
(119, 'CS1310', 'Fall', 2008, 'Anderson'),
(135, 'CS3380', 'Fall', 2008, 'Stone');

INSERT INTO GRADE_REPORT VALUES
(17, 112, 'B'),
(17, 119, 'C'),
(8, 85, 'A'),
(8, 92, 'A'),
(8, 102, 'B'),
(8, 135, 'A');

INSERT INTO PREREQUISITE VALUES
('CS3380', 'CS3320'),
('CS3380', 'MATH2410'),
('CS3320', 'CS1310');

SELECT C.Course_name, G.Grade
FROM STUDENT S
JOIN GRADE_REPORT G ON S.Student_number = G.Student_number
JOIN SECTION SE ON G.Section_identifier = SE.Section_identifier
JOIN COURSE C ON SE.Course_number = C.Course_number
WHERE S.Name = 'Smith';

SELECT S.Name, G.Grade
FROM STUDENT S
JOIN GRADE_REPORT G ON S.Student_number = G.Student_number
JOIN SECTION SE ON G.Section_identifier = SE.Section_identifier
JOIN COURSE C ON SE.Course_number = C.Course_number
WHERE C.Course_name = 'Database'
AND SE.Semester = 'Fall'
AND SE.Year = 2008;

SELECT P.Prerequisite_number
FROM PREREQUISITE P
JOIN COURSE C ON P.Course_number = C.Course_number
WHERE C.Course_name = 'Database';

SELECT Name
FROM STUDENT
WHERE Class = 4 AND Major = 'CS';

SELECT DISTINCT C.Course_name
FROM COURSE C
JOIN SECTION S ON C.Course_number = S.Course_number
WHERE S.Instructor = 'King'
AND (S.Year = 2007 OR S.Year = 2008);

SELECT 
    S.Course_number,
    S.Semester,
    S.Year,
    COUNT(G.Student_number) AS Number_of_Students
FROM SECTION S
LEFT JOIN GRADE_REPORT G 
ON S.Section_identifier = G.Section_identifier
WHERE S.Instructor = 'King'
GROUP BY S.Section_identifier;

SELECT 
    ST.Name,
    C.Course_name,
    C.Course_number,
    C.Credit_hours,
    SE.Semester,
    SE.Year,
    G.Grade
FROM STUDENT ST
JOIN GRADE_REPORT G ON ST.Student_number = G.Student_number
JOIN SECTION SE ON G.Section_identifier = SE.Section_identifier
JOIN COURSE C ON SE.Course_number = C.Course_number
WHERE ST.Class = 4 AND ST.Major = 'CS';


