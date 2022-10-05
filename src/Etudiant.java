

public class Etudiant extends User {

    private int enseignant_id ;
    private int groupe_id ;

    public  Etudiant(){};


    public Etudiant(int enseignant_id, int groupe_id) {
        this.enseignant_id = enseignant_id;
        this.groupe_id = groupe_id;
    }


    public Etudiant(int id, String firstName, String lastName, String email, String Phone, int role_id, int UserCollege_numero, String password , int enseignant_id, int groupe_id) {
        super(id, firstName, lastName, email, Phone, role_id, UserCollege_numero , password );
        this.enseignant_id = enseignant_id;
        this.groupe_id = groupe_id;
    }

    public void setEnseignant_id(int enseignant_id) {
        this.enseignant_id = enseignant_id;
    }

    public void setGroupe_id(int groupe_id) {
        this.groupe_id = groupe_id;
    }

    public int getEnseignant_id() {
        return enseignant_id;
    }

    public int getGroupe_id() {
        return groupe_id;
    }

    @Override
    public String toString() {
        return "Etudiant{" +

                ", id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", Phone='" + Phone + '\'' +
                ", UserCollege_numero=" + UserCollege_numero +
                ", Role_id=" + Role_id +
                "enseignant_id=" + enseignant_id +
                ", groupe_id=" + groupe_id +
                '}';
    }
}
