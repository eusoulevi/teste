package br.com.teste.dao.escola;

import com.xpert.persistence.dao.BaseDAO;
import br.com.teste.modelo.escola.Aluno;
import javax.ejb.Local;

/**
 *
 * @author levi
 */
@Local
public interface AlunoDAO extends BaseDAO<Aluno> {
    
}
