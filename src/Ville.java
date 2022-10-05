


public class Ville {


    private int id_ville ;
    private String ville_name ;


    public Ville(){}

    public  Ville(int id, String ville_name){

        this.id_ville = id;
        this.ville_name = ville_name;

    }

    public  int getId_ville(){
        return id_ville ;
    }

    public  void setId_ville(int id){
        this.id_ville = id ;
    }

    // Getter
    public String getVille_name() {
        return ville_name;
    }

    // Setter
    public void setVille_name(String ville_name) {
        this.ville_name = ville_name;
    }


    @Override
    public String toString() {
        return "Ville {" +
                "id=" + id_ville +
                ", villeName='" + ville_name + '\'' +
                '}';
    }



}
