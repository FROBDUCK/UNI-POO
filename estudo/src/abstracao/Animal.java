package abstracao;

abstract class Animal {
    public abstract void som();

    // Método concreto (com implementação)
    public void dormir() {
        System.out.println("O animal está dormindo.");
    }
}
