/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import dataccess.PersonDao;
import java.util.ArrayList;
import model.Person;

/**
 *
 * @author A
 */
public class PersonRepository implements IPersonRepository{

    @Override
    public void findPersonInfo(ArrayList<Person> persons) {
        PersonDao.Instance().findPersonInfor(persons);
    }

    @Override
    public void copyTextToNewFile(ArrayList<Person> persons) {
        PersonDao.Instance().copyFile(persons);
    }
    
    
    
}
