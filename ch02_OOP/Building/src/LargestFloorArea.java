public class LargestFloorArea extends Building{

    Integer floorArea;

    public LargestFloorArea(String name, String country, String place, Integer floorArea) {
        super(name, country, place);
        this.floorArea = floorArea;
    }

    public Integer getFloorArea() {
        return floorArea;
    }

    public void setFloorArea(Integer floorArea) {
        this.floorArea = floorArea;
    }

    @Override
    public String toString() {
        return "LargestFloorArea [name=" + name + ", country=" + country + ", place=" + place + ", floorArea=" + floorArea +"]";
    }

    
    

}
