package Places.Utilits;

import Places.*;

public class GroupPlaces {
    private Region region;
    private City city;
    private Capital capital;

    public GroupPlaces(Region region, City city, Capital capital) {
        this.region = region;
        this.city = city;
        this.capital = capital;
    }


    public Region getRegion() {
        return region;
    }

    public void setRegion(Region region) {
        this.region = region;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public Capital getCapital() {
        return capital;
    }

    public void setCapital(Capital capital) {
        this.capital = capital;
    }

    public void showAll(){
        getRegion().whatIAm();
        getCity().whatIAm();
        getCapital().whatIAm();
    }

}
