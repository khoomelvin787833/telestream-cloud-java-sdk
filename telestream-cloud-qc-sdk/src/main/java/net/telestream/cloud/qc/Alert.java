/*
 * Qc API
 * QC API
 *
 * OpenAPI spec version: 1.0.0
 * Contact: cloudsupport@telestream.net
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package net.telestream.cloud.qc;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Alert
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-01-05T16:30:43.778+01:00")
public class Alert {
  @SerializedName("level")
  private String level = null;

  @SerializedName("info")
  private String info = null;

  @SerializedName("begin")
  private String begin = null;

  @SerializedName("end")
  private String end = null;

  @SerializedName("stream")
  private Integer stream = null;

  @SerializedName("detail")
  private String detail = null;

  public Alert level(String level) {
    this.level = level;
    return this;
  }

   /**
   * Get level
   * @return level
  **/
  @ApiModelProperty(value = "")
  public String getLevel() {
    return level;
  }

  public void setLevel(String level) {
    this.level = level;
  }

  public Alert info(String info) {
    this.info = info;
    return this;
  }

   /**
   * Extra information for an alert.
   * @return info
  **/
  @ApiModelProperty(value = "Extra information for an alert.")
  public String getInfo() {
    return info;
  }

  public void setInfo(String info) {
    this.info = info;
  }

  public Alert begin(String begin) {
    this.begin = begin;
    return this;
  }

   /**
   * Start time of alert.
   * @return begin
  **/
  @ApiModelProperty(value = "Start time of alert.")
  public String getBegin() {
    return begin;
  }

  public void setBegin(String begin) {
    this.begin = begin;
  }

  public Alert end(String end) {
    this.end = end;
    return this;
  }

   /**
   * End time of alert.
   * @return end
  **/
  @ApiModelProperty(value = "End time of alert.")
  public String getEnd() {
    return end;
  }

  public void setEnd(String end) {
    this.end = end;
  }

  public Alert stream(Integer stream) {
    this.stream = stream;
    return this;
  }

   /**
   * Get stream
   * @return stream
  **/
  @ApiModelProperty(value = "")
  public Integer getStream() {
    return stream;
  }

  public void setStream(Integer stream) {
    this.stream = stream;
  }

  public Alert detail(String detail) {
    this.detail = detail;
    return this;
  }

   /**
   * Get detail
   * @return detail
  **/
  @ApiModelProperty(value = "")
  public String getDetail() {
    return detail;
  }

  public void setDetail(String detail) {
    this.detail = detail;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Alert alert = (Alert) o;
    return Objects.equals(this.level, alert.level) &&
        Objects.equals(this.info, alert.info) &&
        Objects.equals(this.begin, alert.begin) &&
        Objects.equals(this.end, alert.end) &&
        Objects.equals(this.stream, alert.stream) &&
        Objects.equals(this.detail, alert.detail);
  }

  @Override
  public int hashCode() {
    return Objects.hash(level, info, begin, end, stream, detail);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Alert {\n");
    
    sb.append("    level: ").append(toIndentedString(level)).append("\n");
    sb.append("    info: ").append(toIndentedString(info)).append("\n");
    sb.append("    begin: ").append(toIndentedString(begin)).append("\n");
    sb.append("    end: ").append(toIndentedString(end)).append("\n");
    sb.append("    stream: ").append(toIndentedString(stream)).append("\n");
    sb.append("    detail: ").append(toIndentedString(detail)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
  
}

