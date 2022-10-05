

import java.util.Arrays;
import java.util.Scanner ;

public
class User {

    protected int  id ;
    protected String firstName ;
    protected String lastName ;
    protected String email ;
    protected String Phone ;

    protected int UserCollege_numero ;

    protected  int Role_id ;

    protected  String password ;

    public User(){}

    public User(int id,String firstName, String lastName,String email, String Phone , int role_id , int  UserCollege_numero , String password ){

        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email =email;
        this.Phone = Phone;
        this.Role_id = role_id ;
        this.UserCollege_numero = UserCollege_numero ;
        this.password = password ;

    }

    public  int getId(){
        return id ;
    }

    public  void setId(int id){
        this.id = id ;
    }

    // Getter
    public String getFirstName() {
        return firstName;
    }

    // Setter
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    // Getter
    public String getLastName() {
        return lastName;
    }

    // Setter
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    // Getter
    public String getPhone() {
        return Phone;
    }

    // Setter
    public void setPhone(String phone) {
        this.Phone = phone;
    }


    // Getter
    public String getEmail() {
        return email;
    }

    // Setter
    public void setEmail(String email) {
        this.email = email;
    }


    public int getUserCollege_numero() {
        return UserCollege_numero;
    }

    public int getRole_id() {
        return Role_id;
    }


    public void setUserCollege_numero(int userCollege_numero) {
        UserCollege_numero = userCollege_numero;
    }


    public void setRole_id(int role_id) {
        Role_id = role_id;
    }

    public  String getPassword(){
        return password ;
    }

    public  void setPassword(String password){
        this.password = password ;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", Phone='" + Phone + '\'' +
                ", UserCollege_numero=" + UserCollege_numero +
                ", Role_id=" + Role_id +
                ", Passworde =" + password +

                '}';
    }


}
