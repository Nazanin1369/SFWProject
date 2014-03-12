package edu.mum.comproonline.model;

import edu.mum.comproonline.model.ApplicationTbl;
import edu.mum.comproonline.model.InstituteTbl;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.0.v20130507-rNA", date="2014-03-12T14:49:54")
@StaticMetamodel(EducationaldataTbl.class)
public class EducationaldataTbl_ { 

    public static volatile SingularAttribute<EducationaldataTbl, ApplicationTbl> edAppID;
    public static volatile SingularAttribute<EducationaldataTbl, Integer> edID;
    public static volatile CollectionAttribute<EducationaldataTbl, InstituteTbl> instituteTblCollection;

}