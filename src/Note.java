


public class Note {

    private int   id_Note ;
    private int   matiere_idNote ;
    private int   user_etudiant_id ;
    private int   valeurNote ;
    private int   is_deleted ;

    public Note(int id_Note, int matiere_idNote, int user_etudiant_id, int valeurNote, int is_deleted) {
        this.id_Note = id_Note;
        this.matiere_idNote = matiere_idNote;
        this.user_etudiant_id = user_etudiant_id;
        this.valeurNote = valeurNote;
        this.is_deleted = is_deleted;
    }

    public int getId_Note() {
        return id_Note;
    }

    public int getMatiere_idNote() {
        return matiere_idNote;
    }

    public int getUser_etudiant_id() {
        return user_etudiant_id;
    }

    public int getValeurNote() {
        return valeurNote;
    }

    public int getIs_deleted() {
        return is_deleted;
    }

    public void setId_Note(int id_Note) {
        this.id_Note = id_Note;
    }

    public void setMatiere_idNote(int matiere_idNote) {
        this.matiere_idNote = matiere_idNote;
    }

    public void setUser_etudiant_id(int user_etudiant_id) {
        this.user_etudiant_id = user_etudiant_id;
    }

    public void setValeurNote(int valeurNote) {
        this.valeurNote = valeurNote;
    }

    public void setIs_deleted(int is_deleted) {
        this.is_deleted = is_deleted;
    }


    @Override
    public String toString() {
        return "Note { " +
                "id_Note=" + id_Note +
                ", matiere_idNote=" + matiere_idNote +
                ", user_etudiant_id=" + user_etudiant_id +
                ", valeurNote=" + valeurNote +
                ", is_deleted=" + is_deleted +
                '}';
    }
}
