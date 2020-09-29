package defpackage;

import com.google.common.base.Optional;
import java.util.Map;

/* renamed from: hwu reason: default package */
public final class hwu {
    public final String a;
    public final String b;
    public final Optional<String> c;
    public final Map<String, String> d;
    public final hwp e;
    public Optional<hwt> f = Optional.e();
    public Optional<hwv> g = Optional.e();
    private boolean h;

    public hwu(String str, String str2, String str3, boolean z, Map<String, String> map, hwp hwp) {
        this.a = (String) fbp.a(str);
        this.b = (String) fbp.a(str2);
        this.c = Optional.c(str3);
        this.h = z;
        this.d = map;
        this.e = (hwp) fbp.a(hwp);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hwu)) {
            return false;
        }
        hwu hwu = (hwu) obj;
        return this.c.equals(hwu.c) && this.b.equals(hwu.b) && this.a.equals(hwu.a) && this.h == hwu.h && this.d.equals(hwu.d) && this.e.equals(hwu.e);
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
