public class Director {
    public TV construirTVPlana() {
        return new TV.TVBuilder("Plana")
                .setMarca("Samsung")
                .setTamaño(55)
                .setEsSmart(true)
                .build();
    }
    
    public TV construirTVClasica() {
        return new TV.TVBuilder("Clásica")
                .setMarca("Sony")
                .setTamaño(32)
                .setEsSmart(false)
                .build();
    }
}
