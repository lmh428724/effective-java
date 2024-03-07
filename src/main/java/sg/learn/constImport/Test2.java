package sg.learn.constImport;


/**
 * @标题  对于一些常量值的引入可以通过 static import 来减少代码的冗余
 * @描述信息
 * @作者 silly goose
 * @日期 2024/3/7
 */
import static sg.learn.constImport.PhysicalConstants.*;
public class Test2 {
    double atoms(double mols) {
        return AVOGADROS_NUMBER * BOLTZMANN_CONSTANT * ELECTRON_MASS * mols;
    }
}
