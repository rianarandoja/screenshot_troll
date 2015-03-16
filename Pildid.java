package projekt;

public class Pildid{

    static String crack(){
        int random = (int) Math.round(Math.random()* 3);
        if(random == 1){return "C:\\Users\\Kasutaja\\OneDrive\\TARTU ÜLIKOOL\\OOP\\IntelliJ projects\\src\\projekt\\crack.gif";}
        else if(random == 2){return "C:\\Users\\Kasutaja\\OneDrive\\TARTU ÜLIKOOL\\OOP\\IntelliJ projects\\src\\projekt\\crack2.gif";}
        else{return "C:\\Users\\Kasutaja\\OneDrive\\TARTU ÜLIKOOL\\OOP\\IntelliJ projects\\src\\projekt\\crack3.gif";}}
        
    static String värv() {
    	int random = (int) Math.round(Math.random()* 6);
    	if(random == 1) {return "C:/Users/Kalvar/Desktop/sinine.gif";}
    	else if(random == 2) {return "C:/Users/Kalvar/Desktop/roheline.gif";}
    	else if(random == 3) {return "C:/Users/Kalvar/Desktop/oranž.gif";}
    	else if(random == 4) {return "C:/Users/Kalvar/Desktop/kollane.gif";}
    	else if(random == 5) {return "C:/Users/Kalvar/Desktop/hsinine.gif";}
    	else {return "C:/Users/Kalvar/Desktop/punane.gif";}
    }

    static String pomm() {return "C:\\Users\\Kasutaja\\OneDrive\\TARTU ÜLIKOOL\\OOP\\IntelliJ projects\\src\\projekt\\plahvatus4.gif";}
}
