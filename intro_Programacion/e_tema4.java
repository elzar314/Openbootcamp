class Main {

  public static void main(String[] args) {

    System.out.println("Ejercicio 1");
    int numeroif = 12;
    int numeroif2 = -51;
    mayorOmenor(numeroif);
    mayorOmenor(numeroif2);

    
    System.out.println("\nEjercicio 2");
    int numeroWhile=-3;
    while(numeroWhile<3){
      System.out.println(numeroWhile);
      numeroWhile++;
    }

    
    System.out.println("\nEjercicio 3");
    do{
      System.out.println(numeroWhile);
    }while(numeroWhile<3);

    
    System.out.println("\nEjercicio 4");
    int numeroFor=0;
    for(int i=0;i<=3;i++){
      System.out.println(numeroFor);
      numeroFor++;
    }

    
    System.out.println("\nEjercicio 5");
    int estacion=3;
    switch(estacion){
      case 1:
        System.out.println("La estación es verano");
        break;
        case 2:
        System.out.println("La estación es otoño");
        break;
        case 3:
        System.out.println("La estación es invierno");
        break;
        case 4:
        System.out.println("La estación es primavera");
        break;
        default:
        System.out.println("No sé que estación es");
    }
    
  }
  

  public static void mayorOmenor(int numero){
    if(numero>0){
      System.out.println("El numero "+numero+" es positivo");
    }
    else if(numero<0){
      System.out.println("El numero "+numero+" es negativo");
    }
  }

}
