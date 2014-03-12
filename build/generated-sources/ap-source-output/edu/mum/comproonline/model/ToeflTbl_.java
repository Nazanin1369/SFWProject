package edu.mum.comproonline.model;

import edu.mum.comproonline.model.EnglishproTbl;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.0.v20130507-rNA", date="2014-03-12T14:47:46")
@StaticMetamodel(ToeflTbl.class)
public class ToeflTbl_ { 

    public static volatile SingularAttribute<ToeflTbl, Integer> tID;
    public static volatile SingularAttribute<ToeflTbl, EnglishproTbl> tEnglishID;
    public static volatile SingularAttribute<ToeflTbl, Double> tScore;
    public static volatile SingularAttribute<ToeflTbl, String> tYearTaken;

}