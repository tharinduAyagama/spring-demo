public class Greeting implements Greet{
    GreetService greetService;

    public Greeting(GreetService greetingService){
        greetService = greetingService;
    }

    public void init(){
        System.out.println("initializing");
    }

    public void destroy(){
        System.out.println("destroying");
    }

    @Override
    public String getGreeting(){
        if(greetService.haveGreeted())
            return "has been greeted";
        else
            return "hello there!";
    }
}
