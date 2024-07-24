package one.digitalinnovation.mockando;

public class ApiDosCorreios {

    public DadosLocalizacao buscarDadosComBaseNoCep(int cep) {
        // Aqui você deveria implementar a lógica para buscar os dados do endereço com base no CEP
        return new DadosLocalizacao("UF", "Cidade", "Logradouro", "Complemento", "Bairro");
    }
}

