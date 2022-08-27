import edu.umg.decorador.CompressionDecorator;
import edu.umg.decorador.DataSource;
import edu.umg.decorador.EncryptionDecorator;
import edu.umg.decorador.FileDataSource;

public class Main {
    public static void main(String[] args) {

        String salaryRecords = "Name,Salary\nLester Perez,100000\nKimberly Salazar,912000";

        /*FileDataSource fds = new FileDataSource("OutputDemo.txt");

        fds.writeData( salaryRecords );

        System.out.println( fds.readData() );*/

        /*DataSource encoded = new EncryptionDecorator(
                new FileDataSource("OutputDemo.txt")
        );

        encoded.writeData( salaryRecords );

        System.out.println("Informacion Decodificada");
        System.out.println( encoded.readData() );*/

        DataSource encoded = new CompressionDecorator(
                new EncryptionDecorator(
                    new FileDataSource("OutputDemo.txt")
                )
        );

        encoded.writeData( salaryRecords );




    }
}