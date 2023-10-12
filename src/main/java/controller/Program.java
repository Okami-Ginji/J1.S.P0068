/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import java.util.ArrayList;
import model.Student;
import repository.CollectionRepository;

/**
 *
 * @author Administrator
 */
public class Program {
    
    CollectionRepository program;
    ArrayList<Student> lt;
    
    public Program() {
        program = new CollectionRepository();
        lt = new ArrayList<>();
    }
    
    public void run() {
        System.out.println("====== Collection Sort Program ======");
        program.display(lt);
    }
}
