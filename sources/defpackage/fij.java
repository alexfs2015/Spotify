package defpackage;

import com.google.gson.internal.LinkedTreeMap;

/* renamed from: fij reason: default package */
public final class fij extends fih {
    public final LinkedTreeMap<String, fih> a = new LinkedTreeMap<>();

    public final void a(String str, fih fih) {
        if (fih == null) {
            fih = fii.a;
        }
        this.a.put(str, fih);
    }

    public final fih a(String str) {
        return (fih) this.a.get(str);
    }

    public final boolean equals(Object obj) {
        return obj == this || ((obj instanceof fij) && ((fij) obj).a.equals(this.a));
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
