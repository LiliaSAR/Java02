public class CalculatorSalary {
    int socTax;
    int profitTax;
    int armyTax = 1000;
    int balanceSalary;

    public int balanceSalary(int currentSalary ) {

        if ((currentSalary >= 0) && (currentSalary <= 150000)) {
            profitTax = (int)((0.23) * currentSalary);
            socTax = (int)((0.025) * currentSalary);
        } else
        if ((currentSalary > 150000) && (currentSalary <= 2000000)) {
            profitTax = (int)((0.28) * (currentSalary - 150000)) + 34500;
            if (currentSalary < 500000){
                socTax = (int)((0.025) * currentSalary);
            }else
                if (currentSalary >= 500000){
                    socTax = 12500;
            }

        } else
        if (currentSalary > 2000000) {
            profitTax =  (int)((0.36) * (currentSalary - 2000000) ) + 552500;
            socTax = 12500;

        }
        else {
            System.out.println("You entered money is incorrect");
        }

        balanceSalary = currentSalary - (profitTax + socTax + armyTax);

        return balanceSalary;

    }

}
