import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class FilaEspera implements Iterable<Senha>{

    private List<Senha> senhas = new ArrayList<>();

    public FilaEspera(Senha... senhas) {
        this.senhas = Arrays.asList(senhas);
    }

    @Override
    public Iterator<Senha> iterator() {
        return senhas.iterator();
    }


}
