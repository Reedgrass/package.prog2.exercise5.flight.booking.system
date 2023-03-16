package exercise5.flight.booking.system;

import java.time.LocalDate;
import java.util.Random;

public class FlightBooking {
    private String flightID;
    //private String passengerFullName;
    private String[] passengerFullName = new String[10];
    private String flightCompany;
    private LocalDate departingDate;
    private LocalDate returnDate;
    private int totalPassengers;
    private double totalTicketPrice;
    private int childPassengers;
    private int adultPassengers;
    private double departingTicketPrice;
    private double returnTicketPrice;

    private String[] passengerGender = new String[10];
    private String[] passengerAge = new String[10];

    /*Private PassengerGender
    PassengerAge*/
    BookingClass bookingClass;
    TripDestination tripDestination;
    TripSource tripSource;
    TripType tripType;
    Airport sourceAirport;
    Airport destinationAirport;
    int TripDate;

    public void setPassengerFullName (int size,String passengerFullName){
        this.passengerFullName[size] = passengerFullName;
    }

    //public String getPassengerFullName(int size){
    //    return passengerFullName[size];
    // }
    public FlightBooking(String Null, LocalDate departDate, LocalDate returnDate, int childPassengers,
                         int adultPassengers) {
        //this.passengerFullName []= Null;
        this.departingDate = departDate;
        this.returnDate = returnDate;
        this.childPassengers = childPassengers;
        this.adultPassengers = adultPassengers;
    }

    enum TripType {
        ONE_WAY, RETURN
    }

    enum BookingClass {
        FIRST, BUSINESS, ECONOMY
    }

    enum TripSource {
        NANJING, BEIJING, SHANGHAI, OULU, HELSINKI, PARIS
    }

    enum TripDestination {
        NANJING, BEIJING, SHANGHAI, OULU, HELSINKI, PARIS
    }

    enum Airport {
        NANJING_LUKOU_INTERNATIONAL_AIRPORT, BEIJING_CAPITAL_INTERNATIONAL_AIRPORT,
        SHANGHAI_PUDONG_INTERNATIONAL_AIRPORT, OULU_AIRPORT, HELSINKI_AIRPORT,
        PARIS_CHARLES_DE_GAULLE_AIRPORT
    }

    public String getPassengerFullName(int size) {

        return passengerFullName [size] ;
    }

    public void setBookingClass(String bookingClass) {
        switch (bookingClass) {
            case "1":
                this.bookingClass = BookingClass.FIRST;
                break;
            case "2":
                this.bookingClass = BookingClass.BUSINESS;
                break;
            case "3":
                this.bookingClass = BookingClass.ECONOMY;
                break;

        }
    }

    public BookingClass getBookingClass() {
        return this.bookingClass;
    }

    public void setTripDate(int tripDate) {
        this.TripDate = tripDate;
    }

    public int getTripDate() {
        return TripDate;
    }

    public String getTicketNumber(int size) {

        return ticketNumber[size];
    }

    public TripSource getTripSource() {
        return this.tripSource;
    }

    public String getFlightCompany() {

        return flightCompany;
    }

    public void setTripSource(String tripSource) {
        switch (tripSource) {
            case "1":
                this.tripSource = TripSource.NANJING;
                this.sourceAirport = Airport.NANJING_LUKOU_INTERNATIONAL_AIRPORT;
                break;
            case "2":
                this.tripSource = TripSource.BEIJING;
                this.sourceAirport = Airport.BEIJING_CAPITAL_INTERNATIONAL_AIRPORT;
                break;
            case "3":
                this.tripSource = TripSource.SHANGHAI;
                this.sourceAirport = Airport.SHANGHAI_PUDONG_INTERNATIONAL_AIRPORT;
                break;
            case "4":
                this.tripSource = TripSource.OULU;
                this.sourceAirport = Airport.OULU_AIRPORT;
                break;
            case "5":
                this.tripSource = TripSource.HELSINKI;
                this.sourceAirport = Airport.HELSINKI_AIRPORT;
                break;
            case "6":
                this.tripSource = TripSource.PARIS;
                this.sourceAirport = Airport.PARIS_CHARLES_DE_GAULLE_AIRPORT;
                break;

        }
    }

    public void setTripDestination(String tripSource, String tripDestination) {
        switch (tripDestination) {
            case "1":
                this.tripDestination = TripDestination.NANJING;
                this.destinationAirport = Airport.NANJING_LUKOU_INTERNATIONAL_AIRPORT;
                break;
            case "2":
                this.tripDestination = TripDestination.BEIJING;
                this.destinationAirport = Airport.BEIJING_CAPITAL_INTERNATIONAL_AIRPORT;
                break;
            case "3":
                this.tripDestination = TripDestination.SHANGHAI;
                this.destinationAirport = Airport.SHANGHAI_PUDONG_INTERNATIONAL_AIRPORT;
                break;
            case "4":
                this.tripDestination = TripDestination.OULU;
                this.destinationAirport = Airport.OULU_AIRPORT;
                break;
            case "5":
                this.tripDestination = TripDestination.HELSINKI;
                this.destinationAirport = Airport.HELSINKI_AIRPORT;
                break;
            case "6":
                this.tripDestination = TripDestination.PARIS;
                this.destinationAirport = Airport.PARIS_CHARLES_DE_GAULLE_AIRPORT;
                break;

        }
    }

