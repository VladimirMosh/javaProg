import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Set<Notebook> set = new HashSet<>();
        set.add(new Notebook("Sony Vaio", 8, "Windows11", 60000, "VPC"));
        set.add(new Notebook("MacBook", 16, "macOS", 99000, "PRO"));
        set.add(new Notebook("Xiaomi Mi", 32, "Windows12 ", 68000, "Notebook Pro"));
        set.add(new Notebook("Lenovo IdeaPad", 16, "linux", 88000, "Gaming"));

        programСommands operation = new programСommands(set);
        operation.start();

    }
}