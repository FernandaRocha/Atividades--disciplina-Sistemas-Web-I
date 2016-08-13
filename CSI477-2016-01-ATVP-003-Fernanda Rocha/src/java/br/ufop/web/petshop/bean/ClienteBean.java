/*
 * 
 */
package br.ufop.web.petshop.bean;

import br.ufop.web.petshop.controller.ClienteController;
import br.ufop.web.petshop.model.InterfaceModel;
import java.util.List;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author Fernando B Oliveira <https://github.com/fboliveira>
 */
@Named(value = "clienteBean")
@RequestScoped
public class ClienteBean {

    /**
     * Creates a new instance of AlunoBean
     */
    public ClienteBean() {
    }
    
    public List<InterfaceModel> getClientes() {
        ClienteController clienteController = new ClienteController();
        return clienteController.getList();
    }
    
}
