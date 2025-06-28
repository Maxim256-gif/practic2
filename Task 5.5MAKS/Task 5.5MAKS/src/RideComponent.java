import java.util.HashMap;
import java.util.Map;

abstract class RideComponent {
    protected String name;
    protected Map<String, RideComponent> childComponents = new HashMap<>();

    public RideComponent(String name) {
        this.name = name;
    }

    public abstract void processRequest();

    public void addComponent(RideComponent component) {
        childComponents.put(component.name, component);
    }

    public void removeComponent(String name) {
        childComponents.remove(name);
    }
}
