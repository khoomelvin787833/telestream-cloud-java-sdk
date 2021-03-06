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
 * ExtraFile
 */

public class ExtraFile {
  @SerializedName("tag")
  private String tag = null;

  @SerializedName("file_size")
  private Long fileSize = null;

  @SerializedName("file_name")
  private String fileName = null;

  public ExtraFile tag(String tag) {
    this.tag = tag;
    return this;
  }

   /**
   * Get tag
   * @return tag
  **/
  @ApiModelProperty(required = true, value = "")
  public String getTag() {
    return tag;
  }

  public void setTag(String tag) {
    this.tag = tag;
  }

  public ExtraFile fileSize(Long fileSize) {
    this.fileSize = fileSize;
    return this;
  }

   /**
   * Get fileSize
   * @return fileSize
  **/
  @ApiModelProperty(required = true, value = "")
  public Long getFileSize() {
    return fileSize;
  }

  public void setFileSize(Long fileSize) {
    this.fileSize = fileSize;
  }

  public ExtraFile fileName(String fileName) {
    this.fileName = fileName;
    return this;
  }

   /**
   * Get fileName
   * @return fileName
  **/
  @ApiModelProperty(required = true, value = "")
  public String getFileName() {
    return fileName;
  }

  public void setFileName(String fileName) {
    this.fileName = fileName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExtraFile extraFile = (ExtraFile) o;
    return Objects.equals(this.tag, extraFile.tag) &&
        Objects.equals(this.fileSize, extraFile.fileSize) &&
        Objects.equals(this.fileName, extraFile.fileName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tag, fileSize, fileName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExtraFile {\n");
    
    sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
    sb.append("    fileSize: ").append(toIndentedString(fileSize)).append("\n");
    sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
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

