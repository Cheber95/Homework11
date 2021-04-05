package ru.geekbraines;

import java.util.ArrayList;

public class Box<T extends Fruit>{
    ArrayList<T> container = new ArrayList<>();

    public void addFruit(T fruit) {
        boolean b = container.add(fruit);
    }

    public float getWeight() {
        float weight;
        if (container.isEmpty()) {
            weight = 0f;
        } else {
            weight = container.get(0).getWeight();
        }
        return container.size() * weight;
    }

    public boolean compare(Box box) {
        if(this.getWeight() == box.getWeight()) {
            return true;
        } else {
            return false;
        }
    }

    public void addToOtherBox(Box<T> otherBox){
        while (!container.isEmpty()) {
                otherBox.addFruit(container.get(0));
                container.remove(0);
        }
    }
}
