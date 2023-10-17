package med.voll.api.entity.medico;

import med.voll.api.entity.endereco.DadosEndereco;
import med.voll.api.entity.enums.Especialidade;

public record DadosCadastroMedico(String nome,
                                  String email,
                                  String crm,
                                  Especialidade especialidade,
                                  DadosEndereco endereco) {
}
