class Main {
  public static void main(String[] args){

    Cliente cliente1 = new Cliente(25,"Pedro Gomez","98647521",1572.2);
    Trabajador trabajador1 = new Trabajador();
    trabajador1.setNombre("Julia Mendoza");
    trabajador1.setEdad(32);
    trabajador1.setTelefono("4015852");
    trabajador1.setSalario(2560.5);

    System.out.println("Datos de Cliente");
    System.out.println("Nombre: "+cliente1.getNombre());
    System.out.println("Edad: "+cliente1.getEdad());
    System.out.println("Teléfono: "+cliente1.getTelefono());
    System.out.println("Crédito: "+cliente1.getCredito());

    System.out.println("\nDatos de Trabajador");
    System.out.println("Nombre: "+trabajador1.getNombre());
    System.out.println("Edad: "+trabajador1.getEdad());
    System.out.println("Teléfono: "+trabajador1.getTelefono());
    System.out.println("Crédito: "+trabajador1.getSalario());

        
  }
}

class Persona{
  private int edad=0;
  private String nombre="";
  private String telefono="";

  public void setEdad(int edad){
    this.edad=edad;
  }
  public int getEdad(){
    return edad;
  }
  public void setNombre(String nombre){
    this.nombre=nombre;
  }
  public String getNombre(){
    return nombre;
  }
  public void setTelefono(String telefono){
    this.telefono=telefono;
  }
  public String getTelefono(){
    return telefono;
  }
  public Persona (int edad,String nombre,String telefono){
    this.edad=edad;
    this.nombre=nombre;
    this.telefono=telefono;
  }

  public Persona(){}
  }

class Cliente extends Persona{
  private double credito=0;
  
  public void setCredito(double credito){
    this.credito=credito;
  }
  public double getCredito(){
    return credito;
  }

  public Cliente (int edad,String nombre,String telefono,double credito){
    super(edad,nombre,telefono);
    this.credito=credito;
  }

  public Cliente(){}
  
}

class Trabajador extends Persona{
  private double salario=0;
  public void setSalario(double salario){
    this.salario=salario;
  }
  public double getSalario(){
    return salario;
  }

  public Trabajador (int edad,String nombre,String telefono,double salario){
    super(edad,nombre,telefono);
    this.salario=salario;
  }

  public Trabajador(){}
}

