/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import java.util.ArrayList;
import model.Student;
import dataacess.CollectionDAO;

/**
 *
 * @author Administrator
 */
public class CollectionRepository implements ICollectionRepository{

    @Override
    public void display(ArrayList<Student> lt) {
       CollectionDAO.Instance().display(lt);
    }
    
}
