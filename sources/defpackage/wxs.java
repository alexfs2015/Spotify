package defpackage;

/* renamed from: wxs reason: default package */
public final class wxs {
    public static <V> void a(wws<? super V> wws, V v, wyc wyc) {
        if (!wws.b(v) && wyc != null) {
            Throwable f = wws.f();
            if (f == null) {
                wyc.c("Failed to mark a promise as success because it has succeeded already: {}", (Object) wws);
                return;
            }
            wyc.c("Failed to mark a promise as success because it has failed already: {}, unnotified cause:", wws, f);
        }
    }

    public static void a(wws<?> wws, Throwable th, wyc wyc) {
        if (!wws.b(th) && wyc != null) {
            Throwable f = wws.f();
            if (f == null) {
                wyc.c("Failed to mark a promise as failure because it has succeeded already: {}", wws, th);
            } else {
                wyc.b("Failed to mark a promise as failure because it has failed already: {}, unnotified cause: {}", wws, wxv.a(f), th);
            }
        }
    }
}
