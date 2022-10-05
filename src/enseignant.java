



public class enseignant extends User {

    private  int depatement_id ;
    private  int matiere_id ;
    private  int is_responsable ;
    private  String date_prise_fonction ;


    public  enseignant(){};

    public enseignant(int depatement_id, int matiere_id, int is_responsable, String date_prise_fonction) {
        this.depatement_id = depatement_id;
        this.matiere_id = matiere_id;
        this.is_responsable = is_responsable;
        this.date_prise_fonction = date_prise_fonction;
    }

    public enseignant(int id, String firstName, String lastName, String email, String Phone, int role_id, int UserCollege_numero, String password  , int depatement_id, int matiere_id, int is_responsable, String date_prise_fonction) {
        super(id, firstName, lastName, email, Phone, role_id, UserCollege_numero , password);
        this.depatement_id = depatement_id;
        this.matiere_id = matiere_id;
        this.is_responsable = is_responsable;
        this.date_prise_fonction = date_prise_fonction;
    }

    public int getDepatement_id() {
        return depatement_id;
    }

    public int getMatiere_id() {
        return matiere_id;
    }

    public int getIs_responsable() {
        return is_responsable;
    }

    public String getDate_prise_fonction() {
        return date_prise_fonction;
    }

    public void setDepatement_id(int depatement_id) {
        this.depatement_id = depatement_id;
    }

    public void setMatiere_id(int matiere_id) {
        this.matiere_id = matiere_id;
    }

    public void setIs_responsable(int is_responsable) {
        this.is_responsable = is_responsable;
    }

    public void setDate_prise_fonction(String date_prise_fonction) {
        this.date_prise_fonction = date_prise_fonction;
    }


    @Override
    public String toString() {
        return "enseignant{" +
                "depatement_id=" + depatement_id +
                ", matiere_id=" + matiere_id +
                ", is_responsable=" + is_responsable +
                ", date_prise_fonction='" + date_prise_fonction + '\'' +
                ", id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", Phone='" + Phone + '\'' +
                ", UserCollege_numero=" + UserCollege_numero +
                ", Role_id=" + Role_id +
                '}';
    }
}
