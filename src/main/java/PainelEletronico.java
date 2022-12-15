public class PainelEletronico {

    public static String getProximoAtendimento(FilaEspera filaEspera) {
        String nomePessoa = null;

        for (Senha senha : filaEspera) {
            if (senha.getTipoSenha().equals(TipoSenha.PREFERENCIAL)) {
                nomePessoa = senha.getNomePessoa();
                break;
            }
        }

        return nomePessoa;
    }

}
