import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Graph {

  private Collection<Node> nodes;
  private Collection<Edge> edges;
  private Map<String, String> attributes;

  public Graph() {
    nodes = new ArrayList<>();
    edges = new ArrayList<>();
    attributes = new HashMap<>();
  }

  public Graph(Map<String, String> attributes) {
    nodes = new ArrayList<>();
    edges = new ArrayList<>();
    this.attributes = attributes;
  }

  public Collection<Node> getNodes() {
    return nodes;
  }

  public Collection<Edge> getEdges() {
    return edges;
  }

  public Graph node(String name) {
    Node temp = new Node(name);
    nodes.add(temp);
    return this;
  }

  public Graph node(String name, Map<String, String> attributes) {
    Node temp = new Node(name, attributes);
    nodes.add(temp);
    return this;
  }

  public Graph edge(String start, String end) {
    Edge temp = new Edge(start, end);
    edges.add(temp);
    return this;
  }

  public Graph edge(String start, String end, Map<String, String> attributes) {
    Edge temp = new Edge(start, end, attributes);
    edges.add(temp);
    return this;
  }

  public Map<String, String> getAttributes() {
    return attributes;
  }
}
