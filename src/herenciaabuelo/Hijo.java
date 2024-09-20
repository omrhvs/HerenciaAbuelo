package herenciaabuelo;

import javax.swing.JOptionPane;

public class Hijo extends Padre
{
    private int edad;
    private String nombre; 
    

    Hijo (int edad,String nombre)
    { 
        super();
        this.edad = edad;
        this.nombre = nombre;
    }

    
    public void mostrar()
    {
        JOptionPane.showMessageDialog(null,HerenciaAbuelo.lines + "\n" +
                    "Nombre:" + nombre + "\n" +
                    "Edad:" + edad + "\n" +
                    "Altura:" + altura + "\n" +
                    "Constitucion Fisica:" + constitucion + "\n" +
                    "Ojos: " + ojos + "\n" +
                    "Piel:" + piel + "\n" +
                    "Cabello:" + cabello + "\n" +
                    HerenciaAbuelo.lines
                );
    }
}
