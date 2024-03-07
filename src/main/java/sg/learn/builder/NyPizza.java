package sg.learn.builder;

/**
 * @标题
 * @描述信息
 * @作者 silly goose
 * @日期 2024/2/19
 */
public class NyPizza extends Pizza{

    public enum Size {小, 中, 大}
    private final Size size;

    public static class Builder extends Pizza.Builder<Builder>{
        private final Size size;
        public Builder(Size size){
            this.size = size;
        }

        @Override
        public NyPizza build() {
            return new NyPizza(this);
        }

        @Override
        protected Builder self() {
            return this;
        }
    }

    private NyPizza(Builder builder){
        super(builder);
        size = builder.size;
    }

    public static void main(String[] args) {
        NyPizza pizza = new NyPizza.Builder(Size.小)
                .addTopping(Topping.洋葱)
                .addTopping(Topping.火腿)
                .build();
    }

}
