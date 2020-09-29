package defpackage;

import java.io.Serializable;

/* renamed from: niq reason: default package */
public final class niq implements xja<hcs, String, Serializable, hcs> {
    public static hcs a(hcs hcs, String str, Serializable serializable) {
        return (fbo.a(str) || serializable == null) ? hcs : hcs.toBuilder().a(str, serializable).a();
    }

    public final /* synthetic */ Object call(Object obj, Object obj2, Object obj3) {
        return a((hcs) obj, (String) obj2, (Serializable) obj3);
    }
}
