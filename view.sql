CREATE VIEW passed_students AS
SELECT id, name, mark
FROM student
WHERE mark > 50;


CREATE VIEW student_marks AS
SELECT s.name, m.mark
FROM student s
JOIN marks m
ON s.id = m.id;

CREATE VIEW emp_view AS
SELECT empid, name, salary
FROM employee;
UPDATE emp_view
SET salary = 50000
WHERE empid = 1;