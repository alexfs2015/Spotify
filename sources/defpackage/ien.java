package defpackage;

import android.os.Parcelable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
/* renamed from: ien reason: default package */
public abstract class ien implements Parcelable {
    @JsonCreator
    public static ien create(@JsonProperty("stream") String str, @JsonProperty("midroll-watchnow") String str2, @JsonProperty("watchnow") String str3, @JsonProperty("preroll") String str4, @JsonProperty("mobile-screensaver") String str5) {
        iem iem = new iem(str, str2, str3, str4, str5);
        return iem;
    }

    @JsonProperty("stream")
    public abstract String a();

    @JsonProperty("midroll-watchnow")
    public abstract String b();

    @JsonProperty("watchnow")
    public abstract String c();

    @JsonProperty("preroll")
    public abstract String d();

    @JsonProperty("mobile-screensaver")
    public abstract String e();

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (a() != null) {
            sb.append("\tstream: ");
            sb.append(a());
            sb.append(10);
        }
        if (b() != null) {
            sb.append("\tmidroll-watchnow: ");
            sb.append(b());
            sb.append(10);
        }
        if (c() != null) {
            sb.append("\twatchnow: ");
            sb.append(c());
            sb.append(10);
        }
        if (d() != null) {
            sb.append("\tpreroll: ");
            sb.append(d());
            sb.append(10);
        }
        if (e() != null) {
            sb.append("\tmobile-screensaver: ");
            sb.append(e());
            sb.append(10);
        }
        return sb.toString();
    }
}
