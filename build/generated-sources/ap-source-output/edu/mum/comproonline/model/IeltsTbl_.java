package edu.mum.comproonline.model;

import edu.mum.comproonline.model.EnglishproTbl;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.0.v20130507-rNA", date="2014-03-12T14:49:54")
@StaticMetamodel(IeltsTbl.class)
public class IeltsTbl_ { 

    public static volatile SingularAttribute<IeltsTbl, String> iYearTaken;
    public static volatile SingularAttribute<IeltsTbl, Double> iListeningScore;
    public static volatile SingularAttribute<IeltsTbl, Double> iWritingScore;
    public static volatile SingularAttribute<IeltsTbl, Double> iSpeakingScore;
    public static volatile SingularAttribute<IeltsTbl, Integer> iID;
    public static volatile SingularAttribute<IeltsTbl, Double> iReadingScore;
    public static volatile SingularAttribute<IeltsTbl, Double> iOveralScore;
    public static volatile SingularAttribute<IeltsTbl, EnglishproTbl> iEnglishID;

}