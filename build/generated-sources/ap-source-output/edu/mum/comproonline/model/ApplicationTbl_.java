package edu.mum.comproonline.model;

import edu.mum.comproonline.model.EducationaldataTbl;
import edu.mum.comproonline.model.EnglishproTbl;
import edu.mum.comproonline.model.PersonaldataTbl;
import edu.mum.comproonline.model.ProfessionalexpTbl;
import edu.mum.comproonline.model.UserTbl;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.0.v20130507-rNA", date="2014-03-12T14:49:54")
@StaticMetamodel(ApplicationTbl.class)
public class ApplicationTbl_ { 

    public static volatile CollectionAttribute<ApplicationTbl, EnglishproTbl> englishproTblCollection;
    public static volatile SingularAttribute<ApplicationTbl, Integer> appStatus;
    public static volatile CollectionAttribute<ApplicationTbl, PersonaldataTbl> personaldataTblCollection;
    public static volatile SingularAttribute<ApplicationTbl, UserTbl> appUserID;
    public static volatile SingularAttribute<ApplicationTbl, Integer> appScore;
    public static volatile CollectionAttribute<ApplicationTbl, EducationaldataTbl> educationaldataTblCollection;
    public static volatile CollectionAttribute<ApplicationTbl, ProfessionalexpTbl> professionalexpTblCollection;
    public static volatile SingularAttribute<ApplicationTbl, Integer> appID;

}