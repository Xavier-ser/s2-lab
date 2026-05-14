CREATE OR REPLACE PROCEDURE even_odd(n NUMBER)
AS
BEGIN
    IF MOD(n,2)=0 THEN
        DBMS_OUTPUT.PUT_LINE('Even Number');
    ELSE
        DBMS_OUTPUT.PUT_LINE('Odd Number');
    END IF;
END;
/

CREATE OR REPLACE PROCEDURE grade_check(mark NUMBER)
AS
BEGIN

    IF mark >= 90 THEN
        DBMS_OUTPUT.PUT_LINE('Grade A');

    ELSIF mark >= 80 THEN
        DBMS_OUTPUT.PUT_LINE('Grade B');

    ELSIF mark >= 70 THEN
        DBMS_OUTPUT.PUT_LINE('Grade C');

    ELSIF mark >= 60 THEN
        DBMS_OUTPUT.PUT_LINE('Grade D');

    ELSE
        DBMS_OUTPUT.PUT_LINE('Grade F');

    END IF;

END;
/

CREATE OR REPLACE PROCEDURE check_number(n NUMBER)
AS
BEGIN

    IF n > 0 THEN
        DBMS_OUTPUT.PUT_LINE('Positive');

    ELSIF n < 0 THEN
        DBMS_OUTPUT.PUT_LINE('Negative');

    ELSE
        DBMS_OUTPUT.PUT_LINE('Zero');

    END IF;

END;
/

CREATE OR REPLACE PROCEDURE weekday(dayno NUMBER)
AS
BEGIN

    CASE dayno

        WHEN 1 THEN
            DBMS_OUTPUT.PUT_LINE('Sunday');

        WHEN 2 THEN
            DBMS_OUTPUT.PUT_LINE('Monday');

        WHEN 3 THEN
            DBMS_OUTPUT.PUT_LINE('Tuesday');

        WHEN 4 THEN
            DBMS_OUTPUT.PUT_LINE('Wednesday');

        WHEN 5 THEN
            DBMS_OUTPUT.PUT_LINE('Thursday');

        WHEN 6 THEN
            DBMS_OUTPUT.PUT_LINE('Friday');

        WHEN 7 THEN
            DBMS_OUTPUT.PUT_LINE('Saturday');

        ELSE
            DBMS_OUTPUT.PUT_LINE('Invalid Day');

    END CASE;

END;
/

CREATE OR REPLACE PROCEDURE factorial(n NUMBER)
AS
    fact NUMBER := 1;
    i NUMBER;
BEGIN

    FOR i IN 1..n LOOP
        fact := fact * i;
    END LOOP;

    DBMS_OUTPUT.PUT_LINE('Factorial = ' || fact);

END;
/