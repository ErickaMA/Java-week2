public class LargestFootprint extends Building {
  
    Integer footprint;

    public LargestFootprint(String name, String country, String place, Integer footprint) {
        super(name, country, place);
        this.footprint = footprint;
    }

    public Integer getFootprint() {
        return footprint;
    }

    public void setFootprint(Integer footprint) {
        this.footprint = footprint;
    }

    @Override
    public String toString() {
        return "LargestFootprint [name=" + name + ", country=" + country + ", place=" + place + ", footprint=" + footprint + "]";
    }

    
    
}
