/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.sweetEscape.model;

import java.util.ArrayList;
import java.util.Objects;
import byui.cit260.sweetEscape.control.MapControl;

/**
 *
 * @author chadh
 */
public class RoomScene extends QuestionSceneType {
    
    private String item;
    private String area;
    public static ArrayList<Inventory> items = new ArrayList<>();
    
    public RoomScene() {
        
    }
    
    private static void assignItemsToScenes(Inventory[] items, RegularSceneType[] scenes){
        
        RoomScene roomScene1 = new RoomScene();
        ArrayList<Inventory> resources = new ArrayList<>();
        Inventory.add(items[3]);
        Inventory.add(items[4]);
        
        RoomScene roomScene2 = new RoomScene();
        ArrayList<Inventory> resources2 = new ArrayList<>();
        Inventory.add(items[6]);
        Inventory.add(items[0]);
        
        RoomScene roomScene3 = new RoomScene();
        ArrayList<Inventory> resources3 = new ArrayList<>();
        Inventory.add(items[5]);
        Inventory.add(items[1]);
        Inventory.add(items[2]);
        
        RoomScene roomScene4 = new RoomScene();
        ArrayList<Inventory> resources4 = new ArrayList<>();
        Inventory.add(items[7]);
        
    }

    public RoomScene(String item, String area) {
        this.item = item;
        this.area = area;
    }

    public RoomScene(String item, String area, Question question, String description, int inspectItem, int invalidLocation, String mapSymbol) {
        super(question, description, inspectItem, invalidLocation, mapSymbol);
        this.item = item;
        this.area = area;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public ArrayList<Inventory> getItems() {
        return items;
    }

    public void setItems(ArrayList<Inventory> items) {
        this.items = items;
    }

    public Question getQuestion() {
        return question;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 23 * hash + Objects.hashCode(this.item);
        hash = 23 * hash + Objects.hashCode(this.area);
        hash = 23 * hash + Objects.hashCode(this.items);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final RoomScene other = (RoomScene) obj;
        if (!Objects.equals(this.item, other.item)) {
            return false;
        }
        if (!Objects.equals(this.area, other.area)) {
            return false;
        }
        if (!Objects.equals(this.items, other.items)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "RoomScene{" + "item=" + item + ", area=" + area + ", items=" + items + '}';
    }
    
    
}
