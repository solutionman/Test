package stream.strings;

public class SecondClass {
    Long id;
    String someCode;

    public SecondClass(Long id, String someCode){
        this.id = id;
        this.someCode = someCode;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSomeCode() {
        return someCode;
    }

    public void setSomeCode(String someCode) {
        this.someCode = someCode;
    }
}
