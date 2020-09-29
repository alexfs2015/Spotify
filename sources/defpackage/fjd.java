package defpackage;

import com.google.gson.internal.LinkedTreeMap;

/* renamed from: fjd reason: default package */
public final class fjd extends fjb {
    public final LinkedTreeMap<String, fjb> a = new LinkedTreeMap<>();

    public final fjb a(String str) {
        return (fjb) this.a.get(str);
    }

    public final void a(String str, fjb fjb) {
        if (fjb == null) {
            fjb = fjc.a;
        }
        this.a.put(str, fjb);
    }

    public final boolean equals(Object obj) {
        return obj == this || ((obj instanceof fjd) && ((fjd) obj).a.equals(this.a));
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
