package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: wzz reason: default package */
public final class wzz {
    private static final AtomicReference<wzz> d = new AtomicReference<>();
    private final wug a = wzw.a();
    private final wug b = wzw.b();
    private final wug c = wzw.c();

    private wzz() {
        wzv.a().f();
    }

    public static wug a() {
        return wxk.a;
    }

    private synchronized void c() {
        if (this.a instanceof wxi) {
            ((wxi) this.a).b();
        }
        if (this.b instanceof wxi) {
            ((wxi) this.b).b();
        }
        if (this.c instanceof wxi) {
            ((wxi) this.c).b();
        }
    }

    public static wug b() {
        wzz wzz;
        while (true) {
            wzz = (wzz) d.get();
            if (wzz != null) {
                break;
            }
            wzz = new wzz();
            if (d.compareAndSet(null, wzz)) {
                break;
            }
            wzz.c();
        }
        return wzs.a(wzz.a);
    }
}
