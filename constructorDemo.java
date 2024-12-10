class Constructor {
    double width;
    double height;
    double depth;
    Constructor(){
        System.out.println("Constructor without parameters");
        width =10;
        height =10;
        depth =10;
    }
    Constructor(int  a ,int b,int c){
        System.out.println("Constructor with parameters");
        width = a;
        height = b;
        depth = c;

    }
    double volume(){
        return width*height*depth;
    }
}
public class constructorDemo {
    public static void main(String[] args){
        Constructor cuboid1 = new Constructor();
        double vol;
        vol = cuboid1.volume();
        System.out.println("Volume : "+ vol);
        Constructor cuboid2 = new Constructor(8,11,9);
        vol=cuboid2.volume();
        System.out.println("Volume : "+vol);

    }
}