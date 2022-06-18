package questao1;

import connection.ConnectionFactory;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Produto {

    public static void main(String[] args) throws SQLException {
        Scanner read = new Scanner(System.in);
        ConnectionFactory connection = new ConnectionFactory();
        connection.getConnection();
        System.out.println("Digite uma opção: \n1- Cadastrar \n2- Atualizar \n3- Excluir");
        int option = read.nextInt();
        switch (option) {
            case 1:
                for (int i = 1; i < 4; ++i) {
                    String sql = "INSERT INTO PRODUTO(ID, NOME, DESCRICAO, QTD, PRECO) VALUES(?, 'notebook', 'macbook pro', 15, 'R$25000')";
                    PreparedStatement ps = connection.getConnection().prepareStatement(sql);
                    ps.setInt(1, i);
                    ps.execute();
                }

                System.out.println("Produtos cadastrados com sucesso.");
                break;
            case 2:
                String sql = "UPDATE PRODUTO SET QTD=8 WHERE ID =1 ";
                PreparedStatement ps = connection.getConnection().prepareStatement(sql);
                ps.execute();
                System.out.println("Produto 2 atualizado com sucesso.");
                break;
            case 3:
                String sql3 = "DELETE FROM PRODUTO WHERE ID = 2";
                PreparedStatement ps3 = connection.getConnection().prepareStatement(sql3);
                ps3.execute();
                System.out.println("Produto 3 deletado com sucesso.");
        }
    }
}
