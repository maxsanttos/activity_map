package entities;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
    private Integer matricula;
    private String name;
    private Integer presenca;
    private List<Nota> notas;

    public Aluno() {}

    public Aluno(Integer matricula, String name, Integer presenca) {
        this.matricula = matricula;
        this.name = name;
        this.presenca = presenca;
        this.notas = new ArrayList<>();
        
    }

    public Integer getMatricula() {
        return matricula;
    }

    public void setMatricula(Integer matricula) {
        this.matricula = matricula;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPresenca() {
        return presenca;
    }

    public void setPresenca(Integer presenca) {
        this.presenca = presenca;
    }

    public void addNotas(Double nota) {
        notas.add(new Nota(nota));
    }
    
    public String mostraNotas() {
        String notas = "";

        for (Nota nota : this.notas) {
            notas += nota.getNotas();
            notas += "  ";
        }

        return notas;
    }

    public String porcentagem() {
       return String.format("%.2f",(this.presenca * 100.0) / 60.0); 
    }

    public String media() {
        double sum = 0.0;

        for (Nota nota : this.notas) {
            sum += nota.getNotas();
        }

        return String.format("%.2f",sum / 3.0);
    }

    public String statusAluno(){
        double sum = 0.0;
        for (Nota nota : this.notas) {
            sum += nota.getNotas();
        }
        double status = sum / 3.0;
        if (status >= 7) {
            return "APROVADO!";
        }else if (status <= 6 && status >= 4) {
            return "RECUPERACAO!";
        }else{
            return "REPROVADO!";
        }
    }
}
