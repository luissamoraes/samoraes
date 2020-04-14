package caed.dao;

import caed.entidade.Escola;
import conexaocaed.util.FabricaConexao;
import caed.util.exception.ErroSistema;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author luissamoraes
 */
public class CaedDAO implements CrudDAO<Escola>{
    
    @Override
    public void salvar(Escola escola) throws ErroSistema{
        try {
            Connection conexao = FabricaConexao.getConexao();
            PreparedStatement ps;
            if(escola.getId() == null){
                ps = conexao.prepareStatement("INSERT INTO `escola` (`escola`,`estado`,`cidade`,`matricula`) VALUES (?,?,?,?)");
            } else {
                ps = conexao.prepareStatement("update escola set escola=?, estado=?, cidade=?, matricula=? where id=?");
                ps.setInt(5, escola.getId());
            }
            ps.setString(1, escola.getEscola());
            ps.setString(2, escola.getEstado());
            ps.setString(3, escola.getCidade());
            ps.setDate(4, new Date(escola.getMatricula().getTime()));
            ps.execute();
            FabricaConexao.fecharConexao();
        } catch (SQLException ex) {
            throw new ErroSistema("Erro ao tentar salvar!", ex);
        }
    }
    
    @Override
    public void deletar(Escola escola) throws ErroSistema{
        try {
            Connection conexao = FabricaConexao.getConexao();
            PreparedStatement ps  = conexao.prepareStatement("delete from escola where id = ?");
            ps.setInt(1, escola.getId());
            ps.execute();
        } catch (SQLException ex) {
            throw new ErroSistema("Erro ao deletar as escola!", ex);
        }
    }
    
    @Override
    public List<Escola> buscar() throws ErroSistema{
        try {
            Connection conexao = FabricaConexao.getConexao();
            PreparedStatement ps = conexao.prepareStatement("select * from escola");
            ResultSet resultSet = ps.executeQuery();
            List<Escola> escolas = new ArrayList<>();
            while(resultSet.next()){
                Escola escola = new Escola();
                escola.setId(resultSet.getInt("id"));
                escola.setEscola(resultSet.getString("escola"));
                escola.setEstado(resultSet.getString("estado"));
                escola.setCidade(resultSet.getString("cidade"));
                escola.setMatricula(resultSet.getDate("matricula"));
                escolas.add(escola);
            }
            FabricaConexao.fecharConexao();
            return escolas;
            
        } catch (SQLException ex) {
            throw new ErroSistema("Erro ao buscar as escolas!",ex);
        }
    }
}
