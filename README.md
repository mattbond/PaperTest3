PaperTest3
==========

Demonstrate Exceptions and response problems with Apache CXF 3.0.0 when using schema-validation and MTOM.

Abbreviations:
SSV = server side validation i.e. in cxf-beans.xml <jaxws:properties><entry key="schema-validation-enabled" value="true" /></jaxws:properties>
CSM = client side MTOM (Enable MTOM enabled in SoapUI 5.0.0)

All 4 combinations of SSV : ON / OFF and CSM : ON / OFF wer tried

Results:
* SSV OFF : CSM OFF -> Works
* SSV OFF : CSM ON  -> Works
* SSV ON  : CSM OFF -> Response is invalid XML (<Status xsi:type="ns3:CodeType" xmlns:ns3="http://paper.bitapp.de/page" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance">)
* SSV ON  : CSM ON  -> SOAP Fault: `<faultstring>Invalid index -1; current element has only 1 attributes</faultstring>`. Due to `java.lang.IllegalArgumentException: Invalid index -1; current element has only 1 attributes`


Project also includes:
* Complete console logs and Responses are in the project in subfolders of "Request"
* SoapUI 5.0.0 Project. Currently set to MTOM on (enabled)
