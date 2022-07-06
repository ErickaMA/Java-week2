public class LargestUsableVolume extends Building {

    Integer built;
    Integer floorArea;
    Double volume;

    public LargestUsableVolume(String name, String country, Integer built, String place, Integer floorArea,
            Double volume) {
        super(name, country, place);
        
        this.built = built;
        this.floorArea = floorArea;
        this.volume = volume;
    }

    public Integer getBuilt() {
        return built;
    }

    public void setBuilt(Integer built) {
        this.built = built;
    }

    public Integer getFloorArea() {
        return floorArea;
    }

    public void setFloorArea(Integer floorArea) {
        this.floorArea = floorArea;
    }

    public Double getVolume() {
        return volume;
    }

    public void setVolume(Double volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "LargestUsableVolume [name= " + name + ", country= " + country + ", built= " + built + ", place= " + place + ", floorArea= " + floorArea + "m^2, volume=" + volume + "million m^3]";
    }

    
    
}
