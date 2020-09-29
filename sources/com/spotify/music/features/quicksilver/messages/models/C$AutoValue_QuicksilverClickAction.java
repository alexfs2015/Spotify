package com.spotify.music.features.quicksilver.messages.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/* renamed from: com.spotify.music.features.quicksilver.messages.models.$AutoValue_QuicksilverClickAction reason: invalid class name */
abstract class C$AutoValue_QuicksilverClickAction extends QuicksilverClickAction {
    private final String buttonType;
    private final Boolean shouldDismiss;
    private final String trackingUrl;
    private final String url;

    /* renamed from: com.spotify.music.features.quicksilver.messages.models.$AutoValue_QuicksilverClickAction$a */
    static final class a implements com.spotify.music.features.quicksilver.messages.models.QuicksilverClickAction.a {
        Boolean a;
        private String b;
        private String c;
        private String d;

        /* synthetic */ a(QuicksilverClickAction quicksilverClickAction, byte b2) {
            this(quicksilverClickAction);
        }

        a() {
        }

        private a(QuicksilverClickAction quicksilverClickAction) {
            this.b = quicksilverClickAction.getButtonType();
            this.c = quicksilverClickAction.getUrl();
            this.d = quicksilverClickAction.getTrackingUrl();
            this.a = quicksilverClickAction.getShouldDismiss();
        }
    }

    C$AutoValue_QuicksilverClickAction(String str, String str2, String str3, Boolean bool) {
        if (str != null) {
            this.buttonType = str;
            this.url = str2;
            this.trackingUrl = str3;
            if (bool != null) {
                this.shouldDismiss = bool;
                return;
            }
            throw new NullPointerException("Null shouldDismiss");
        }
        throw new NullPointerException("Null buttonType");
    }

    @JsonProperty("action")
    public String getButtonType() {
        return this.buttonType;
    }

    @JsonProperty("url")
    public String getUrl() {
        return this.url;
    }

    @JsonProperty("tracking_url")
    public String getTrackingUrl() {
        return this.trackingUrl;
    }

    @JsonProperty("should_dismiss")
    public Boolean getShouldDismiss() {
        return this.shouldDismiss;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("QuicksilverClickAction{buttonType=");
        sb.append(this.buttonType);
        sb.append(", url=");
        sb.append(this.url);
        sb.append(", trackingUrl=");
        sb.append(this.trackingUrl);
        sb.append(", shouldDismiss=");
        sb.append(this.shouldDismiss);
        sb.append("}");
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof QuicksilverClickAction) {
            QuicksilverClickAction quicksilverClickAction = (QuicksilverClickAction) obj;
            if (this.buttonType.equals(quicksilverClickAction.getButtonType())) {
                String str = this.url;
                if (str != null ? str.equals(quicksilverClickAction.getUrl()) : quicksilverClickAction.getUrl() == null) {
                    String str2 = this.trackingUrl;
                    if (str2 != null ? str2.equals(quicksilverClickAction.getTrackingUrl()) : quicksilverClickAction.getTrackingUrl() == null) {
                        if (this.shouldDismiss.equals(quicksilverClickAction.getShouldDismiss())) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode = (this.buttonType.hashCode() ^ 1000003) * 1000003;
        String str = this.url;
        int i = 0;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.trackingUrl;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return ((hashCode2 ^ i) * 1000003) ^ this.shouldDismiss.hashCode();
    }

    public com.spotify.music.features.quicksilver.messages.models.QuicksilverClickAction.a toBuilder() {
        return new a(this, 0);
    }
}
