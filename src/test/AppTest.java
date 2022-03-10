package test;

import domain.*;
import java.util.*;

public class AppTest {

    public static void main(String[] args) {
        Maestro lizzy = new Maestro(500, "Lizzy");
        Maestro eduardo = new Maestro(500, "Eduardo");
        Maestro amanda = new Maestro(500, "Amanda");

        List<Maestro> teacherList = new ArrayList<>();
        teacherList.add(lizzy);
        teacherList.add(eduardo);
        teacherList.add(amanda);

        Estudiante natasha = new Estudiante("Natasha Mora", 10);
        Estudiante viri = new Estudiante("Edgar Becerra", 8);
        Estudiante sergio = new Estudiante("Sergio Conchas", 10);

        List<Estudiante> studentList = new ArrayList<>();

        studentList.add(natasha);
        studentList.add(viri);
        studentList.add(sergio);

        Escuela ghs = new Escuela(studentList, teacherList);

        var megan = new Maestro(400, "Megan");

        ghs.agregarMaestro(megan);

        natasha.pagarTarifa(5000);
        viri.pagarTarifa(6000);

        System.out.println("GHS has earned $" + Escuela.getDineroGanado());

        System.out.println("------Making SCHOOL PAY SALARY----");

        lizzy.recibirSalario(lizzy.getSalario());
        ghs.actualizacionTotalDineroGastado(lizzy.getSalario());
        System.out.println("GHS has spent for salary to " + lizzy.getName()
                + " and now has $" + ghs.getDineroGanado());

        eduardo.recibirSalario(eduardo.getSalario());
        ghs.actualizacionTotalDineroGastado(eduardo.getSalario());

        System.out.println("GHS has spent for salary to " + eduardo.getName()
                + " and now has $" + ghs.getDineroGanado());

        System.out.println(viri);

        amanda.recibirSalario(amanda.getSalario());

        System.out.println(amanda);

    }
}
