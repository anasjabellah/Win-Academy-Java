
import  java.util.LinkedList ;
import java.util.Collection ;
import java.util.stream.* ;

public class Management {
    LinkedList<Etudiant>  listE;
    LinkedList<College> listC;
    LinkedList<Ville> listvill;
    LinkedList<Adresse>  listAdresse;
    LinkedList<Groupe> listGroupe ;
    LinkedList<Salle> listSalle ;
    LinkedList<Matiere> listMatiere ;
    LinkedList<Role> listrole ;
    LinkedList<enseignant> listenseignant ;
    LinkedList<Admin> listAdmin ;

    LinkedList<Note> listNote ;





    public Management(){
        listE = new LinkedList<>();
        listC = new LinkedList<>();
        listvill = new LinkedList<>();
        listAdresse = new LinkedList<>();
        listGroupe = new  LinkedList<>();
        listSalle = new  LinkedList<>();
        listMatiere = new  LinkedList<>();
        listrole = new LinkedList<>();
        listenseignant = new LinkedList<>();
        listAdmin = new LinkedList<>();
        listNote = new LinkedList<>();
    }



    ///////////////////////////////////
    // user management all function ;
    public void addUser(Etudiant record){
        listE.add(record);
    }

    public  void getAllUser(){
        for(int i = 0 ; i < listE.size() ; i++ ){
            System.out.println("id : "+ listE.get(i).toString());
        }
    }

    public  void  getEt(int IdEte){
        System.out.println(listE.stream().filter(getEte -> getEte.getEnseignant_id() == IdEte).collect(Collectors.toList()));
    }

    ///////////////////////////////////
    // management all function in College
    public void addCollege(College recordCollege){
        listC.add(recordCollege);
    }

    public  void getCollege(int index){
        System.out.println(listC.stream().filter(getCollege -> getCollege.getIdCollege() == index).collect(Collectors.toList()));
    }

    public  void getAllCollege(){
        for(int i = 0 ; i < listC.size() ; i++ ){
            System.out.println("id : "+ listC.get(i).getIdCollege()  +" name : " + listC.get(i).getNameCollege());
        }
    }

    public  void delletCollege(int index){
        System.out.println(listC.stream().filter(getCollege -> getCollege.getIdCollege() == index).collect(Collectors.toSet()));
        listC.remove(index - 1 );
        System.out.println("is deleted");
    }

    ///////////////////////////////////
    // management all function in ville
    public  void  AddVille(Ville recordVille){
        listvill.add(recordVille);
    }

    public  void getAllVille(){
        for(int i = 0 ; i < listvill.size() ; i++ ){
            System.out.println("id : "+ listvill.get(i).getId_ville() +" name ville : "+ listvill.get(i).getVille_name());
        }
    }

    ///////////////////////////////////
    // management all function in Adresse
    public  void  AddAdresse(Adresse recordAdresse){
        listAdresse.add(recordAdresse);
    }

    public  void getAllAdresse(){
        for(int i = 0 ; i < listAdresse.size() ; i++ ){
            System.out.println("id : "+ listAdresse.get(i).getAdresse_id()  +" name : " + listAdresse.get(i).getAdresseCollege_numero());
        }
    }

    ///////////////////////////////////
    // management all function in Groupe
    public  void  AddGroupe(Groupe recordGroupe){ listGroupe.add(recordGroupe);}

    public  void  getGroup(int idGroup){
        System.out.println(listGroupe.stream().filter(getGroup -> getGroup.getGroupe_id() == idGroup).collect(Collectors.toList()));
    }
    public  void getAllGroup(){
        for(int i = 0 ; i < listGroupe.size() ; i++ ){
            System.out.println("id : "+ listGroupe.get(i).getGroupe_id()  +" name : " + listGroupe.get(i).getGroupe_name());
        }
    }


    ///////////////////////////////////
    // management all function in salle

    public  void addSalle(Salle recordSalle){ listSalle.add(recordSalle); }
    public  void getSalle(int idSalle){
        System.out.println(listSalle.stream().filter(getSalle -> getSalle.getId_salle() == idSalle).collect(Collectors.toList()));
    }
    public  void getAllSalle(){
        for(int i = 0 ; i < listSalle.size() ; i++ ){
            System.out.println("id : "+ listSalle.get(i).getId_salle()  +" name : " + listSalle.get(i).getSalleCollege_numero() + " Nbr place :"+ listSalle.get(i).getSalleNbr_place());
        }
    }

    ///////////////////////////////////////
    //    management all function in Matiere
    public  void  addMatiere(Matiere recordMatiere){
        listMatiere.add(recordMatiere);
    }
    public void  getMatiere(int nameMa){
        System.out.println(listMatiere.stream().filter(getMatiere -> getMatiere.getId_Matiere() == nameMa).collect(Collectors.toList()));
    }
    public  void getAllMatiere(){
        for(int i = 0 ; i < listMatiere.size() ; i++ ){
            System.out.println("id : "+ listMatiere.get(i).getId_Matiere()  +" name : " + listMatiere.get(i).getMatiere_name());
        }
    }
    ///////////////////////////////////////
    //    management all function in Role
    public  void  addRole(Role recordRole){
        listrole.add(recordRole);
    }

    public void  getRole(int index){
        System.out.println(listrole.stream().filter(getRole -> getRole.getRole_id() == index).collect(Collectors.toList()));
    }
    public  void getAllRole(){
        for(int i = 0 ; i < listrole.size() ; i++ ){
            System.out.println("id : "+ listrole.get(i).getRole_id()  +" name : " + listrole.get(i).getRole_name());
        }
    }


    ////////////////////////////////////////////////
    // management all function in enseignant

    public  void  addEnseignant(enseignant recordEnseignant){
        listenseignant.add(recordEnseignant);
    }

    public  void  GetAllEnseignant(){
        for(int i = 0 ; i < listenseignant.size() ; i++ ){
            System.out.println("id : "+ listenseignant.get(i).getId()  + "  name : " + listenseignant.get(i).getFirstName()  );
        }
    }

    public  void GetEnseignant(int index){
        System.out.println(listenseignant.stream().filter(getEnseignant -> getEnseignant.getId() == index).collect(Collectors.toList()));
    }


    ///////////////////////////////////////////////////
    // Management all function in admin

    public  void  addAdmin(Admin recordAdmin){
        listAdmin.add(recordAdmin);
    }

    public  void  getAllAdmin(){
        for(int i = 0 ; i < listAdmin.size() ; i++ ){
            System.out.println("id : "+ listAdmin.get(i).getId()  +"  name : " + listAdmin.get(i).firstName  );
        }
    }

    public  void GetAdmin(int index){
        System.out.println(listAdmin.stream().filter(getAdmin -> getAdmin.getId() == index).collect(Collectors.toList()));
    }


}
