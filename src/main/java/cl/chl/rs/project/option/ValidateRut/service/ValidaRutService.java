package cl.chl.rs.project.option.ValidateRut.service;

public class ValidaRutService {

	public String validaRut(String rut) {
		
		int cont = 0;
        String formato;
        rut = rut.replace(".", "");
        rut = rut.replace("-", "");
        formato = "-" + rut.substring(rut.length() - 1);
        for (int i = rut.length() - 2; i >= 0; i--) {
            formato = rut.substring(i, i + 1) + formato;
            cont++;
            if (cont == 3 && i != 0) {
                formato = "." + formato;
                cont = 0;
            }
        }
        return formato;
	}
}
