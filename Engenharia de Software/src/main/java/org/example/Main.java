import java.util.LinkedList;
import java.util.List;

public class Produto {
    private List<Consulta> consultas = new LinkedList<Consulta>();

    public void agendarConsulta(Consulta consulta) {
        consultas.add(consulta);
    }

    public List<Consulta> consultarConsultasPorPaciente(String paciente) {
        List<Consulta> consultasEncontradas = new LinkedList<Consulta>();
        for (Consulta consulta : consultas) {
            if (consulta.getPaciente().getNome().equals(paciente)) {
                consultasEncontradas.add(consulta);
            }
        }
        return consultasEncontradas;
    }

    public List<Consulta> consultarConsultasPorMedicoNome(String nome) {
        List<Consulta> consultasEncontradas = new LinkedList<Consulta>();
        for (Consulta consulta : consultas) {
            if (consulta.getMedico().getNome().equals(nome)) {
                consultasEncontradas.add(consulta);
            }
        }
        return consultasEncontradas;
    }

    public List<Consulta> consultarConsultasPorMedicoEspecialidade(String especialidade) {
        List<Consulta> consultasEncontradas = new LinkedList<Consulta>();
        for (Consulta consulta : consultas) {
            if (consulta.getMedico().getEspecialidade().equals(especialidade)) {
                consultasEncontradas.add(consulta);
            }
        }
        return consultasEncontradas;
    }

    public List<Consulta> getConsultas() {
        return consultas;
    }

}