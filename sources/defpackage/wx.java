package defpackage;

import java.util.Map;

/* renamed from: wx reason: default package */
public final class wx {
    Map<String, String> a;
    Map<String, String> b;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        wx wxVar = (wx) obj;
        return xa.a((Object) this.a, (Object) wxVar.a) && xa.a((Object) this.b, (Object) wxVar.b);
    }

    public final int hashCode() {
        return ((xa.a((Object) this.a) + 629) * 37) + xa.a((Object) this.b);
    }
}
