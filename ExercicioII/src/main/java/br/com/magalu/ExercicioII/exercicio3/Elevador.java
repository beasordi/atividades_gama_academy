package br.com.magalu.ExercicioII.exercicio3;

public class Elevador {

    int terreo = 0;
    int quantUsuarios = 0;
    int capacidade;
    int andaresTotais;
    int andar = terreo;

    public void inicializa(int capacidade, int andaresTotais){
        this.capacidade = capacidade;
        this.andaresTotais = andaresTotais;

    }

    public void entra(){
        if(this.quantUsuarios < this.capacidade){
            this.quantUsuarios ++;
            System.out.println("O usuário conseguiu entrar");
        }
        else{
            System.out.println("Não há mais espaço no elevador, aguarde!");
        }
    }

    public void sai (){
        if (this.quantUsuarios > 0){
            this.quantUsuarios --;
            System.out.println("Seu usuário saiu");
        }
        else{
            System.out.println("O elevador esta vazio");
        }
    }
    public void sobe(){
        if( this.andar < this.andaresTotais-1){
            this.andar++;
            System.out.println("Você chegou ao " + this.andar + "andar");
        }
        else{
            System.out.println("Você já chegou ao topo");
        }
    }
    public void desce(){
        if(this.andar > this.terreo){
            this.andar--;
            System.out.println("Você chegou ao " + (this.andar - 1) + "andar");
        }
        else{
            System.out.println("Você já está no térreo");
        }
    }

    //getters e setters
    public int getTerreo() {
        return terreo;
    }

    public void setTerreo(int terreo) {
        this.terreo = terreo;
    }

    public int getQuantUsuarios() {
        return quantUsuarios;
    }

    public void setQuantUsuarios(int quantUsuarios) {
        this.quantUsuarios = quantUsuarios;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public int getAndaresTotais() {
        return andaresTotais;
    }

    public void setAndaresTotais(int andaresTotais) {
        this.andaresTotais = andaresTotais;
    }

    public int getAndar() {
        return andar;
    }

    public void setAndar(int andar) {
        this.andar = andar;
    }

}
