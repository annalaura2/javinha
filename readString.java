package cursoDeJava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadString { 
	 
    public static void main (String[] args) { 
 
       //  pergunta o nome
       System.out.print("Entre com o nome: "); 
 
       //  Abre o input
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
 
       String userName = null; 
 
       try { 
          userName = br.readLine(); 
       } catch (IOException ioe) { 
          System.out.println("IO erro tentando ler o nome"); 
          System.exit(1); 
       } 
 
       System.out.println("Seu nome é,  " + userName); 
 
    } 
 
 }  
