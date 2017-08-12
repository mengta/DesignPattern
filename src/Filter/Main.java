package Filter;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        List<Person> persons = new ArrayList<Person>();

        persons.add(new Person("Robert","Male", "Single"));
        persons.add(new Person("John","Male", "Married"));
        persons.add(new Person("Laura","Female", "Married"));
        persons.add(new Person("Diana","Female", "Single"));
        persons.add(new Person("Mike","Male", "Single"));
        persons.add(new Person("Bobby","Male", "Single"));
        Criteria male=new CriteraMale();
        Criteria single=new CriteriaSingle();
        Criteria singleMale=new AndCriteria(single,male);
        printPersons(singleMale.meetCriteria(persons));
    }
    public static void printPersons(List<Person> persons){
        for(Person person:persons){
            System.out.println(person.getName()+" "+person.getGender()+" "+person.getMaritalStatus());
        }
    }
}
