package dynamic_binding_experiment;

/*
 * Imagina que A <- B <- C  (B hereda de A y C hereda de B)
 */

public class Program {
    public static void main(String[] args) {
        A genericObject = new C();
        genericObject.myMethod();
    }
}

class A {
    public void myMethod() {
        // Esto hace referencia al objeto desde el que se llama el método
        String className = this.getClass().getSimpleName();
        // Tiene sentido, this en tiempo de ejecución hace referencia al objeto que hizo dynamic binding (el que llama
        // el método) permitiendo que acceda a todas las propiedades que están definidas en la clase en tiempo de compilación
        // esto no es un problema ya que por definición, una clase hija también tendrá las propiedades definidas
        // en una clase padre.

        // Es decir, si estuviera definida la propiedad x en A, es seguro accederla desde cualquier método porque las subclases
        // de A también tendrán esas propiedades por definición.
        System.out.println("My method defined on A: " + className);
    }    
}

class B extends A{
    /*
    @Override
    public void myMethod() {
        String className = this.getClass().getSimpleName();
        System.out.println("My method defined on B: " + className);
    }
    */
}

class C extends B {

}