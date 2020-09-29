package defpackage;

import com.google.common.base.Optional;
import java.util.Map;

/* renamed from: hui reason: default package */
public final class hui {
    public final String a;
    public final String b;
    public final Optional<String> c;
    public final Map<String, String> d;
    public final hud e;
    public Optional<huh> f = Optional.e();
    public Optional<huj> g = Optional.e();
    private boolean h;

    public hui(String str, String str2, String str3, boolean z, Map<String, String> map, hud hud) {
        this.a = (String) fay.a(str);
        this.b = (String) fay.a(str2);
        this.c = Optional.c(str3);
        this.h = z;
        this.d = map;
        this.e = (hud) fay.a(hud);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hui)) {
            return false;
        }
        hui hui = (hui) obj;
        return this.c.equals(hui.c) && this.b.equals(hui.b) && this.a.equals(hui.a) && this.h == hui.h && this.d.equals(hui.d) && this.e.equals(hui.e);
    }

    public final int hashCode() {
        return (((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + (this.h ? 1 : 0)) * 31) + this.d.hashCode()) * 31) + this.e.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TrackInfo{name='");
        sb.append(this.b);
        sb.append('\'');
        sb.append(", artist=");
        sb.append(this.c);
        sb.append(", forceIsInCollection=");
        sb.append(this.h);
        sb.append(", trackMetadata=");
        sb.append(this.d);
        sb.append(", collectionState=");
        sb.append(this.e);
        sb.append('}');
        return sb.toString();
    }
}
