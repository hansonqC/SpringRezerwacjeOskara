package pl.oskarpolak.demorepo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import pl.oskarpolak.demorepo.models.repositories.ReservationRepository;

/**
 * Created by lukasz on 2017-10-16.
 */
public class RestController {
    @Autowired
    ReservationRepository reservationRepository;

    @RequestMapping(value="/rest/reservation", method = RequestMethod.GET, produces= "application/json")
    public ResponseEntity reservation(){
        return new ResponseEntity(reservationRepository.findAll(), HttpStatus.OK);
    }
}
