public class Lesson2_calculator {
    double result(double a, double b, int znak){
        double x = 0;
        if(znak == 1) x = (a + b);
        if(znak == 2) x = (a - b);
        if(znak == 3) x = (a * b);
        if(znak == 4) x = (a / b);
        return x;
    }
}
