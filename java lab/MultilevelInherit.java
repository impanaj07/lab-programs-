 class Box {
        private double width;
        private double height;
        private double depth;
    
        Box(Box ob) {
            width = ob.width;
            height = ob.height;
            depth = ob.depth;
        }
    
        Box(double w, double h, double d) {
            width = w;
            height = h;
            depth = d;
        }
    
        Box() {
            width = -1;
            height = -1;
            depth = -1;
        }
    
        Box(double len) {
            width = height = depth = len;
        }
    
        double volume() {
            return width * height * depth;
        }
    }
    
    class BoxWeight extends Box {
        double weight;
    
        BoxWeight(BoxWeight ob) {
            super(ob);
            weight = ob.weight;
        }
    
        BoxWeight(double w, double h, double d, double m) {
            super(w, h, d);
            weight = m;
        }
    
        BoxWeight() {
            super();
            weight = -1;
        }
    
        BoxWeight(double len, double m) {
            super(len);
            weight = m;
        }
    }
    
    class Shipment extends BoxWeight {
        double cost;
    
        Shipment(Shipment ob) {
            super(ob);
            cost = ob.cost;
        }
    
        Shipment(double w, double h, double d, double m, double c) {
            super(w, h, d, m);
            cost = c;
        }
    
        Shipment() {
            super();
            cost = -1;
        }
    }
    
    public class MultilevelInherit {
        public static void main(String[] args) {
            Shipment s1 = new Shipment(10, 20, 15, 10, 3.14);
            Shipment s2 = new Shipment(2, 3, 4, 0.76, 1.28);
            double vol;
    
            vol = s1.volume();
            System.out.println("Volume of Shipment is " + vol);
            System.out.println("Weight of shipment1 is " + s1.weight);
            System.out.println("Shipping cost: $" + s1.cost);
            System.out.println();
    
            vol = s2.volume();
            System.out.println("Volume of shipment 2 is " + vol);
            System.out.println("Weight of shipment 2 is " + s2.weight);
            System.out.println("Shipping cost: $" + s2.cost);
        }
    }
    