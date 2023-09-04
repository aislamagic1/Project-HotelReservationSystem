package ba.unsa.etf.rpr.business;

import ba.unsa.etf.rpr.dao.DaoFactory;
import ba.unsa.etf.rpr.domain.Guests;
import ba.unsa.etf.rpr.exception.GuestException;

import java.util.List;

/**
 * Business logic layer for GuestManager
 * @author Aldin Islamagic
 */

public class GuestManager {

    /**
     * Get all guests from db
     * @return list of guests
     */
    public List<Guests> getAll(){
        return DaoFactory.guestsDao().getAll();
    }

    /**
     * Delete instance from db
     * @param id of object
     * @throws GuestException
     */
    public void delete(int id) throws GuestException {
        try{
            DaoFactory.guestsDao().delete(id);
        }catch(Exception e){
            throw new GuestException("Greska prilikom brisanja");
        }
    }

    /**
     * Method adds item in db
     * @param item to be added
     * @throws GuestException
     */

    public void add(Guests item) throws GuestException {
        if(item.getId() != 0) throw new GuestException("Id must be autoincrement");
        try{
            DaoFactory.guestsDao().add(item);
        }catch(Exception e){
            throw new GuestException("Greska prilikom brisanja");
        }
    }


    /**
     * Get item by id
     * @param id of item
     * @return item from db
     * @throws GuestException
     */
    public Guests getById(int id) throws GuestException {
        try{
            return DaoFactory.guestsDao().getById(id);
        }
        catch(Exception e){
            throw new GuestException("Gost sa id-om ne postoji!");
        }
    }

    /**
     * Udpate item id db
     * @param item to be updated
     * @return updated item
     * @throws GuestException
     */
    public Guests update(Guests item) throws GuestException {
        try{
            return DaoFactory.guestsDao().update(item);
        }
        catch(Exception e){
            throw new GuestException("Gost ne postoji ili podaci nisu validni!");
        }
    }

}
