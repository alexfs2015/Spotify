package defpackage;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.music.features.homemix.models.HomeMixTuning;
import java.util.List;

/* renamed from: nsp reason: default package */
public final class nsp extends HomeMixTuning {
    private final String a;
    private final List<String> b;

    /* renamed from: nsp$a */
    public static final class a implements com.spotify.music.features.homemix.models.HomeMixTuning.a {
        public String a;
        private List<String> b;

        public final com.spotify.music.features.homemix.models.HomeMixTuning.a a(List<String> list) {
            if (list != null) {
                this.b = list;
                return this;
            }
            throw new NullPointerException("Null blacklist");
        }

        public final HomeMixTuning a() {
            String str = "";
            if (this.a == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" style");
                str = sb.toString();
            }
            if (this.b == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" blacklist");
                str = sb2.toString();
            }
            if (str.isEmpty()) {
                return new nsp(this.a, this.b, 0);
            }
            StringBuilder sb3 = new StringBuilder("Missing required properties:");
            sb3.append(str);
            throw new IllegalStateException(sb3.toString());
        }
    }

    private nsp(String str, List<String> list) {
        this.a = str;
        this.b = list;
    }

    /* synthetic */ nsp(String str, List list, byte b2) {
        this(str, list);
    }

    @JsonProperty("style")
    public final String a() {
        return this.a;
    }

    @JsonProperty("member_blacklist")
    public final List<String> b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof HomeMixTuning) {
            HomeMixTuning homeMixTuning = (HomeMixTuning) obj;
            return this.a.equals(homeMixTuning.a()) && this.b.equals(homeMixTuning.b());
        }
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HomeMixTuning{style=");
        sb.append(this.a);
        sb.append(", blacklist=");
        sb.append(this.b);
        sb.append("}");
        return sb.toString();
    }
}
