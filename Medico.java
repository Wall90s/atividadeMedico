public class Medico {
    private int crm;
    private String nome;
    private String dataNascimento;
    private String especialidade;
    private int anoInicialExperiencia;

    public Medico() {   // 1/2 - Construtor vazio
    }

    public Medico(int crm, String nome, String dataNascimento, String especialidade, int anoInicialExperiencia) {   // 2/2 - Construtor com parâmetros
        this.crm = crm;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.especialidade = especialidade;
        this.anoInicialExperiencia = anoInicialExperiencia;
    }

    public int getCrm() {
        return crm;
    }

    public void setCrm(int crm) {
        this.crm = crm;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public int getAnoInicialExperiencia() {
        return anoInicialExperiencia;
    }

    public void setAnoInicialExperiencia(int anoInicialExperiencia) {
        this.anoInicialExperiencia = anoInicialExperiencia;
    }

    public void imprimirMedico() {
        System.out.println("CRM: " + this.getCrm());    // Esse "this" acessa o atributo do próprio objeto
        System.out.println("Nome: " + this.getNome());
        System.out.println("Data de Nasc.: " + this.getDataNascimento());
        System.out.println("Especialidade: " + this.getEspecialidade());
        System.out.println("Experiência: " + this.getAnoInicialExperiencia());
        System.out.println();
    }

    public void verificarTempoExperiencia() {
        int anoAtual = 2023;
        int anosDeExperiencia = anoAtual - this.getAnoInicialExperiencia(); // Aqui o "this" pega o ano inicial do próprio objeto

        if (anosDeExperiencia < 1) {
            System.out.println("Inexperiente: menos de 1 ano de tempo de experiência");
            System.out.println();
        }
        if (anosDeExperiencia >= 2 && anosDeExperiencia <= 5) {
            System.out.println("Pouca experiência: de 2 a 5 anos de tempo de experiência");
            System.out.println();
        }
        if (anosDeExperiencia >= 6 && anosDeExperiencia >= 10) {
            System.out.println("Experiente: de 6 até 10 anos de tempo de experiência");
            System.out.println();
        }
        if (anosDeExperiencia > 10) {
            System.out.println("Muita experiência: mais de 10 anos de tempo de experiência");
            System.out.println();
        }
    }
}
