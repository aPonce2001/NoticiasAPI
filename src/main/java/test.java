import java.sql.Date;
import java.time.LocalDate;
import java.util.List;

import com.humilde.modelo.Autor;
import com.humilde.modelo.Noticia;
import com.humilde.persistencia.DAOFactory;

public class test {

	public static void main(String[] args) {
		// DAOFactory.getInstacia().getAutorDAO().getAll();
//		Autor autor = new Autor("Gabriel", "Flores","gabiflores02@gmail.com");
//		DAOFactory.getInstacia().getAutorDAO().create(autor);
		List <Noticia> list = DAOFactory.getInstacia().getNoticiaDAO().getNoticiasByTitleContain("OCHO");
		//List <Noticia> list = DAOFactory.getInstacia().getNoticiaDAO().getNoticiasByYear(2022);
		//List<Noticia> list =  DAOFactory.getInstacia().getNoticiaDAO().getNoticiasByAutorID(2);
		
		for (Noticia n : list) {
			System.out.println(n.getTitle() + "\n" + n.getCuerpo() );
			
			
		}
		
	}

}
