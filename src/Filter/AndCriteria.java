package Filter;

import java.util.List;

public class AndCriteria implements Criteria {
    private Criteria criteria;
    private Criteria otherCritera;

    public AndCriteria(Criteria criteria, Criteria otherCritera) {
        this.criteria = criteria;
        this.otherCritera = otherCritera;
    }

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> firstCriteraPersons=criteria.meetCriteria(persons);
        return otherCritera.meetCriteria(firstCriteraPersons);
    }
}
