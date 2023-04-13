// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static void main(String[] args) {
        //Primera parte
        int a=1;int b=2;int c=3;
        System.out.println("La suma de "+a+"+"+b+"+"+c+" es: "+suma(a,b,c));

        //Segunda Parte
        Coche miCoche= new Coche();
        System.out.println("El Coche tiene: "+miCoche.puertas+" puertas");
        miCoche.incrementarPuertas();
        System.out.println("Ahora tiene: "+miCoche.puertas+" puertas");

    }

    public static int suma(int a, int b, int c){
        return a+b+c;
    }
}

class Coche{
    public int puertas=4;
    public void incrementarPuertas(){
        this.puertas++;
    }
}