    public void setTripType(String tripType) {
        switch (tripType) {
            case "1":
                this.tripType = TripType.ONE_WAY;
                break;
            case "2":
                this.tripType = TripType.RETURN;
                break;

        }
    }

    public TripType getTripType() {
        return this.tripType;
    }

    public TripDestination getTripDestination() {
        return tripDestination;
    }

    public LocalDate getDepartingDate() {

        return departingDate;
    }

    public LocalDate getReturnDate() {

        return returnDate;
    }

    public Airport getDestinatiAirport() {
        return destinationAirport;
    }

    public void setTotalTicketPrice() {
        this.totalTicketPrice = Math.abs(
                (((2 * ((300 + (0.1 * 300)) + (0.05 * 300))) + (5 * ((300 + (0.1 * 300)) + (0.05 * 300)))) + 250) * 2);
    }

    public double getTotalTicketPrice() {
        return Math.abs(
                (((2 * ((300 + (0.1 * 300)) + (0.05 * 300))) + (5 * ((300 + (0.1 * 300)) + (0.05 * 300)))) + 250) * 2);
    }

    public void setDepartingTicketPrice(int child, int adult) {
        this.departingTicketPrice = departingTicketPrice;
    }

    public double getDepartingTicketPrice() {
        return departingTicketPrice;
    }

    public void setReturnTicketPrice() {
        this.returnTicketPrice = returnTicketPrice;
    }

    public double getReturnTicketPrice() {
        return returnTicketPrice;
    }

    public int getChildrenPassengers() {

        return childPassengers;
    }

    public int getAdultPassengers() {

        return adultPassengers;
    }

    public int getTotalPassengers() {
        return totalPassengers;
    }

    public void setSourceAirport(Airport sourceAirport) {
        if (sourceAirport.equals(destinationAirport)) {
            this.sourceAirport = sourceAirport;
        } else {
            throw new IllegalArgumentException("Source cannot be the same as destination.");
        }
    }

    public Airport getSourceAirport() {
        return sourceAirport;
    }

    public void setTripDestination(Airport destinationAirport) {
        if (destinationAirport.equals(sourceAirport)) {
            this.destinationAirport = destinationAirport;
        } else {
            throw new IllegalArgumentException("Destination cannot be the same as source.");
        }
    }

    public void setDepartureDate(LocalDate departureDate) {

        String departingString = "2023-03-04";
        this.departingDate = LocalDate.parse(departingString);
    }

    public void setReturnDate(LocalDate returnDate) {

        String returningString = "2023-03-05";
        this.returnDate = departingDate.plusDays(2);
    }

    public void setTicketNumber(int size,String ticketNumber) {

        this.ticketNumber [size] = ticketNumber;
    }

    // public void setPassengerFullName(String passengerFullName) {

    //   this.passengerFullName = passengerFullName;
    //}

    public void setFlightCompany(String flightCompany) {

        this.flightCompany = flightCompany;
    }

    public void setDepartingDate(LocalDate departingDate) {

        this.departingDate = departingDate;
    }

    public void setTotalTicketPrice(double totalTicketPrice) {

        this.totalTicketPrice = totalTicketPrice;
    }

    public void setChildPassengers(int childPassengers) {

        this.childPassengers = childPassengers;
    }

    public void setAdultPassengers(int adultPassengers) {

        this.adultPassengers = adultPassengers;
    }

    public void setTotalPassengers(int totalPassengers, int totalPassengers2) {
        this.totalPassengers = childPassengers + adultPassengers;
    }

    public void setPassengerGender(int size,String passengerGender){
        this.passengerGender[size] = passengerGender;
    }

    public void setPassengerAge (int size,String passengerAge){
        this.passengerAge [size] = passengerAge;
    }

    public String toString() {
        return "Dear " + passengerFullName + ". Thank you for booking your flight with " +
                flightCompany + ".\nFollowing are the details of your booking and the trip:" + "\n" +
                "Ticket Number: " + ticketNumber + "\n" +
                "From " + tripSource + " to " + tripDestination + "\n" +
                "Date of departure: " + departingDate + "\n" +
                "Date of return: " + returnDate + "\n" +
                "Total passengers: " + totalPassengers + "\n" +
                "Total ticket price in Euros: " + totalTicketPrice;
    }

