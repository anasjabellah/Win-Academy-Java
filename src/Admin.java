


public class Admin extends User {

    public Admin() {
    }

    public Admin(int id, String firstName, String lastName, String email, String Phone, int role_id, int UserCollege_numero, String password) {
        super(id, firstName, lastName, email, Phone, role_id, UserCollege_numero, password);
    }

    @Override
    public String toString() {
        return "Admin{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", Phone='" + Phone + '\'' +
                ", UserCollege_numero=" + UserCollege_numero +
                ", Role_id=" + Role_id +
                ", password='" + password + '\'' +
                '}';
    }
}
