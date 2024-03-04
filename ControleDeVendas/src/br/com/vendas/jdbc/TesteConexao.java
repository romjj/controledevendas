package br.com.vendas.jdbc;

import javax.swing.JOptionPane;

public class TesteConexao {

    public static void main(String[] args) {

        try {

            new ConnectionFactory().getConnection();
            JOptionPane.showMessageDialog(null, "Conectado ao banco de dados com sucesso!");
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Ops! Aconteceu o erro: " + erro);
        }

    }

}
