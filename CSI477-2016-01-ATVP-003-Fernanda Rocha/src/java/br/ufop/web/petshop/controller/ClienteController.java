
package br.ufop.web.petshop.controller;

import br.ufop.web.petshop.dao.ClienteDAO;
import br.ufop.web.petshop.model.InterfaceModel;
import java.util.List;

public class ClienteController implements InterfaceController {
    
    @Override
    public List<InterfaceModel> getList() {
        ClienteDAO clienteDAO = new ClienteDAO();
        return clienteDAO.getList();
    }

    @Override
    public InterfaceModel get(int id) {
        ClienteDAO clienteDAO = new ClienteDAO();
        return clienteDAO.get(id);
    }

    @Override
    public boolean add(InterfaceModel item) {
        ClienteDAO clienteDAO = new ClienteDAO();
        return clienteDAO.add(item);
    }
    
}
