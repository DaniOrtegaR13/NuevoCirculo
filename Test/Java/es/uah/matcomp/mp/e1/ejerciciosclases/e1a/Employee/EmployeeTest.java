package es.uah.matcomp.mp.e1.ejerciciosclases.e1a.Employee;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    @Test
    void getId() {
        Employee empId = new Employee(1,"Dani","Ortega", 2000);
        assertEquals(1, empId.getId());
    }

    @Test
    void getFirstName() {
        Employee empFN = new Employee(1,"Dani","Ortega", 2000);
        assertEquals("Dani", empFN.getFirstName());
    }

    @Test
    void getLastName() {
        Employee empLN = new Employee(1,"Dani","Ortega", 2000);
        assertEquals("Ortega", empLN.getLastName());
    }

    @Test
    void getName() {
        Employee empN = new Employee(1,"Dani","Ortega", 2000);
        assertEquals("DaniOrtega", empN.getName());
    }

    @Test
    void getSalary() {
        Employee empS = new Employee(1,"Dani","Ortega", 2000);
        assertEquals(2000, empS.getSalary());
    }

    @Test
    void setSalary() {
        Employee empS = new Employee(1,"Dani","Ortega", 2000);
        empS.setSalary(2000);
        assertEquals(2000, empS.getSalary());
    }

    @Test
    void getAnnualSalary() {
        Employee empAS = new Employee(1,"Dani","Ortega", 2000);
        assertEquals(24000, empAS.getAnnualSalary());
    }

    @Test
    void raiseSalary() {
        Employee empr = new Employee(1,"Dani","Ortega", 2000);
        empr.raiseSalary(2000);
        assertEquals(2000, empr.getSalary()/21);
    }

    @Test
    void testToString() {
        Employee empST = new Employee(1,"Dani","Ortega", 2000);
        assertEquals(1, empST.getId());
        assertEquals("Dani", empST.getFirstName());
        assertEquals("Ortega", empST.getLastName());
        assertEquals("DaniOrtega",empST.getName());
        assertEquals(2000, empST.getSalary());
        assertEquals(24000, empST.getAnnualSalary());

    }
}