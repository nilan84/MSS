
/**
 * MSS_SignatureRespType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v10  Built on : Sep 04, 2013 (02:03:08 UTC)
 */

            
                package org.etsi.uri.ts102204.v1_1_2;
            

            /**
            *  MSS_SignatureRespType bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class MSS_SignatureRespType extends org.etsi.uri.ts102204.v1_1_2.MessageAbstractType
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = MSS_SignatureRespType
                Namespace URI = http://uri.etsi.org/TS102204/v1.1.2#
                Namespace Prefix = ns4
                */
            

                        /**
                        * field for MobileUser
                        */

                        
                                    protected org.etsi.uri.ts102204.v1_1_2.MobileUserType localMobileUser ;
                                

                           /**
                           * Auto generated getter method
                           * @return org.etsi.uri.ts102204.v1_1_2.MobileUserType
                           */
                           public  org.etsi.uri.ts102204.v1_1_2.MobileUserType getMobileUser(){
                               return localMobileUser;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param MobileUser
                               */
                               public void setMobileUser(org.etsi.uri.ts102204.v1_1_2.MobileUserType param){
                            
                                            this.localMobileUser=param;
                                    

                               }
                            

                        /**
                        * field for MSS_Signature
                        */

                        
                                    protected org.etsi.uri.ts102204.v1_1_2.SignatureTypeE localMSS_Signature ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localMSS_SignatureTracker = false ;

                           public boolean isMSS_SignatureSpecified(){
                               return localMSS_SignatureTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return org.etsi.uri.ts102204.v1_1_2.SignatureTypeE
                           */
                           public  org.etsi.uri.ts102204.v1_1_2.SignatureTypeE getMSS_Signature(){
                               return localMSS_Signature;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param MSS_Signature
                               */
                               public void setMSS_Signature(org.etsi.uri.ts102204.v1_1_2.SignatureTypeE param){
                            localMSS_SignatureTracker = param != null;
                                   
                                            this.localMSS_Signature=param;
                                    

                               }
                            

                        /**
                        * field for SignatureProfile
                        */

                        
                                    protected org.etsi.uri.ts102204.v1_1_2.MssURIType localSignatureProfile ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSignatureProfileTracker = false ;

                           public boolean isSignatureProfileSpecified(){
                               return localSignatureProfileTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return org.etsi.uri.ts102204.v1_1_2.MssURIType
                           */
                           public  org.etsi.uri.ts102204.v1_1_2.MssURIType getSignatureProfile(){
                               return localSignatureProfile;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SignatureProfile
                               */
                               public void setSignatureProfile(org.etsi.uri.ts102204.v1_1_2.MssURIType param){
                            localSignatureProfileTracker = param != null;
                                   
                                            this.localSignatureProfile=param;
                                    

                               }
                            

                        /**
                        * field for Status
                        */

                        
                                    protected org.etsi.uri.ts102204.v1_1_2.StatusType localStatus ;
                                

                           /**
                           * Auto generated getter method
                           * @return org.etsi.uri.ts102204.v1_1_2.StatusType
                           */
                           public  org.etsi.uri.ts102204.v1_1_2.StatusType getStatus(){
                               return localStatus;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Status
                               */
                               public void setStatus(org.etsi.uri.ts102204.v1_1_2.StatusType param){
                            
                                            this.localStatus=param;
                                    

                               }
                            

                        /**
                        * field for MSSP_TransID
                        * This was an Attribute!
                        */

                        
                                    protected org.apache.axis2.databinding.types.NCName localMSSP_TransID ;
                                

                           /**
                           * Auto generated getter method
                           * @return org.apache.axis2.databinding.types.NCName
                           */
                           public  org.apache.axis2.databinding.types.NCName getMSSP_TransID(){
                               return localMSSP_TransID;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param MSSP_TransID
                               */
                               public void setMSSP_TransID(org.apache.axis2.databinding.types.NCName param){
                            
                                            this.localMSSP_TransID=param;
                                    

                               }
                            
     

     
        /**
        *
        * @param parentQName
        * @param factory
        * @return org.apache.axiom.om.OMElement
        */
       public org.apache.axiom.om.OMElement getOMElement (
               final javax.xml.namespace.QName parentQName,
               final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException{


        
               org.apache.axiom.om.OMDataSource dataSource =
                       new org.apache.axis2.databinding.ADBDataSource(this,parentQName);
               return factory.createOMElement(dataSource,parentQName);
            
        }

         public void serialize(final javax.xml.namespace.QName parentQName,
                                       javax.xml.stream.XMLStreamWriter xmlWriter)
                                throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{
                           serialize(parentQName,xmlWriter,false);
         }

         public void serialize(final javax.xml.namespace.QName parentQName,
                               javax.xml.stream.XMLStreamWriter xmlWriter,
                               boolean serializeType)
            throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{
            
                


                java.lang.String prefix = null;
                java.lang.String namespace = null;
                

                    prefix = parentQName.getPrefix();
                    namespace = parentQName.getNamespaceURI();
                    writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);
                

                   java.lang.String namespacePrefix = registerPrefix(xmlWriter,"http://uri.etsi.org/TS102204/v1.1.2#");
                   if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)){
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           namespacePrefix+":MSS_SignatureRespType",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "MSS_SignatureRespType",
                           xmlWriter);
                   }

               
                                            if (localMajorVersion != null){
                                        
                                                writeAttribute("",
                                                         "MajorVersion",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localMajorVersion), xmlWriter);

                                            
                                      }
                                    
                                      else {
                                          throw new org.apache.axis2.databinding.ADBException("required attribute localMajorVersion is null");
                                      }
                                    
                                            if (localMinorVersion != null){
                                        
                                                writeAttribute("",
                                                         "MinorVersion",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localMinorVersion), xmlWriter);

                                            
                                      }
                                    
                                      else {
                                          throw new org.apache.axis2.databinding.ADBException("required attribute localMinorVersion is null");
                                      }
                                    
                                            if (localMSSP_TransID != null){
                                        
                                                writeAttribute("",
                                                         "MSSP_TransID",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localMSSP_TransID), xmlWriter);

                                            
                                      }
                                    
                                      else {
                                          throw new org.apache.axis2.databinding.ADBException("required attribute localMSSP_TransID is null");
                                      }
                                    
                                            if (localAP_Info==null){
                                                 throw new org.apache.axis2.databinding.ADBException("AP_Info cannot be null!!");
                                            }
                                           localAP_Info.serialize(new javax.xml.namespace.QName("http://uri.etsi.org/TS102204/v1.1.2#","AP_Info"),
                                               xmlWriter);
                                        
                                            if (localMSSP_Info==null){
                                                 throw new org.apache.axis2.databinding.ADBException("MSSP_Info cannot be null!!");
                                            }
                                           localMSSP_Info.serialize(new javax.xml.namespace.QName("http://uri.etsi.org/TS102204/v1.1.2#","MSSP_Info"),
                                               xmlWriter);
                                        
                                            if (localMobileUser==null){
                                                 throw new org.apache.axis2.databinding.ADBException("MobileUser cannot be null!!");
                                            }
                                           localMobileUser.serialize(new javax.xml.namespace.QName("http://uri.etsi.org/TS102204/v1.1.2#","MobileUser"),
                                               xmlWriter);
                                         if (localMSS_SignatureTracker){
                                            if (localMSS_Signature==null){
                                                 throw new org.apache.axis2.databinding.ADBException("MSS_Signature cannot be null!!");
                                            }
                                           localMSS_Signature.serialize(new javax.xml.namespace.QName("http://uri.etsi.org/TS102204/v1.1.2#","MSS_Signature"),
                                               xmlWriter);
                                        } if (localSignatureProfileTracker){
                                            if (localSignatureProfile==null){
                                                 throw new org.apache.axis2.databinding.ADBException("SignatureProfile cannot be null!!");
                                            }
                                           localSignatureProfile.serialize(new javax.xml.namespace.QName("http://uri.etsi.org/TS102204/v1.1.2#","SignatureProfile"),
                                               xmlWriter);
                                        }
                                            if (localStatus==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Status cannot be null!!");
                                            }
                                           localStatus.serialize(new javax.xml.namespace.QName("http://uri.etsi.org/TS102204/v1.1.2#","Status"),
                                               xmlWriter);
                                        
                    xmlWriter.writeEndElement();
               

        }

        private static java.lang.String generatePrefix(java.lang.String namespace) {
            if(namespace.equals("http://uri.etsi.org/TS102204/v1.1.2#")){
                return "ns4";
            }
            return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }

        /**
         * Utility method to write an element start tag.
         */
        private void writeStartElement(java.lang.String prefix, java.lang.String namespace, java.lang.String localPart,
                                       javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
            if (writerPrefix != null) {
                xmlWriter.writeStartElement(namespace, localPart);
            } else {
                if (namespace.length() == 0) {
                    prefix = "";
                } else if (prefix == null) {
                    prefix = generatePrefix(namespace);
                }

                xmlWriter.writeStartElement(prefix, localPart, namespace);
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
        }
        
        /**
         * Util method to write an attribute with the ns prefix
         */
        private void writeAttribute(java.lang.String prefix,java.lang.String namespace,java.lang.String attName,
                                    java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
            if (xmlWriter.getPrefix(namespace) == null) {
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            xmlWriter.writeAttribute(namespace,attName,attValue);
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeAttribute(java.lang.String namespace,java.lang.String attName,
                                    java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName,attValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace,attName,attValue);
            }
        }


           /**
             * Util method to write an attribute without the ns prefix
             */
            private void writeQNameAttribute(java.lang.String namespace, java.lang.String attName,
                                             javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

                java.lang.String attributeNamespace = qname.getNamespaceURI();
                java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
                if (attributePrefix == null) {
                    attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
                }
                java.lang.String attributeValue;
                if (attributePrefix.trim().length() > 0) {
                    attributeValue = attributePrefix + ":" + qname.getLocalPart();
                } else {
                    attributeValue = qname.getLocalPart();
                }

                if (namespace.equals("")) {
                    xmlWriter.writeAttribute(attName, attributeValue);
                } else {
                    registerPrefix(xmlWriter, namespace);
                    xmlWriter.writeAttribute(namespace, attName, attributeValue);
                }
            }
        /**
         *  method to handle Qnames
         */

        private void writeQName(javax.xml.namespace.QName qname,
                                javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            java.lang.String namespaceURI = qname.getNamespaceURI();
            if (namespaceURI != null) {
                java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
                if (prefix == null) {
                    prefix = generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix,namespaceURI);
                }

                if (prefix.trim().length() > 0){
                    xmlWriter.writeCharacters(prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                } else {
                    // i.e this is the default namespace
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                }

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
            }
        }

        private void writeQNames(javax.xml.namespace.QName[] qnames,
                                 javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

            if (qnames != null) {
                // we have to store this data until last moment since it is not possible to write any
                // namespace data after writing the charactor data
                java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
                java.lang.String namespaceURI = null;
                java.lang.String prefix = null;

                for (int i = 0; i < qnames.length; i++) {
                    if (i > 0) {
                        stringToWrite.append(" ");
                    }
                    namespaceURI = qnames[i].getNamespaceURI();
                    if (namespaceURI != null) {
                        prefix = xmlWriter.getPrefix(namespaceURI);
                        if ((prefix == null) || (prefix.length() == 0)) {
                            prefix = generatePrefix(namespaceURI);
                            xmlWriter.writeNamespace(prefix, namespaceURI);
                            xmlWriter.setPrefix(prefix,namespaceURI);
                        }

                        if (prefix.trim().length() > 0){
                            stringToWrite.append(prefix).append(":").append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        } else {
                            stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        }
                    } else {
                        stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                    }
                }
                xmlWriter.writeCharacters(stringToWrite.toString());
            }

        }


        /**
         * Register a namespace prefix
         */
        private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace) throws javax.xml.stream.XMLStreamException {
            java.lang.String prefix = xmlWriter.getPrefix(namespace);
            if (prefix == null) {
                prefix = generatePrefix(namespace);
                while (xmlWriter.getNamespaceContext().getNamespaceURI(prefix) != null) {
                    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                }
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            return prefix;
        }


  
        /**
        * databinding method to get an XML representation of this object
        *
        */
        public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
                    throws org.apache.axis2.databinding.ADBException{


        
                 java.util.ArrayList elementList = new java.util.ArrayList();
                 java.util.ArrayList attribList = new java.util.ArrayList();

                
                    attribList.add(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema-instance","type"));
                    attribList.add(new javax.xml.namespace.QName("http://uri.etsi.org/TS102204/v1.1.2#","MSS_SignatureRespType"));
                
                            elementList.add(new javax.xml.namespace.QName("http://uri.etsi.org/TS102204/v1.1.2#",
                                                                      "AP_Info"));
                            
                            
                                    if (localAP_Info==null){
                                         throw new org.apache.axis2.databinding.ADBException("AP_Info cannot be null!!");
                                    }
                                    elementList.add(localAP_Info);
                                
                            elementList.add(new javax.xml.namespace.QName("http://uri.etsi.org/TS102204/v1.1.2#",
                                                                      "MSSP_Info"));
                            
                            
                                    if (localMSSP_Info==null){
                                         throw new org.apache.axis2.databinding.ADBException("MSSP_Info cannot be null!!");
                                    }
                                    elementList.add(localMSSP_Info);
                                
                            elementList.add(new javax.xml.namespace.QName("http://uri.etsi.org/TS102204/v1.1.2#",
                                                                      "MobileUser"));
                            
                            
                                    if (localMobileUser==null){
                                         throw new org.apache.axis2.databinding.ADBException("MobileUser cannot be null!!");
                                    }
                                    elementList.add(localMobileUser);
                                 if (localMSS_SignatureTracker){
                            elementList.add(new javax.xml.namespace.QName("http://uri.etsi.org/TS102204/v1.1.2#",
                                                                      "MSS_Signature"));
                            
                            
                                    if (localMSS_Signature==null){
                                         throw new org.apache.axis2.databinding.ADBException("MSS_Signature cannot be null!!");
                                    }
                                    elementList.add(localMSS_Signature);
                                } if (localSignatureProfileTracker){
                            elementList.add(new javax.xml.namespace.QName("http://uri.etsi.org/TS102204/v1.1.2#",
                                                                      "SignatureProfile"));
                            
                            
                                    if (localSignatureProfile==null){
                                         throw new org.apache.axis2.databinding.ADBException("SignatureProfile cannot be null!!");
                                    }
                                    elementList.add(localSignatureProfile);
                                }
                            elementList.add(new javax.xml.namespace.QName("http://uri.etsi.org/TS102204/v1.1.2#",
                                                                      "Status"));
                            
                            
                                    if (localStatus==null){
                                         throw new org.apache.axis2.databinding.ADBException("Status cannot be null!!");
                                    }
                                    elementList.add(localStatus);
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","MajorVersion"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localMajorVersion));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","MinorVersion"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localMinorVersion));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","MSSP_TransID"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localMSSP_TransID));
                                

                return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(), attribList.toArray());
            
            

        }

  

     /**
      *  Factory class that keeps the parse method
      */
    public static class Factory{

        
        

        /**
        * static method to create the object
        * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
        *                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
        * Postcondition: If this object is an element, the reader is positioned at its end element
        *                If this object is a complex type, the reader is positioned at the end element of its outer element
        */
        public static MSS_SignatureRespType parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            MSS_SignatureRespType object =
                new MSS_SignatureRespType();

            int event;
            java.lang.String nillableValue = null;
            java.lang.String prefix ="";
            java.lang.String namespaceuri ="";
            try {
                
                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                
                if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","type")!=null){
                  java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                        "type");
                  if (fullTypeName!=null){
                    java.lang.String nsPrefix = null;
                    if (fullTypeName.indexOf(":") > -1){
                        nsPrefix = fullTypeName.substring(0,fullTypeName.indexOf(":"));
                    }
                    nsPrefix = nsPrefix==null?"":nsPrefix;

                    java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":")+1);
                    
                            if (!"MSS_SignatureRespType".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (MSS_SignatureRespType)org.w3.www.xml._1998.namespace.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                
                    // handle attribute "MajorVersion"
                    java.lang.String tempAttribMajorVersion =
                        
                                reader.getAttributeValue(null,"MajorVersion");
                            
                   if (tempAttribMajorVersion!=null){
                         java.lang.String content = tempAttribMajorVersion;
                        
                                                 object.setMajorVersion(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInteger(tempAttribMajorVersion));
                                            
                    } else {
                       
                               throw new org.apache.axis2.databinding.ADBException("Required attribute MajorVersion is missing");
                           
                    }
                    handledAttributes.add("MajorVersion");
                    
                    // handle attribute "MinorVersion"
                    java.lang.String tempAttribMinorVersion =
                        
                                reader.getAttributeValue(null,"MinorVersion");
                            
                   if (tempAttribMinorVersion!=null){
                         java.lang.String content = tempAttribMinorVersion;
                        
                                                 object.setMinorVersion(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInteger(tempAttribMinorVersion));
                                            
                    } else {
                       
                               throw new org.apache.axis2.databinding.ADBException("Required attribute MinorVersion is missing");
                           
                    }
                    handledAttributes.add("MinorVersion");
                    
                    // handle attribute "MSSP_TransID"
                    java.lang.String tempAttribMSSP_TransID =
                        
                                reader.getAttributeValue(null,"MSSP_TransID");
                            
                   if (tempAttribMSSP_TransID!=null){
                         java.lang.String content = tempAttribMSSP_TransID;
                        try {
                            object.setMSSP_TransID(
                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToNCName(tempAttribMSSP_TransID));
                        }catch(Exception ex){
                            ex.printStackTrace();
                        }
                                            
                    } else {
                       
                               throw new org.apache.axis2.databinding.ADBException("Required attribute MSSP_TransID is missing");
                           
                    }
                    handledAttributes.add("MSSP_TransID");
                    
                    
                    reader.next();
                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://uri.etsi.org/TS102204/v1.1.2#","AP_Info").equals(reader.getName())){
                                
                                                object.setAP_Info(org.etsi.uri.ts102204.v1_1_2.AP_Info_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://uri.etsi.org/TS102204/v1.1.2#","MSSP_Info").equals(reader.getName())){
                                
                                                object.setMSSP_Info(org.etsi.uri.ts102204.v1_1_2.MSSP_Info_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://uri.etsi.org/TS102204/v1.1.2#","MobileUser").equals(reader.getName())){
                                
                                                object.setMobileUser(org.etsi.uri.ts102204.v1_1_2.MobileUserType.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://uri.etsi.org/TS102204/v1.1.2#","MSS_Signature").equals(reader.getName())){
                                
                                                object.setMSS_Signature(org.etsi.uri.ts102204.v1_1_2.SignatureTypeE.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://uri.etsi.org/TS102204/v1.1.2#","SignatureProfile").equals(reader.getName())){
                                
                                                object.setSignatureProfile(org.etsi.uri.ts102204.v1_1_2.MssURIType.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://uri.etsi.org/TS102204/v1.1.2#","Status").equals(reader.getName())){
                                
                                                object.setStatus(org.etsi.uri.ts102204.v1_1_2.StatusType.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                }
                              
                            while (!reader.isStartElement() && !reader.isEndElement())
                                reader.next();
                            
                                if (reader.isStartElement())
                                // A start element we are not expecting indicates a trailing invalid property
                                throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                            



            } catch (javax.xml.stream.XMLStreamException e) {
                throw new java.lang.Exception(e);
            }

            return object;
        }

        }//end of factory class

        

        }
           
    