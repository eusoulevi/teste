package br.com.teste.dao.controleacesso.impl;

import br.com.teste.application.BaseDAOImpl;
import br.com.teste.dao.controleacesso.UsuarioDAO;
import br.com.teste.modelo.controleacesso.SituacaoUsuario;
import br.com.teste.modelo.controleacesso.Usuario;
import java.util.List;
import javax.ejb.Stateless;

/**
 *
 * @author #Author
 */
@Stateless
public class UsuarioDAOImpl extends BaseDAOImpl<Usuario> implements UsuarioDAO {

    @Override
    public List<Usuario> getUsuariosAtivos() {
        return list("situacaoUsuario", SituacaoUsuario.ATIVO, "nome");
    }
}
