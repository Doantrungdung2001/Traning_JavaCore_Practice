package dao;

import entity.Bike;
import entity.Twinsbike;

public class TwinsBikeDAO extends BikeDAO{
    public void saveBike(Bike bike) {
        super.saveBike(bike);
    }

    @Override
    public void getAllBike() {
        super.getAllBike();
    }

    @Override
    public void getBikeById(String id) {
        super.getBikeById(id);
    }

    @Override
    public void updateBike(Bike bike) {
        super.updateBike(bike);
    }

    @Override
    public void removeBikeyId(String id) {
        super.removeBikeyId(id);
    }
}
