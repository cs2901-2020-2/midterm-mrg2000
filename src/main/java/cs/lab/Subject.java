package cs.lab;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Subject {
    private final List<Observer> observers = new ArrayList<>();
    HashMap<String, Integer> table = new HashMap<>();

    public Subject() {
        table.put("A", 40); table.put("B", 25); table.put("C", 15); table.put("D", 20);
    }

    public void setData(String name, Integer value) {
        table.put(name, value);
        this.notifyObservers();
    }

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    private void notifyObservers() {
        for (Observer observer : this.observers) {
            observer.update();
        }
    }

    public String graphicString() {
        String name; 
        Integer value;
        StringBuilder graphicData = new StringBuilder();
        for (Map.Entry <String, Integer> entry : table.entrySet()) {
            name = entry.getKey();
            value = entry.getValue();
            graphicData.append(name).append(": ").append(value);
        }
        return graphicData.toString();
    }

    public Map<String, Integer> getData() {
        return table;
    }

}
