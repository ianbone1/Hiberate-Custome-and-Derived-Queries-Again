package com.codeclan.coursebookings.coursebookings.Models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "courses")
public class Course implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "town")
    private String town;

    @Column(name = "stars")
    private int stars;

//    @JsonIgnoreProperties({"customer","course"})
    @JsonIgnore
    @OneToMany(mappedBy = "course", fetch = FetchType.LAZY)
    private List<Booking> bookings;

    public Course(String name, String town, int stars) {
        this.name = name;
        this.town = town;
        this.stars = stars;
        this.bookings = new ArrayList<Booking>();
    }

    public Course() {
    }


    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTown() {
        return this.town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public int getStars() {
        return this.stars;
    }

    public void setStars(int starRating) {
        this.stars = starRating;
    }

    public List<Booking> getBookings() {
        return this.bookings;
    }

    public void setBookings(List<Booking> bookings) {
        this.bookings = bookings;
    }

    public void addBooking(Booking booking){
        this.bookings.add(booking);
    }

    public void removeBooking(Booking booking){
        this.bookings.remove(booking);
    }
}
