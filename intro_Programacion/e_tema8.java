class Main {

  public static void main(String[] args) {

    Persona persona1 = new Persona();
    persona1.setNombre("Juan Alvarez");
    persona1.setTelefono("954782564");
    persona1.setEdad(29);

    //Imprimiendo

    System.out.println("El nombre de la persona creada es "+persona1.getNombre()+", su edad es "+persona1.getEdad()+" y su número de teléfono es "+persona1.getTelefono()+".");
      

  }

}

 class Persona {
    private int edad=0;
    private String nombre="";
    private String telefono="";

    public int getEdad(){
      return this.edad;
    }

    public void setEdad(int edad){
      this.edad=edad;
    }

    public String getNombre(){
      return this.nombre;
    }

    public void setNombre(String nombre){
      this.nombre=nombre;
    }

    public String getTelefono(){
      return this.telefono;
    }

    public void setTelefono(String telefono){
      this.telefono = telefono;
    }
    
  }
