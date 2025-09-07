package Modelo;


/**
 *
 * @author marcosisaacarayaabarca
 */
public class Cliente extends Persona {


    private String Fecha_Inscripcion;
    private Instructor InstructorAsignado;

    public Cliente() {
    }

    public Cliente(String Fecha_Inscripcion, String Nombre, String Fecha_Nacimiento, String Correo, int Numero_Celular, int Cedula, char Sexo) {
        super(Nombre,Fecha_Nacimiento, Correo, Numero_Celular, Cedula, Sexo);
        this.Fecha_Inscripcion = Fecha_Inscripcion;
    }
     
    public String getFecha_Inscripcion() {
        return Fecha_Inscripcion;
    }

    
    public void setFecha_Inscripcion(String Fecha_Inscripcion) {
        this.Fecha_Inscripcion = Fecha_Inscripcion;
    }
    
    @Override
    public String Datos() {
    return "Cliente {" +
           "Cedula=" + getCedula() +
           ", Nombre=" + getNombre() +  
           ", Sexo=" + getSexo() +
           ", Fecha_Nacimiento='" + getFecha_Nacimiento() + '\'' +
           ", Correo='" + getCorreo() + '\'' +
           ", Numero_Celular=" + getNumero_Celular() +
           ", Fecha_Inscripcion='" + Fecha_Inscripcion + '\'' +
           '}';
    }
    
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente(
                
            "2023-05-12",    
            "Marquitos",
            "2000-10-15",    
            "prueba@gmail.com", 
            88887777,        
            123456789,       
            'M'            
        );

        System.out.println(cliente1.toString());
    }
    
}

