package Filter;

import java.util.ArrayList;
import java.util.List;

public class CriteraMale implements Criteria {
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> malePersons=new ArrayList<>();
        for(Person person:persons){
            if(person.getGender().equalsIgnoreCase("MALE")){
                malePersons.add(person);
            }
        }
        return malePersons;
    }
}
