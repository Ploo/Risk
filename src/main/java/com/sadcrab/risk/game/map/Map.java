package com.sadcrab.risk.game.map;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by martin on 08/01/14.
 */
public class Map {

    List<Region> regions;
    List<Edge> edges;

    public Map() {
        regions = new ArrayList<Region>();
        edges = new ArrayList<Edge>();
    }

    /**
     * Creates a connection between two regions
     */
    public void addEdge(Region a, Region b) {
        edges.add(new Edge(a, b));
    }

}
