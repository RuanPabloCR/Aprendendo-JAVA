package POO.Exercicios.Planta2;

public class Planta {
    int id;
    String nome;
    Double tamanho;
    public Planta(int id){
        this.id = id;
    }
    @Override
    public String toString(){
        return "ID" + id + ", Nome: " + nome + ", Tamanho: " + tamanho + "cm";
    }
    @Override
    public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    Planta outra = (Planta) obj;
    return this.id == outra.id;
    }
}
