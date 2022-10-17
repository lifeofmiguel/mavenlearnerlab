import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class People{

    private List<Person> personList = new ArrayList<>();

    public List<Person> getPersonList() {
        return personList;
    }

    public void setPersonList(List<Person> personList) {
        this.personList = personList;
    }

    public void add(Person person){
        personList.add(person);
    }

    public Person findById(Long id){
        for(Person x : personList){
            Long i = x.getId();
            if(i.equals(id)){
                return x;
            }
        }
        return null;
    }

    public void contains(Person person){
        personList.contains(person);
    }

    public void remove(Person person){
        personList.remove(person);
    }

    public void removeAll(){
        personList.clear();
    }

    public int count(){
        return personList.size();
    }

    public Person[] toArray(){
        return personList.toArray(new Person[0]);
    }
    public Iterator<Person> iterator(){
        return personList.iterator();
    }

}
