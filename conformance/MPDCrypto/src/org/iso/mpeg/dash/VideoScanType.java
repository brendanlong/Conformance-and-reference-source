//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-792 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.08.23 at 08:13:31 AM MESZ 
//


package org.iso.mpeg.dash;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VideoScanType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="VideoScanType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="progressive"/>
 *     &lt;enumeration value="interlaced"/>
 *     &lt;enumeration value="unknown"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "VideoScanType")
@XmlEnum
public enum VideoScanType {

    @XmlEnumValue("progressive")
    PROGRESSIVE("progressive"),
    @XmlEnumValue("interlaced")
    INTERLACED("interlaced"),
    @XmlEnumValue("unknown")
    UNKNOWN("unknown");
    private final String value;

    VideoScanType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VideoScanType fromValue(String v) {
        for (VideoScanType c: VideoScanType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
