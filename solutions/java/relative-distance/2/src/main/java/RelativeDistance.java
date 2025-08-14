import java.util.HashMap;
import java.util.List;
import java.util.Map;

class RelativeDistance {
    
    private Map<String, List<String>> familyTree = new HashMap<>();

    RelativeDistance(Map<String, List<String>>  familyTree) {
        this.familyTree = familyTree;
    }
    

    Map<String, Integer> getAncestors(String person, Map<String, String> childToParent) {

        Map <String, Integer> ancestors = new HashMap<>();
        int distance = 0;
        while (person != null) {
            ancestors.put(person, distance);
            person = childToParent.get(person);
            distance++;
        }
        return ancestors;
    }

    int degreeOfSeparation(String personA, String personB) {

        Map<String, String> childToParent = new HashMap<>();
        for (var entry : familyTree.entrySet()) {
            String parent = entry.getKey();
            for (String child : entry.getValue()) {
                childToParent.put(child, parent);
            }
        }

        Map<String, Integer> ancestorsA = getAncestors(personA, childToParent);
        Map<String, Integer> ancestorsB = getAncestors(personB, childToParent);

        int minDistance = Integer.MAX_VALUE;
        for (String ancestor : ancestorsA.keySet()) {
            if (ancestorsB.containsKey(ancestor)) {
                int totalDistance = ancestorsA.get(ancestor) + ancestorsB.get(ancestor);
                minDistance = Math.min(minDistance, totalDistance);
            }
        }

        if (minDistance == Integer.MAX_VALUE) return -1;
        if (minDistance == 1 || minDistance == 2) return 1;
        return minDistance - 1;
    }
}
