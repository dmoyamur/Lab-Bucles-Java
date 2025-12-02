package LaboratorioBucles;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;
import java.util.List;


public class LaboratorioBucles {
    public static void CajaRegistradora(){
        Scanner scanner = new Scanner(System.in);
        int opcion;
        int totalaPagar=0;
        int valorPagado=0;
        do {
            System.out.println("Menú");
            System.out.println("1. Hamburguesa: $50");
            System.out.println("2. Papas: $30");
            System.out.println("3. Finalizar Pedido");
            System.out.println("4. Salir");
            System.out.println("Elige una opcion de nuestro menú: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch(opcion){
                case 1:
                    System.out.println("Agregaste Hamburguesa");
                    totalaPagar=totalaPagar+50;
                    break;
                case 2:
                    System.out.println("Agregaste Papas");
                    totalaPagar=totalaPagar+30;
                    break;
                case 3:
                    System.out.println("El valor a pagar es de: $"+totalaPagar);
                    System.out.println("Con cuánto deseas cancelar?: ");
                    valorPagado = scanner.nextInt();
                    scanner.nextLine();
                    while (valorPagado<totalaPagar){;
                        System.out.println("Monto Insuficiente. Ingrese un monto válido: $");
                        valorPagado=scanner.nextInt();
                    }
                    System.out.println("Su cambio es de :"+(valorPagado-totalaPagar));
            }
        } while (opcion!=4);
    }

    public static void CalculadoraDescuentos(){
        Scanner scanner = new Scanner(System.in);
        double precio = 0;
        System.out.println("Ingrese el precio del producto: ");
        precio = scanner.nextInt();
        double i=0;
        for (i=0.1; i<0.51; i+=0.1){
            System.out.println("El precio con descuento de: "+(int)(i*100)+"% es de: $"+(precio-(precio*i)));
        }
    }

    public static void TablaMultiplicar(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un número: ");
        int numero = scanner.nextInt();
        int contador = 1;
        while (contador<=10) {
            System.out.println(numero+" x "+contador+" = "+(numero*contador));
            contador++;
        }
    }

    public static void CajeroAutomatico(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("-- CAJERO AUTOMATICO --");
        int opcionCajero=0;
        int saldo = 0;
        int transaccion = 0;

        do{
            System.out.println("\n -- Menu de Opciones --");
            System.out.println("1. Consultar Saldo");
            System.out.println("2. Retirar");
            System.out.println("3. Depositar");
            System.out.println("4. Salir");
            System.out.println("Elije una opción: ");
            opcionCajero = scanner.nextInt();

            switch (opcionCajero){
                case 1:
                    System.out.println("Su saldo es de: $"+saldo);
                    break;
                case 2:
                    System.out.println("Ingrese el monto a retirar: ");
                    transaccion = scanner.nextInt();
                    while (transaccion>saldo){
                        System.out.println("Monto inválido, intente nuevamente");
                        transaccion=scanner.nextInt();
                    }
                    saldo = saldo-transaccion;
                    System.out.println("Retiro realizado");
                    break;
                case 3:
                    System.out.println("Ingrese el monto a depositar:");
                    transaccion = scanner.nextInt();
                    saldo = saldo+transaccion;
                    System.out.println("Depósito aplicado");
                    break;
            }
        }while (opcionCajero!=4);
    }

    public static void GeneradorContraseña(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la longitud de la contraseña");
        int longClave = scanner.nextInt();
        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!#$%&/()=?¡¿'+}{[]*-_";

        Random random = new Random();
        StringBuilder clave = new StringBuilder();

        for (int i=0; i<longClave; i++){
            int caracter = random.nextInt(caracteres.length());
            clave.append(caracteres.charAt(caracter));
        }
        System.out.println(clave);
    }

    public static void AsistenciaClase(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de estudiantes: ");
        int cantEstudiantes = scanner.nextInt();
        List<String> presentes=new ArrayList<>();
        List<String> ausentes=new ArrayList<>();

        for (int i=0; i<cantEstudiantes; i++){
            System.out.println("Ingrese el nombre del estudiante: ");
            String nombre = scanner.next();
            System.out.println("Digite 1, si esta presente o 2, si está ausente: ");
            int estado = scanner.nextInt();
            if (estado==1){
                presentes.add(nombre);
            } else {
                ausentes.add(nombre);
            }
        }
        System.out.println("Los alumnos presentes y son: "+presentes);
        System.out.println("Los alumnos ausentes son: "+ausentes);
    }

    public static void CalculadoraPromedios() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Cuántas Calificaciones desea ingresar: ");
        int cantNotas = scanner.nextInt();
        float notas = 0;
        for (int i = 1; i <= cantNotas; i++) {
            System.out.println("Ingrese la nota número " + i + ": ");
            float nota = scanner.nextDouble();
            notas += nota;
        }
        float promedio = (notas / cantNotas);
        System.out.println("El promedio de las notas es: " + promedio);
        if (promedio < 6) {
            System.out.println("Su estado es: Reprobado");
        } else if (promedio < 8) {
            System.out.println("Su estado es: Aprobado");
        } else {
            System.out.println("Su estado es: Excelente");
        }
    }
}

