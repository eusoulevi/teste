package br.com.teste.dao.controleacesso;

import com.xpert.persistence.dao.BaseDAO;
import br.com.teste.modelo.controleacesso.AcessoSistema;
import javax.ejb.Local;

/**
 *
 * @author ayslan
 */
@Local
public interface AcessoSistemaDAO extends BaseDAO<AcessoSistema> {
    
}
