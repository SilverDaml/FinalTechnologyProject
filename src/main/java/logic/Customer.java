
package logic;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;


@Entity(name = "Customer")
@javax.persistence.Table(name = "\"Customer\"")
public class Customer extends Person implements Serializable {

    public Customer() {
    }
    
    
    
}
