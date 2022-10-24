package Corrida;

public class Piloto {
    private String nomePiloto;
    private Integer idade;
    private Sexo sexo;
    private String equipe;

    public String getNomePiloto() {
        return nomePiloto;
    }
    public void setNomePiloto(String nomePiloto) {
        this.nomePiloto = nomePiloto;
    }

    public Integer getIdade() {
        return idade;
    }
    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public String getEquipe() {
        return equipe;
    }
    public void setEquipe(String nomePiloto) {
        this.equipe = equipe;
    }

    public Sexo getSexo() {
        return sexo;
    }
    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public Piloto(String nomePiloto, Integer idade, Sexo sexo, String equipe){
        this.nomePiloto = nomePiloto;
        this.idade = idade;
        this.sexo = sexo;
        this.equipe = equipe;
    }

    @Override
    public String toString() {
        return "Dados do(a) Piloto(a): " +
                "\n Nome do(a) piloto(a): " + nomePiloto +
                "\n Idade: " + idade +
                "\n Sexo: " + sexo +
                "\n Equipe: " + equipe;
    }
}
