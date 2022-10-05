import java.util.*;

public class Main {


    public static void main(String[] args) {

        // user obj
        Management usEt = new Management();
        Management coll = new Management();
        Management Vill = new Management();
        Management Adres = new Management();
        Management Group = new Management();
        Management Sall = new Management();
        Management Matier  = new Management();
        Management Roles = new Management();
        Management enseign = new Management();
        Management admin =  new Management();


        Role recordRole = new Role();
        recordRole.setRole_id(1);
        recordRole.setRole_name("Etudiant");
        Roles.addRole(recordRole);


        Matiere recordMatiere = new  Matiere();
               recordMatiere.setId_Matiere(1);
               recordMatiere.setMatiere_name("mat");
               recordMatiere.setIs_deleted(0);
        Matier.addMatiere(recordMatiere);


        Salle  recordSalle = new Salle();
               recordSalle.setId_salle(1);
               recordSalle.setSalleCollege_numero(1);
               recordSalle.setSalleMatiere_id(1);
               recordSalle.setSalleNbr_place(22);
               recordSalle.setSalleIs_deleted(0);
        Sall.addSalle(recordSalle);


        Groupe  recordGroupe = new Groupe();
                recordGroupe.setGroupe_id(1);
                recordGroupe.setGroupe_enseignant_id(1);
                recordGroupe.setGroupe_name("A");
        Group.AddGroupe(recordGroupe);

        Adresse recordAdresse = new Adresse();
                recordAdresse.setAdresse_id(1);
                recordAdresse.setCollege_numero(1);
                recordAdresse.setAdresse_id(1);
        Adres.AddAdresse(recordAdresse);


        Ville recordVille = new Ville();
              recordVille.setId_ville(1);
              recordVille.setVille_name("casa");
        Vill.AddVille(recordVille);

        // college management
        College recordCollege = new College();
                          recordCollege.setIdCollege(1);
                          recordCollege.setNameCollege("banzayad");
        coll.addCollege(recordCollege);

        // college user
        Etudiant record = new Etudiant();
            record.setId(1);
            record.setFirstName("anass");
            record.setLastName("anass");
            record.setPhone("1234567");
            record.setEmail("anass@test.com");
            record.setPassword("12223333");
            record.setGroupe_id(1);
            record.setEnseignant_id(1);
        usEt.addUser(record);

        enseignant recordEnseignant = new enseignant();
                   recordEnseignant.setId(1);
                   recordEnseignant.setFirstName("amin");
                   recordEnseignant.setLastName("lamidi");
                   recordEnseignant.setPhone("10200330303");
                   recordEnseignant.setEmail("anas@gmail.com");
                   recordEnseignant.setPassword("122339393");
                   recordEnseignant.setDepatement_id(1);
                   recordEnseignant.setMatiere_id(1);
                   recordEnseignant.setIs_responsable(0);
                   recordEnseignant.setDate_prise_fonction("09/02/2022");
        enseign.addEnseignant(recordEnseignant);


        Admin recordAdmin = new Admin();
             recordAdmin.setId(1);
             recordAdmin.setFirstName("amin");
             recordAdmin.setLastName("lamidi");
             recordAdmin.setPhone("10200330303");
             recordAdmin.setEmail("anas@gmail.com");
             recordAdmin.setRole_id(3);
             recordAdmin.setUserCollege_numero(1);
             recordAdmin.setPassword("aqseq12233");
        admin.addAdmin(recordAdmin);



        Scanner scanner = new Scanner(System.in);

        int i = 0 ;
        int n = 1 ;

        do {

            i++ ;
            n++ ;

            System.out.println("--------------------------------------------");
            System.out.println("---------------------------------------------");

            System.out.println("1.  Add user        .");
            System.out.println("2.  Add College     .");
            System.out.println("3.  delete College  .");
            System.out.println("4.  Add Ville       .");
            System.out.println("5.  Add Adresse     .");
            System.out.println("6.  Add Groupe      .");
            System.out.println("7.  Add Salle       .");
            System.out.println("8.  Add Matiere     .");
            System.out.println("9.  Add Role        .");
            System.out.println("10.  Search          .");
            System.out.println("11.  Close           .");



            System.out.print(":_ ");

            int Namber  =  scanner.nextInt();


            switch (Namber) {
                case 1:


                    int Iuser = 0;
                    int Nuser = 1;

                    do {
                        Scanner scannerUsers = new Scanner(System.in);
                        Iuser++;
                        Nuser++;

                        System.out.println("--------------------------------------------");
                        System.out.println("1. do you Add Etudiant     .");
                        System.out.println("2. do you Add Enseignant   .");
                        System.out.println("3. do you  Admin           .");
                        System.out.println("4. do you cloas            .");
                        System.out.println("---------------------------------------------");

                        System.out.print(":_ ");
                        int SeUser = scanner.nextInt();

                        switch (SeUser) {
                            case 1:

                                Scanner scannerUser = new Scanner(System.in);
                                int id, id_collegeUser, enseignant_id, groupe_id;
                                String firstName, lastName, email, phone;


                                System.out.print("enter id user : ");
                                id = scannerUser.nextInt();

                                System.out.print("enter your first name : ");
                                firstName = scannerUser.next();

                                System.out.print("enter your last name : ");
                                lastName = scannerUser.next();

                                System.out.print("enter your  email : ");
                                email = scannerUser.next();

                                System.out.print("enter your phone : ");
                                phone = scannerUser.next();

                                System.out.print("enter your id college  : ");
                                coll.getAllCollege();
                                id_collegeUser = scannerUser.nextInt();

                                System.out.print("enter id enseignant :");
                                enseignant_id = scannerUsers.nextInt();

                                System.out.print("enter id Group :");
                                Group.getAllGroup();
                                groupe_id = scannerUsers.nextInt();


                                record = new Etudiant(id, firstName, lastName, email, phone, 1, id_collegeUser, "82273837", enseignant_id, groupe_id);
                                usEt.addUser(record);
                                System.out.println(record.toString());

                                break;
                            case 2:

                                Scanner scannerEnseignant = new Scanner(System.in);
                                int idEnseignant, id_collegeEnseignant, depatement_idEnseignant, matiere_idEnseignant;
                                String firstNameEnseignant, lastNameEnseignant, emailEnseignant, phoneEnseignant, date_prise_fonction;


                                System.out.print("enter id user : ");
                                idEnseignant = scannerEnseignant.nextInt();

                                System.out.print("enter your first name : ");
                                firstNameEnseignant = scannerEnseignant.next();

                                System.out.print("enter your last name : ");
                                lastNameEnseignant = scannerEnseignant.next();

                                System.out.print("enter your  email : ");
                                emailEnseignant = scannerEnseignant.next();

                                System.out.print("enter your phone : ");
                                phoneEnseignant = scannerEnseignant.next();

                                System.out.print("enter your id college  : ");
                                coll.getAllCollege();
                                id_collegeEnseignant = scannerEnseignant.nextInt();

                                System.out.print("enter id depatement :");
                                depatement_idEnseignant = scannerEnseignant.nextInt();

                                System.out.print("enter id matiere :");
                                Matier.getAllMatiere();
                                matiere_idEnseignant = scannerEnseignant.nextInt();

                                System.out.print("enter date prise fonction :");
                                date_prise_fonction = scannerEnseignant.next();

                                recordEnseignant = new enseignant(idEnseignant, firstNameEnseignant, lastNameEnseignant, emailEnseignant, phoneEnseignant, 2, id_collegeEnseignant, "627576", depatement_idEnseignant, matiere_idEnseignant, 0, date_prise_fonction);
                                enseign.addEnseignant(recordEnseignant);
                                System.out.println(recordEnseignant.toString());

                                break;

                            case 3:
                                Scanner scannerAdmin = new Scanner(System.in);
                                int idAdmin, id_collegeAdmin;
                                String firstNameAdmin, lastNameAdmin, emailAdmin, phoneAdmin, passwordAdmin;


                                System.out.print("enter id user : ");
                                idAdmin = scannerAdmin.nextInt();

                                System.out.print("enter your first name : ");
                                firstNameAdmin = scannerAdmin.next();

                                System.out.print("enter your last name : ");
                                lastNameAdmin = scannerAdmin.next();

                                System.out.print("enter your  email : ");
                                emailAdmin = scannerAdmin.next();

                                System.out.print("enter your phone : ");
                                phoneAdmin = scannerAdmin.next();

                                System.out.print("enter your id college  : ");
                                coll.getAllCollege();
                                id_collegeAdmin = scannerAdmin.nextInt();

                                System.out.print("enter your Password  : ");
                                passwordAdmin = scannerAdmin.next();


                                recordAdmin = new Admin(idAdmin, firstNameAdmin, lastNameAdmin, emailAdmin, phoneAdmin, 3, id_collegeAdmin, passwordAdmin);
                                admin.addAdmin(recordAdmin);
                                System.out.println(recordAdmin.toString());

                                break;

                            case 4:
                                Iuser++;
                                break;
                        }


                    } while (Iuser < Nuser);


                    break;

                case 2:


                    Scanner scannerCollege = new Scanner(System.in);
                    int idCollege;
                    String nameCollege;

                    System.out.print("enter id college : ");
                    idCollege = scannerCollege.nextInt();

                    System.out.print("enter  name college  : ");
                    nameCollege = scannerCollege.next();

                    recordCollege = new College(idCollege, nameCollege);
                    coll.addCollege(recordCollege);
                    System.out.println(recordCollege.toString());

                    break;
                case 3:

                    Scanner scannerdellCollege = new Scanner(System.in);
                    int idDGetCollege;

                    System.out.print("enter id college : ");
                    idDGetCollege = scannerdellCollege.nextInt();

                    coll.delletCollege(idDGetCollege);

                    break;

                case 4:

                    Scanner scannerVille = new Scanner(System.in);
                    int idVille;
                    String nameVille;

                    System.out.print("enter id Ville : ");
                    idVille = scannerVille.nextInt();

                    System.out.print("enter your name Ville : ");
                    nameVille = scannerVille.next();

                    recordVille = new Ville(idVille, nameVille);
                    Vill.AddVille(recordVille);
                    System.out.println(recordVille.toString());


                    break;

                case 5:

                    Scanner scannerAdd = new Scanner(System.in);
                    int id_adresse, college_id, adresse_name;

                    System.out.print("enter id adresse  :");
                    id_adresse = scannerAdd.nextInt();


                    System.out.println("entre id college :");
                    coll.getAllCollege();
                    college_id = scannerAdd.nextInt();


                    System.out.println("enter id ville");
                    Vill.getAllVille();
                    adresse_name = scannerAdd.nextInt();

                    recordAdresse = new Adresse(id_adresse, college_id, adresse_name);
                    Adres.AddAdresse(recordAdresse);
                    System.out.println(recordAdresse.toString());

                    break;

                case 6:

                    Scanner scannerGroupe = new Scanner(System.in);
                    int Groupe_id, Groupe_enseignant_id;
                    String Groupe_name;

                    System.out.print("enter id Group  :");
                    Groupe_id = scannerGroupe.nextInt();


                    System.out.println("entre id enseignant :");
                    enseign.GetAllEnseignant();
                    Groupe_enseignant_id = scannerGroupe.nextInt();


                    System.out.println("enter name Group");
                    Groupe_name = scannerGroupe.next();

                    recordGroupe = new Groupe(Groupe_id, Groupe_enseignant_id, Groupe_name);
                    Group.AddGroupe(recordGroupe);

                    System.out.println(recordGroupe.toString());


                    break;

                case 7:

                    Scanner scannerSalle = new Scanner(System.in);
                    int id_salle, salleCollege_numero, salleMatiere_id, salleNbr_place;

                    System.out.print("enter id Salle  :");
                    id_salle = scannerSalle.nextInt();

                    System.out.print("enter id  college    :");
                    coll.getAllCollege();
                    salleCollege_numero = scannerSalle.nextInt();

                    System.out.print("enter id matiere  :");
                    Matier.getAllMatiere();
                    salleMatiere_id = scannerSalle.nextInt();

                    System.out.print("enter nbr salle   :");
                    salleNbr_place = scannerSalle.nextInt();


                    recordSalle = new Salle(id_salle, salleCollege_numero, salleMatiere_id, salleNbr_place, 0);
                    Sall.addSalle(recordSalle);

                    System.out.println(recordSalle.toString());


                    break;

                case 8:

                    Scanner scannerMatiere = new Scanner(System.in);
                    int id_Matiere, is_del;
                    String name_Matiere;


                    System.out.print("enter id Matiere  :");
                    id_Matiere = scannerMatiere.nextInt();

                    System.out.print("enter name Matiere   :");
                    name_Matiere = scannerMatiere.next();

                    recordMatiere = new Matiere(id_Matiere, name_Matiere, 0);
                    Matier.addMatiere(recordMatiere);

                    System.out.println(recordMatiere.toString());


                    break;

                case 9:

                    Scanner scannerRole = new Scanner(System.in);
                    int id_Role;
                    String name_Role;


                    System.out.print("enter id role");
                    id_Role = scannerRole.nextInt();

                    System.out.print("enter name role :");
                    name_Role = scannerRole.next();

                    recordRole = new Role(id_Role, name_Role);
                    Roles.addRole(recordRole);


                    break;
                case 10:

                    Scanner scannerSearch = new Scanner(System.in);
                    int idSearch;

                    System.out.println("1. Get College");
                    System.out.println("2. Get All College");
                    System.out.println("3. Get Salle");
                    System.out.println("4. Get All Salle");
                    System.out.println("5. Get Role");
                    System.out.println("6. Get All roles");
                    System.out.println("7. Get Matiere");
                    System.out.println("8. Get All Matiere");
                    System.out.println("9. Get Group");
                    System.out.println("10. Get All Groups");
                    System.out.println("11. Get Users");
                    System.out.println("12. Close ");

                    System.out.print("__: ");
                    idSearch = scannerSearch.nextInt();

                    switch (idSearch) {
                        case 1:

                            Scanner scannerGetCollege = new Scanner(System.in);
                            int idGetCollege;
                            String nameGetCollege;

                            System.out.print("enter id college : ");
                            idGetCollege = scannerGetCollege.nextInt();

                            coll.getCollege(idGetCollege);

                            break;
                        case 2:
                            coll.getAllCollege();
                            break;
                        case 3:
                            Scanner scannerGetSalle = new Scanner(System.in);
                            System.out.print("id salle :");

                            id_salle = scannerGetSalle.nextInt();
                            Sall.getSalle(id_salle);
                            break;
                        case 4:
                            Sall.getAllSalle();
                            break;
                        case 5:

                            Scanner scannerGetRole = new Scanner(System.in);
                            System.out.print("id Role :");

                            id_Role = scannerGetRole.nextInt();
                            Roles.getRole(id_Role);

                            break;
                        case 6:
                            Roles.getAllRole();
                            break;
                        case 7:
                            Scanner scannerGetMatiere = new Scanner(System.in);
                            System.out.print("name  Matiere :");

                            int nameMa = scannerGetMatiere.nextInt();
                            Matier.getMatiere(nameMa);
                            break;
                        case 8:
                            Matier.getAllMatiere();
                            break;
                        case 9:

                            Scanner scannerGetGroup = new Scanner(System.in);
                            System.out.print("id Group :");

                            int  idGroup = scannerGetGroup.nextInt();
                            Group.getGroup(idGroup);

                            break;
                        case 10:
                            Group.getAllGroup();
                            break;
                        case 11:

                            int casSH = 1, caseEnd = 2;

                            do {

                                casSH++;
                                caseEnd++;

                                Scanner scannerSearchUser = new Scanner(System.in);
                                int idSearchUser;

                                System.out.println("1. get Admin");
                                System.out.println("2. get all Admin");
                                System.out.println("3. get enseignant");
                                System.out.println("4. get all enseignant ");
                                System.out.println("5. get etudiant");
                                System.out.println("6. get all etudiant");
                                System.out.println("7. close");

                                idSearchUser = scannerSearchUser.nextInt();


                                switch (idSearchUser) {
                                    case 1:

                                        Scanner scannerGetAdmin = new Scanner(System.in);
                                        System.out.print("id Enseignant :");

                                        int  idGetAdmin = scannerGetAdmin.nextInt();
                                        admin.GetAdmin(idGetAdmin);

                                        break;
                                    case 2:
                                        admin.getAllAdmin();
                                        break;
                                    case 3:

                                        Scanner scannerGetEnseignant = new Scanner(System.in);
                                        System.out.print("id Enseignant :");

                                        int  idGetEnseignant = scannerGetEnseignant.nextInt();
                                        enseign.GetEnseignant(idGetEnseignant);

                                        break;
                                    case 4:
                                        enseign.GetAllEnseignant();
                                        break;
                                    case 5:

                                        Scanner scannerSearchUserEt = new Scanner(System.in);
                                        int idSearchEte;

                                        System.out.print("enter id Etudiant");
                                        idSearchEte =  scannerSearchUserEt.nextInt();
                                        usEt.getEt(idSearchEte);
                                        break;
                                    case 6:
                                        usEt.getAllUser();
                                        break;
                                    case 7:
                                        casSH = caseEnd ;
                                        break;
                                }

                            }
                            while (casSH < caseEnd);

                            break;
                    }

                    break;

                case 11:
                    i = n ;
                    break;
            }
        }
        while (i < n);



    }



}



