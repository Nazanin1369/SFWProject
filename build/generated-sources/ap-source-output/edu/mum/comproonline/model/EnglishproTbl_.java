package edu.mum.comproonline.model;

import edu.mum.comproonline.model.ApplicationTbl;
import edu.mum.comproonline.model.GreTbl;
import edu.mum.comproonline.model.IeltsTbl;
import edu.mum.comproonline.model.ToeflTbl;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.0.v20130507-rNA", date="2014-03-12T14:47:46")
@StaticMetamodel(EnglishproTbl.class)
public class EnglishproTbl_ { 

    public static volatile SingularAttribute<EnglishproTbl, Integer> enListeningAbility;
    public static volatile SingularAttribute<EnglishproTbl, Integer> enID;
    public static volatile SingularAttribute<EnglishproTbl, Integer> enReadingWritingAbility;
    public static volatile CollectionAttribute<EnglishproTbl, IeltsTbl> ieltsTblCollection;
    public static volatile CollectionAttribute<EnglishproTbl, ToeflTbl> toeflTblCollection;
    public static volatile SingularAttribute<EnglishproTbl, ApplicationTbl> enAppID;
    public static volatile SingularAttribute<EnglishproTbl, Integer> enSpeakingAbility;
    public static volatile CollectionAttribute<EnglishproTbl, GreTbl> greTblCollection;

}