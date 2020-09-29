package com.spotify.music.features.quicksilver.messages.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/* renamed from: com.spotify.music.features.quicksilver.messages.models.$AutoValue_QuicksilverCardMessage reason: invalid class name */
abstract class C$AutoValue_QuicksilverCardMessage extends QuicksilverCardMessage {
    private final Map<String, QuicksilverClickAction> clickActions;
    private final String closeTitle;
    private final boolean fullscreen;
    private final String heading;
    private final String htmlContent;
    private final String icon;
    private final String id;
    private final String impressionUrl;
    private final String uuid;

    /* renamed from: com.spotify.music.features.quicksilver.messages.models.$AutoValue_QuicksilverCardMessage$a */
    static final class a implements com.spotify.music.features.quicksilver.messages.models.QuicksilverCardMessage.a {
        private String a;
        private String b;
        private Map<String, QuicksilverClickAction> c;
        private String d;
        private String e;
        private String f;
        private String g;
        private String h;
        private Boolean i;

        a() {
        }

        private a(QuicksilverCardMessage quicksilverCardMessage) {
            this.a = quicksilverCardMessage.getHeading();
            this.b = quicksilverCardMessage.getHtmlContent();
            this.c = quicksilverCardMessage.getClickActions();
            this.d = quicksilverCardMessage.getIcon();
            this.e = quicksilverCardMessage.getImpressionUrl();
            this.f = quicksilverCardMessage.getCloseTitle();
            this.g = quicksilverCardMessage.getId();
            this.h = quicksilverCardMessage.getUuid();
            this.i = Boolean.valueOf(quicksilverCardMessage.isFullscreen());
        }

        /* synthetic */ a(QuicksilverCardMessage quicksilverCardMessage, byte b2) {
            this(quicksilverCardMessage);
        }
    }

    C$AutoValue_QuicksilverCardMessage(String str, String str2, Map<String, QuicksilverClickAction> map, String str3, String str4, String str5, String str6, String str7, boolean z) {
        this.heading = str;
        if (str2 != null) {
            this.htmlContent = str2;
            this.clickActions = map;
            this.icon = str3;
            this.impressionUrl = str4;
            this.closeTitle = str5;
            this.id = str6;
            this.uuid = str7;
            this.fullscreen = z;
            return;
        }
        throw new NullPointerException("Null htmlContent");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof QuicksilverCardMessage) {
            QuicksilverCardMessage quicksilverCardMessage = (QuicksilverCardMessage) obj;
            String str = this.heading;
            if (str != null ? str.equals(quicksilverCardMessage.getHeading()) : quicksilverCardMessage.getHeading() == null) {
                if (this.htmlContent.equals(quicksilverCardMessage.getHtmlContent())) {
                    Map<String, QuicksilverClickAction> map = this.clickActions;
                    if (map != null ? map.equals(quicksilverCardMessage.getClickActions()) : quicksilverCardMessage.getClickActions() == null) {
                        String str2 = this.icon;
                        if (str2 != null ? str2.equals(quicksilverCardMessage.getIcon()) : quicksilverCardMessage.getIcon() == null) {
                            String str3 = this.impressionUrl;
                            if (str3 != null ? str3.equals(quicksilverCardMessage.getImpressionUrl()) : quicksilverCardMessage.getImpressionUrl() == null) {
                                String str4 = this.closeTitle;
                                if (str4 != null ? str4.equals(quicksilverCardMessage.getCloseTitle()) : quicksilverCardMessage.getCloseTitle() == null) {
                                    String str5 = this.id;
                                    if (str5 != null ? str5.equals(quicksilverCardMessage.getId()) : quicksilverCardMessage.getId() == null) {
                                        String str6 = this.uuid;
                                        if (str6 != null ? str6.equals(quicksilverCardMessage.getUuid()) : quicksilverCardMessage.getUuid() == null) {
                                            if (this.fullscreen == quicksilverCardMessage.isFullscreen()) {
                                                return true;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    @JsonProperty("click_actions")
    public Map<String, QuicksilverClickAction> getClickActions() {
        return this.clickActions;
    }

    @JsonProperty("close_title")
    public String getCloseTitle() {
        return this.closeTitle;
    }

    @JsonProperty("heading")
    public String getHeading() {
        return this.heading;
    }

    @JsonProperty("html_content")
    public String getHtmlContent() {
        return this.htmlContent;
    }

    @JsonProperty("icon")
    public String getIcon() {
        return this.icon;
    }

    @JsonProperty("id")
    public String getId() {
        return this.id;
    }

    @JsonProperty("impression_url")
    public String getImpressionUrl() {
        return this.impressionUrl;
    }

    @JsonProperty("uuid")
    public String getUuid() {
        return this.uuid;
    }

    public int hashCode() {
        String str = this.heading;
        int i = 0;
        int hashCode = ((((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ this.htmlContent.hashCode()) * 1000003;
        Map<String, QuicksilverClickAction> map = this.clickActions;
        int hashCode2 = (hashCode ^ (map == null ? 0 : map.hashCode())) * 1000003;
        String str2 = this.icon;
        int hashCode3 = (hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.impressionUrl;
        int hashCode4 = (hashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.closeTitle;
        int hashCode5 = (hashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
        String str5 = this.id;
        int hashCode6 = (hashCode5 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
        String str6 = this.uuid;
        if (str6 != null) {
            i = str6.hashCode();
        }
        return ((hashCode6 ^ i) * 1000003) ^ (this.fullscreen ? 1231 : 1237);
    }

    @JsonProperty("fullscreen")
    public boolean isFullscreen() {
        return this.fullscreen;
    }

    public com.spotify.music.features.quicksilver.messages.models.QuicksilverCardMessage.a toBuilder() {
        return new a(this, 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("QuicksilverCardMessage{heading=");
        sb.append(this.heading);
        sb.append(", htmlContent=");
        sb.append(this.htmlContent);
        sb.append(", clickActions=");
        sb.append(this.clickActions);
        sb.append(", icon=");
        sb.append(this.icon);
        sb.append(", impressionUrl=");
        sb.append(this.impressionUrl);
        sb.append(", closeTitle=");
        sb.append(this.closeTitle);
        sb.append(", id=");
        sb.append(this.id);
        sb.append(", uuid=");
        sb.append(this.uuid);
        sb.append(", fullscreen=");
        sb.append(this.fullscreen);
        sb.append("}");
        return sb.toString();
    }
}
