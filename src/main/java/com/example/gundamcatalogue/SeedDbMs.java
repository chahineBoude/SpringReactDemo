package com.example.gundamcatalogue;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;

@Component
public class SeedDbMs {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @PostConstruct
    public void init(){
       jdbcTemplate.update(
                "insert into MOBILESUIT (name, info, universe, image, manufacturer, power, speed, control, weapons, rating) values (?,?,?,?,?,?,?,?,?,?)",
                new Object[]{"RX-78-2 Gundam","The Gundam was incredibly advanced for its time. Built from lightweight Luna Titanium Alloy.","UC","gundam.jpg","Earth Federation Forces",4,4,3,"2 × 60mm Vulcan Gun, BOWA-XBR-M-79-07G Beam Rifle, RX-M-SH-008/S-01025 Shield, 2 × Beam Saber (2 x Beam Javelin)",3.66666});
       jdbcTemplate.update(
                "insert into MOBILESUIT (name, info, universe, image, manufacturer, power, speed, control, weapons, rating) values (?,?,?,?,?,?,?,?,?,?)",
                new Object[]{"RGM-79 GM","first mass-produced mobile suit of the Earth Federation.","UC","gm.jpg","Earth Federation Forces",2,2,3,"2 × 60mm Vulcan Gun, 1-2 x THI BSjG01 Beam Saber, BR-M-79C-1 Beam Spray Gun, FADEGEL RGM-M-Sh-003 Shield",2.33333333333333});
        jdbcTemplate.update(
                "insert into MOBILESUIT (name, info, universe, image, manufacturer, power, speed, control, weapons, rating) values (?,?,?,?,?,?,?,?,?,?)",
                new Object[]{"GAT-X105 Strike Gundam","The Strike Gundam is the most versatile of the five Gundams in the Earth Alliance's G Project.","CE","strike.jpg","Earth Alliance",3,4,4,"2 × Igelstellung 75mm Automatic Multi-barrel CIWS 2 × Armor Schneider Combat Knife",3.66666});

    }

}
