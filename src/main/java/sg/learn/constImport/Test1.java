package sg.learn.constImport;

/**
 * @标题
 * @描述信息
 * @作者 silly goose
 * @日期 2024/3/7
 */
public class Test1 {
    double atoms(double mols) {
        return PhysicalConstants.AVOGADROS_NUMBER * PhysicalConstants.BOLTZMANN_CONSTANT *PhysicalConstants.ELECTRON_MASS * mols;
    }
}
