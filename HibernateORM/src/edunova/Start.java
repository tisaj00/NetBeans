package edunova;

// domaća zadaća:
import edunova.controller.ObradaOperater;
import edunova.controller.ObradaPolaznik;
import edunova.model.Operater;
import edunova.model.Polaznik;
import edunova.pomocno.BCrypt;
import edunova.pomocno.EdunovaException;
import edunova.view.SplashScreen;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

//upogoniti Hibernate prateći https://examples.javacodegeeks.com/enterprise-java/hibernate/hibernate-maven-example/
public class Start {

    public static void main(String[] args) {

//        ObradaPolaznik op = new ObradaPolaznik();
//           long start = System.currentTimeMillis();
//        Polaznik p;
//        List<Polaznik> lista = new ArrayList<>();
//        for (int i = 0; i < 120000; i++) {
//
//            p = new Polaznik();
//            p.setIme("Polaznik b" +i);
//            p.setPrezime("Prezime b" +i);
//            p.setEmail("edunova@edunova.hr");
//            p.setOib("98544075463");
//               
//            lista.add(p);
//           
//        }
//        
//         try {
//                op.spremi(lista);
//            } catch (EdunovaException ex) {
//                ex.printStackTrace();
//            }
//        
//        long kraj = System.currentTimeMillis();
//        
//        System.out.println(kraj-start);

         new SplashScreen().setVisible(true);
//      Operater o = new Operater();
//      o.setEmail("tjakopec@gmail.com");
//      o.setLozinka(BCrypt.hashpw("t", BCrypt.gensalt()));
//        System.out.println(o.getLozinka());
//      o.setIme("Tomislav");
//      o.setPrezime("Jakopec");
//      
//        ObradaOperater oo = new ObradaOperater();
//        try {
//            oo.spremi(o);
//        } catch (EdunovaException ex) {
//           ex.printStackTrace();
//        }
//        
    }

}
