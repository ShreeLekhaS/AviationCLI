import com.organization.flight.controller.FlightController;
import com.organization.flight.repository.FlightRepository;
import com.organization.flight.service.FlightService;

public class Main {
    public static void main(String[] args) {
        FlightRepository repository = new FlightRepository();
        FlightService service = new FlightService(repository);

        FlightController controller = new FlightController(service);

        controller.startCLI();
    }
}