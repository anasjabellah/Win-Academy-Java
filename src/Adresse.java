



public class Adresse {

    private  int adresse_id ;
    private  int AdresseCollege_numero ;
    private  int AdresseVille_id ;

    public Adresse(){};

    public  Adresse(int adresse_id , int AdresseCollege_numero , int AdresseVille_id){
        this.adresse_id = adresse_id ;
        this.AdresseCollege_numero = AdresseCollege_numero ;
        this.AdresseVille_id = AdresseVille_id ;
    }


    public  int getAdresse_id(){
        return adresse_id ;
    }

    public  void setAdresse_id(int adresse_id){
        this.adresse_id = adresse_id ;
    }

    // Getter
    public int getAdresseCollege_numero() {
        return AdresseCollege_numero;
    }

    // Setter
    public void setCollege_numero(int AdresseCollege_numero) {
        this.AdresseCollege_numero = AdresseCollege_numero;
    }

    // Getter
    public int getAdresseVille_id() {
        return AdresseVille_id;
    }

    // Setter
    public void setAdresseVille_id(int AdresseVille_id) {
        this.AdresseVille_id = AdresseVille_id;
    }


    @Override
    public String toString() {
        return "Adresse{" +
                "id=" + adresse_id +
                ", id college ='" + AdresseVille_id + '\'' +
                ", id ville ='" + AdresseVille_id + '\'' +
                '}';
    }



}
