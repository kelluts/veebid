
package ee.ttu.idu0075._2015.ws._package;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for packageMemberListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="packageMemberListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="packageMember" type="{http://www.ttu.ee/idu0075/2015/ws/package}packageMemberType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "packageMemberListType", propOrder = {
    "packageMember"
})
public class PackageMemberListType {

    protected List<PackageMemberType> packageMember;

    /**
     * Gets the value of the packageMember property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the packageMember property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPackageMember().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PackageMemberType }
     * 
     * 
     */
    public List<PackageMemberType> getPackageMember() {
        if (packageMember == null) {
            packageMember = new ArrayList<PackageMemberType>();
        }
        return this.packageMember;
    }

}
