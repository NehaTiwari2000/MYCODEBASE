package commonMethod;

import java.util.List;

public class MyCommonMethod {
    public static <T> void extracted(List<T> integerList) {
        for (T i : integerList){
            System.out.println(i);
        }
    }
}
