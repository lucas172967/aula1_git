import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java. util.Date;
import java.util.TimeZone;

public class teste_data {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		sdf3.setTimeZone(TimeZone.getTimeZone("GMT"));
		
		// A função parse recebe uma string no formato definido e retorna no formato da data
		Date y1 = sdf1.parse("25/06/2018");
		Date y2 = sdf2.parse("25/06/2018 15:42:07");
		// Data no padrão utc
		Date y3 = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
		
		
		// x1 recebe a data do atual momento
		Date x1 = new Date(); 
		// Outra maneira de receber a data do atual momento
		Date x2 = new Date(System.currentTimeMillis());
		// Define a data pelo numero de milissegundos
		Date x3 = new Date(0L);
		
		
		
		System.out.println("x1: " + sdf2.format(x1));
		System.out.println("x2: " + sdf2.format(x2));
		System.out.println("x3: " + sdf2.format(x3));
		System.out.println("y1: " + sdf2.format(y1));
		System.out.println("y2: " + sdf2.format(y2));
		System.out.println("y3: " + sdf2.format(y3));
	
		System.out.println("-----------------------------------------");
		
		System.out.println("x1: " + sdf3.format(x1));
		System.out.println("x2: " + sdf3.format(x2));
		System.out.println("x3: " + sdf3.format(x3));
		System.out.println("y1: " + sdf3.format(y1));
		System.out.println("y2: " + sdf3.format(y2));
		System.out.println("y3: " + sdf3.format(y3));
		
		System.out.println("-----------------------------------------");
		
		System.out.println("x1: " + x1);
		System.out.println("x2: " + x2);
		System.out.println("x3: " + x3);
		System.out.println("y1: " + y1);
		System.out.println("y2: " + y2);
		System.out.println("y3: " + y3);
	}

}
