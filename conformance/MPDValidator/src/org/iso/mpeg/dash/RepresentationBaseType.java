//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.2-hudson-jaxb-ri-2.2-63- 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.05.11 at 03:03:46 PM MESZ 
//


package org.iso.mpeg.dash;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;
import org.w3c.dom.Element;


/**
 * <p>Java class for RepresentationBaseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RepresentationBaseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FramePacking" type="{urn:mpeg:dash:schema:mpd:2011}DescriptorType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="AudioChannelConfiguration" type="{urn:mpeg:dash:schema:mpd:2011}DescriptorType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ContentProtection" type="{urn:mpeg:dash:schema:mpd:2011}DescriptorType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="EssentialProperty" type="{urn:mpeg:dash:schema:mpd:2011}DescriptorType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SupplementalProperty" type="{urn:mpeg:dash:schema:mpd:2011}DescriptorType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="InbandEventStream" type="{urn:mpeg:dash:schema:mpd:2011}DescriptorType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;any processContents='lax' namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="profiles" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="width" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
 *       &lt;attribute name="height" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
 *       &lt;attribute name="sar" type="{urn:mpeg:dash:schema:mpd:2011}RatioType" />
 *       &lt;attribute name="frameRate" type="{urn:mpeg:dash:schema:mpd:2011}FrameRateType" />
 *       &lt;attribute name="audioSamplingRate" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="mimeType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="segmentProfiles" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="codecs" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="maximumSAPPeriod" type="{http://www.w3.org/2001/XMLSchema}double" />
 *       &lt;attribute name="startWithSAP" type="{urn:mpeg:dash:schema:mpd:2011}SAPType" />
 *       &lt;attribute name="maxPlayoutRate" type="{http://www.w3.org/2001/XMLSchema}double" />
 *       &lt;attribute name="codingDependency" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="scanType" type="{urn:mpeg:dash:schema:mpd:2011}VideoScanType" />
 *       &lt;anyAttribute processContents='lax' namespace='##other'/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RepresentationBaseType", propOrder = {
    "framePackings",
    "audioChannelConfigurations",
    "contentProtections",
    "essentialProperties",
    "supplementalProperties",
    "inbandEventStreams",
    "anies"
})
@XmlSeeAlso({
    AdaptationSetType.class,
    SubRepresentationType.class,
    RepresentationType.class
})
public class RepresentationBaseType {

    @XmlElement(name = "FramePacking")
    protected List<DescriptorType> framePackings;
    @XmlElement(name = "AudioChannelConfiguration")
    protected List<DescriptorType> audioChannelConfigurations;
    @XmlElement(name = "ContentProtection")
    protected List<DescriptorType> contentProtections;
    @XmlElement(name = "EssentialProperty")
    protected List<DescriptorType> essentialProperties;
    @XmlElement(name = "SupplementalProperty")
    protected List<DescriptorType> supplementalProperties;
    @XmlElement(name = "InbandEventStream")
    protected List<DescriptorType> inbandEventStreams;
    @XmlAnyElement
    protected List<Element> anies;
    @XmlAttribute(name = "profiles")
    protected String profiles;
    @XmlAttribute(name = "width")
    @XmlSchemaType(name = "unsignedInt")
    protected Long width;
    @XmlAttribute(name = "height")
    @XmlSchemaType(name = "unsignedInt")
    protected Long height;
    @XmlAttribute(name = "sar")
    protected String sar;
    @XmlAttribute(name = "frameRate")
    protected String frameRate;
    @XmlAttribute(name = "audioSamplingRate")
    protected String audioSamplingRate;
    @XmlAttribute(name = "mimeType")
    protected String mimeType;
    @XmlAttribute(name = "segmentProfiles")
    protected String segmentProfiles;
    @XmlAttribute(name = "codecs")
    protected String codecs;
    @XmlAttribute(name = "maximumSAPPeriod")
    protected Double maximumSAPPeriod;
    @XmlAttribute(name = "startWithSAP")
    protected Long startWithSAP;
    @XmlAttribute(name = "maxPlayoutRate")
    protected Double maxPlayoutRate;
    @XmlAttribute(name = "codingDependency")
    protected Boolean codingDependency;
    @XmlAttribute(name = "scanType")
    protected VideoScanType scanType;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the framePackings property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the framePackings property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFramePackings().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DescriptorType }
     * 
     * 
     */
    public List<DescriptorType> getFramePackings() {
        if (framePackings == null) {
            framePackings = new ArrayList<DescriptorType>();
        }
        return this.framePackings;
    }

    /**
     * Gets the value of the audioChannelConfigurations property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the audioChannelConfigurations property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAudioChannelConfigurations().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DescriptorType }
     * 
     * 
     */
    public List<DescriptorType> getAudioChannelConfigurations() {
        if (audioChannelConfigurations == null) {
            audioChannelConfigurations = new ArrayList<DescriptorType>();
        }
        return this.audioChannelConfigurations;
    }

    /**
     * Gets the value of the contentProtections property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contentProtections property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContentProtections().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DescriptorType }
     * 
     * 
     */
    public List<DescriptorType> getContentProtections() {
        if (contentProtections == null) {
            contentProtections = new ArrayList<DescriptorType>();
        }
        return this.contentProtections;
    }

    /**
     * Gets the value of the essentialProperties property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the essentialProperties property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEssentialProperties().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DescriptorType }
     * 
     * 
     */
    public List<DescriptorType> getEssentialProperties() {
        if (essentialProperties == null) {
            essentialProperties = new ArrayList<DescriptorType>();
        }
        return this.essentialProperties;
    }

    /**
     * Gets the value of the supplementalProperties property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the supplementalProperties property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSupplementalProperties().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DescriptorType }
     * 
     * 
     */
    public List<DescriptorType> getSupplementalProperties() {
        if (supplementalProperties == null) {
            supplementalProperties = new ArrayList<DescriptorType>();
        }
        return this.supplementalProperties;
    }

    /**
     * Gets the value of the inbandEventStreams property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the inbandEventStreams property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInbandEventStreams().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DescriptorType }
     * 
     * 
     */
    public List<DescriptorType> getInbandEventStreams() {
        if (inbandEventStreams == null) {
            inbandEventStreams = new ArrayList<DescriptorType>();
        }
        return this.inbandEventStreams;
    }

    /**
     * Gets the value of the anies property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the anies property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAnies().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Element }
     * 
     * 
     */
    public List<Element> getAnies() {
        if (anies == null) {
            anies = new ArrayList<Element>();
        }
        return this.anies;
    }

    /**
     * Gets the value of the profiles property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProfiles() {
        return profiles;
    }

    /**
     * Sets the value of the profiles property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProfiles(String value) {
        this.profiles = value;
    }

    /**
     * Gets the value of the width property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getWidth() {
        return width;
    }

    /**
     * Sets the value of the width property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setWidth(Long value) {
        this.width = value;
    }

    /**
     * Gets the value of the height property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getHeight() {
        return height;
    }

    /**
     * Sets the value of the height property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setHeight(Long value) {
        this.height = value;
    }

    /**
     * Gets the value of the sar property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSar() {
        return sar;
    }

    /**
     * Sets the value of the sar property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSar(String value) {
        this.sar = value;
    }

    /**
     * Gets the value of the frameRate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFrameRate() {
        return frameRate;
    }

    /**
     * Sets the value of the frameRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFrameRate(String value) {
        this.frameRate = value;
    }

    /**
     * Gets the value of the audioSamplingRate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAudioSamplingRate() {
        return audioSamplingRate;
    }

    /**
     * Sets the value of the audioSamplingRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAudioSamplingRate(String value) {
        this.audioSamplingRate = value;
    }

    /**
     * Gets the value of the mimeType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMimeType() {
        return mimeType;
    }

    /**
     * Sets the value of the mimeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMimeType(String value) {
        this.mimeType = value;
    }

    /**
     * Gets the value of the segmentProfiles property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSegmentProfiles() {
        return segmentProfiles;
    }

    /**
     * Sets the value of the segmentProfiles property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSegmentProfiles(String value) {
        this.segmentProfiles = value;
    }

    /**
     * Gets the value of the codecs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodecs() {
        return codecs;
    }

    /**
     * Sets the value of the codecs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodecs(String value) {
        this.codecs = value;
    }

    /**
     * Gets the value of the maximumSAPPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMaximumSAPPeriod() {
        return maximumSAPPeriod;
    }

    /**
     * Sets the value of the maximumSAPPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMaximumSAPPeriod(Double value) {
        this.maximumSAPPeriod = value;
    }

    /**
     * Gets the value of the startWithSAP property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getStartWithSAP() {
        return startWithSAP;
    }

    /**
     * Sets the value of the startWithSAP property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setStartWithSAP(Long value) {
        this.startWithSAP = value;
    }

    /**
     * Gets the value of the maxPlayoutRate property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMaxPlayoutRate() {
        return maxPlayoutRate;
    }

    /**
     * Sets the value of the maxPlayoutRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMaxPlayoutRate(Double value) {
        this.maxPlayoutRate = value;
    }

    /**
     * Gets the value of the codingDependency property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCodingDependency() {
        return codingDependency;
    }

    /**
     * Sets the value of the codingDependency property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCodingDependency(Boolean value) {
        this.codingDependency = value;
    }

    /**
     * Gets the value of the scanType property.
     * 
     * @return
     *     possible object is
     *     {@link VideoScanType }
     *     
     */
    public VideoScanType getScanType() {
        return scanType;
    }

    /**
     * Sets the value of the scanType property.
     * 
     * @param value
     *     allowed object is
     *     {@link VideoScanType }
     *     
     */
    public void setScanType(VideoScanType value) {
        this.scanType = value;
    }

    /**
     * Gets a map that contains attributes that aren't bound to any typed property on this class.
     * 
     * <p>
     * the map is keyed by the name of the attribute and 
     * the value is the string value of the attribute.
     * 
     * the map returned by this method is live, and you can add new attribute
     * by updating the map directly. Because of this design, there's no setter.
     * 
     * 
     * @return
     *     always non-null
     */
    public Map<QName, String> getOtherAttributes() {
        return otherAttributes;
    }

}
