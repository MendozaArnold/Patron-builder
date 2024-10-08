public class Main {
    public static void main(String[] args) {
        Director director = new Director();
        
        TV tvPlana = director.construirTVPlana();
        TV tvClasica = director.construirTVClasica();
        
        System.out.println(tvPlana);
        System.out.println(tvClasica);
    }
}
