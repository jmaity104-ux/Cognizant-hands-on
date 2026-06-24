DECLARE
    v_age       NUMBER := 20;
    v_salary    NUMBER := 25000;
    v_grade     VARCHAR2(10);
    v_message   VARCHAR2(100);

BEGIN
    IF v_salary >= 50000 THEN
        v_grade := 'A';
        v_message := 'High earner';
    ELSIF v_salary >= 30000 THEN
        v_grade := 'B';
        v_message := 'Average earner';
    ELSE
        v_grade := 'C';
        v_message := 'Entry level';
    END IF;
    
    DBMS_OUTPUT.PUT_LINE('Age: ' || v_age);
    DBMS_OUTPUT.PUT_LINE('Salary: ' || v_salary);
    DBMS_OUTPUT.PUT_LINE('Grade: ' || v_grade);
    DBMS_OUTPUT.PUT_LINE('Category: ' || v_message);
    
    DBMS_OUTPUT.PUT_LINE('--- Counting using loop ---');
    FOR i IN 1..5 LOOP
        DBMS_OUTPUT.PUT_LINE('Number: ' || i);
    END LOOP;

END;
/