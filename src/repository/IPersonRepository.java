/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import java.util.ArrayList;
import model.Person;

/**
 *
 * @author A
 */
public interface IPersonRepository {
    public void findPersonInfo(ArrayList<Person> persons);
    
    public void copyTextToNewFile(ArrayList<Person> persons);
    
}