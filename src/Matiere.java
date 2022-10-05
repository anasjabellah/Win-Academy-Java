


public class Matiere {

    private int  id_Matiere ;
    private String  matiere_name ;
    private int  is_deleted ;

    public  Matiere(){};

    public Matiere(int id_Matiere, String matiere_name, int is_deleted) {
        this.id_Matiere = id_Matiere;
        this.matiere_name = matiere_name;
        this.is_deleted = is_deleted;
    }

    public void setId_Matiere(int id_Matiere) {
        this.id_Matiere = id_Matiere;
    }

    public void setMatiere_name(String matiere_name) {
        this.matiere_name = matiere_name;
    }

    public void setIs_deleted(int is_deleted) {
        this.is_deleted = is_deleted;
    }

    public int getId_Matiere() {
        return id_Matiere;
    }

    public String getMatiere_name() {
        return matiere_name;
    }

    public int getIs_deleted() {
        return is_deleted;
    }

    @Override
    public String toString() {
        return "Matiere{" +
                "id_Matiere=" + id_Matiere +
                ", matiere_name='" + matiere_name + '\'' +
                '}';
    }
}
