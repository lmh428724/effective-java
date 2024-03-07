package sg.learn.类层次优于标签类.标签类示例;

/**
 * @标题
 * @描述信息
 * @作者 silly goose
 * @日期 2024/3/7
 */
class Figure {
    enum Shape {RECTANGLE, CIRCLE}

    ;


    final Shape shape;
    double length;
    double width;
    double radius;

    Figure(double radius) {
        shape = Shape.CIRCLE;
        this.radius = radius;
    }

    Figure(double length, double width) {
        shape = Shape.RECTANGLE;
        this.length = length;
        this.width = width;
    }

    double area() {
        switch (shape) {
            case RECTANGLE:
                return length * width;
            case CIRCLE:
                return Math.PI * (radius * radius);
            default:
                throw new AssertionError();
        }
    }

}
