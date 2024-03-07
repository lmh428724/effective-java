package sg.learn.builder;

import java.util.EnumSet;
import java.util.Objects;
import java.util.Set;

/**
 * @标题
 * @描述信息
 * @作者 silly goose
 * @日期 2024/2/19
 */
public abstract class Pizza {

    public enum Topping {火腿, 蘑菇, 洋葱, 胡椒, 香肠}

    final Set<Topping> toppings;


    abstract static class Builder<T extends Builder<T>> {
        EnumSet<Topping> toppings = EnumSet.noneOf(Topping.class);

        public T addTopping(Topping topping) {
            toppings.add(Objects.requireNonNull(topping));
            return self();
        }

        abstract Pizza build();

        // Subclasses must override this method to return "this"
        protected abstract T self();
    }

    Pizza(Builder<?> builder) {
        toppings = builder.toppings.clone();
    }
}
