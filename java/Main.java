public class Main {
    public static void main(String[] args) {
        
        // --- Exemplo de Mamífero Genérico (Gato) ---
        Mamiferos gato = new Mamiferos();
        gato.nome = "Gato Doméstico";
        gato.habitat = "Doméstico/Urbano";
        gato.dieta = "Carnívoro";
        gato.tamanho = "40cm";

        System.out.println("Animal: " + gato.nome);
        System.out.println("Habitat: " + gato.habitat);
        System.out.println("Dieta: " + gato.dieta);
        System.out.println("Tamanho: " + gato.tamanho);
        
        System.out.println("---------------------------");

        // --- Exemplo de Bovino herdando de Mamífero (Nelore) ---
        Bovinos nelore = new Bovinos();
        // Variáveis herdadas de Mamiferos:
        nelore.nome = "Boi Nelore";
        nelore.habitat = "Pasto";
        nelore.dieta = "Herbívoro";
        nelore.tamanho = "1.70m (altura)";
        
        // Variáveis específicas de Bovinos:
        nelore.porte = "Grande";
        nelore.cor = "Branco";
        nelore.resistencia = "Altíssima";

        System.out.println("Animal: " + nelore.nome);
        System.out.println("Habitat: " + nelore.habitat);
        System.out.println("Dieta: " + nelore.dieta);
        System.out.println("Porte: " + nelore.porte);
        System.out.println("Resistência: " + nelore.resistencia);
    }
}
