package defpackage;

import java.util.Map;

/* renamed from: wj reason: default package */
public final class wj {
    Map<String, String> a;
    Map<String, String> b;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        wj wjVar = (wj) obj;
        return wm.a((Object) this.a, (Object) wjVar.a) && wm.a((Object) this.b, (Object) wjVar.b);
    }

    public final int hashCode() {
        return ((wm.a((Object) this.a) + 629) * 37) + wm.a((Object) this.b);
    }
}
