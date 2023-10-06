public class Personagem implements Cloneable  {

    private String nome;
    private int nivel;
    private int vida;

    public Personagem(String nome, int nivel, int vida){
        this.nome = nome;
        this.nivel = nivel;
        this.vida = vida;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }
    @Override
    public Personagem clone() throws CloneNotSupportedException {
        try {
            return (Personagem) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    @Override
    public String toString(){
        return "Personagem:" +
                " Nome:" + nome +
                " Nivel:" + nivel +
                " Vidas:" + vida;
    }
}