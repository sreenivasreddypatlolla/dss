//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.07.15 at 09:48:58 AM CEST 
//


package eu.europa.esig.jaxb.policy;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SignatureConstraints complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SignatureConstraints">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="StructuralValidation" type="{http://dss.esig.europa.eu/validation/diagnostic}LevelConstraint" minOccurs="0"/>
 *         &lt;element name="AcceptablePolicies" type="{http://dss.esig.europa.eu/validation/diagnostic}MultiValuesConstraint" minOccurs="0"/>
 *         &lt;element name="ReferenceDataExistence" type="{http://dss.esig.europa.eu/validation/diagnostic}LevelConstraint" minOccurs="0"/>
 *         &lt;element name="ReferenceDataIntact" type="{http://dss.esig.europa.eu/validation/diagnostic}LevelConstraint" minOccurs="0"/>
 *         &lt;element name="SignatureIntact" type="{http://dss.esig.europa.eu/validation/diagnostic}LevelConstraint" minOccurs="0"/>
 *         &lt;element name="SigningCertificate" type="{http://dss.esig.europa.eu/validation/diagnostic}CertificateConstraints" minOccurs="0"/>
 *         &lt;element name="CACertificate" type="{http://dss.esig.europa.eu/validation/diagnostic}CertificateConstraints" minOccurs="0"/>
 *         &lt;element name="Cryptographic" type="{http://dss.esig.europa.eu/validation/diagnostic}CryptographicConstraint" minOccurs="0"/>
 *         &lt;element name="MandatedSignedQProperties" type="{http://dss.esig.europa.eu/validation/diagnostic}SignedAttributesConstraints" minOccurs="0"/>
 *         &lt;element name="MandatedUnsignedQProperties" type="{http://dss.esig.europa.eu/validation/diagnostic}UnsignedAttributesConstraints" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SignatureConstraints", propOrder = {
    "structuralValidation",
    "acceptablePolicies",
    "referenceDataExistence",
    "referenceDataIntact",
    "signatureIntact",
    "signingCertificate",
    "caCertificate",
    "cryptographic",
    "mandatedSignedQProperties",
    "mandatedUnsignedQProperties"
})
public class SignatureConstraints {

    @XmlElement(name = "StructuralValidation")
    protected LevelConstraint structuralValidation;
    @XmlElement(name = "AcceptablePolicies")
    protected MultiValuesConstraint acceptablePolicies;
    @XmlElement(name = "ReferenceDataExistence")
    protected LevelConstraint referenceDataExistence;
    @XmlElement(name = "ReferenceDataIntact")
    protected LevelConstraint referenceDataIntact;
    @XmlElement(name = "SignatureIntact")
    protected LevelConstraint signatureIntact;
    @XmlElement(name = "SigningCertificate")
    protected CertificateConstraints signingCertificate;
    @XmlElement(name = "CACertificate")
    protected CertificateConstraints caCertificate;
    @XmlElement(name = "Cryptographic")
    protected CryptographicConstraint cryptographic;
    @XmlElement(name = "MandatedSignedQProperties")
    protected SignedAttributesConstraints mandatedSignedQProperties;
    @XmlElement(name = "MandatedUnsignedQProperties")
    protected UnsignedAttributesConstraints mandatedUnsignedQProperties;

    /**
     * Gets the value of the structuralValidation property.
     * 
     * @return
     *     possible object is
     *     {@link LevelConstraint }
     *     
     */
    public LevelConstraint getStructuralValidation() {
        return structuralValidation;
    }

    /**
     * Sets the value of the structuralValidation property.
     * 
     * @param value
     *     allowed object is
     *     {@link LevelConstraint }
     *     
     */
    public void setStructuralValidation(LevelConstraint value) {
        this.structuralValidation = value;
    }

    /**
     * Gets the value of the acceptablePolicies property.
     * 
     * @return
     *     possible object is
     *     {@link MultiValuesConstraint }
     *     
     */
    public MultiValuesConstraint getAcceptablePolicies() {
        return acceptablePolicies;
    }

    /**
     * Sets the value of the acceptablePolicies property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultiValuesConstraint }
     *     
     */
    public void setAcceptablePolicies(MultiValuesConstraint value) {
        this.acceptablePolicies = value;
    }

