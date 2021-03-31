package com.aerotravel.flightticketbooking.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotBlank;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class Passenger {
    @Id
    @GeneratedValue()
    private long passengerId;
    @NotBlank
    private String firstName;
    @NotBlank
    private String lastName;
    @NotBlank
    private String phoneNumber;
    @NotBlank
    private String passportNumber;

    private String email;

    private String address;
    
    private String bankName;
    
    private long cardNumber;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate expiryDate;
    private int cvvNumber;

    @ManyToOne
    private Flight flight;

    public Passenger() {
    	
    	System.out.println("in the cnst of "+getClass().getName());
    }
	public Passenger(@NotBlank String firstName, @NotBlank String lastName, @NotBlank String phoneNumber,
			@NotBlank String passportNumber, String email, String address, String bankName, long cardNumber,
			LocalDate expiryDate, int cvvNumber) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
		this.passportNumber = passportNumber;
		this.email = email;
		this.address = address;
		this.bankName = bankName;
		this.cardNumber = cardNumber;
		this.expiryDate = expiryDate;
		this.cvvNumber = cvvNumber;
	}



	public long getPassengerId() {
        return passengerId;
    }

    public void setPassengerId(long passengerId) {
        this.passengerId = passengerId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPassportNumber() {
        return passportNumber;
    }

    public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }
    
    public String getBankName() {
		return bankName;
	}



	public void setBankName(String bankName) {
		this.bankName = bankName;
	}



	public long getCardNumber() {
		return cardNumber;
	}



	public void setCardNumber(long cardNumber) {
		this.cardNumber = cardNumber;
	}



	public LocalDate getExpiryDate() {
		return expiryDate;
	}



	public void setExpiryDate(LocalDate expiryDate) {
		this.expiryDate = expiryDate;
	}



	public int getCvvNumber() {
		return cvvNumber;
	}



	public void setCvvNumber(int cvvNumber) {
		this.cvvNumber = cvvNumber;
	}
}
