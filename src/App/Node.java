package App;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by prince on 10/3/16.
 */
public class Node {

    private String name;
    private int depthLevel = 0;
    private List<Node> adjacenciesList;

    public Node(String name) {
        this.name = name;
        this.adjacenciesList = new ArrayList<>();
    }

    public void addNeighbour(Node node) {
        this.adjacenciesList.add(node);
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setDepthLevel(int depthLevel) {
        this.depthLevel = depthLevel;
    }

    public void setAdjacenciesList(List<Node> adjacenciesList) {
        this.adjacenciesList = adjacenciesList;
    }

    public String getName() {
        return name;
    }

    public int getDepthLevel() {
        return depthLevel;
    }

    public List<Node> getAdjacenciesList() {
        return adjacenciesList;
    }



    @Override
    public String toString() {
        return this.name;
    }
}
