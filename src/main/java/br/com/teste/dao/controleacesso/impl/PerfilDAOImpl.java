package br.com.teste.dao.controleacesso.impl;

import br.com.teste.application.BaseDAOImpl;
import br.com.teste.dao.controleacesso.PerfilDAO;
import br.com.teste.modelo.controleacesso.Perfil;
import br.com.teste.modelo.controleacesso.Usuario;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.Query;

/**
 *
 * @author #Author
 */
@Stateless
public class PerfilDAOImpl extends BaseDAOImpl<Perfil> implements PerfilDAO {
    
     @Override
    public List<Perfil> getPerfis(Usuario usuario) {

        String queryString = "SELECT perfis FROM " + Usuario.class.getName() + " u WHERE u =?1 ";
        Query query = getEntityManager().createQuery(queryString);
        query.setParameter(1, usuario);

        return query.getResultList();

    }
}
