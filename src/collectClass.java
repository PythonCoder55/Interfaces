import java.util.ArrayList;

public class collectClass {
    public static ArrayList<Object> collectAll(Object[] objects, Filter filter) {
        ArrayList<Object> resultList = new ArrayList<>();
        for (Object obj : objects) {
            if (filter.accept(obj)) {
                resultList.add(obj);
            }
        }
        return resultList;
    }
}