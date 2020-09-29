package com.spotify.mobile.android.spotlets.ads.marquee.trigger;

final class AutoValue_MarqueeTriggerModel extends MarqueeTriggerModel {
    private static final long serialVersionUID = 1471;
    private final String pageUri;
    private final boolean quickSilverDisplayed;

    static final class a implements com.spotify.mobile.android.spotlets.ads.marquee.trigger.MarqueeTriggerModel.a {
        private String a;
        private Boolean b;

        a() {
        }

        private a(MarqueeTriggerModel marqueeTriggerModel) {
            this.a = marqueeTriggerModel.a();
            this.b = Boolean.valueOf(marqueeTriggerModel.b());
        }

        /* synthetic */ a(MarqueeTriggerModel marqueeTriggerModel, byte b2) {
            this(marqueeTriggerModel);
        }

        public final com.spotify.mobile.android.spotlets.ads.marquee.trigger.MarqueeTriggerModel.a a(String str) {
            if (str != null) {
                this.a = str;
                return this;
            }
            String str2 = "uasiUelgNlpr";
            throw new NullPointerException("Null pageUri");
        }

        public final com.spotify.mobile.android.spotlets.ads.marquee.trigger.MarqueeTriggerModel.a a(boolean z) {
            this.b = Boolean.valueOf(z);
            return this;
        }

        public final MarqueeTriggerModel a() {
            String str = "";
            if (this.a == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                String str2 = "rUimpg a";
                sb.append(" pageUri");
                str = sb.toString();
            }
            if (this.b == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                String str3 = " pkioyaiDuieSqslvrldc";
                sb2.append(" quickSilverDisplayed");
                str = sb2.toString();
            }
            if (str.isEmpty()) {
                return new AutoValue_MarqueeTriggerModel(this.a, this.b.booleanValue(), 0);
            }
            StringBuilder sb3 = new StringBuilder("Missing required properties:");
            sb3.append(str);
            throw new IllegalStateException(sb3.toString());
        }
    }

    private AutoValue_MarqueeTriggerModel(String str, boolean z) {
        this.pageUri = str;
        this.quickSilverDisplayed = z;
    }

    /* synthetic */ AutoValue_MarqueeTriggerModel(String str, boolean z, byte b) {
        this(str, z);
    }

    public final String a() {
        return this.pageUri;
    }

    public final boolean b() {
        return this.quickSilverDisplayed;
    }

    public final com.spotify.mobile.android.spotlets.ads.marquee.trigger.MarqueeTriggerModel.a c() {
        return new a(this, 0);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof MarqueeTriggerModel) {
            MarqueeTriggerModel marqueeTriggerModel = (MarqueeTriggerModel) obj;
            if (this.pageUri.equals(marqueeTriggerModel.a()) && this.quickSilverDisplayed == marqueeTriggerModel.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.pageUri.hashCode() ^ 1000003) * 1000003) ^ (this.quickSilverDisplayed ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MarqueeTriggerModel{pageUri=");
        sb.append(this.pageUri);
        String str = "essruSi,yklpicdeDlaq iv";
        sb.append(", quickSilverDisplayed=");
        sb.append(this.quickSilverDisplayed);
        String str2 = "}";
        sb.append("}");
        return sb.toString();
    }
}
