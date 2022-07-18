package equals;

public class Third {
    int id;
    String name;
    void setId(int id){
        this.id = id;
    }
    void setName(String name){
        this.name = name;
    }
    int getId(){
        return id;
    }
    String getName(){
        return name;
    }
    @Override
    public boolean equals(Object o){
        if(o == null) return false;
        if(o == this) return true;
        if(getClass() != o.getClass()) return false;
        Third third = (Third) o;
        if(id == third.id && name.equals(third.name)){
            return true;
        }
        return false;
    }

    @Override
    public int hashCode(){
        return id * name.hashCode();
    }
}
