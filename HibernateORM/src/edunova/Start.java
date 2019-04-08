package edunova;

// domaća zadaća:
import com.github.javafaker.Faker;
import edunova.controller.ObradaGrupa;
import edunova.controller.ObradaOperater;
import edunova.controller.ObradaPredavac;
import edunova.model.Grupa;
import edunova.model.Operater;
import edunova.model.Predavac;
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

//        ObradaPredavac op = new ObradaPredavac();
//           long start = System.currentTimeMillis();
//        Predavac p;
//        List<Predavac> lista = new ArrayList<>();
//        Faker f = new Faker();
//        for (int i = 0; i < 100; i++) {
//
//            p = new Predavac();
//            p.setIme(f.name().firstName());
//            p.setPrezime(f.name().lastName());
//            p.setEmail(f.name().username() + "@edunova.hr");
//            p.setOib("98544075463");
//            p.setIban("HR1624840083284924558");
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

//        ObradaGrupa o = new ObradaGrupa();
//        Grupa g = new Grupa();
//        g.setNaziv("Grupa");
//        try {
//            o.spremi(g);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
        

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