    /**
     * Gets the value of the referenceDataExistence property.
     * 
     * @return
     *     possible object is
     *     {@link LevelConstraint }
     *     
     */
    public LevelConstraint getReferenceDataExistence() {
        return referenceDataExistence;
    }

    /**
     * Sets the value of the referenceDataExistence property.
     * 
     * @param value
     *     allowed object is
     *     {@link LevelConstraint }
     *     
     */
    public void setReferenceDataExistence(LevelConstraint value) {
        this.referenceDataExistence = value;
    }

    /**
     * Gets the value of the referenceDataIntact property.
     * 
     * @return
     *     possible object is
     *     {@link LevelConstraint }
     *     
     */
    public LevelConstraint getReferenceDataIntact() {
        return referenceDataIntact;
    }

    /**
     * Sets the value of the referenceDataIntact property.
     * 
     * @param value
     *     allowed object is
     *     {@link LevelConstraint }
     *     
     */
    public void setReferenceDataIntact(LevelConstraint value) {
        this.referenceDataIntact = value;
    }

    /**
     * Gets the value of the signatureIntact property.
     * 
     * @return
     *     possible object is
     *     {@link LevelConstraint }
     *     
     */
    public LevelConstraint getSignatureIntact() {
        return signatureIntact;
    }

    /**
     * Sets the value of the signatureIntact property.
     * 
     * @param value
     *     allowed object is
     *     {@link LevelConstraint }
     *     
     */
    public void setSignatureIntact(LevelConstraint value) {
        this.signatureIntact = value;
    }

    /**
     * Gets the value of the signingCertificate property.
     * 
     * @return
     *     possible object is
     *     {@link CertificateConstraints }
     *     
     */
    public CertificateConstraints getSigningCertificate() {
        return signingCertificate;
    }

    /**
     * Sets the value of the signingCertificate property.
     * 
     * @param value
     *     allowed object is
     *     {@link CertificateConstraints }
     *     
     */
    public void setSigningCertificate(CertificateConstraints value) {
        this.signingCertificate = value;
    }

    /**
     * Gets the value of the caCertificate property.
     * 
     * @return
     *     possible object is
     *     {@link CertificateConstraints }
     *     
     */
    public CertificateConstraints getCACertificate() {
        return caCertificate;
    }

    /**
     * Sets the value of the caCertificate property.
     * 
     * @param value
     *     allowed object is
     *     {@link CertificateConstraints }
     *     
     */
    public void setCACertificate(CertificateConstraints value) {
        this.caCertificate = value;
    }

    /**
     * Gets the value of the cryptographic property.
     * 
     * @return
     *     possible object is
     *     {@link CryptographicConstraint }
     *     
     */
    public CryptographicConstraint getCryptographic() {
        return cryptographic;
    }

    /**
     * Sets the value of the cryptographic property.
     * 
     * @param value
     *     allowed object is
     *     {@link CryptographicConstraint }
     *     
     */
    public void setCryptographic(CryptographicConstraint value) {
        this.cryptographic = value;
    }

    /**
     * Gets the value of the mandatedSignedQProperties property.
     * 
     * @return
     *     possible object is
     *     {@link SignedAttributesConstraints }
     *     
     */
    public SignedAttributesConstraints getMandatedSignedQProperties() {
        return mandatedSignedQProperties;
    }

    /**
     * Sets the value of the mandatedSignedQProperties property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignedAttributesConstraints }
     *     
     */
    public void setMandatedSignedQProperties(SignedAttributesConstraints value) {
        this.mandatedSignedQProperties = value;
    }

    /**
     * Gets the value of the mandatedUnsignedQProperties property.
     * 
     * @return
     *     possible object is
     *     {@link UnsignedAttributesConstraints }
     *     
     */
    public UnsignedAttributesConstraints getMandatedUnsignedQProperties() {
        return mandatedUnsignedQProperties;
    }

    /**
     * Sets the value of the mandatedUnsignedQProperties property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnsignedAttributesConstraints }
     *     
     */
    public void setMandatedUnsignedQProperties(UnsignedAttributesConstraints value) {
        this.mandatedUnsignedQProperties = value;
    }

}