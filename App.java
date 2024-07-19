public class App {

    public static void main(String [] args){
        double funcionario1 = 2000.0;
        double funcionario2 = 2500.0;
        double funcionario3 = 3000.0;
        double funcionario4 = 3500.0;
        double funcionario5 = 4000.0;

        double inss1 = Salario.impInss(funcionario1);
        double inss2 = Salario.impInss(funcionario2);
        double inss3 = Salario.impInss(funcionario3);
        double inss4 = Salario.impInss(funcionario4);
        double inss5 = Salario.impInss(funcionario5);

        double impRenda1 = Salario.calculoImpRenda(funcionario1);
        double impRenda2 = Salario.calculoImpRenda(funcionario2);
        double impRenda3 = Salario.calculoImpRenda(funcionario3);
        double impRenda4 = Salario.calculoImpRenda(funcionario4);
        double impRenda5 = Salario.calculoImpRenda(funcionario5);

        double salarioComImposto1 = funcionario1 - inss1 - impRenda1;
        double salarioComImposto2 = funcionario2 - inss2 - impRenda2;
        double salarioComImposto3 = funcionario3 - inss3 - impRenda3;
        double salarioComImposto4 = funcionario4 - inss4 - impRenda4;
        double salarioComImposto5 = funcionario5 - inss5 - impRenda5;

        

        System.out.println("----- FUNCIONÁRIO 1 -----\n");
        System.out.println("O primeiro salário sem impostos foi: " + funcionario1);
        System.out.println("INSS:" + inss1);
        System.out.println("Imposto de renda:" + impRenda1);
        System.out.println("O primeiro salário com os impostos foi: " + salarioComImposto1);
       
        System.out.println("\n ----- FUNCIONÁRIO 2 -----\n");
        System.out.println("O segundo salário sem impostos foi: " + funcionario2);
        System.out.println("INSS:" + inss2);
        System.out.println("Imposto de renda:" + impRenda2);
        System.out.println("O segundo salário com os impostos foi: " + salarioComImposto2);

        System.out.println("\n ----- FUNCIONÁRIO 3 -----\n");
        System.out.println("O terceiro salário sem impostos foi: " + funcionario3);
        System.out.println("INSS:" + inss3);
        System.out.println("Imposto de renda:" + impRenda3);
        System.out.println("O terceiro salário com os impostos foi: " + salarioComImposto3);

        System.out.println("\n ----- FUNCIONÁRIO 4 -----\n");
        System.out.println("O quarto salário sem impostos foi: " + funcionario4);
        System.out.println("INSS:" + inss4);
        System.out.println("Imposto de renda:" + impRenda4);
        System.out.println("O quarto salário com os impostos foi: " + salarioComImposto4);

        System.out.println("\n ----- FUNCIONÁRIO 5 -----\n");
        System.out.println("O quinto salário sem impostos foi: " + funcionario5);
        System.out.println("INSS:" + inss5);
        System.out.println("Imposto de renda:" + impRenda5);
        System.out.println("O quinto salário com os impostos foi: " + salarioComImposto5);


    }



}
