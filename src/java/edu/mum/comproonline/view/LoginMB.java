/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.mum.comproonline.view;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author User
 */
@ManagedBean
@RequestScoped
public class LoginMB {

    /**
     * Creates a new instance of LoginMB
     */
    public LoginMB() {
    }
//    @EJB
//    private LoginControlBean loginControlBean;
    private String username;
    private String password;
    private String errormessage;

    
    public String getErrormessage() {
        return errormessage;
    }

    public void setErrormessage(String errormessage) {
        this.errormessage = errormessage;
    }

       
    
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public void checkLogin() throws Exception
    {
//    
//        String result=loginControlBean.checkLogin(this);
//        
//          
//        
//        if(result.equals("found"))
//        {
//        FacesContext facesContext = FacesContext.getCurrentInstance();
//        HttpSession session = (HttpSession) facesContext.getExternalContext().getSession(true);
//        session.setAttribute("susername", this.username);
//        return "adminhome.xhtml";
//        
//        
//        }
//        else if(result.equals("NoObject"))
//        this.errormessage="For new user need to register first!!";
//        
//        else this.errormessage="Password is incorrect try agaain !!!";
//        return "login.xhtml";
//       
//        
//        
//        
//        
//         
    }
    
}

