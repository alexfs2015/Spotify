package defpackage;

/* renamed from: wjm reason: default package */
public final class wjm {
    public static <V> void a(wim<? super V> wim, V v, wjw wjw) {
        if (!wim.b(v) && wjw != null) {
            Throwable f = wim.f();
            if (f == null) {
                wjw.c("Failed to mark a promise as success because it has succeeded already: {}", (Object) wim);
                return;
            }
            wjw.c("Failed to mark a promise as success because it has failed already: {}, unnotified cause:", wim, f);
        }
    }

    public static void a(wim<?> wim, Throwable th, wjw wjw) {
        if (!wim.b(th) && wjw != null) {
            Throwable f = wim.f();
            if (f == null) {
                wjw.c("Failed to mark a promise as failure because it has succeeded already: {}", wim, th);
            } else {
                wjw.b("Failed to mark a promise as failure because it has failed already: {}, unnotified cause: {}", wim, wjp.a(f), th);
            }
        }
    }
}
