/*
 * 
 */
package br.ufop.web.petshop.dao;

import br.ufop.web.petshop.model.Cliente;
import br.ufop.web.petshop.model.InterfaceModel;
import br.ufop.web.persistence.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Fernando B Oliveira <https://github.com/fboliveira>
 *
 */
public class ClienteDAO implements InterfaceDAO {

    private List<InterfaceModel> clientes;

    @Override
    public List<InterfaceModel> getList() {

        List<InterfaceModel> clientes = new ArrayList<>();

        String sql = "SELECT * FROM clientes";
        ResultSet rs = DataSource.executeQuery(sql);


                        
        try {
            while (rs.next()) {
                Cliente cliente = new Cliente();
                cliente.setId(rs.getInt("id"));
                cliente.setNome(rs.getString("nome"));
                cliente.setLogin(rs.getString("login"));
                cliente.setSenha(rs.getString("senha"));
       

                clientes.add(cliente);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
     
        return clientes;

    }

    @Override
    public boolean add(InterfaceModel item) {

        Cliente cliente = (Cliente) item;

        String sql = "INSERT INTO clientes (id, nome, login, senha) VALUES ("
                + "'" + cliente.getNome() + "', '', '','',"  + ")";
        System.out.println(sql);

        return DataSource.executeUpdate(sql);
    }

    @Override
    public InterfaceModel get(int id) {

        String sql = "SELECT id, nome, login, senha FROM clientes WHERE id = " + id;
        ResultSet rs = DataSource.executeQuery(sql);
        Cliente cliente = new Cliente();

        try {
            if (rs.next()) {
                cliente.setId(rs.getInt("id"));
                cliente.setNome(rs.getString("nome"));
                cliente.setId(rs.getInt("login"));
                cliente.setNome(rs.getString("senha"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return (InterfaceModel) cliente;
        
    }

}
    