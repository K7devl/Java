package tp_abstraccion;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int auxInt;
        String auxString;
        Persona per[] = new Persona[5];


        for(int i=0; i<5;i++){
            System.out.println("\n Ingrese de que tipo va a ser la persona N°"+ i + ":\n 1. Ingeniero \n 2. Licenciado\n 3.Nada\n");
            do{
                auxInt = sc.nextInt();
                if(auxInt <1 || auxInt>3){
                    System.out.println("Incorrecto");
                }
            }while(auxInt <1 || auxInt>3);

            switch (auxInt) {
                case 1:
                    per[i] = new Ingeniero();
                    System.out.println("\nIngrese el nombre del Ingeniero: ");
                    auxString = sc.next();
                    sc.nextLine();
                    per[i].set_Nombre(auxString);
                    break;

                case 2:
                    per[i] = new Licenciado();
                    System.out.println("\nIngrese el nombre del Licenciado: ");
                    auxString = sc.next();
                    sc.nextLine();
                    per[i].set_Nombre(auxString);
                    break;

                case 3:
                    per[i] = new Otro();
                    System.out.println("\nIngrese el nombre del Caballero: ");
                    auxString = sc.next();
                    sc.nextLine();
                    per[i].set_Nombre(auxString);
                    break;
            }
        }

        for(int i=0;i<5;i++){
            System.out.println("N°"+i + ":"+ per[i].get_Persona());
        }


    }
    
}
