package defpackage;

import io.reactivex.Single;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: gkl reason: default package */
public interface gkl {

    /* renamed from: gkl$-CC reason: invalid class name */
    public final /* synthetic */ class CC {
        public static Single $default$b(gkl _this) {
            return _this.a().f($$Lambda$ywPFOoFSRrNwrz4LaMKbNciCWI.INSTANCE);
        }

        public static Single $default$c(gkl _this) {
            return _this.a().f($$Lambda$gkl$qTCsgpXzQukvKLYJe3tsVjow9I.INSTANCE);
        }

        /* JADX WARNING: Incorrect type for immutable var: ssa=java.util.List, code=java.util.List<gkq>, for r3v0, types: [java.util.List, java.util.List<gkq>] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static /* synthetic */ java.util.Map a(java.util.List<defpackage.gkq> r3) {
            /*
                java.util.HashMap r0 = new java.util.HashMap
                int r1 = r3.size()
                r0.<init>(r1)
                java.util.Iterator r3 = r3.iterator()
            L_0x000d:
                boolean r1 = r3.hasNext()
                if (r1 == 0) goto L_0x0021
                java.lang.Object r1 = r3.next()
                gkq r1 = (defpackage.gkq) r1
                java.lang.String r2 = r1.a()
                r0.put(r2, r1)
                goto L_0x000d
            L_0x0021:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.gkl.CC.a(java.util.List):java.util.Map");
        }

        public static List<gkq> b(List<gkq> list) {
            Collections.sort(list, gkq.d);
            return list;
        }
    }

    Single<List<gkq>> a();

    Single<List<gkq>> b();

    Single<Map<String, gkq>> c();
}
