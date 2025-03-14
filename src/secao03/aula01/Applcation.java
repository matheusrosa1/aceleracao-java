package secao03.aula01;

public class Applcation {
    public static void main(String[] args) {
        Television television = new Television("Philips", "LCD", 32);

        System.out.println("A televisão está ligada?");
        System.out.println(television.isOn());

        System.out.println("O volume atual é:");
        System.out.println(television.getVolume());

        double sizeCm = Television.convertToCentimeters(32);
        System.out.println("O tamanho em centímetros é:" + sizeCm);
    }
}
