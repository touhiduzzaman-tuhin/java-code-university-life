/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tuhin
 */
public class User {
    protected String id;
    protected String password;
    
    public User(String u, String p)
    {
        this.id = u;
        this.password = p;
        
    }
    
    boolean login(String u, String p)
        {
            if(u.equals(id) && p.equals(password))
            {
                return true;
            }
            else
            {
                return false;
            }
        }
}
