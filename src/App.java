
public class App {
    public static void main(String[] args) throws Exception {
        
        for(int x = 0; x<=5;x++){
            Personagem personagemAleatorio = Personagem.criarPersonagemAleatorio();
            System.out.println(personagemAleatorio);
        }
    }
}
