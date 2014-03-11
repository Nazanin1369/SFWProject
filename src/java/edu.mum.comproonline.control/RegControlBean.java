/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.mum.comproonline.control;

import edu.mum.comproonline.model.UserTbl;
import edu.mum.comproonline.model.UserDaoBean;
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

    public void saveRegInfo(RegMB regMB) throws Exception {
        UserTbl newAppl = new UserTbl();
        newAppl.setFirstName(regMB.getFirstName());
        newAppl.setMiddleName(regMB.getMiddleName());
        newAppl.setLastName(regMB.getLastName());
        newAppl.setUserEmail(regMB.getUserEmail());
        newAppl.setPassword(regMB.getPassword());
        newAppl.setRoles('2');
        newAppl.setStatus(true);

        //DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
        Calendar cal = Calendar.getInstance();
        newAppl.setLastLoginDate(null);
        newAppl.setCreationDate(cal.getTime());

        myApplicantDAO.create(newAppl);
        //System.out.println("Account Created");
    }

    public boolean emailExists(RegMB regMB) throws Exception {

        int counter = myApplicantDAO.countEmails(regMB.getUserEmail());
        if (counter > 0) {
            return true;
        }
        return false;

    }

}
