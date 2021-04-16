/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestTaks;

/**
 *
 * @author ivan
 */

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Scanner;

public class TestTask {
    static ArrayList<Task> tasks = new ArrayList();
    
    public static void main(String args[]){
       /* 
        Task tarea1 = null;
        Task tarea2 = null;
        Task tarea3 = null;
        */
       
        Task aux = null;
        
        int contadorTask = 0;
        
        int tarea;
        int tareaDel;
        int tareaShow;
        
        int n = 0;
        
        Scanner input = new Scanner(System.in);
        
        int opcion;
        
        do{
            System.out.println("1. Crear una nueva tarea");
            System.out.println("2. Marcar tarea como hecha");
            System.out.println("3. Eliminar una tarea");
            System.out.println("4. Mostrar una tarea");
            System.out.println("5. Mostrar todas las tareas");
            System.out.println("0. Salir del programa");
            System.out.println();
            System.out.print("Ingrese un valor: ");
            
            opcion = input.nextInt();
            
            System.out.println();
            input.nextLine(); //Se encarga de limpiar el buffer de Scanner
            
            
            switch(opcion){
                case 0:
                    break;
                    
                case 1:
                    System.out.println();
                    System.out.print("Ingrese una descripcion: ");
                    String descripcion = input.nextLine();
                    System.out.println();
                    
                    System.out.println("Ingrese una fecha de vencimiento. (Formato: aaaa/mm/dd)");
                    String vencimiento = input.nextLine();
                    System.out.println();
                                      
                    int year = Integer.parseInt(vencimiento.split("/")[0]);
                    int month = Integer.parseInt(vencimiento.split("/")[1]);
                    int day = Integer.parseInt(vencimiento.split("/")[2]);
                    
                    contadorTask += 1;
              
                    aux = new Task(contadorTask, descripcion, LocalDate.of(year, month, day));
                    
                    tasks.add(aux);
                    
                    break;
                
                case 2:
                    System.out.println();
                    System.out.print("Ingrese el numero de tarea que desea marcar como completa: ");
                    tarea = input.nextInt();
                    System.out.println();
                   
                    for(int i = 0; i < tasks.size(); i++){
                        if(tasks.get(i).getId() == tarea){
                            tasks.get(i).setEstado(true);
                        }                      
                    }
                    
                    break;
                
                case 3:
                    System.out.println();
                    System.out.print("Ingrese el numero de la tarea que desea eliminar: ");
                    tareaDel = input.nextInt();
                    input.nextLine();
                    System.out.println();
         
                    for(int i = 0; i < tasks.size(); i++){
                        if(tasks.get(i).getId() == tareaDel){
                            tasks.remove(i);
                        }                    
                    }
                    break;
                case 4: //mostrar tarea
                    System.out.println();
                    System.out.print("Ingrese el numero de la tarea que desea mostrar: ");
                    tareaShow = input.nextInt();
                    input.nextLine();
                    System.out.println();
                    
                    for(int i = 0; i < tasks.size(); i++){
                        if(tasks.get(i).getId() == tareaShow){
                            System.out.println(tasks.get(i));
                        }                     
                    }
                    break;
                    
                case 5: //Mostrar todas tareas
                    for(int i=0; i<tasks.size(); i++){
                        System.out.println(tasks.get(i));
                    }
                    break;
                
                default:
                    break;
            }
        } while(opcion != 0);
    }
}
