public class Aluno implements Comparable<Aluno>{
    private Long matricula;
    private String nome;
    private Double p1;
    private Double p2;
    private Double t1;
    private Double t2;
    private Double media;
    private char situacao;

    public char getSituacao() {
        if(media < 5)
            situacao = 'I';
        else if(media >= 5 && media < 7)
            situacao = 'R';
        else if(media >= 7 && media < 9)
            situacao = 'B';
        else
            situacao = 'E';
        return situacao;
    }

    public Double calculaMedia() {
        media = 0.6*((p1 + p2) / 2) + 0.4*((t1 + t2) / 2);
        return media;
    }

    public Aluno() {}

    public Aluno(Long matricula, String nome, Double p1, Double p2, Double t1, Double t2) {
        this.matricula = matricula;
        this.nome = nome;
        this.p1 = p1;
        this.p2 = p2;
        this.t1 = t1;
        this.t2 = t2;
    }

    public Long getMatricula() {
        return matricula;
    }

    public void setMatricula(Long matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getP1() {
        return p1;
    }

    public void setP1(Double p1) {
        this.p1 = p1;
    }

    public Double getP2() {
        return p2;
    }

    public void setP2(Double p2) {
        this.p2 = p2;
    }

    public Double getT1() {
        return t1;
    }

    public void setT1(Double t1) {
        this.t1 = t1;
    }

    public Double getT2() {
        return t2;
    }

    public void setT2(Double t2) {
        this.t2 = t2;
    }

    @Override
    public String toString() {
        //String.format(), (Exercicio: Formatar o retorno, especificamente
        // calculaMedia() com apenas 1 casa decimal)
        /*
        * d - int, Integer, long, Long, short....
        * f - float, double, Float, Double
        * s - String
        * c - char
        * */
        return String.format("%d %s %.1f %c", matricula, nome, calculaMedia(), getSituacao());
        //return matricula + " " + nome + " " + calculaMedia() + " " + getSituacao();
    }


    @Override
    public int compareTo(Aluno o) {
        return Long.compare(this.matricula, o.matricula);
    }
}
