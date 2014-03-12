package edu.mum.comproonline.model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.0.v20130507-rNA", date="2014-03-12T14:49:54")
@StaticMetamodel(UserTbl.class)
public class UserTbl_ { 

    public static volatile SingularAttribute<UserTbl, Integer> userID;
    public static volatile SingularAttribute<UserTbl, Date> userLastLoginDate;
    public static volatile SingularAttribute<UserTbl, String> userFirstName;
    public static volatile SingularAttribute<UserTbl, String> userPassword;
    public static volatile SingularAttribute<UserTbl, Integer> userStatus;
    public static volatile SingularAttribute<UserTbl, String> userEmail;
    public static volatile SingularAttribute<UserTbl, Date> userCreationDate;
    public static volatile SingularAttribute<UserTbl, String> userLastName;
    public static volatile SingularAttribute<UserTbl, Integer> userRole;
    public static volatile SingularAttribute<UserTbl, String> userMiddleName;

}