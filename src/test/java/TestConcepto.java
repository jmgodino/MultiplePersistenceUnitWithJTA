import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.jccm.edu.wsc.valida.data.DelphosPersonaDao;
import com.jccm.edu.wsc.valida.data.SecVirPersonaDao;
import com.jccm.edu.wsc.valida.model.Persona;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:applicationContext.xml",
		"classpath:atomikosJTA.xml" })
public class TestConcepto {

	@Autowired
	DelphosPersonaDao delphosDao;

	@Autowired
	SecVirPersonaDao secvirDao;

	@Test
	public void distribuida() {
		delphos();
		secvir();
	}

	public void delphos() {

		String sql = "select a.c_numide" + "      from tlinsmatprupre so,"
				+ "           tlconvpru      cpru,"
				+ "           tltippruebas   tpru,"
				+ "           tlalumnos      a,"
				+ "           tlpruebas      pru,"
				+ "           tlestinsprupre esol," + "           TLCENTROS C,"
				+ "           TLCENINSPRU CIP," + "           TLDATOSCEN DC,"
				+ "           tlusuarios u," + "           tlempleados e"
				+ "     where a.x_alumno = so.x_alumno"
				+ "       and cpru.x_convpru = so.x_convpru"
				+ "       and cpru.x_prueba = pru.x_prueba"
				+ "       and pru.x_tipprueba = tpru.x_tipprueba"
				+ "       and tpru.x_tipprueba = 3"
				+ "       and pru.x_prueba = 5"
				+ "       AND SO.X_CONVPRU in (29,30)"
				+ "       and esol.x_estinsprupre = so.x_estinsprupre"
				+ "       AND SO.X_CENINSPRU = CIP.X_CENINSPRU"
				+ "       AND CIP.X_CENTRO = C.X_CENTRO"
				+ "       AND C.X_CENTRO = DC.X_CENTRO"
				+ "       and so.c_usucreacion = u.x_usuario(+)"
				+ "       and u.x_empleado = e.x_empleado(+)"
				+ "   order by a.t_apellido1, a.t_apellido2, a.t_nombre";

		List<String> listaNifs = delphosDao.getListFromSql(sql);
		int numNifs = listaNifs.size();
		System.out.println("Numeor nifs: " + numNifs);
	}

	public void secvir() {

		Persona persona = new Persona();
		persona.setApellido1("Apellido1");
		persona.setApellido2("Apellido2");
		persona.setDirres("Jose Miguel");
		persona.setDnie("87654321X");
		persona.setFeccad("12/12/12");
		persona.setFecnac("01/01/85");
		persona.setLocnac("Madrid");
		persona.setLocres("Toledo");
		persona.setMadre("no");
		persona.setMensaje("Mi Mensaje");
		secvirDao.save(persona);

		Persona p = secvirDao.findAlumnosByNif("87654321X");
		System.out.println("Persona: " + p.getApellido1());

	}
}
