public class Main {
    public static void main (String[]args){

        Pessoa p1 = new Pessoa();

        Pessoa p2 = new Pessoa();

        p1.nome = "Deide C.";
        p2.nome = "Thomas T.";

        p1.rua = "Rua 12";
        p1.cidade = "Barueri";
        p1.estado = "São Paulo";

        p2.rua = "Rua 12";
        p2.cidade = "Barueri";
        p2.estado = "São Paulo";

        p1.CPF = "15551111111";
        p2.CPF = "211122211111";

        p1.RG = "3453463471";
        p2.RG = "3553463471";

        p1.termoCienciaRisco = true;
        p2.termoCienciaRisco = true;

        p1.telefone = 121212122;
        p2.telefone = 221212122;

        p1.telcontato = 12121212;
        p2.telcontato = 12112121;
    }
}
