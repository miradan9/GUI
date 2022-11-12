package Ejercicio_XML;

import org.w3c.dom.DOMImplementation;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Text;

import java.io.File;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

public class Ejercicio_03 {

    public static void main(String[] args) {
        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            DOMImplementation implementation = builder.getDOMImplementation();

            Document document = implementation.createDocument(null, "curriculum", null);
            document.setXmlVersion("1.0");

            Element empleados = document.createElement("empleados");
            Element empleado = document.createElement("empleado");

            Element nombre = document.createElement("nombre");
            Text textNombre = document.createTextNode("Valeria Aguayo");
            nombre.appendChild(textNombre);
            empleado.appendChild(nombre);

            Element direccion = document.createElement("direccion");
            Text textDireccion = document.createTextNode("Atlacomulco");
            direccion.appendChild(textDireccion);
            empleado.appendChild(direccion);

            Element fecha = document.createElement("fecha");
            Text textFecha = document.createTextNode("09/04/03");
            fecha.appendChild(textFecha);
            empleado.appendChild(fecha);

            Element telefono = document.createElement("telefono");
            Text textTelefono = document.createTextNode("7121723986");
            telefono.appendChild(textTelefono);
            empleado.appendChild(telefono);

            Element estudios = document.createElement("estudios");
            Text textEstudios = document.createTextNode("Licenciatura en Ingeniería en Computación");
            estudios.appendChild(textEstudios);
            empleado.appendChild(estudios);

            Element idiomas = document.createElement("idiomas");
            Text textIdiomas = document.createTextNode("Inglés");
            idiomas.appendChild(textIdiomas);
            empleado.appendChild(idiomas);

            empleados.appendChild(empleado);

            document.getDocumentElement().appendChild(empleados);

            Source source = new DOMSource(document);
            Result result = new StreamResult(new File("curriculum.xml"));

            Transformer transformer = TransformerFactory.newInstance().newTransformer();
            transformer.transform(source, result);

        } catch (ParserConfigurationException | TransformerException ex) {
            System.out.println(ex.getMessage());
        }

    }
}


