package com.Interface;

import java.util.ArrayList;
import java.util.List;

public class BirdRepository {
    private List<Bird> birdList = new ArrayList<>();

    public List<Bird> getBirdList() {
        return birdList;
    }

    public void add(Bird bird){
        birdList.add(bird);
    }

    public void remove(Bird bird){
        birdList.remove(bird);
    }

    public Bird getBird(String name){
        for (int i = 0; i < birdList.size(); i++){
            if (name.equalsIgnoreCase(birdList.get(i).name))
                return birdList.get(i);
        }
        return null;
    }
}