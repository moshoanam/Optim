package org.ftafrica.co.optime.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import org.ftafrica.co.optime.model.Employees;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2015-09-14T11:11:18")
@StaticMetamodel(LoginDetails.class)
public class LoginDetails_ { 

    public static volatile SingularAttribute<LoginDetails, Employees> employeeId;
    public static volatile SingularAttribute<LoginDetails, String> username;
    public static volatile SingularAttribute<LoginDetails, String> email;
    public static volatile SingularAttribute<LoginDetails, String> password;

}