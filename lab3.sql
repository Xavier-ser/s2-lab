SELECT c.course_name, g.Grade
FROM STUDENT s
JOIN GRADE_REPORT g ON s.Student_number = g.Student_number
JOIN SECTION sec ON g.Section_identifier = sec.Section_identifier
JOIN COURSE c ON sec.Course_number = c.Course_number
WHERE s.name = 'Smith';

SELECT s.Name, g.Grade
FROM STUDENT s
JOIN GRADE_REPORT g ON s.Student_number = g.Student_number
JOIN SECTION sec ON g.Section_identifier = sec.Section_identifier
JOIN COURSE c ON sec.Course_number = c.Course_number
WHERE c.Course_name = 'Database'
  AND sec.Semester = 'Fall'
  AND sec.Year = 2008;
  
SELECT p.Prerequisite_number
FROM COURSE c
JOIN PREREQUISITE p ON c.Course_number = p.Course_number
WHERE c.Course_name = 'Database';


SELECT Name
FROM STUDENT
WHERE Major = 'CS';


SELECT DISTINCT c.Course_name
FROM COURSE c
JOIN SECTION sec ON c.Course_number = sec.Course_number
WHERE sec.Instructor = 'King'
  AND sec.Year IN (2007, 2008);
  

SELECT 
    sec.Course_number,
    sec.Semester,
    sec.Year,
    COUNT(g.Student_number) AS Student_Count
FROM SECTION sec
LEFT JOIN GRADE_REPORT g 
    ON sec.Section_identifier = g.Section_identifier
WHERE sec.Instructor = 'King'
GROUP BY 
    sec.Section_identifier,
    sec.Course_number,
    sec.Semester,
    sec.Year;
    
SELECT 
    s.Name,
    c.Course_name,
    c.Course_number,
    c.Credit_hours,
    sec.Semester,
    sec.Year,
    g.Grade
FROM STUDENT s
JOIN GRADE_REPORT g 
    ON s.Student_number = g.Student_number
JOIN SECTION sec 
    ON g.Section_identifier = sec.Section_identifier
JOIN COURSE c 
    ON sec.Course_number = c.Course_number
WHERE s.Class = 4
  AND s.Major = 'CS'
ORDER BY s.Name, sec.Year, sec.Semester;



