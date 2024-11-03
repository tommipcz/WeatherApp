package org.example.models;


import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Table(name = "weather_data_hum")
public class WeatherDataHum {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private LocalDate date;

    @Column(nullable = false)
    private LocalTime time;

    @Column(nullable = false)
    private double hum;

    @ManyToOne
    @JoinColumn(name = "location_id", nullable = false)
    private Location location;

}

