package tisaj.obracunplace;


import tisaj.obracunplace.pomocno.HibernateUtil;


//upogoniti Hibernate prateći https://examples.javacodegeeks.com/enterprise-java/hibernate/hibernate-maven-example/
public class Start {

    public static void main(String[] args) {
        
        HibernateUtil.getSession();
        
    }
    
}
