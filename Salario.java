public class Salario {
        public static double impInss( double salarioSemImposto){
            double inss;
    
            if (salarioSemImposto <= 1212.00){
                inss = salarioSemImposto * 0.075;
            }
    
            else if (salarioSemImposto <= 2427.35){
                inss = salarioSemImposto * 0.09;
            }
            else if (salarioSemImposto <= 3641.03){
                inss = salarioSemImposto * 0.12;
            }
            else{
                inss = salarioSemImposto * 0.14;
            }
    
            return inss;
        }
    
    
        public static double calculoImpRenda( double salarioSemImposto){
           double imp;
    
           if (salarioSemImposto <= 1903.98){
            imp = 0;
           }
           else if(salarioSemImposto <= 2826.65){
            imp = salarioSemImposto * 0.075 - 142.80;
           }
           else if( salarioSemImposto <= 3751.05){
            imp = salarioSemImposto * 0.15 - 354.80;
           }
           else if (salarioSemImposto <= 4664.68){
            imp = salarioSemImposto * 0.225 - 636.13;
           }
           else{
            imp = salarioSemImposto * 0.275 - 869.36;
           }
    
         return imp;
    
        }
       
    
    
    
    
    
    
    
    
    
    }

