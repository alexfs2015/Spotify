package com.spotify.music.behindthelyrics.model.business;

import com.fasterxml.jackson.annotation.JsonProperty;

final class AutoValue_TrackAnnotation extends TrackAnnotation {
    private final TrackAnnotationAuthor author;
    private final String content;
    private final String contentType;
    private final double timestamp;

    AutoValue_TrackAnnotation(String str, String str2, double d, TrackAnnotationAuthor trackAnnotationAuthor) {
        if (str != null) {
            this.content = str;
            if (str2 != null) {
                this.contentType = str2;
                this.timestamp = d;
                this.author = trackAnnotationAuthor;
                return;
            }
            throw new NullPointerException("Null contentType");
        }
        throw new NullPointerException("Null content");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof TrackAnnotation) {
            TrackAnnotation trackAnnotation = (TrackAnnotation) obj;
            if (this.content.equals(trackAnnotation.getContent()) && this.contentType.equals(trackAnnotation.getContentType()) && Double.doubleToLongBits(this.timestamp) == Double.doubleToLongBits(trackAnnotation.getTimestamp())) {
                TrackAnnotationAuthor trackAnnotationAuthor = this.author;
                return trackAnnotationAuthor != null ? trackAnnotationAuthor.equals(trackAnnotation.getAuthor()) : trackAnnotation.getAuthor() == null;
            }
        }
    }

    @JsonProperty("author")
    public final TrackAnnotationAuthor getAuthor() {
        return this.author;
    }

    @JsonProperty("contents")
    public final String getContent() {
        return this.content;
    }

    @JsonProperty("contentType")
    public final String getContentType() {
        return this.contentType;
    }

    @JsonProperty("timestamp")
    public final double getTimestamp() {
        return this.timestamp;
    }

    public final int hashCode() {
        int hashCode = (((((this.content.hashCode() ^ 1000003) * 1000003) ^ this.contentType.hashCode()) * 1000003) ^ ((int) ((Double.doubleToLongBits(this.timestamp) >>> 32) ^ Double.doubleToLongBits(this.timestamp)))) * 1000003;
        TrackAnnotationAuthor trackAnnotationAuthor = this.author;
        return hashCode ^ (trackAnnotationAuthor == null ? 0 : trackAnnotationAuthor.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TrackAnnotation{content=");
        sb.append(this.content);
        sb.append(", contentType=");
        sb.append(this.contentType);
        sb.append(", timestamp=");
        sb.append(this.timestamp);
        sb.append(", author=");
        sb.append(this.author);
        sb.append("}");
        return sb.toString();
    }
}
