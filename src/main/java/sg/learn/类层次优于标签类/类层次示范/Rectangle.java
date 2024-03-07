package sg.learn.类层次优于标签类.类层次示范;

/**
 * @标题
 * @描述信息
 * @作者 silly goose
 * @日期 2024/3/7
 */
public class Rectangle extends Figure {
    final double length;
    final double width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    double area() {
        return length * width;
    }
}
