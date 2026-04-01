-- 1. Display all the countries
SELECT * FROM countries;

-- 2. Display email and phone number for all employees
SELECT email, phone_number FROM employees;

-- 3. Display employee whose last name is 'Fay'
SELECT * FROM employees
WHERE last_name = 'Fay';

-- 4. Find hire date for employees whose last name is 'Grant' or 'Whalen'
SELECT first_name, last_name, hire_date FROM employees WHERE last_name IN ('Grant', 'Whalen');

-- 5. Display name of employee who is Shipping Clerk
SELECT e.first_name, e.last_name FROM employees e JOIN jobs j ON e.job_id = j.job_id WHERE j.job_title = 'Shipping Clerk';

-- 6. Get all employees who work for department 8
SELECT * FROM employees WHERE department_id = 8;

-- 7. Display departments in descending order
SELECT * FROM departments ORDER BY department_name DESC;

-- 8. Display employees whose last name starts with 'K'
SELECT * FROM employees WHERE last_name LIKE 'K%';

-- 9. Display employees hired between 1995 and 1997
SELECT first_name, last_name, hire_date FROM employees WHERE hire_date BETWEEN '1995-01-01' AND '1997-12-31';

-- 10. Display jobs where maximum salary is less than 5000
SELECT * FROM jobs WHERE max_salary < 5000;

-- 11. Display email address in lower case
SELECT LOWER(email) AS email_lower FROM employees;

-- 12. Display employees hired in 1995
SELECT first_name, last_name
FROM employees WHERE EXTRACT(YEAR FROM hire_date) = 1995;

-- 13. Insert an employee "Paul Newton" in department 11
INSERT INTO employees (employee_id, first_name, last_name, email, phone_number, hire_date, job_id, salary, department_id)
VALUES (999, 'Paul', 'Newton', 'PNEWTON', '1234567890', CURRENT_DATE, 'IT_PROG', 6000, 11);

-- 14. Delete the Shipping department
DELETE FROM departments WHERE department_name = 'Shipping';