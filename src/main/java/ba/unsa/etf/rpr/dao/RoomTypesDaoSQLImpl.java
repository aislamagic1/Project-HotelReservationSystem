package ba.unsa.etf.rpr.dao;

import ba.unsa.etf.rpr.domain.RoomTypes;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.List;
import java.util.Properties;

public class RoomTypesDaoSQLImpl implements RoomTypesDao{

    private Connection connection;

    /**
     * Constructor that makes connection to the database with  hidden values needed to make the connection
     */
    public RoomTypesDaoSQLImpl(){
        try{
            String fieldPath = "src/dataBase.properties";
            Properties pros = new Properties();
            FileInputStream ip = new FileInputStream(fieldPath);
            pros.load(ip);
            this.connection = DriverManager.getConnection(pros.getProperty("url"), pros.getProperty("username"), pros.getProperty("password"));
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public RoomTypes getById(int id) {
        return null;
    }

    @Override
    public RoomTypes add(RoomTypes item) {
        return null;
    }

    @Override
    public RoomTypes update(RoomTypes item) {
        return null;
    }

    @Override
    public void delete(int id) {

    }

    @Override
    public List<RoomTypes> getAll() {
        return null;
    }
}
