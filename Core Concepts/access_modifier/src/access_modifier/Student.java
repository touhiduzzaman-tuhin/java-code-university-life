/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package access_modifier;

/**
 *
 * @author Tuhin
 */
/*
Access
Modifie      Class      Package      SubClass       World

Public        Y            Y            Y             Y
Private       Y            N            N             N
Protected     Y            Y            Y             N
Not Moifier   Y            Y            N             N


we use this.something
when the variable name and number of class name is same that time we use this
keyward and 
this.tuhin  = tuhin;
here first tuhin is number of class name
and second tuhin is local variable


*/

public class Student {
    public String name;
    public int age;
    
    private String id;
    private String email;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
}
