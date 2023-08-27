import java.util.Random;

public class Personagem {
    private int visibilidade;
    private int poder;
    private int vidas;

    private Personagem(int visibilidade, int poder, int vidas) {
        this.visibilidade = visibilidade;
        this.poder = poder;
        this.vidas = vidas;
    }

    public static Personagem criarPersonagemNormal() {
        return new Personagem(10, 50, 3);
    }

    public static Personagem criarPersonagemPoderoso(int poder) {
        return new Personagem(10, poder, 3);
    }

    public static Personagem criarPersonagemSoturno(int visibilidade) {
        return new Personagem(visibilidade, 50, 3);
    }

    public static Personagem criarPersonagemPersonalizado(int visibilidade, int poder, int vidas) {
        return new Personagem(visibilidade, poder, vidas);
    }

    public static Personagem criarPersonagemAleatorio() {
        Random random = new Random();
        int x = random.nextInt(100);

        if (x <= 60) {
            return criarPersonagemNormal();
        } else if (x <= 75) {
            int poder = random.nextInt(101);
            return criarPersonagemPoderoso(poder);
        } else if (x <= 90) {
            int visibilidade = random.nextInt(11);
            return criarPersonagemSoturno(visibilidade);
        } else {
            int visibilidade = random.nextInt(11);
            int poder = random.nextInt(101);
            int vidas = random.nextInt(6);
            return criarPersonagemPersonalizado(visibilidade, poder, vidas);
        }
    }

    @Override
    public String toString() {
        return "Personagem [visibilidade=" + visibilidade + ", poder=" + poder + ", vidas=" + vidas + "]";
    }
}