public class TV {
    private String tipo;
    private String marca;
    private int tamaño;
    private boolean esSmart;

    // Constructor privado para el patrón Builder
    private TV(TVBuilder builder) {
        this.tipo = builder.tipo;
        this.marca = builder.marca;
        this.tamaño = builder.tamaño;
        this.esSmart = builder.esSmart;
    }

    @Override
    public String toString() {
        return "TV {" +
                "Tipo: '" + tipo + '\'' +
                ", Marca: '" + marca + '\'' +
                ", Tamaño: " + tamaño + " pulgadas" +
                ", Es Smart: " + esSmart +
                '}';
    }

    // Clase Builder
    public static class TVBuilder {
        private String tipo;
        private String marca;
        private int tamaño;
        private boolean esSmart;

        public TVBuilder(String tipo) {
            this.tipo = tipo;
        }

        public TVBuilder setMarca(String marca) {
            this.marca = marca;
            return this;
        }

        public TVBuilder setTamaño(int tamaño) {
            this.tamaño = tamaño;
            return this;
        }

        public TVBuilder setEsSmart(boolean esSmart) {
            this.esSmart = esSmart;
            return this;
        }

        public TV build() {
            return new TV(this);
        }
    }
}
