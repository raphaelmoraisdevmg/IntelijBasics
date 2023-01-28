public class OperatorChallenge {
    public static void main(String[] args) {
        //1
        double firstValue =20.00d;
        //2
        double secondValue =80.00d;
        //3
        double total = (firstValue + secondValue) * 100.00d; // operador de precedencia para fazer a conta na ordem certa
        //4
        double remainder = total % 40.00d;
        //5
      /*  boolean isTrue = true;
        System.out.println(total);
        System.out.println(remainder);
        if(remainder > 0){
            isTrue = false;
        }*/
        // segunda opção para o isTrue
        boolean isTrue = remainder==0 ? true : false;
        System.out.println(total);
        System.out.println(remainder);
        //6
        System.out.println(isTrue);
        //7
        if(!isTrue){
            System.out.println("got some reminder");
        }
    }
}
