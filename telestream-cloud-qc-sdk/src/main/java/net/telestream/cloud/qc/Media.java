/*
 * Qc API
 * QC API
 *
 * OpenAPI spec version: 2.0.1
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
import java.util.ArrayList;
import java.util.List;
import net.telestream.cloud.qc.AudioStream;
import net.telestream.cloud.qc.Container;
import net.telestream.cloud.qc.VideoStream;

/**
 * Description of the processed media file.
 */
@ApiModel(description = "Description of the processed media file.")

public class Media {
  @SerializedName("audio")
  private List<AudioStream> audio = null;

  @SerializedName("video")
  private List<VideoStream> video = null;

  @SerializedName("container")
  private Container container = null;

  public Media audio(List<AudioStream> audio) {
    this.audio = audio;
    return this;
  }

  public Media addAudioItem(AudioStream audioItem) {
    if (this.audio == null) {
      this.audio = new ArrayList<AudioStream>();
    }
    this.audio.add(audioItem);
    return this;
  }

   /**
   * Get audio
   * @return audio
  **/
  @ApiModelProperty(value = "")
  public List<AudioStream> getAudio() {
    return audio;
  }

  public void setAudio(List<AudioStream> audio) {
    this.audio = audio;
  }

  public Media video(List<VideoStream> video) {
    this.video = video;
    return this;
  }

  public Media addVideoItem(VideoStream videoItem) {
    if (this.video == null) {
      this.video = new ArrayList<VideoStream>();
    }
    this.video.add(videoItem);
    return this;
  }

   /**
   * Get video
   * @return video
  **/
  @ApiModelProperty(value = "")
  public List<VideoStream> getVideo() {
    return video;
  }

  public void setVideo(List<VideoStream> video) {
    this.video = video;
  }

  public Media container(Container container) {
    this.container = container;
    return this;
  }

   /**
   * Get container
   * @return container
  **/
  @ApiModelProperty(value = "")
  public Container getContainer() {
    return container;
  }

  public void setContainer(Container container) {
    this.container = container;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Media media = (Media) o;
    return Objects.equals(this.audio, media.audio) &&
        Objects.equals(this.video, media.video) &&
        Objects.equals(this.container, media.container);
  }

  @Override
  public int hashCode() {
    return Objects.hash(audio, video, container);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Media {\n");
    
    sb.append("    audio: ").append(toIndentedString(audio)).append("\n");
    sb.append("    video: ").append(toIndentedString(video)).append("\n");
    sb.append("    container: ").append(toIndentedString(container)).append("\n");
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

