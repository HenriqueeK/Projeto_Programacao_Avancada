package entidades.DAO;

import apoio.FileManager;
import java.util.ArrayList;
import model.Cliente;


public class ClienteDAO {
    
        
    private final String caminhoArquivo = "cliente.txt";

    public void salvar(Cliente c) {
        FileManager.adicionarLinhaNoArquivo(c.toString(), caminhoArquivo);
    }

    public ArrayList<Cliente> recuperarTodos() {
        ArrayList<String> linhas = FileManager.lerLinhasDoArquivo(caminhoArquivo);
        ArrayList<Cliente> cliente = new ArrayList();

        for (String linha : linhas) {
            String[] partes = linha.split(";");
            String nome = partes[0];
            String cpf = partes[1];
            String telefone = partes[2];
            String endereco = partes[3];

            Cliente c = new Cliente();
            c.setNome(nome);
            c.setCpf(cpf);
            c.setTelefone(telefone);
            c.setEndereco(endereco);
            
      
            cliente.add(c);
        }

        return cliente;
    }
    
}
