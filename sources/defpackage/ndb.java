package defpackage;

import java.io.Serializable;

/* renamed from: ndb reason: default package */
public final class ndb implements wuv<gzz, String, Serializable, gzz> {
    public final /* synthetic */ Object call(Object obj, Object obj2, Object obj3) {
        return a((gzz) obj, (String) obj2, (Serializable) obj3);
    }

    public static gzz a(gzz gzz, String str, Serializable serializable) {
        return (fax.a(str) || serializable == null) ? gzz : gzz.toBuilder().a(str, serializable).a();
    }
}