    Random random = new Random();
    //public String ticketNumber = "11FASDFDOM";
    public String[] ticketNumber = new String[10];
    //String ticketNumber[] = {"11FASDFDOM"};
    public void setTicketNumber() {

        switch (tripType) {
            case ONE_WAY:
                ticketNumber[0] = "11";
                break;
            case RETURN:
                ticketNumber[0] = "22";
                break;
        }
        switch (bookingClass) {
            case FIRST:
                ticketNumber[1] = ticketNumber[0] + "F";
                break;
            case BUSINESS:
                ticketNumber[1] = ticketNumber[0] + "B";
                break;
            case ECONOMY:
                ticketNumber[1] = ticketNumber[0] + "E";
                break;
        }
        for (int i = 0; i < 4; i++) {
            char f = (char) ((random.nextInt(26) + 65));
            ticketNumber[2] = ticketNumber[1] + f;
        }
        this.ticketNumber[3] = ticketNumber[2] + "DOM";
        if (tripSource == TripSource.NANJING && tripDestination == TripDestination.BEIJING) {
            this.ticketNumber[3] = ticketNumber[2] + "DOM";
        }
        if (tripSource == TripSource.BEIJING && tripDestination == TripDestination.NANJING) {
            this.ticketNumber[3] = ticketNumber[2] + "DOM";
        }
        if (tripSource == TripSource.OULU && tripDestination == TripDestination.HELSINKI) {
            this.ticketNumber[3] = ticketNumber[2] + "DOM";
        }
        if (tripSource == TripSource.HELSINKI && tripDestination == TripDestination.OULU) {
            this.ticketNumber[3] = ticketNumber[2] + "DOM";
        }
        if (tripSource == TripSource.NANJING && tripDestination == TripDestination.OULU) {
            this.ticketNumber[3] = ticketNumber[2] + "INT";
        }
        if (tripSource == TripSource.OULU && tripDestination == TripDestination.NANJING) {
            this.ticketNumber[3] = ticketNumber[2] + "INT";
        }
        if (tripSource == TripSource.NANJING && tripDestination == TripDestination.HELSINKI) {
            this.ticketNumber[3] = ticketNumber[2] + "INT";
        }
        if (tripSource == TripSource.HELSINKI && tripDestination == TripDestination.NANJING) {
            this.ticketNumber[3] = ticketNumber[2] + "INT";
        }
        if (tripSource == TripSource.BEIJING && tripDestination == TripDestination.OULU) {
            this.ticketNumber[3] = ticketNumber[2] + "INT";
        }
        if (tripSource == TripSource.OULU && tripDestination == TripDestination.BEIJING) {
            this.ticketNumber[3] = ticketNumber[2] + "INT";
        }
        if (tripSource == TripSource.BEIJING && tripDestination == TripDestination.NANJING) {
            this.ticketNumber[3] = ticketNumber[2] + "INT";
        }
        if (tripSource == TripSource.HELSINKI && tripDestination == TripDestination.BEIJING) {
            this.ticketNumber[3] = ticketNumber[2] + "INT";
        }
    }

    ConfirmationMessage ConfirmationMessage;

    enum ConfirmationMessage {
        CHANGE, NOTCHANGE;
    }

    public void setConfirmationMessage(String confirmationmessage) {
        switch (confirmationmessage) {
            case "1":
                this.ConfirmationMessage = ConfirmationMessage.CHANGE;
                System.out.println(
                        "Thank you for booking your flight with " + flightCompany + ".\n " +
                                "You reserved a total of 1/2/3/... tickets.\n" +
                                "\n"+
                                "Here are the trip details for Passenger No.1/2/3/...\n"+
                                "\n"+
                                "Passenger's Ticket Number: " + ticketNumber[3] + "\n" +
                                "Passenger's Passenger Name: " + passengerFullName + "\n" +
                                "Passenger's Age: "+passengerAge+"\n"+
                                "Passenger's Gender: "+ passengerGender+"\n"+
                                "From: "+tripSource+"("+sourceAirport+")"+"\n"+
                                "To " + tripDestination +"("+ destinationAirport+")"+"\n" +
                                "The flight departs on: " + departingDate + "\n" +
                                "And the return flight is on:" + returnDate +
                                "The total ticket price is: " + totalTicketPrice + "\n" +
                                "\n"+
                                "IMPORTANT NOTICE: As per our policy, the return date was changed because it was \n" +
                                "less than two days apart from your departure date");
                break;
            case "2":
                this.ConfirmationMessage = ConfirmationMessage.NOTCHANGE;
                System.out.println(
                        "Thank you for booking your flight with " + flightCompany + ".\n " +
                                "You reserved a total of 1/2/3/... tickets.\n" +
                                "\n"+
                                "Here are the trip details for Passenger No.1/2/3/...\n"+
                                "\n"+
                                "Passenger's Ticket Number: " + ticketNumber[3] + "\n" +
                                "Passenger's Passenger Name: " + passengerFullName + "\n" +
                                "Passenger's Age: "+passengerAge+"\n"+
                                "Passenger's Gender: "+ passengerGender+"\n"+
                                "From: "+tripSource+"("+sourceAirport+")"+"\n"+
                                "To " + tripDestination +"("+ destinationAirport+")"+"\n" +
                                "The flight departs on: " + departingDate + "\n" +
                                "And the return flight is on:" + returnDate +
                                "The total ticket price is: " + totalTicketPrice + "\n"
                );

                break;
        }
    }

}

