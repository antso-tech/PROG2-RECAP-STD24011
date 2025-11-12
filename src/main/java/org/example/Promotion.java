package org.example;

import java.util.Arrays;
import java.util.List;

public class Promotion {
    private List<String> groupes;

    public Promotion() {
        groupes = Arrays.asList();
    }

    public boolean addGroup(String group){
        return groupes.add(group);
    }
}
