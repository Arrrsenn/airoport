import com.skillbox.airport.Airport;
import com.skillbox.airport.Flight;
import com.skillbox.airport.Flight.Type;

import java.time.Instant;
import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;


public class Main {
    public static void main(String[] args) {
        Airport airport = Airport.getInstance();
        findPlanesLeavingInTheNextTwoHours(airport);
    }

    public static List<Flight> findPlanesLeavingInTheNextTwoHours(Airport airport) {
        //TODO Метод должен вернуть список рейсов вылетающих в ближайшие два часа.

        List<Flight> flights = airport.getTerminals()
                .stream()
                .flatMap(f -> f.getFlights().stream())
                .collect(Collectors.toList());

        return flights.stream()
                .filter(t -> t.getType().equals(Type.DEPARTURE))
                .filter(d -> d.getDate().toInstant().isBefore(Instant.now().plusSeconds(7200)))
                .filter(d -> d.getDate().toInstant().isAfter(Instant.now()))
                .collect(Collectors.toList());
    }

}