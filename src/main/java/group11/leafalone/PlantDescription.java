package group11.leafalone;

public class PlantDescription {


    // colloquial name
    private String type;

    // scientific name
    private String scientific;

    //picture of plant
    private String plantPicture; //TODO discuss data format

    // desired amount of light
    private SunSituation sunSituation;

    // how often the plant needs to be watered
    private int waterCycle;

    // amount of water needed
    //in ml?
    private int waterAmount;

    // advice on the soil
    private String soilAdvice;

    // plain text description
    private String description;

    // reference to the contributor
    // TODO link to Contributor Model, needs database
    private String id;

    //probably needed for contributePlantController
    public PlantDescription(){

    }

    public String getType() {
        return type;
    }

    public String getScientific() {
        return scientific;
    }

    public SunSituation getSunSituation() {
        return sunSituation;
    }

    public int getWaterCycle() {
        return waterCycle;
    }

    public int getWaterAmount() {
        return waterAmount;
    }

    public String getSoilAdvice() {
        return soilAdvice;
    }

    public String getDescription() {
        return description;
    }

    public String getId() {
        return id;
    }
}