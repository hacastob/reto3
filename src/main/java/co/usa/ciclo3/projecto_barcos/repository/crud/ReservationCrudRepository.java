/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package co.usa.ciclo3.projecto_barcos.repository.crud;


import co.usa.ciclo3.projecto_barcos.model.Reservation;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author haider
 */
public interface ReservationCrudRepository extends CrudRepository<Reservation,Integer>{
    
}
