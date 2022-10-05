

public class Groupe {

    private int  Groupe_id ;
    private int  Groupe_enseignant_id ;
    private String  Groupe_name ;

    public  Groupe(){}

    public  Groupe(int Groupe_id , int Groupe_enseignant_id , String  Groupe_name){
        this.Groupe_id = Groupe_id ;
        this.Groupe_enseignant_id = Groupe_enseignant_id ;
        this.Groupe_name = Groupe_name ;
    }


    public  int getGroupe_id(){
        return Groupe_id ;
    }

    public  void setGroupe_id(int Groupe_id){
        this.Groupe_id = Groupe_id ;
    }


    public  int getGroupe_enseignant_id(){ return Groupe_enseignant_id ;}

    public  void setGroupe_enseignant_id(int Groupe_enseignant_id){ this.Groupe_enseignant_id = Groupe_enseignant_id ;}


    public  String getGroupe_name(){ return Groupe_name ;}

    public  void setGroupe_name(String Groupe_name){ this.Groupe_name = Groupe_name ;}


    @Override
    public String toString() {
        return "Groupe {" +
                "Groupe_id =" + Groupe_id +
                ", Groupe_enseignant_id ='" + Groupe_enseignant_id + '\'' +
                ", Groupe_name ='" + Groupe_name + '\'' +
                '}';
    }

}
