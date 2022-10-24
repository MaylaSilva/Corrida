package Corrida;

public class CarroCorrida {
    private Integer numeroCarro;
    private Piloto piloto;
    private Float velocidadeMaxima;
    private Float velocidadeAtual;
    private Boolean ligado;

    public CarroCorrida (Integer numeroCarro, Piloto piloto, Float velocidadeMaxima, Float velocidadeAtual, Boolean ligado){
        this.numeroCarro = numeroCarro;
        this.piloto = piloto;
        this.velocidadeMaxima = velocidadeMaxima;
        this.velocidadeAtual = velocidadeAtual;
        this.ligado = ligado;
    }
    public Integer getNumeroCarro(){
        return numeroCarro;
    } public void setNumeroCarro(Integer numeroCarro){
        this.numeroCarro = numeroCarro;
    }

    public Piloto getPiloto(){
        return piloto;
    } public void setPiloto(Piloto piloto){
        this.piloto = piloto;
    }

    public Float getVelocidadeMaxima(){
        return velocidadeMaxima;
    } public void setVelocidadeMaxima(Float velocidadeMaxima){
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public Float getVelocidadeAtual(){
        return velocidadeAtual  ;
    } public void setVelocidadeAtual(Float velocidadeAtual){
        this.velocidadeAtual = velocidadeAtual;
    }

    public Boolean getLigado(){
        return ligado;
    } public void setLigado(Boolean ligado){
        this.ligado = ligado;
    }


    public static boolean parar (Float velocidadeAtual) {
        if (velocidadeAtual != 0.0f) {
            System.err.println("Você tem que frear primeiro.");
        }
        return true;
    }

    public static void desligar (Boolean ligado, Float velocidadeAtual){
        if (velocidadeAtual != 0.0f){
            System.err.println("Para desligar o carro, primeiro pare ele.");
        } else{
            ligado = false;
        }
    }
    public static void ligar (Boolean ligado){
        if (ligado = false){
        System.err.println("O carro já está ligado.");
    } else{
        ligado = true;
    }
}
    public static void acelerar (Float velocidadeMaxima, Float velocidadeAtual, Float aceleracao, Boolean ligado){
        if (velocidadeAtual > velocidadeMaxima){
            System.err.println("Não podemos ultrapassar a velocidade máxima permitida de "
                    + velocidadeMaxima + " km/h");
        } else if (ligado == false) {
            System.err.println("Primeiro ligue o carro");
        }else {
            velocidadeAtual = velocidadeAtual + aceleracao;
        }
    }

    public static void frear (Float velocidadeAtual, Boolean ligado, Float frear){
        if (ligado == true){
            velocidadeAtual = velocidadeAtual - frear;
        } else if (ligado == false){
            System.out.println("Primeiro ligue o carro");
        } else if (velocidadeAtual < 0.0f){
            System.out.println("Você não pode frear, seu carro já está parado");
        }
    }

    @Override
    public String toString() {
        return "CarroCorrida{}";
    }
}
