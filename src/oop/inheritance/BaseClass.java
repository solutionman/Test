package oop.inheritance;

public class BaseClass {
    private Long id;
    private String name;
    private String nickName;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    public void setNickName(String nickName){
        this.nickName = nickName;
    }

    public String getNickName(){
        return nickName;
    }
}
