package defpackage;

import java.util.HashMap;

/* renamed from: lw reason: default package */
public final class lw {
    private final HashMap<String, lt> a = new HashMap<>();

    /* access modifiers changed from: 0000 */
    public final void a(String str, lt ltVar) {
        lt ltVar2 = (lt) this.a.put(str, ltVar);
        if (ltVar2 != null) {
            ltVar2.a();
        }
    }

    /* access modifiers changed from: 0000 */
    public final lt a(String str) {
        return (lt) this.a.get(str);
    }

    public final void a() {
        for (lt b : this.a.values()) {
            b.b();
        }
        this.a.clear();
    }
}
