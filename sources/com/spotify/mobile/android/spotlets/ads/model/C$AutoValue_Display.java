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

    @JsonProperty("media")
    public String displayMedia() {
        return this.displayMedia;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Display) {
            Display display = (Display) obj;
            if (this.getWidth == display.getWidth() && this.getHeight == display.getHeight()) {
                String str = this.displayMedia;
                if (str != null ? str.equals(display.displayMedia()) : display.displayMedia() == null) {
                    return true;
                }
            }
        }
        return false;
    }

    @JsonProperty("height")
    public int getHeight() {
        return this.getHeight;
    }

    @JsonProperty("width")
    public int getWidth() {
        return this.getWidth;
    }

    public int hashCode() {
        int i = (((this.getWidth ^ 1000003) * 1000003) ^ this.getHeight) * 1000003;
        String str = this.displayMedia;
        return i ^ (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        String str = "tgsDdhlyaiWps=e{t";
        StringBuilder sb = new StringBuilder("Display{getWidth=");
        sb.append(this.getWidth);
        String str2 = "gi=me,tegt H";
        sb.append(", getHeight=");
        sb.append(this.getHeight);
        String str3 = "dlipoiysa= ea,M";
        sb.append(", displayMedia=");
        sb.append(this.displayMedia);
        String str4 = "}";
        sb.append("}");
        return sb.toString();
    }
}
