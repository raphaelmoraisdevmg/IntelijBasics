public class Hello {
    public static void main(String[] args) {
        // if else  exemplos praticos
        boolean isAlien = false;
        if (!isAlien) {
            System.out.println("it is not an alien!");
        } else {  // melhor paratica para escrever if é usando blocos de código, usando essa tecnica já se evita erros.
            System.out.println("And I am sacred of aliens");
        }

        int topScore = 99;
        if(topScore >= 100){
            System.out.println("You got the high score");
        }else{
            System.out.println("You didn't have high score");
        }
        int secondTopScore = 100;
        if((topScore > secondTopScore) && (topScore < 100)){ /* o operador and(&&) necessita que todas as premissas sejam veridadeiras caso isso não ocorra o resultado sera false
         e assim o segundo bloco do if sera executado no caso o bloco else*/
            System.out.println("Greather than second top score and less than 100%");
        }
        if((topScore > 90)||(topScore <=90)){ /* o operador || ou or necessita que uma ou outra premissa sejam verdadeiras,
        caso isso ocorra o resultado sera true e o primeiro bloco do if sera executado*/
            System.out.println("Either or both of the conditions are true");
        }
        int newValue = 50;
        if(newValue == 50){
            System.out.println("ok its will work");
        // o erro está em utilizar um operador de atribuição no if sendo assim a expressão não tera um valor lógico como resultado final
        //    java: incompatible types: int cannot be converted to boolean
        // expressão anterior do if era newValue=50
        }

        boolean isCar = false;
        if(!isCar){
            //System.out.println("This is not supposed to happen");
            System.out.println("now its can happen");
        }
         // ternary operator  operador ternario
        String makeOfCar = "Wolkswagen";
        boolean isDomestic = makeOfCar == "Wolkswagen" ? false : true;
        /*
        se  a comparação der verdadeiro nesse caso aqui resultara
        em false pois o primeiro valor depois da ? e false caso desse false então seria atribuido um true a variavel isDomestic
        */
        if(isDomestic){
            System.out.println("This car is domestic to our country");
        }
        String s  = (isDomestic) ? "This car is domestic": "this car is not domestic";
        System.out.println(s);
    }
}
