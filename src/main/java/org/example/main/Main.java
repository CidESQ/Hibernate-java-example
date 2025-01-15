package org.example.main;

import org.example.entity.Employee;
import org.example.util.UtilEntity;

import javax.persistence.EntityManager;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        EntityManager em = new UtilEntity().getEntityManager();

//       READ ALL---------
        List<Employee> empleados = em.createQuery("SELECT e FROM Employee e", Employee.class).getResultList();
        System.out.println("Listar todos los empleados");
        empleados.forEach(System.out::println);

//      READ ONE-----------
        System.out.println("Buscar uno");
        int employeeId = 3;
        Employee e = em.find(Employee.class, employeeId);
        System.out.println("Empleado encontrado" + e);

//      CREATE ---------
        System.out.println("Craer un Empleado");

//        Employee newEmployee = new Employee();
//        newEmployee.setFirstName("Diego");
//        newEmployee.setPaSurname("Arriaga");
//        newEmployee.setMaSurname("Alega");
//        newEmployee.setEmail("example@gmail.com");
//        newEmployee.setSalary(1231F);
//        em.getTransaction().begin();
//        em.persist(newEmployee);
//        em.getTransaction().commit();
//
//        System.out.println("Nuevo empleado creado " + newEmployee);

//        UPDATE---------
//        System.out.println("Actualizar ");
//        int employeeUpdatedId = 2;
//        Employee employeeUpdated = em.find(Employee.class, employeeUpdatedId);
//        System.out.println("Empleado a modificar: "  +employeeUpdated);
//        employeeUpdated.setFirstName("Irving");
//        employeeUpdated.setPaSurname("Suarez");
//        employeeUpdated.setSalary(123112F);
//
//        em.getTransaction().begin();
//        em.merge(employeeUpdated);
//        em.getTransaction().commit();
//
//        System.out.println("Empleado actualizado" + employeeUpdated);


//        REMOVE ------ ---

        System.out.println("ELIMINAR");
        int employeeRemovedId = 2;
        Employee employeeToRemove = em.find(Employee.class, employeeRemovedId);
        System.out.println("Empleado a eliminar: " + employeeToRemove);

        em.getTransaction().begin();
        em.remove(employeeToRemove);
        em.getTransaction().commit();
        System.out.println("Empleado Eliminado");

//        CERRAR
        em.close();

    }
}