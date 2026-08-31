package UFemoji;

public class Skill {

    private String nome;
    private float forca;
    private float velocidade;
    private float tecnica;
    private float letalidade;

    public Skill(String nome, float forca, float velocidade,
                 float tecnica, float letalidade) {

        this.nome = nome;
        this.forca = forca;
        this.velocidade = velocidade;
        this.tecnica = tecnica;
        this.letalidade = letalidade;
    }
    //Metodos Especias

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public float getForca() {
        return forca;
    }
    public void setForca(float forca) {
        this.forca = forca;
    }
    public float getVelocidade() {
        return velocidade;
    }
    public void setVelocidade(float velocidade) {
        this.velocidade = velocidade;
    }
    public float getTecnica() {
        return tecnica;
    }
    public void setTecnica(float tecnica) {
        this.tecnica = tecnica;
    }
    public float getLetalidade() {
        return letalidade;
    }
    public void setLetalidade(float letalidade) {
        this.letalidade = letalidade;
    }
     
}