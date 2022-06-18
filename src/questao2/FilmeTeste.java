package questao2;
import connection.ConnectionFactory;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
public class FilmeTeste {
    public FilmeTeste() {
    }

    public static void main(String[] args) throws SQLException {
        Scanner read = new Scanner(System.in);
        ConnectionFactory connection = new ConnectionFactory();
        connection.getConnection();
        int page1 = 1;
        int page2 = 5;
        int page3 = 10;
        int page4 = 15;
        int max = 20;
        System.out.println("Quantos filmes você deseja filtrar?");
        int qtdF = read.nextInt();
        System.out.println("Qual página você deseja acessar(1 a 4)?");
        int nPage = read.nextInt();
        String sql;
        PreparedStatement ps;
        ResultSet rs;
        int id;
        String nome;
        String descricao;
        String data;
        if (nPage == 1) {
            sql = "SELECT * FROM FILME WHERE ID >=" + page1 + " AND ID <= " + qtdF;
            ps = connection.getConnection().prepareStatement(sql);
            rs = ps.executeQuery();

            while(rs.next()) {
                id = rs.getInt("ID");
                nome = rs.getString("NOME");
                descricao = rs.getString("DESCRICAO");
                data = rs.getString("DATA_LACAMENTO");
                System.out.println("-------------------------------------------------------------\n");
                System.out.printf("ID: %d \nNome do filme: %s \nDescrição: %s \nData de lançamento: %s \n", id, nome, descricao, data);
                System.out.printf("Página %d \n", nPage);
            }
        }

        if (nPage == 2) {
            sql = "SELECT * FROM FILME WHERE ID >" + page2 + " AND ID <= " + (qtdF + 5);
            ps = connection.getConnection().prepareStatement(sql);
            rs = ps.executeQuery();

            while(rs.next()) {
                id = rs.getInt("ID");
                nome = rs.getString("NOME");
                descricao = rs.getString("DESCRICAO");
                data = rs.getString("DATA_LACAMENTO");
                System.out.println("-------------------------------------------------------------\n");
                System.out.printf("ID: %d \nNome do filme: %s \nDescrição: %s \nData de lançamento: %s \n", id, nome, descricao, data);
                System.out.printf("Página %d \n", nPage);
            }
        }

        if (nPage == 3) {
            sql = "SELECT * FROM FILME WHERE ID >" + page3 + " AND ID <= " + (qtdF + 10);
            ps = connection.getConnection().prepareStatement(sql);
            rs = ps.executeQuery();

            while(rs.next()) {
                id = rs.getInt("ID");
                nome = rs.getString("NOME");
                descricao = rs.getString("DESCRICAO");
                data = rs.getString("DATA_LACAMENTO");
                System.out.println("-------------------------------------------------------------\n");
                System.out.printf("ID: %d \nNome do filme: %s \nDescrição: %s \nData de lançamento: %s \n", id, nome, descricao, data);
                System.out.printf("Página %d \n", nPage);
            }
        }

        if (nPage == 4) {
            sql = "SELECT * FROM FILME WHERE ID >" + page4 + " AND ID <=" + (qtdF + 15);
            ps = connection.getConnection().prepareStatement(sql);
            rs = ps.executeQuery();

            while(rs.next()) {
                id = rs.getInt("ID");
                nome = rs.getString("NOME");
                descricao = rs.getString("DESCRICAO");
                data = rs.getString("DATA_LACAMENTO");
                System.out.println("-------------------------------------------------------------\n");
                System.out.printf("ID: %d \nNome do filme: %s \nDescrição: %s \nData de lançamento: %s \n", id, nome, descricao, data);
                System.out.printf("Página %d \n", nPage);
            }
        } else if (nPage > 4) {
            System.out.println("Página inválida!");
        }

    }
}
