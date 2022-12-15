import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PainelEletronicoTest {

    @Test
    void deveContarAlunosAtivosCurso() {
        FilaEspera filaEspera = new FilaEspera(
                new Senha("pessoaUm", TipoSenha.NORMAL),
                new Senha("pessoaDois", TipoSenha.NORMAL),
                new Senha("pessoaTres", TipoSenha.NORMAL),
                new Senha("pessoaQuatro", TipoSenha.PREFERENCIAL),
                new Senha("pessoaCinco", TipoSenha.PREFERENCIAL)
        );

        assertEquals("pessoaQuatro", PainelEletronico.getProximoAtendimento(filaEspera));
    }

}