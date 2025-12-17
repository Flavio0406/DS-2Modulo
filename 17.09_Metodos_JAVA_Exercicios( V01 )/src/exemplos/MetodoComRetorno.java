package exemplos;

public class MetodoComRetorno {

        public String nomeAluno() {
            return "seu nome ";
        }

        public static void main(String[] args) {
            MetodoComRetorno aluno = new MetodoComRetorno();
            System.out.println("Nome do aluno: " + aluno.nomeAluno());

        }
    }

