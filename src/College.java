


public class College {

    private int id ;
    private String name ;

    public College(){}

    public College(int id, String name){

        this.id = id;
        this.name = name;

    }

    public  int getIdCollege(){
        return id ;
    }

    public  void setIdCollege(int id){
        this.id = id ;
    }

    public String getNameCollege(){
        return name ;
    }

    public  void  setNameCollege(String name){
        this.name = name ;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }







}
