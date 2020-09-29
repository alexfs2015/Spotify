package defpackage;

import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: gcx reason: default package */
public final class gcx<A> {
    private final gcu<A> a;
    private final gcw<A> b;
    private A c;

    /* access modifiers changed from: private */
    public static <A> boolean b(A a2, A a3) {
        return true;
    }

    public gcx(gcw<A> gcw, gcu<A> gcu) {
        this.a = gcu;
        this.b = gcw;
    }

    public final synchronized void a(A a2) {
        A a3 = this.c;
        if (a3 == null || this.b.test(a3, a2)) {
            this.a.run(a2);
        }
        this.c = a2;
    }

    public static <A> gcx<A> a(gcu<A> gcu) {
        return new gcx<>($$Lambda$gcx$putCUjompXkjjKeD_iv8vpHQY0.INSTANCE, gcu);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Incorrect type for immutable var: ssa=java.util.List, code=java.util.List<gcx>, for r1v0, types: [java.util.List, java.util.List<gcx>] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ void a(java.util.List<defpackage.gcx> r1, java.lang.Object r2) {
        /*
            java.util.Iterator r1 = r1.iterator()
        L_0x0004:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0014
            java.lang.Object r0 = r1.next()
            gcx r0 = (defpackage.gcx) r0
            r0.a((A) r2)
            goto L_0x0004
        L_0x0014:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gcx.a(java.util.List, java.lang.Object):void");
    }

    @SafeVarargs
    public static <A> gcx<A> a(gcx<A>... gcxArr) {
        return new gcx<>($$Lambda$gcx$5nkgfF9DXZWFNq6MActpyQCCuzY.INSTANCE, new $$Lambda$gcx$uCEwXDYh5saBHItQZ2nqukz1bTA(new ArrayList(Arrays.asList(gcxArr))));
    }

    public static <A, B> gcx<A> a(gcv<A, B> gcv, gcx<B> gcx) {
        return new gcx<>($$Lambda$gcx$putCUjompXkjjKeD_iv8vpHQY0.INSTANCE, new $$Lambda$gcx$_CI0y9UxwmUPajDJd6STmdslS4(gcx, gcv));
    }

    /* access modifiers changed from: private */
    public static <A> boolean a(A a2, A a3) {
        return !a3.equals(a2);
    }
}
