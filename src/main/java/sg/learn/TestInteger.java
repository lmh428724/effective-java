package sg.learn;

import java.util.Objects;

/**
 * @标题 测试包装类的缓存问题
 * @描述信息
 * @作者 silly goose
 * @日期 2024/2/21
 */
public class TestInteger {
    public static void main(String[] args) {
        /**
         * IntegerCache
         */
        Integer x = 127;
        Integer x1 = 127;
        Integer y = 128;
        Integer z = 128;
        System.out.println(x == x1); // true
        System.out.println(x == 127); // true
        System.out.println(y == 128); // true
        System.out.println(y == z); // false
        System.out.println(y.equals(z)); // true
        System.out.println(Objects.equals(y,z)); // true
        System.out.println(Objects.equals(y,128)); // true
        System.out.println(y.compareTo(z)); // 0
    }

}
