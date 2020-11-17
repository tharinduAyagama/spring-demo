public class Greeting implements Greet{
    GreetService greetService;

    public Greeting(GreetingService greetingService){
        greetService = greetingService;
    }
    @Override
    public String getGreeting(){
        if(greetService.haveGreeted())
            return "has been greeted";
        else
            return "hello there!";
    }
}
