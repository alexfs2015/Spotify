package defpackage;

import java.util.HashMap;

/* renamed from: mb reason: default package */
public final class mb {
    private final HashMap<String, ly> a = new HashMap<>();

    /* access modifiers changed from: 0000 */
    public final ly a(String str) {
        return (ly) this.a.get(str);
    }

    public final void a() {
        for (ly b : this.a.values()) {
            b.b();
        }
        this.a.clear();
    }

    /* access modifiers changed from: 0000 */
    public final void a(String str, ly lyVar) {
        ly lyVar2 = (ly) this.a.put(str, lyVar);
        if (lyVar2 != null) {
            lyVar2.a();
        }
    }
}
