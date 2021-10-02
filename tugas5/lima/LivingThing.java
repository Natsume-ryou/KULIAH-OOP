package tugas5.lima;

public abstract class LivingThing {
    public void breath() {
        System.out.println("Living Thing breathing...");
    }
    public void eat() {
        System.out.println("Living Thing eating...");
    }
    
    public abstract void walk();
}
