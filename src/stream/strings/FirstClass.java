package stream.strings;

import java.util.List;

public class FirstClass {
    Long id;
    List<SecondClass> secondClass;

    public FirstClass(Long id, List<SecondClass> secondClasses){
        this.id = id;
        this.secondClass = secondClasses;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<SecondClass> getSecondClass() {
        return secondClass;
    }

    public void setSecondClass(List<SecondClass> secondClass) {
        this.secondClass = secondClass;
    }
}
