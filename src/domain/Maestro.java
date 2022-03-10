/** 
 Clase responsable de mantener sigue la pista de el nombre (name) del mestro, id, salario
 */
package domain;


public class Maestro {
    
    private int id;
    private float salario;
    private String name;
    private float salarioObtenido;
    public static int CONTADOR;

    private Maestro() {
        this.id = ++Maestro.CONTADOR;
    }

    public Maestro(float salario, String name) {
        this();
        this.salario = salario;
        this.name = name;
    }

    public int getId() {
        return id;
    }


    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public void recibirSalario(float salario){
        salarioObtenido += salario;
            //obj escuela metodo actualizar dinero gastado
                
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Maestro{");
        sb.append("id=").append(id);
        sb.append(", nombre=").append(name);
        sb.append(", Salario ganado hasta el momento=").append(salarioObtenido);
        sb.append('}');
        return sb.toString();
    }
    
    
    
    
    
    
    
    
    
}
