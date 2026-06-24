CREATE OR REPLACE PROCEDURE greet_employee (
    p_name    IN VARCHAR2,
    p_salary  IN NUMBER
)
IS
    v_message VARCHAR2(100);
BEGIN
    IF p_salary >= 50000 THEN
        v_message := 'Senior Employee';
    ELSIF p_salary >= 30000 THEN
        v_message := 'Mid Level Employee';
    ELSE
        v_message := 'Junior Employee';
    END IF;

    DBMS_OUTPUT.PUT_LINE('Employee Name: ' || p_name);
    DBMS_OUTPUT.PUT_LINE('Salary: ' || p_salary);
    DBMS_OUTPUT.PUT_LINE('Level: ' || v_message);
END;
/

BEGIN
    greet_employee('Harsh', 25000);
    DBMS_OUTPUT.PUT_LINE('---');
    greet_employee('Rahul', 45000);
    DBMS_OUTPUT.PUT_LINE('---');
    greet_employee('Priya', 60000);
END;
/