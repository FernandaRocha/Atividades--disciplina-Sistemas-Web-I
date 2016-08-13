/*
 * 
 */
package br.ufop.web.petshop.dao;

import br.ufop.web.petshop.model.InterfaceModel;
import java.util.List;

public interface InterfaceDAO {
 
    public List<InterfaceModel> getList();
    public InterfaceModel get(int id);
    public boolean add(InterfaceModel item);     
    
}
