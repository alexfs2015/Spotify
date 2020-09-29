package com.spotify.music.features.placebobanner.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

final class AutoValue_PlaceboBannerView extends PlaceboBannerView {
    private final List<PlaceboBannerControl> controls;
    private final String description;
    private final String title;
    private final String type;

    static final class a extends com.spotify.music.features.placebobanner.models.PlaceboBannerView.a {
        private String a;
        private String b;
        private String c;
        private List<PlaceboBannerControl> d;

        /* synthetic */ a(PlaceboBannerView placeboBannerView, byte b2) {
            this(placeboBannerView);
        }

        a() {
        }

        private a(PlaceboBannerView placeboBannerView) {
            this.a = placeboBannerView.type();
            this.b = placeboBannerView.title();
            this.c = placeboBannerView.description();
            this.d = placeboBannerView.controls();
        }

        public final com.spotify.music.features.placebobanner.models.PlaceboBannerView.a a(String str) {
            if (str != null) {
                this.a = str;
                return this;
            }
            throw new NullPointerException("Null type");
        }

        public final com.spotify.music.features.placebobanner.models.PlaceboBannerView.a b(String str) {
            this.b = str;
            return this;
        }

        public final com.spotify.music.features.placebobanner.models.PlaceboBannerView.a c(String str) {
            this.c = str;
            return this;
        }

        public final com.spotify.music.features.placebobanner.models.PlaceboBannerView.a a(List<PlaceboBannerControl> list) {
            this.d = list;
            return this;
        }

        public final PlaceboBannerView a() {
            String str = "";
            if (this.a == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" type");
                str = sb.toString();
            }
            if (str.isEmpty()) {
                AutoValue_PlaceboBannerView autoValue_PlaceboBannerView = new AutoValue_PlaceboBannerView(this.a, this.b, this.c, this.d);
                return autoValue_PlaceboBannerView;
            }
            StringBuilder sb2 = new StringBuilder("Missing required properties:");
            sb2.append(str);
            throw new IllegalStateException(sb2.toString());
        }
    }

    private AutoValue_PlaceboBannerView(String str, String str2, String str3, List<PlaceboBannerControl> list) {
        this.type = str;
        this.title = str2;
        this.description = str3;
        this.controls = list;
    }

    @JsonProperty("type")
    public final String type() {
        return this.type;
    }

    @JsonProperty("title")
    public final String title() {
        return this.title;
    }

    @JsonProperty("description")
    public final String description() {
        return this.description;
    }

    @JsonProperty("controls")
    public final List<PlaceboBannerControl> controls() {
        return this.controls;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlaceboBannerView{type=");
        sb.append(this.type);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", description=");
        sb.append(this.description);
        sb.append(", controls=");
        sb.append(this.controls);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof PlaceboBannerView) {
            PlaceboBannerView placeboBannerView = (PlaceboBannerView) obj;
            if (this.type.equals(placeboBannerView.type())) {
                String str = this.title;
                if (str != null ? str.equals(placeboBannerView.title()) : placeboBannerView.title() == null) {
                    String str2 = this.description;
                    if (str2 != null ? str2.equals(placeboBannerView.description()) : placeboBannerView.description() == null) {
                        List<PlaceboBannerControl> list = this.controls;
                        return list != null ? list.equals(placeboBannerView.controls()) : placeboBannerView.controls() == null;
                    }
                }
            }
        }
    }

    public final int hashCode() {
        int hashCode = (this.type.hashCode() ^ 1000003) * 1000003;
        String str = this.title;
        int i = 0;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.description;
        int hashCode3 = (hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        List<PlaceboBannerControl> list = this.controls;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode3 ^ i;
    }

    public final com.spotify.music.features.placebobanner.models.PlaceboBannerView.a toBuilder() {
        return new a(this, 0);
    }
}
