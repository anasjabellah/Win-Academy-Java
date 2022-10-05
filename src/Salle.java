





public class Salle {

    private int  id_salle ;
    private int  SalleCollege_numero ;
    private int  SalleMatiere_id ;
    private int  SalleNbr_place ;
    private int  SalleIs_deleted ;

    public  Salle(){}


    public Salle(int id_salle, int salleCollege_numero, int salleMatiere_id, int salleNbr_place, int salleIs_deleted) {
        this.id_salle = id_salle;
        SalleCollege_numero = salleCollege_numero;
        SalleMatiere_id = salleMatiere_id;
        SalleNbr_place = salleNbr_place;
        SalleIs_deleted = salleIs_deleted;
    }

    public void setId_salle(int id_salle) {
        this.id_salle = id_salle;
    }

    public void setSalleCollege_numero(int salleCollege_numero) {
        SalleCollege_numero = salleCollege_numero;
    }

    public void setSalleMatiere_id(int salleMatiere_id) {
        SalleMatiere_id = salleMatiere_id;
    }

    public void setSalleNbr_place(int salleNbr_place) {
        SalleNbr_place = salleNbr_place;
    }

    public void setSalleIs_deleted(int salleIs_deleted) {
        SalleIs_deleted = salleIs_deleted;
    }


    public int getId_salle() {
        return id_salle;
    }

    public int getSalleCollege_numero() {
        return SalleCollege_numero;
    }

    public int getSalleMatiere_id() {
        return SalleMatiere_id;
    }

    public int getSalleNbr_place() {
        return SalleNbr_place;
    }

    public int getSalleIs_deleted() {
        return SalleIs_deleted;
    }

    @Override
    public String toString() {
        return "Salle{" +
                "id_salle=" + id_salle +
                ", SalleCollege_numero=" + SalleCollege_numero +
                ", SalleMatiere_id=" + SalleMatiere_id +
                ", SalleNbr_place=" + SalleNbr_place +
                '}';
    }
}
