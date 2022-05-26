package com.Interface;

import java.util.HashSet;
import java.util.Set;

public class BirdRepository {
    //private List<Bird> birdList = new ArrayList<>();
    private Set<Bird> birdList = new HashSet<>();
    private static BirdRepository instance;

    private BirdRepository() {
    }

    public static synchronized BirdRepository getInstance() {
        if (instance == null) {
            instance = new BirdRepository();
        }
        return instance;
    }

    public Set<Bird> getBirdList() {
        return birdList;
    }

    public void add(Bird bird){
        birdList.add(bird);
    }

    public void remove(Bird bird){
        birdList.remove(bird);
    }

    public Bird getBird(String birdName){
        return birdList.stream().filter(bird -> bird.name.equals(birdName)).findFirst().orElse(null);
    }
}