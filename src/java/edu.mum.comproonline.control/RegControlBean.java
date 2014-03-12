/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.mum.comproonline;

import edu.mum.comproonline.model.UserTbl;
import edu.mum.comproonline.model.UserDaoBean;
import edu.mum.comproonline.model.UserTbl;
import edu.mum.comproonline.util.HashService;
import edu.mum.comproonline.view.RegMB;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;

/**
 *
 * @author User
 */
@Stateless
@LocalBean
public class RegControlBean {

    @EJB
    UserDaoBean myApplicantDAO;
    HashService myHashService;

    public void saveRegInfo(RegMB regMB) throws Exception {
        UserTbl newAppl = new UserTbl();
        newAppl.setUserFirstName(regMB.getFirstName());
        newAppl.setUserMiddleName(regMB.getMiddleName());
        newAppl.setUserLastName(regMB.getLastName());
        newAppl.setUserEmail(regMB.getEmail());
        myHashService = new HashService();
        myHashService.setPassWord(regMB.getPassword().toString());       
        newAppl.setUserPassword(myHashService.getMessageDigest());

        newAppl.setUserRole(regMB.getRoles());
        newAppl.setUserStatus(1);

        //DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
        Calendar cal = Calendar.getInstance();
        newAppl.setUserLastLoginDate(null);
        newAppl.setUserCreationDate(cal.getTime());

        myApplicantDAO.create(newAppl);

        System.out.println(myHashService.getPassWord());
    }

    public boolean emailExists(RegMB regMB) throws Exception {
        int counter = myApplicantDAO.countEmails(regMB.getEmail());
        if (counter > 0) {
            return true;
        }
        return false;

    }

}
