/*
 * Tts API
 * Description
 *
 * OpenAPI spec version: 2.0.0
 * Contact: cloudsupport@telestream.net
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package net.telestream.cloud.tts;

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
 * JobOutput
 */

public class JobOutput {
  @SerializedName("format")
  private String format = null;

  @SerializedName("url")
  private String url = null;

  public JobOutput format(String format) {
    this.format = format;
    return this;
  }

   /**
   * Output file format
   * @return format
  **/
  @ApiModelProperty(example = "json", value = "Output file format")
  public String getFormat() {
    return format;
  }

  public void setFormat(String format) {
    this.format = format;
  }

  public JobOutput url(String url) {
    this.url = url;
    return this;
  }

   /**
   * URL to output (must be accessed with X-Api-Key)
   * @return url
  **/
  @ApiModelProperty(value = "URL to output (must be accessed with X-Api-Key)")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JobOutput jobOutput = (JobOutput) o;
    return Objects.equals(this.format, jobOutput.format) &&
        Objects.equals(this.url, jobOutput.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(format, url);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JobOutput {\n");
    
    sb.append("    format: ").append(toIndentedString(format)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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

