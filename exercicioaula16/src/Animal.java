public class Animal {
    private String nome;
    private float comprimento;
    private int numerodePatas;
    private String cor;
    private String ambiente;
    private float velocidadeMedia;

    public Animal(String nome, float comprimento, int numerodePatas, String cor, String ambiente, float velocidadeMedia) {
        this.nome = nome;
        this.comprimento = comprimento;
        this.numerodePatas = numerodePatas;
        this.cor = cor;
        this.ambiente = ambiente;
        this.velocidadeMedia = velocidadeMedia;
    }

    public String getNome() {
        return nome;
    }

    public float getComprimento() {
        return comprimento;
    }

    public int getNumerodePatas() {
        return numerodePatas;
    }

    public String getCor() {
        return cor;
    }

    public String getAmbiente() {
        return ambiente;
    }

    public float getVelocidadeMedia() {
        return velocidadeMedia;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setComprimento(float comprimento) {
        this.comprimento = comprimento;
    }

    public void setNumerodePatas(int numeroDePatas) {
        this.numerodePatas = numeroDePatas;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setAmbiente(String ambiente) {
        this.ambiente = ambiente;
    }

    public void setVelocidadeMedia(float velocidadeMedia) {
        this.velocidadeMedia = velocidadeMedia;
    }

    public void dados() {
        System.out.println("Nome:" + nome);
        System.out.println("Comprimento:" + comprimento + "cm");
        System.out.println("Número de Patas:" + numerodePatas);
        System.out.println("Cor:" + cor);
        System.out.println("Ambiente:" + ambiente);
        System.out.println("Velocidade Média:" + velocidadeMedia + "m/s");
    }
}
