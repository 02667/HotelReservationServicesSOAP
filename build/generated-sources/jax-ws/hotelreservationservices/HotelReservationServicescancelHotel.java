
package hotelreservationservices;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.1
 * 
 */
@WebService(name = "HotelReservationServicescancelHotel", targetNamespace = "http://HotelReservationServices")
@SOAPBinding(style = SOAPBinding.Style.RPC)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface HotelReservationServicescancelHotel {


    /**
     * 
     * @param bookingNr
     * @return
     *     returns java.lang.String
     * @throws CancellingOfTheHotelFault
     */
    @WebMethod
    @WebResult(name = "part1", partName = "part1")
    public String cancelHotel(
        @WebParam(name = "bookingNr", partName = "bookingNr")
        int bookingNr)
        throws CancellingOfTheHotelFault
    ;

}
