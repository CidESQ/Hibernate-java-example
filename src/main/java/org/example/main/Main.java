package org.example.main;

import org.example.entity.Employee;
import org.example.util.UtilEntity;

import javax.persistence.EntityManager;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        EntityManager em = new UtilEntity().getEntityManager();
        List<Employee> empleados = em.createQuery("SELECT e FROM Employee e", Employee.class).getResultList();
        System.out.println("Listar todos los empleados");
        empleados.forEach(System.out::println);
    }
}