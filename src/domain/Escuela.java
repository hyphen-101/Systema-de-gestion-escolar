package domain;

import java.util.*;

public class Escuela {
    private List<Estudiante> estudiantes;
    private List<Maestro> maestros;
    private static float dineroGanado;
    private static float dineroGastado;

    public Escuela(List<Estudiante> estudiantes, List<Maestro> maestros) {
        this.estudiantes = estudiantes;
        this.maestros = maestros;
        dineroGanado = 400000;
        dineroGastado = 0;
    }

    public List<Estudiante> getEstudiantes() {
        return estudiantes;
    }
    
    public void agregarEstudiante(Estudiante estudiante){
         estudiantes.add(estudiante);
    }

    public List<Maestro> getMaestros() {
        return maestros;
    }
    
    public void agregarMaestro(Maestro maestro){
         maestros.add(maestro);
    }

    public static float getDineroGanado() {
        return dineroGanado;
    }
    
    public void actualizacionTotalDineroGanado(float entradaDinero){
        dineroGanado += entradaDinero;
    }

    public static float getDineroGastado() {
        return dineroGastado;
    }
    
    public void actualizacionTotalDineroGastado(float gastos){
        dineroGanado -= gastos;
    }
    
    
    
}
