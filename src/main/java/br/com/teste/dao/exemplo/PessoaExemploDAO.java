package br.com.teste.dao.exemplo;

import com.xpert.persistence.dao.BaseDAO;
import br.com.teste.modelo.exemplo.PessoaExemplo;
import javax.ejb.Local;

/**
 *
 * @author ayslan
 */
@Local
public interface PessoaExemploDAO extends BaseDAO<PessoaExemplo> {
    
}
