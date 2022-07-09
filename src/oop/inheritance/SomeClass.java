package oop.inheritance;

public class SomeClass extends BaseClass {
    private Long id;
    private String familyName;

    @Override
    public Long getId() {
        return id;
    }

    public Long getBaseId(){
        return super.getId();
    }


    @Override
    public void setId(Long id) {
        this.id = id;
        super.setId(id + 1L);
    }

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    public void setName(String name){
        super.setName(name);
    }
}
