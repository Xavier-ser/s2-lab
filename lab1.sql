-- 1. REGIONS
CREATE TABLE regions (
    region_id INT PRIMARY KEY,
    region_name VARCHAR(50)
);

-- 2. COUNTRIES
CREATE TABLE countries (
    country_id VARCHAR(10) PRIMARY KEY,
    country_name VARCHAR(50),
    region_id INT,
    FOREIGN KEY (region_id)
    REFERENCES regions(region_id)
    ON DELETE CASCADE
    ON UPDATE CASCADE
);

-- 3. LOCATIONS
CREATE TABLE locations (
    location_id INT PRIMARY KEY,
    street_address VARCHAR(100),
    postal_code VARCHAR(20),
    city VARCHAR(50),
    state_province VARCHAR(50),
    country_id VARCHAR(10),
    FOREIGN KEY (country_id)
    REFERENCES countries(country_id)
    ON DELETE CASCADE
    ON UPDATE CASCADE
);

-- 4. DEPARTMENTS
CREATE TABLE departments (
    department_id INT PRIMARY KEY,
    department_name VARCHAR(50),
    location_id INT,
    FOREIGN KEY (location_id)
    REFERENCES locations(location_id)
    ON DELETE CASCADE
    ON UPDATE CASCADE
);

-- 5. JOBS
CREATE TABLE jobs (
    job_id INT PRIMARY KEY,
    job_title VARCHAR(50),
    min_salary DECIMAL(10,2),
    max_salary DECIMAL(10,2)
);

-- 6. EMPLOYEES
CREATE TABLE employees (
    employee_id INT PRIMARY KEY,
    first_name VARCHAR(50),
    last_name VARCHAR(50),
    email VARCHAR(50),
    phone_number VARCHAR(20),
    hire_date DATE,
    job_id INT,
    salary DECIMAL(10,2),
    manager_id INT,
    department_id INT,

    FOREIGN KEY (job_id)
    REFERENCES jobs(job_id)
    ON DELETE CASCADE
    ON UPDATE CASCADE,

    FOREIGN KEY (manager_id)
    REFERENCES employees(employee_id)
    ON DELETE CASCADE
    ON UPDATE CASCADE,

    FOREIGN KEY (department_id)
    REFERENCES departments(department_id)
    ON DELETE CASCADE
    ON UPDATE CASCADE
);

-- 7. DEPENDENTS
CREATE TABLE dependents (
    dependent_id INT PRIMARY KEY,
    first_name VARCHAR(50),
    last_name VARCHAR(50),
    relationship VARCHAR(50),
    employee_id INT,
    FOREIGN KEY (employee_id)
    REFERENCES employees(employee_id)
    ON DELETE CASCADE
    ON UPDATE CASCADE
);