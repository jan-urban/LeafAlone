package group11.leafalone.ViewModel;

import group11.leafalone.Plant.Plant;

import java.text.SimpleDateFormat;

public class Details_Plant {
    public final static String dateFormat = "dd MMMM yyyy";
    private String name;
    private String plantCare;
    private String scientific;
    private String sun;
    private String supposedSun;
    private String acquisition;
    private String watered;
    private String nextWatering;
    private String notes;

    public Details_Plant(Plant plant) {
        this.name = plant.getName();
        this.plantCare = plant.getPlantCare().getColloquial();
        this.scientific = plant.getPlantCare().getScientific();
        this.sun = plant.getSun().getName();
        this.supposedSun = plant.getPlantCare().getSunSituation().getName();
        SimpleDateFormat sdf = new SimpleDateFormat(dateFormat);
        this.acquisition = sdf.format(plant.getAcquisition());
        this.watered = sdf.format(plant.getWatered());
        this.nextWatering = sdf.format(plant.getNextWatering());
        this.notes = plant.getNotes();

    }

    public String getName() {
        return name;
    }

    public String getPlantCare() {
        return plantCare;
    }

    public String getScientific() {
        return scientific;
    }

    public String getSun() {
        return sun;
    }

    public String getSupposedSun() {
        return supposedSun;
    }

    public String getAcquisition() {
        return acquisition;
    }

    public String getWatered() {
        return watered;
    }

    public String getNextWatering() {
        return nextWatering;
    }

    public String getNotes() {
        return notes;
    }
}
