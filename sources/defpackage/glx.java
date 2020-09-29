package defpackage;

import io.reactivex.Single;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: glx reason: default package */
public interface glx {

    /* renamed from: glx$-CC reason: invalid class name */
    public final /* synthetic */ class CC {
        public static Single $default$b(glx glx) {
            return glx.a().f($$Lambda$iNs6gvAVJ02YJwiC3B9AK29il5U.INSTANCE);
        }

        public static Single $default$c(glx glx) {
            return glx.a().f($$Lambda$glx$6GhVjicZNCLPqnv21LNH3hlfg8w.INSTANCE);
        }

        /* JADX WARNING: Incorrect type for immutable var: ssa=java.util.List, code=java.util.List<gmc>, for r3v0, types: [java.util.List, java.util.List<gmc>] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static /* synthetic */ java.util.Map a(java.util.List<defpackage.gmc> r3) {
            /*
                java.util.HashMap r0 = new java.util.HashMap
                int r1 = r3.size()
                r0.<init>(r1)
                java.util.Iterator r3 = r3.iterator()
            L_0x000d:
                boolean r1 = r3.hasNext()
                if (r1 == 0) goto L_0x0021
                java.lang.Object r1 = r3.next()
                gmc r1 = (defpackage.gmc) r1
                java.lang.String r2 = r1.a()
                r0.put(r2, r1)
                goto L_0x000d
            L_0x0021:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.glx.CC.a(java.util.List):java.util.Map");
        }

        public static List<gmc> b(List<gmc> list) {
            Collections.sort(list, gmc.d);
            return list;
        }
    }

    Single<List<gmc>> a();

    Single<List<gmc>> b();

    Single<Map<String, gmc>> c();
}
