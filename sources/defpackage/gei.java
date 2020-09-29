package defpackage;

import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: gei reason: default package */
public final class gei<A> {
    private final gef<A> a;
    private final geh<A> b;
    private A c;

    public gei(geh<A> geh, gef<A> gef) {
        this.a = gef;
        this.b = geh;
    }

    public static <A> gei<A> a(gef<A> gef) {
        return new gei<>($$Lambda$gei$Tu3uDRCigPrf8Jb4WqrYTj5ydU.INSTANCE, gef);
    }

    public static <A, B> gei<A> a(geg<A, B> geg, gei<B> gei) {
        return new gei<>($$Lambda$gei$Tu3uDRCigPrf8Jb4WqrYTj5ydU.INSTANCE, new $$Lambda$gei$jHpQ6qt2rT64LkvpWJhSQrSvcXU(gei, geg));
    }

    @SafeVarargs
    public static <A> gei<A> a(gei<A>... geiArr) {
        return new gei<>($$Lambda$gei$EkyCDuy0DELtKbTOHLg4MYxsLU.INSTANCE, new $$Lambda$gei$Xqczb6_R9RsEcAMtd5EbPD6qfqI(new ArrayList(Arrays.asList(geiArr))));
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Incorrect type for immutable var: ssa=java.util.List, code=java.util.List<gei>, for r1v0, types: [java.util.List, java.util.List<gei>] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ void a(java.util.List<defpackage.gei> r1, java.lang.Object r2) {
        /*
            java.util.Iterator r1 = r1.iterator()
        L_0x0004:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0014
            java.lang.Object r0 = r1.next()
            gei r0 = (defpackage.gei) r0
            r0.a((A) r2)
            goto L_0x0004
        L_0x0014:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gei.a(java.util.List, java.lang.Object):void");
    }

    /* access modifiers changed from: private */
    public static <A> boolean a(A a2, A a3) {
        return !a3.equals(a2);
    }

    /* access modifiers changed from: private */
    public static <A> boolean b(A a2, A a3) {
        return true;
    }

    public final synchronized void a(A a2) {
        A a3 = this.c;
        if (a3 == null || this.b.test(a3, a2)) {
            this.a.run(a2);
        }
        this.c = a2;
    }
}
