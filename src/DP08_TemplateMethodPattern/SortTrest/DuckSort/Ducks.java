package DP08_TemplateMethodPattern.SortTrest.DuckSort;

public class Ducks implements Comparable<Ducks>{
    String name;
    int weight;

    public Ducks(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public String toString() {
        return name + " weighs " + weight;
    }

    public int compareTo(Ducks object) {
        Ducks otherDuck = (Ducks) object;

        if (this.weight < otherDuck.weight) {
            return -1;
        } else if (this.weight == otherDuck.weight) {
            return 0;
        } else {    // this.weight > otherDuck.weight
            return 1;
        }
    }
}
