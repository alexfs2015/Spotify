package com.spotify.music.libs.album.model;

/* renamed from: com.spotify.music.libs.album.model.$AutoValue_WindowedContentMessage reason: invalid class name */
abstract class C$AutoValue_WindowedContentMessage extends WindowedContentMessage {
    private final String bodyText;
    private final String titleText;

    C$AutoValue_WindowedContentMessage(String str, String str2) {
        this.titleText = str;
        this.bodyText = str2;
    }

    public String getTitleText() {
        return this.titleText;
    }

    public String getBodyText() {
        return this.bodyText;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("WindowedContentMessage{titleText=");
        sb.append(this.titleText);
        sb.append(", bodyText=");
        sb.append(this.bodyText);
        sb.append("}");
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof WindowedContentMessage) {
            WindowedContentMessage windowedContentMessage = (WindowedContentMessage) obj;
            String str = this.titleText;
            if (str != null ? str.equals(windowedContentMessage.getTitleText()) : windowedContentMessage.getTitleText() == null) {
                String str2 = this.bodyText;
                return str2 != null ? str2.equals(windowedContentMessage.getBodyText()) : windowedContentMessage.getBodyText() == null;
            }
        }
    }

    public int hashCode() {
        String str = this.titleText;
        int i = 0;
        int hashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.bodyText;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode ^ i;
    }
}
