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

public class Task {
  //Atributos de clase Task
    
  private String descripcion;
  private Boolean estado;
  private LocalDate vencimiento;
  private int id;

    
    
    public Task(int id, String descripcion, LocalDate vencimiento){ 
        this.descripcion = descripcion;
        this.estado = false; //Inicia siempre sin finalizar.
        this.vencimiento = vencimiento;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    public LocalDate getVencimiento() {
        return vencimiento;
    }

    public void setVencimiento(LocalDate vencimiento) {
        this.vencimiento = vencimiento;
    }
    
@Override
    public String toString() {
        return "Tarea = {" + "ID= " + id + " Descripcion= " + descripcion + ", Fecha vencimiento= " + vencimiento + ", Estado de tarea= " + estado + '}';
    }
}

