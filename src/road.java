public class road {
    public static void main(String[] args) {


        BMW bmw = new BMW();
        Mersedes mersedes = new Mersedes();
        bmw.setSoundDrive("бипка");
        mersedes.setSoundDrive("бупка");
gd(mersedes);
gd(bmw);
bmw.setNewSound("biiiii");
mersedes.setNewSound("byyyyyy");
        CarRepolmpl carRepolmpl = new CarRepolmpl();
        carRepolmpl.getNewSound(bmw);
        carRepolmpl.getNewSound(mersedes);

    }
    public static void gd(Car car) {
        car.drive();
    }

}


