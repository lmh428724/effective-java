package sg.learn.类层次优于标签类.类层次示范;

/**
 * @标题
 * @描述信息
 * @作者 silly goose
 * @日期 2024/3/7
 */
public class Circle extends Figure {
    final double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI * (radius * radius);
    }
}
