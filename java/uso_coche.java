public class uso_coche {
        public static void main(String[] args) {
            coche Renault=new coche(); //INSTANCIAR UNA CLASE O EJEMPLARIZAR CLASE
            Renault.establecer_color("rojo");
            System.out.println(Renault.dime_color());
            System.out.println("Este coche tiene "+Renault.dime_largo()+ " ruedas");
    
        }
    }

