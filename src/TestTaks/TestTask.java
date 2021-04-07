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
import java.util.Scanner;

public class TestTask {
    public static void main(String args[]){
        
        Task tarea1 = null;
        Task tarea2 = null;
        Task tarea3 = null;
        
        int contadorTask = 0;
        
        int tarea;
        int tareaDel;
        int tareaShow;
        
        Scanner input = new Scanner(System.in);
        
        int opcion;
        
        do{
            System.out.println("1. Crear una nueva tarea");
            System.out.println("2. Marcar tarea como hecha");
            System.out.println("3. Eliminar una tarea");
            System.out.println("4. Mostrar una tarea");
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
                    contadorTask = contadorTask + 1;
                    if(contadorTask > 3){
                        System.out.println();
                        System.out.println("MAXIMO DE TAREAS ALCANZADO");
                        System.out.println();
                        break;
                    }
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
                   
                    if(contadorTask == 1){
                       tarea1 = new Task(descripcion, LocalDate.of(year, month, day));
                    }
                    if(contadorTask == 2){
                        tarea2 = new Task(descripcion, LocalDate.of(year, month, day));
                    }
                    if(contadorTask == 3) {
                        tarea3 = new Task(descripcion, LocalDate.of(year, month, day));
                    }
                    
                    break;
                
                case 2:
                    System.out.println();
                    System.out.print("Ingrese el numero de tarea que desea marcar como completa(1-3): ");
                    tarea = input.nextInt();
                    System.out.println();
                    switch(tarea){
                        case 1:
                            if(tarea1 != null){
                                tarea1.setEstado(true);
                                System.out.println();
                                System.out.println("--------------------");
                                System.out.println("| TAREA1 REALIZADA |");
                                System.out.println("--------------------");
                                System.out.println();
                            }else{
                                System.out.println();
                                System.out.println("------------------------");
                                System.out.println("| TAREA1 NO DISPONIBLE |");
                                System.out.println("------------------------");
                                System.out.println();
                            }
                            break;
                        
                        case 2:
                            if(tarea2 != null){
                                tarea2.setEstado(true);
                                System.out.println();
                                System.out.println("--------------------");
                                System.out.println("| TAREA2 REALIZADA |");
                                System.out.println("--------------------");
                                System.out.println();
                        }else{
                                System.out.println();
                                System.out.println("------------------------");
                                System.out.println("| TAREA2 NO DISPONIBLE |");
                                System.out.println("------------------------");  
                                System.out.println();
                            }
                        break;
                        
                        case 3:
                            if(tarea3 != null){
                                tarea3.setEstado(true);
                                System.out.println();
                                System.out.println("--------------------");
                                System.out.println("| TAREA3 REALIZADA |");
                                System.out.println("--------------------");
                                System.out.println();
                            }else{
                                System.out.println();
                                System.out.println("------------------------");
                                System.out.println("| TAREA3 NO DISPONIBLE |");
                                System.out.println("------------------------");  
                                System.out.println();
                                break;
                            }
                        break;
                        
                        default:
                            break;
                    }
                    break;
                case 3:
                    System.out.println();
                    System.out.print("Ingrese el numero de la tarea que desea eliminar(1-3): ");
                    tareaDel = input.nextInt();
                    System.out.println();
         
                    switch(tareaDel){
                        case 1:
                            if(tarea1 != null){
                                tarea1 = null;
                                System.out.println();
                                System.out.println("--------------------");
                                System.out.println("| TAREA1 ELIMINADA |");
                                System.out.println("--------------------");
                                System.out.println();
                            }else{
                                System.out.println();
                                System.out.println("------------------------");
                                System.out.println("| TAREA1 NO DISPONIBLE |");
                                System.out.println("------------------------");
                                System.out.println();
                            }
                            break;
                        
                        case 2:
                            if(tarea2 != null){
                                tarea2 = null;
                                System.out.println();
                                System.out.println("--------------------");
                                System.out.println("| TAREA2 ELIMINADA |");
                                System.out.println("--------------------");
                                System.out.println();
                        }else{
                                System.out.println();
                                System.out.println("------------------------");
                                System.out.println("| TAREA2 NO DISPONIBLE |");
                                System.out.println("------------------------");    
                                System.out.println();
                            }
                        break;
                        
                        case 3:
                            if(tarea3 != null){
                                tarea3 = null;
                                System.out.println();
                                System.out.println("--------------------");
                                System.out.println("| TAREA3 ELIMINADA |");
                                System.out.println("--------------------");
                                System.out.println();
                        }else{
                                System.out.println();
                                System.out.println("------------------------");
                                System.out.println("| TAREA3 NO DISPONIBLE |");
                                System.out.println("------------------------");       
                                System.out.println();
                            }
                        break;
                        
                        default:
                            break;
                    }
                    break;
                case 4: //mostrar tarea
                    System.out.println();
                    System.out.print("Ingrese el numero de la tarea que desea mostrar(1-3): ");
                    tareaShow = input.nextInt();
                    System.out.println();
                    switch(tareaShow){
                        case 1:
                            if(tarea1 != null){
                                System.out.println();
                                System.out.println(tarea1.toString());
                                System.out.println();
                            }else{
                                System.out.println();
                                System.out.println("------------------------");
                                System.out.println("| TAREA1 NO DISPONIBLE |");
                                System.out.println("------------------------");
                                System.out.println();
                            }
                            break;
                        
                        case 2:
                            if(tarea2 != null){
                                System.out.println();
                                System.out.println(tarea2.toString());
                                System.out.println();
                        }else{
                                System.out.println();
                                System.out.println("------------------------");
                                System.out.println("| TAREA2 NO DISPONIBLE |");
                                System.out.println("------------------------");  
                                System.out.println();
                            }
                        break;
                        
                        case 3:
                            if(tarea3 != null){
                                System.out.println();
                                System.out.println(tarea3.toString());
                                System.out.println();
                        }else{
                                System.out.println();
                                System.out.println("------------------------");
                                System.out.println("| TAREA3 NO DISPONIBLE |");
                                System.out.println("------------------------");    
                                System.out.println();
                            }
                        break;
                        
                        default:
                            break;
                }
                    break;
                
                default:
                    break;
            }
        } while(opcion != 0);
    }
}
