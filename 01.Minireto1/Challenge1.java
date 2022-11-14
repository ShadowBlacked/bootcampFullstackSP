package minireto1;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Challenge1 {
	//Variables
	String string_f="";//Contiene la cadena final para retornar
	int aleatory_numbers=8;//Cantidad de cifras a generar aleatoriamente
	int digit;//Guarda segun el caso un entero aleatorio 0-9
	//Metodos
	//Metodo para generar una cadena de numeros aleatorios de dos tipos a ó b
	public String randomStringAB(String s){
		if ("Tipo A".equals(s)){
			String start="54";//Inicio para tipo a
			string_f+=start;
			for (int i=1;i<=aleatory_numbers;i++){
				digit = (int)(Math.random()*10);
				string_f+=String.valueOf(digit);
			}
		}else if("Tipo B".equals(s)) {
			String start="08";//Inicio para tipo a
			string_f+=start;
			for (int i=1;i<=aleatory_numbers;i++){
				digit = (int)(Math.random()*10);
				string_f+=String.valueOf(digit);
			}			
		}else {
			System.out.println("No se reconoció ningún tipo");
		}
		return string_f;
	}
	//Metodo que verifica si un string esta dentro de los elementos de una lista de strings
	public boolean findIn(String s,List<String> l) {
        boolean b = true;
        for (String i : l) {
        	//Comprobamos si el dato i de la lista es identico al string ingresado
            if (i == null ? s == null : i.equals(s)) {
                b = false;
                break;
            } else {
                b = true;
            }
        }
        if (b == false) {
        	System.out.println("La cadena ingresada hace parte de la Lista");
        }else {
        	System.out.println("La cadena ingresada NO hace parte de la Lista");
        }
        return b;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Challenge1 ch1=new Challenge1();
        Scanner sc = new Scanner(System.in);
        //Desafío 2A
        
        try{
        	System.out.println("/*/*/*/*/*/*/*/*/*/ DESAFIO 2A: GENERADOR DE NUMEROS ALEATORIOS DE DOS TIPOS /*/*/*/*/*/*/*/*/*/ ");
        	System.out.println("Generar: ");
        	System.out.println("1.Tipo A (54........) ");
            System.out.println("2.Tipo B (08........) ");
            System.out.println("3.Saltar a desafío 2B");
             int type_str = sc.nextInt();
        switch(type_str){
            case 1:{
                System.out.println(ch1.randomStringAB("Tipo A"));
                break;
            }
            case 2:{
                System.out.println(ch1.randomStringAB("Tipo B"));
                break;
            }
            case 3:{
            	break;
            }default:{
                System.out.println("Opcion incorrecta");
            }
        }
        //Excepcion para controlar el tipo de dato ingresado y el formato del numero ingresado
        }catch(InputMismatchException | NumberFormatException ex){
            System.out.print("El dato ingresado es incorrecto");
        }
        //Desafio 2B
        try {
            String s;
            System.out.println("/*/*/*/*/*/*/*/*/*/ DESAFIO 2B: COMPROBAR STRING DADO EN UNA LISTA DE STRINGS /*/*/*/*/*/*/*/*/*/");
            System.out.print("Ingrese una cadena: ");
            sc.nextLine();
            s = sc.nextLine();
            System.out.print("Ingrese el tamaño de la lista: ");
            int e = Integer.parseInt(sc.nextLine());
            List<String> l = new ArrayList<>();
            //Ciclo para agregar elementos a la lista
            for (int i = 0; i < e; i++) {
                System.out.print("Ingrese el " + (i + 1) + " elemento de la lista: ");
                l.add(sc.nextLine());
            }
            System.out.println(ch1.findIn(s, l));
        } catch (InputMismatchException | NumberFormatException ex) {
            System.out.println("El dato ingresado es incorrecto");
        }
        sc.close();
        System.out.print("Hasta pronto! ");
	}
}
