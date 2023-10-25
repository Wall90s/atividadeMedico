import java.util.Scanner;

public class TestaMedico {
    public static void main(String[] args) {
        /* Instanciando alguns objetos */
        Medico claudia = new Medico(1234, "Claudia", "25/10/2023", "Pediatra", 2014);
        Medico claudiana = new Medico(1234, "Claudiana", "25/10/2023", "Ortopedista", 2012);

        /* Lendo informações digitadas e atribuindo em variáveis*/
        Scanner leia = new Scanner(System.in);
        System.out.println("CRM:");
        int crm = leia.nextInt();
        System.out.println("Nome:");
        String nome = leia.next();
        System.out.println("Data de Nasc.:");
        String dataNascimento = leia.next();
        System.out.println("Especialidade:");
        String especialidade = leia.next();
        System.out.println("Ano inicial de experiência:");
        int anoInicialExperiencia = leia.nextInt();

        /* Instanciando objeto com informações digitadas */
        Medico claudete = new Medico(crm, nome, dataNascimento, especialidade, anoInicialExperiencia);

        claudia.imprimirMedico();   // Imprimindo informações sem parâmetros graças ao "this"
        claudiana.imprimirMedico();
        claudete.imprimirMedico();

        claudete.verificarTempoExperiencia();   // Imprimindo experiência também sem parâmetros
    }
}
