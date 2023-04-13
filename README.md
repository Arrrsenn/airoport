# Airoport
Working with flight data at the airport using the com.skillbox.airport library

The Main class contains the main method, which calls the findPlanesLeavingInTheNextTwoHours method, passing it an Airport type object.

The findPlanesLeavingInTheNextTwoHours method returns a list of flights that depart in the next two hours. To do this, the method uses the Java Stream API and calls several filtering and data collection methods.

First, the method creates a list of all flights at the airport using the getTerminals and getFlights methods, and then filters it to leave only departing flights (Type.DEPARTURE) that should depart in the next two hours (filtering by departure time).

Finally, the method returns a filtered list of flights, which can then be used in other parts of the program.
