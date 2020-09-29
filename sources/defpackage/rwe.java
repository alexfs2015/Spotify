package defpackage;

import java.util.Iterator;

/* renamed from: rwe reason: default package */
public final class rwe extends ruk {
    private final jwu a;

    rwe(jwu jwu) {
        this.a = jwu;
    }

    public final void a(final aio aio, boolean z) {
        if (!z) {
            jwu jwu = this.a;
            AnonymousClass1 r0 = new gcp<String>() {
                public final /* synthetic */ void accept(Object obj) {
                    aio.a((String) obj);
                }
            };
            synchronized (jwu.b) {
                Iterator it = jwu.a.iterator();
                while (it.hasNext()) {
                    r0.accept(((jwx) it.next()).toString());
                }
            }
        }
    }
}
