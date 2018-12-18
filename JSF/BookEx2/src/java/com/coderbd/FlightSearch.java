package com.coderbd;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.faces.context.FacesContext;

public class FlightSearch {

    String origination;
    String destination;
    String departDate;
    String departTime;
    String returnDate;
    String returnTime;
    String tripType;
    ArrayList matchingFlight = new ArrayList();
    String flightNum;
    Flight matchingFlights;

    public String getOrigination() {
        return origination;
    }

    public void setOrigination(String origination) {
        this.origination = origination;
        ((Flight) matchingFlight.get(0)).setOrigination(origination);
        ((Flight) matchingFlight.get(1)).setOrigination(origination);
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
        ((Flight) matchingFlight.get(0)).setDestination(destination);
        ((Flight) matchingFlight.get(1)).setDestination(destination);
        ((Flight) matchingFlight.get(0)).setFlightNum("133");
        ((Flight) matchingFlight.get(1)).setDestination("233");
    }

    public String getDepartDate() {
        return departDate;
    }

    public void setDepartDate(String departDate) {
        this.departDate = departDate;
        ((Flight) matchingFlight.get(0)).setDepartDate(departDate);
        ((Flight) matchingFlight.get(1)).setDepartDate(departDate);
    }

    public String getDepartTime() {
        return departTime;
    }

    public void setDepartTime(String departTime) {
        this.departTime = departTime;
        ((Flight) matchingFlight.get(0)).setDepartTime(departTime);
        ((Flight) matchingFlight.get(1)).setDepartTime(departTime);
    }

    public String getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(String returnDate) {
        this.returnDate = returnDate;
        ((Flight) matchingFlight.get(0)).setDepartDate(departDate);
        ((Flight) matchingFlight.get(1)).setDepartDate(departDate);
    }

    public String getReturnTime() {
        return returnTime;
    }

    public void setReturnTime(String returnTime) {
        this.returnTime = returnTime;
        ((Flight) matchingFlight.get(0)).setReturnTime(returnTime);
        ((Flight) matchingFlight.get(1)).setReturnTime(returnTime);
    }

    public String getTripType() {
        return tripType;
    }

    public void setTripType(String tripType) {
        this.tripType = tripType;
    }

    public ArrayList getMatchingFlight() {
        return matchingFlight;
    }

    public void setMatchingFlight(List matchingFlight) {
        this.matchingFlight.addAll(matchingFlight);
    }

    public String reset() {
        this.setOrigination(origination);
        this.setDestination(destination);
        this.setDepartDate(departDate);
        this.setDepartTime(departTime);
        this.setReturnDate(returnDate);
        this.setReturnTime(returnTime);
        this.setTripType(tripType);
        return "Success";
    }

    public String search() {
        if (origination.equals("Dhaka") && destination.equals("Shylet")) {
            return "Success!";
        } else {
            return "No Flights";
        }
    }

  
    public String getFlightNum() {
        return flightNum;
    }

    public void setFlightNum(String flightNum) {
        this.flightNum = flightNum;
    }

    public Flight getMatchingFlights() {
        for (int i=0; i<matchingFlight.size(); i++){
            matchingFlights=(Flight) matchingFlight.get(i);
            if(matchingFlights.flightNum.equals(flightNum)){
                break;
            }
            matchingFlights=null;
        }
        return matchingFlights;
    }

    public void setMatchingFlights(Flight matchingFlights) {
        this.matchingFlights = matchingFlights;
    }
  public String select() {
    FacesContext context = FacesContext.getCurrentInstance();
    Map requestParams =
      context.getExternalContext().getRequestParameterMap();
    flightNum = (String) requestParams.get("flightNum");
    return "select";
  }

 
}
