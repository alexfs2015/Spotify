package com.spotify.mobile.android.spotlets.ads.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/* renamed from: com.spotify.mobile.android.spotlets.ads.model.$AutoValue_Display reason: invalid class name */
abstract class C$AutoValue_Display extends Display {
    private final String displayMedia;
    private final int getHeight;
    private final int getWidth;

    C$AutoValue_Display(int i, int i2, String str) {
        this.getWidth = i;
        this.getHeight = i2;
        this.displayMedia = str;
    }

    @JsonProperty("width")
    public int getWidth() {
        return this.getWidth;
    }

    @JsonProperty("height")
    public int getHeight() {
        return this.getHeight;
    }

    @JsonProperty("media")
    public String displayMedia() {
        return this.displayMedia;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Display{getWidth=");
        sb.append(this.getWidth);
        sb.append(", getHeight=");
        sb.append(this.getHeight);
        sb.append(", displayMedia=");
        sb.append(this.displayMedia);
        sb.append("}");
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Display) {
            Display display = (Display) obj;
            if (this.getWidth == display.getWidth() && this.getHeight == display.getHeight()) {
                String str = this.displayMedia;
                return str != null ? str.equals(display.displayMedia()) : display.displayMedia() == null;
            }
        }
    }

    public int hashCode() {
        int i = (((this.getWidth ^ 1000003) * 1000003) ^ this.getHeight) * 1000003;
        String str = this.displayMedia;
        return i ^ (str == null ? 0 : str.hashCode());
    }
}
