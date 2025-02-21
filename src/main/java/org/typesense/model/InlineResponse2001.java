package org.typesense.model;


import io.swagger.v3.oas.annotations.media.Schema;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonCreator;

public class InlineResponse2001   {
  
  @Schema(example = "1", required = true, description = "The number of documents that have been updated")
 /**
   * The number of documents that have been updated  
  **/
  private Integer numUpdated = null;
 /**
   * The number of documents that have been updated
   * @return numUpdated
  **/
  @JsonProperty("num_updated")
  public Integer getNumUpdated() {
    return numUpdated;
  }

  public void setNumUpdated(Integer numUpdated) {
    this.numUpdated = numUpdated;
  }

  public InlineResponse2001 numUpdated(Integer numUpdated) {
    this.numUpdated = numUpdated;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2001 {\n");
    
    sb.append("    numUpdated: ").append(toIndentedString(numUpdated)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
