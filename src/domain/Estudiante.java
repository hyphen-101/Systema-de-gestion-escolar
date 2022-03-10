/**
 * Clase responsable de mantener sigue la pista de el id nombre califucacion tarifa y el total de la tarifa del estudiante

 *
 */
package domain;

public class Estudiante {

    private int id;
    public static int Contador;
    private String nombre;
    private float calificacion;
    private float tarifaPagada;
    private float totalTarifa;

    private Estudiante() {
        this.id = ++Estudiante.Contador;
    }

    public Estudiante(String nombre, float calificacion) {
        this();

        this.nombre = nombre;
        this.calificacion = calificacion;
        this.tarifaPagada = 0;
        this.totalTarifa = 30000;
    }

    public Estudiante(int id, String nombre, float calificacion) {
        this.id = id;
        this.nombre = nombre;
        this.calificacion = calificacion;
    }

    public void setCalificacion(float calificacion) {
        this.calificacion = calificacion;
    }

    //metodos
    public void pagarTarifa(float tarifa) {
        tarifaPagada += tarifa;
        //obj escuela metodo actualizar dinero gastado
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public float getCalificacion() {
        return calificacion;
    }

    public float getTarifaPagada() {
        return tarifaPagada;
    }

    public float getTotalTarifa() {
        return totalTarifa;
    }
    
    public float tarifaRestante(){
        return totalTarifa - tarifaPagada;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Estudiante{");
        sb.append("id=").append(id);
        sb.append(", nombre=").append(nombre);
        sb.append(", calificacion=").append(calificacion);
        sb.append(", total de tarifa pagada hasta el momento =").append(tarifaPagada);
        
        sb.append('}');
        return sb.toString();
    }
    
    

}
