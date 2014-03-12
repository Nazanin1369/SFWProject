package edu.mum.comproonline.model;

import edu.mum.comproonline.model.CoursesTbl;
import edu.mum.comproonline.model.EducationaldataTbl;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.0.v20130507-rNA", date="2014-03-12T14:47:46")
@StaticMetamodel(InstituteTbl.class)
public class InstituteTbl_ { 

    public static volatile SingularAttribute<InstituteTbl, String> instituteSubject;
    public static volatile SingularAttribute<InstituteTbl, String> instituteFinalGPA;
    public static volatile CollectionAttribute<InstituteTbl, CoursesTbl> coursesTblCollection;
    public static volatile SingularAttribute<InstituteTbl, String> instituteDegree;
    public static volatile SingularAttribute<InstituteTbl, String> instituteDegreeStatus;
    public static volatile SingularAttribute<InstituteTbl, String> instituteStartDate;
    public static volatile SingularAttribute<InstituteTbl, String> instituteCounty;
    public static volatile SingularAttribute<InstituteTbl, Integer> instituteID;
    public static volatile SingularAttribute<InstituteTbl, String> instituteArea;
    public static volatile SingularAttribute<InstituteTbl, String> instituteCity;
    public static volatile SingularAttribute<InstituteTbl, String> instituteEndDate;
    public static volatile SingularAttribute<InstituteTbl, String> instituteName;
    public static volatile SingularAttribute<InstituteTbl, String> instituteGradingScale;
    public static volatile SingularAttribute<InstituteTbl, EducationaldataTbl> instituteEdID;

}