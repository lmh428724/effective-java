package sg.learn;

import cn.hutool.core.date.StopWatch;

/**
 * @标题
 * @描述信息
 * @作者 silly goose
 * @日期 2024/2/20
 */
public class Test {


    /**
     * 不要滥用自动装箱
     */
    private static void sum() {
        StopWatch stopWatch = new StopWatch();
        stopWatch.start("装箱类求和");
        Long sum1 = 0L;
        for (Long i = 0L; i < Integer.MAX_VALUE; i++) {
            sum1 += i;
        }
        stopWatch.stop();
        System.out.println(sum1);
        stopWatch.start("基本类求和");
        long sum2 = 0L;
        for (long i = 0L; i < Integer.MAX_VALUE; i++) {
            sum2 += i;
        }
        stopWatch.stop();
        System.out.println(sum2);
        System.out.println(stopWatch.prettyPrint());
    }

    public static void main(String[] args) {
        // 不要滥用自动装箱
        sum();
    }

}
