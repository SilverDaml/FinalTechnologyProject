
package logic;


import javax.persistence.Entity;

@Entity(name = "User")
@javax.persistence.Table(name = "\"User\"")
public class User extends Person {
    
    private String password;
    private String email;
    
    public User () {
        
    }

    public User(String fname, String lname, String email, String password) {
        // Call the super constructor to initialize the inherited fields (fname and lname)
        super.setFname(fname);
        super.setLname(lname);
        this.email = email;
        this.password = password;
    }

   

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
    
    
}
