package com.spotify.music.features.quicksilver.messages.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/* renamed from: com.spotify.music.features.quicksilver.messages.models.$AutoValue_NoteMessage reason: invalid class name */
abstract class C$AutoValue_NoteMessage extends NoteMessage {
    private final Map<String, QuicksilverClickAction> clickActions;
    private final String htmlContent;
    private final String id;
    private final String impressionUrl;
    private final String uuid;

    /* renamed from: com.spotify.music.features.quicksilver.messages.models.$AutoValue_NoteMessage$a */
    static final class a extends com.spotify.music.features.quicksilver.messages.models.NoteMessage.a {
        private String a;
        private Map<String, QuicksilverClickAction> b;
        private String c;
        private String d;
        private String e;

        a() {
        }

        private a(NoteMessage noteMessage) {
            this.a = noteMessage.getHtmlContent();
            this.b = noteMessage.getClickActions();
            this.c = noteMessage.getImpressionUrl();
            this.d = noteMessage.getId();
            this.e = noteMessage.getUuid();
        }

        /* synthetic */ a(NoteMessage noteMessage, byte b2) {
            this(noteMessage);
        }
    }

    C$AutoValue_NoteMessage(String str, Map<String, QuicksilverClickAction> map, String str2, String str3, String str4) {
        if (str != null) {
            this.htmlContent = str;
            this.clickActions = map;
            this.impressionUrl = str2;
            this.id = str3;
            this.uuid = str4;
            return;
        }
        throw new NullPointerException("Null htmlContent");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof NoteMessage) {
            NoteMessage noteMessage = (NoteMessage) obj;
            if (this.htmlContent.equals(noteMessage.getHtmlContent())) {
                Map<String, QuicksilverClickAction> map = this.clickActions;
                if (map != null ? map.equals(noteMessage.getClickActions()) : noteMessage.getClickActions() == null) {
                    String str = this.impressionUrl;
                    if (str != null ? str.equals(noteMessage.getImpressionUrl()) : noteMessage.getImpressionUrl() == null) {
                        String str2 = this.id;
                        if (str2 != null ? str2.equals(noteMessage.getId()) : noteMessage.getId() == null) {
                            String str3 = this.uuid;
                            return str3 != null ? str3.equals(noteMessage.getUuid()) : noteMessage.getUuid() == null;
                        }
                    }
                }
            }
        }
    }

    @JsonProperty("click_actions")
    public Map<String, QuicksilverClickAction> getClickActions() {
        return this.clickActions;
    }

    @JsonProperty("html_content")
    public String getHtmlContent() {
        return this.htmlContent;
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
        int hashCode = (this.htmlContent.hashCode() ^ 1000003) * 1000003;
        Map<String, QuicksilverClickAction> map = this.clickActions;
        int i = 0;
        int hashCode2 = (hashCode ^ (map == null ? 0 : map.hashCode())) * 1000003;
        String str = this.impressionUrl;
        int hashCode3 = (hashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.id;
        int hashCode4 = (hashCode3 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.uuid;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode4 ^ i;
    }

    public com.spotify.music.features.quicksilver.messages.models.NoteMessage.a toBuilder() {
        return new a(this, 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("NoteMessage{htmlContent=");
        sb.append(this.htmlContent);
        sb.append(", clickActions=");
        sb.append(this.clickActions);
        sb.append(", impressionUrl=");
        sb.append(this.impressionUrl);
        sb.append(", id=");
        sb.append(this.id);
        sb.append(", uuid=");
        sb.append(this.uuid);
        sb.append("}");
        return sb.toString();
    }
}
