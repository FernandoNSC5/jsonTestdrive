package gson.object;

import java.util.List;

public class People {
    private List<Person> people;

    public People(List<Person> pPeople)
    {
        this.people = pPeople;
    }

    public void setPeople(List<Person> pPeople)
    {
        this.people = pPeople;
    }

    public List<Person> getPeople()
    {
        return people;
    }

    public String toString()
    {
        StringBuffer stringBuffer = new StringBuffer();
        for(Person person : people)
        {
            stringBuffer.append(person.toString() + "\n");
        }
        return stringBuffer.toString();
    }
}
