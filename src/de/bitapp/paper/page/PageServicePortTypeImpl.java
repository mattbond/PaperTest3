
/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

package de.bitapp.paper.page;

import java.util.logging.Logger;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 3.0.0
 * 2014-06-12T15:11:02.870+09:00
 * Generated source version: 3.0.0
 * 
 */

@javax.jws.WebService(
                      serviceName = "pageService",
                      portName = "pageServicePort",
                      targetNamespace = "http://paper.bitapp.de/page",
                      wsdlLocation = "file:/C:/Users/bond/git/PaperTest3/paper3.wsdl",
                      endpointInterface = "de.bitapp.paper.page.PageServicePortType")
                      
public class PageServicePortTypeImpl implements PageServicePortType {

    private static final Logger LOG = Logger.getLogger(PageServicePortTypeImpl.class.getName());

    /* (non-Javadoc)
     * @see de.bitapp.paper.page.PageServicePortType#ping(de.bitapp.paper.page.FileType  status )*
     */
    public de.bitapp.paper.page.CodeType ping(FileType status) { 
        LOG.info("Executing operation ping");
        System.out.println(status);
        try {
            de.bitapp.paper.page.CodeType _return = new de.bitapp.paper.page.CodeType();
            _return.setCode(1048498287);
            _return.setMessage("Message-2025488042");
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

}
