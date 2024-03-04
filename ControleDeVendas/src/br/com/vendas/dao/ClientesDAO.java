package br.com.vendas.dao;

import br.com.vendas.jdbc.ConnectionFactory;
import br.com.vendas.model.Clientes;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.util.List;
import javax.swing.JOptionPane;

public class ClientesDAO {

    private Connection con;

    public ClientesDAO() {
        this.con = new ConnectionFactory().getConnection();
    }

    //Metodo cadastrar Cliente
    public void cadastrarCliente(Clientes obj) {
        try {
            //1 passo  - comando sql
            String sql = "insert into tb_clientes (nome,rg,cpf,email,telefone,celular,cep,endereco,numero,complemento,bairro,cidade,estado) "
                    + " values (?,?,?,?,?,?,?,?,?,?,?,?,?)";

            //2 passo - conectar o banco de dados e organizar o comando sql
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, obj.getNome());
            stmt.setString(2, obj.getRg());
            stmt.setString(3, obj.getCpf());
            stmt.setString(4, obj.getEmail());
            stmt.setString(5, obj.getTelefone());
            stmt.setString(6, obj.getCelular());
            stmt.setString(7, obj.getCep());
            stmt.setString(8, obj.getEndereco());
            stmt.setInt(9, obj.getNumero());
            stmt.setString(10, obj.getComplemento());
            stmt.setString(11, obj.getBairro());
            stmt.setString(12, obj.getCidade());
            stmt.setString(13, obj.getUf());

            //3 passo - executar o comando sql
            stmt.execute();
            stmt.close();

            JOptionPane.showMessageDialog(null, "Cadastrado com Sucesso!");

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Erro: " + erro);

        }

    }

    public List<Clientes> listarClientes() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public Clientes consultaPorNome(String nome) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public Clientes buscaCep(String text) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public List<Clientes> buscaClientePorNome(String nome) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
