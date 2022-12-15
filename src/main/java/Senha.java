public class Senha {

    private String nomePessoa;
    private TipoSenha tipoSenha;

    public Senha(String nomePessoa, TipoSenha tipoSenha) {
        this.nomePessoa = nomePessoa;
        this.tipoSenha = tipoSenha;
    }

    public String getNomePessoa() {
        return nomePessoa;
    }

    public void setNomePessoa(String nomePessoa) {
        this.nomePessoa = nomePessoa;
    }

    public TipoSenha getTipoSenha() {
        return tipoSenha;
    }

    public void setTipoSenha(TipoSenha tipoSenha) {
        this.tipoSenha = tipoSenha;
    }

}
