package MiCuartoPrograma;
import java.util.Scanner;

/*
 * Universidad Latina de Costa Rica 
 * Facultad de Ingenieria en Sistemas Computacionales
 * Viernes 12 de Febrero,2021

package MiCuartoPrograma;

import java.util.Scanner;

/**
 *
 * @author Guillermo SA 
 * 
 */
public class MiCuartoPrograma {
    public static void main(String[] args) {
    
        boolean diaLluvioso = false;
                
        if(diaLluvioso== true){
            System.out.println("El dia está lluvioso");
    }
        else{
            System.out.println("El dia no está lluvioso");
    }
           
    
    boolean quizOtraSemana=true;
       
    if (quizOtraSemana){
            System.out.println("Hay que prepararse...&...bastante");
    }     
       
    else{
            System.out.println("Igual hay que estar preparados");
    }    
    
    //Scanner s= new Scanner(System.in);
    
    boolean profeDice= true//s.nextBoolean();
    boolean internet= true//s.nextBoolean();
    boolean luz= true//s.nextBoolean();
    boolean terremoto= false//s.nextBoolean();
    
    if(profeDice==true){
        if(internet==true){ 
            if(luz==true){
                if(terremoto==true){
                    System.out.println("SI HAY QUIZ!");
                } 
                else {
                    System.out.println("NO HAY QUIZ!");
                }
            }
            else {
                System.out.println("NO HAY QUIZ!");
            }
            
        }else{
        System.out.println("NO HAY QUIZ!");
        }
    }else{
        System.out.println("NO HAY QUIZ!");
    }
   
   


//Segunda Forma
    
    String mensaje="NO HAY QUIZ";
    if(profeDice==true){
        if(internet==true){ 
            if(luz==true){
                if(terremoto==false){
                    mensaje="SI HAY QUIZ";
                }
            }
        }    
    }        
     System.out.println(mensaje);
  
    //Tercera Forma
    
    mensaje="NO HAY QUIZ";
    if(profeDice){
        if(internet){ 
            if(luz){
                if(terremoto){
                    mensaje="SI HAY QUIZ";
                }
            }
        }    
    }        
     System.out.println(mensaje);
   
    
    //Cuarta Forma
    mensaje="NO HAY QUIZ";
    if(internet){
        if(profeDice){ 
            if(!terremoto){
                if(luz){
                    mensaje="SI HAY QUIZ";
                }
            }
        }    
    }        
     System.out.println(mensaje);      
    
    //Quinta Forma
    
    if(internet && luz && profeDice && terremoto){
        System.out.println("SI HAY QUIZ");
    }
    else{
        System.out.println("NO HAY QUIZ");
    }
    
    //Sexta Forma
    mensaje="NO HAY QUIZ";
    if(internet &&luz && profeDice && terremoto){
        mensaje="SI HAY QUIZ!";
    }
    System.out.println(mensaje);
    
    //Septima Forma
     mensaje="SI HAY QUIZ";
    if(!internet ||!luz ||!profeDice ||!terremoto){
        mensaje="NO HAY QUIZ!";
    }
    System.out.println(mensaje);
  
    
    //ALCANCE DE VARIABLES
    
    if(internet){
       int numQuiz=1; 
        if(luz){
          System.out.println("El #Quiz es:"+ numQuiz);
            
        }
    }
    
    //System.out.println("El #Quiz es" + numQuiz);
    
    //ARITMETICA
    
    int numQuiz=1;
    
    //aumenta en uno
    numQuiz=numQuiz+1;
            
    numQuiz++;
    
    //aumenta de dos en dos
    numQuiz = numQuiz+2;
    numQuiz += 2;
    
    //restar su valor -2
    numQuiz = numQuiz -2;
    numQuiz-=2;
    
    
    //multiplicacion
    numQuiz = numQuiz *2;
    numQuiz*=2;
    
    //division
    numQuiz = numQuiz /1000;
    numQuiz/=1000;
    
    //numero de residuo
    numQuiz = numQuiz %2;
    numQuiz%=2;
   
    //CICLOS FOR & WHILE
    System.out.println("El numero mas"+" "+1);
    System.out.println("El numero mas"+" "+2);
    System.out.println("El numero mas"+" "+3);
    System.out.println("El numero mas"+" "+4);
    System.out.println("El numero mas"+" "+5);
    /*
    //segunda Forma
    int num=1;
    System.out.println("El numero mas"+" "+num);
    num=num+1;
    System.out.println("El numero mas"+" "+num);
    num=num+1;
    System.out.println("El numero mas"+" "+num);
    
    //tercera forma
    num=1;
    System.out.println("El numero mas"+" "+num);
    num++;
    System.out.println("El numero mas"+" "+num);
    num++;
    */
    
    //El Problema en forma x1000
    for(int num=1; num<=1000  ;num++){  
        
        System.out.println("El numero mas"+" "+num);
    } 
    
    
    //segunda forma
    int num=1;
    while(num<=1000){
        System.out.println("El numero mas"+" "+num);
        
        num+=100;
    }
    
    
}
    
    
    
    
    
    
    
    public void ejecuccionEscaner(){
     int numBonito1;
        int numBonito2;

        Scanner scannerHermoso = new Scanner(System.in);
        System.out.println("Digite un primer número:");
        
        numBonito1= scannerHermoso.nextInt();
        
        System.out.println("Digite un segundo número:");
        
        numBonito2= scannerHermoso.nextInt();
        
         System.out.println("Resultado:"+ (numBonito1+numBonito2));
         
    }
}       
        


