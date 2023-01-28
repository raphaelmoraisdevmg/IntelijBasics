public class OperatorChallenge {
    public static void main(String[] args) {
        //1 create a double variable with a value of 20.00
        double firstValue =20.00d;
        //2 crate a second variable of type double with a value of 80.00
        double secondValue =80.00d;
        //3 add both numbers together, the multiply by 100.00
        double total = (firstValue + secondValue) * 100.00d; // operador de precedencia para fazer a conta na ordem certa
        //4 use the remainder operator, to figure out what the remainder from the result of the operation in step three, and 40.00, will be
        double remainder = total % 40.00d;
        //5 create a boolean variable that assings the value true, if the reminder in step four is 0.00, or false if it's not zero.
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
        //6 output the boolean variable jus to see what the result is
        System.out.println(isTrue);
        //7write an if-then statement that displays a message, 'got some remainder', if the boolean in step five is  not true
        if(!isTrue){
            System.out.println("got some reminder");
        }