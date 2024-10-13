import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);
        System.out.println("Ingrese los numeros de un DNI y te diré su letra");
        int numero= sc.nextInt();
        int numeroModulo = 23;
        int modulo = Math.floorMod(numero, 23);
        sc.close();

        if (numero>9999999 && numero<100000000){
            if (modulo==0){
                System.out.println(numero+"T");
            }else if (modulo==1){
                System.out.println(numero+"R");
            }else if (modulo==2){
                System.out.println(numero+"W");
            }else if (modulo==3){
                System.out.println(numero+"A");
            }else if (modulo==4){
                System.out.println(numero+"G");
            }else if (modulo==5){
                System.out.println(numero+"M");
            }else if (modulo==6){
                System.out.println(numero+"Y");
            }else if (modulo==7){
                System.out.println(numero+"F");
            }else if (modulo==8){
                System.out.println(numero+"P");
            }else if (modulo==9){
                System.out.println(numero+"D");
            }else if (modulo==10){
                System.out.println(numero+"X");
            }else if (modulo==11){
                System.out.println(numero+"B");
            }else if (modulo==12){
                System.out.println(numero+"N");
            }else if (modulo==13){
                System.out.println(numero+"J");
            }else if (modulo==14){
                System.out.println(numero+"Z");
            }else if (modulo==15){
                System.out.println(numero+"S");
            }else if (modulo==16){
                System.out.println(numero+"Q");
            }else if (modulo==17){
                System.out.println(numero+"V");
            }else if (modulo==18){
                System.out.println(numero+"H");
            }else if (modulo==19){
                System.out.println(numero+"L");
            }else if (modulo==20){
                System.out.println(numero+"C");
            }else if (modulo==21){
                System.out.println(numero+"K");
            }else if (modulo==22){
                System.out.println(numero+"E");
            }
        }else{
            System.out.println("No es la parte de numeros del DNI");
        }
    }
}