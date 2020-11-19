import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("App.xml");
        Greet greet = context.getBean("greeting" , Greet.class);
        System.out.println(greet.getGreeting());
        context.close();
    }
}
