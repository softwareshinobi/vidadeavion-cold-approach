package online.vidadeavion.coldapproach.coldapproach;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "coldapproach")
public class ColdApproach {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    //   @NonNull
    @Column(name = "shortDescription")
    private String shortDescription;

    //   @NonNull
    @Column(name = "longDescription")
    private String longDescription;

    //  @NonNull
    @Column(name = "description")
    private String description;

    //  @NonNull
    @Column(name = "usedSpecialSauce")
    private boolean usedSpecialSauce;


        //  @NonNull
    @Column(name = "vip")
    private boolean vip;
        
//    //  @NonNull
//    @Column(name = "category")
//    private String category;
    
    //   @NonNull
    @Column(name = "partyModeLevel")
    private String partyModeLevel;
    
        //   @NonNull
    @Column(name = "location")
    private String location;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public String getLongDescription() {
        return longDescription;
    }

    public void setLongDescription(String longDescription) {
        this.longDescription = longDescription;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isUsedSpecialSauce() {
        return usedSpecialSauce;
    }

    public void setUsedSpecialSauce(boolean usedSpecialSauce) {
        this.usedSpecialSauce = usedSpecialSauce;
    }



    public boolean isVip() {
        return vip;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }

    public String getPartyModeLevel() {
        return partyModeLevel;
    }

    public void setPartyModeLevel(String partyModeLevel) {
        this.partyModeLevel = partyModeLevel;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ColdApproach{");
        sb.append("id=").append(id);
        sb.append(", shortDescription=").append(shortDescription);
        sb.append(", longDescription=").append(longDescription);
        sb.append(", description=").append(description);
        sb.append(", usedSpecialSauce=").append(usedSpecialSauce);
        sb.append(", vip=").append(vip);
        sb.append(", partyModeLevel=").append(partyModeLevel);
        sb.append(", location=").append(location);
        sb.append('}');
        return sb.toString();
    }
    

}
