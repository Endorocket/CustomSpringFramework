import pl.insert.config.ApplicationContext;
import pl.insert.config.Configuration;
import pl.insert.services.Service;

public class Main {

    public static void main(String[] args) {

        ApplicationContext context = new ApplicationContext(Configuration.class);

        Service service = context.getBean("mojaInnaNazwa", Service.class);

        System.out.println(service);

    }
}
