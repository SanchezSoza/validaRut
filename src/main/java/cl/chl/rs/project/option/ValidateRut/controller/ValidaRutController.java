package cl.chl.rs.project.option.ValidateRut.controller;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import cl.chl.rs.project.option.ValidateRut.service.ValidaRutService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@Controller
public class ValidaRutController {

	@CrossOrigin
	@GetMapping(value = ValidaRutURIConstants.VALIDARUT)
	@ApiOperation(value = "Valida el rut del cliente", notes = "Valida el rut del cliente y lo devuelve con un formato especial")
	@ApiResponses({@ApiResponse(code = HttpServletResponse.SC_OK, message = "OK"),
		@ApiResponse(code = HttpServletResponse.SC_INTERNAL_SERVER_ERROR, message = "INTERNAL ERROR SERVER"),
		@ApiResponse(code = HttpServletResponse.SC_UNAUTHORIZED, message = "UNAUTHORIZED"),
		@ApiResponse(code = HttpServletResponse.SC_FORBIDDEN, message = "FORBIDDEN"),
		@ApiResponse(code = HttpServletResponse.SC_NOT_FOUND, message = "ELEMENTO NOT FOUND")
	})
	public @ResponseBody String validateRutData(@PathVariable String rut) {
		String rutFormateado = "";
		ValidaRutService valida = new ValidaRutService();
		rutFormateado = valida.validaRut(rut);
		return rutFormateado;
	}
}
