import java.util.Map;
import java.util.Map.Entry;
import java.util.HashMap;

public class DialingCodes {
    
    private Map<Integer, String> codes = new HashMap<>();

    public Map<Integer, String> getCodes() {
        return codes;
    }

    public void setDialingCode(Integer code, String country) {
        codes.put(code, country);
    }

    public String getCountry(Integer code) {
        return codes.get(code);
    }

    public void addNewDialingCode(Integer code, String country) {
        if (codes.containsKey(code) || codes.containsValue(country)) {
            return;
        }
        codes.put(code, country);
    }

    public Integer findDialingCode(String country) {
        for (Map.Entry<Integer, String> e : codes.entrySet()) {
            if (e.getValue() == country) {
                return e.getKey();
            }
        }
        return null;
    }

    public void updateCountryDialingCode(Integer code, String country) {
        Integer previousCode = findDialingCode(country);
        if (previousCode == null) {
            return;
        }
        codes.remove(previousCode);
        codes.put(code, country);
    }
}
