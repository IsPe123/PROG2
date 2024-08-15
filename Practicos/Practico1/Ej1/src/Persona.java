import java.time.LocalDate;
import java.time.Period;

public class Persona {
    private int dni;
    private LocalDate fechaDeNacimiento;
    private char sexo;
    private String nombre;
    private String apellido;
    private double peso;
    private double altura;

    //Constructor solo DNI
    public Persona(int dni) {
        this.dni = dni;
        this.fechaDeNacimiento = LocalDate.of(2000, 1, 1);
        this.sexo = 'F';
        this.nombre = "N";
        this.apellido = "N";
        this.peso = 1;
        this.altura = 1;
    }

    //Constructor con todos los parametros
    public Persona(int dni, LocalDate fechaDeNacimiento, char sexo, String nombre, String apellido, double peso, double altura) {
        this.dni = dni;
        this.fechaDeNacimiento = fechaDeNacimiento;
        setSexo(sexo);
        this.nombre = nombre;
        this.apellido = apellido;
        setPeso(peso);
        setAltura(altura);
    }

    //Calcular indice masa corporal
    public double calcularIMC() {
        return peso / (Math.pow(altura, 2));
    }

    //Verificar si esta en forma 
    public boolean estaEnForma() {
        double IMC = calcularIMC();
        return (IMC >= 18.5 && IMC <= 25);
    } 

    //Saber si esta cumpliendo anios
    public boolean cumpleAnios() {
        LocalDate fechaActual = LocalDate.now();
        return fechaActual.getDayOfMonth() == fechaDeNacimiento.getDayOfMonth() &&
               fechaActual.getMonth() == fechaDeNacimiento.getMonth();
    }

    //Saber si es mayor de edad(18)
    public boolean esMayorDeEdad() {
        return esMayorDe(18);
    }

    //Saber si es puede votar
    public boolean puedeVotar() {
        return esMayorDe(16);
    }

    //Saber si es mayor de alguna edad
    public boolean esMayorDe(int edadPretendida) {
        int edadExacta = calcularEdad();
        return (edadExacta >= edadPretendida);
    }

    //Calcular edad
    public int calcularEdad() {
        return Period.between(fechaDeNacimiento, LocalDate.now()).getYears();
    }

    //Mostrar toda la info del objeto
    public String toString(){
        return "Nombre y apellido: " + nombre + " " + apellido + 
               "\nEdad: " + calcularEdad() +
               "\nSexo: " + sexo +
               "\nDni:" + dni +
               "\nPeso:" + peso +
               "\nAltura:" + altura;
    }

    //Setters
    public void setFechaDeNacimiento(LocalDate fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public void setSexo(char sexo) {
        if (sexo == 'M' || sexo == 'F') {
            this.sexo = sexo;
        } else {
            this.sexo = 'F';
        }
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setPeso(double peso) {
        if (peso > 0) {
            this.peso = peso;
        } else {
            this.peso = 1;
        }
    }

    public void setAltura(double altura) {
        if (altura > 0) {
            this.altura = altura;
        } else {
            this.altura = 1;
        }
    }

}