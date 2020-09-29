package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: wem reason: default package */
public final class wem {
    @Deprecated
    static final wdr a = new wdr();

    static {
        StringBuilder sb = new StringBuilder();
        sb.append(wdz.a);
        sb.append("=");
        wgw.b((CharSequence) sb.toString());
        wgw.b((CharSequence) ";");
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x0068 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0069 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static long a(defpackage.wec r4, long r5) {
        /*
            wea r5 = r4.d()
            wgw r6 = defpackage.wdy.b
            java.lang.String r5 = r5.b(r6)
            r0 = -1
            if (r5 == 0) goto L_0x0014
            long r4 = java.lang.Long.parseLong(r5)     // Catch:{ NumberFormatException -> 0x0013 }
            return r4
        L_0x0013:
            return r0
        L_0x0014:
            wea r5 = r4.d()
            boolean r6 = r4 instanceof defpackage.weh
            if (r6 == 0) goto L_0x003d
            weh r4 = (defpackage.weh) r4
            wee r6 = defpackage.wee.a
            wee r4 = r4.a()
            boolean r4 = r6.equals(r4)
            if (r4 == 0) goto L_0x0060
            wgw r4 = defpackage.wdy.e
            boolean r4 = r5.d(r4)
            if (r4 == 0) goto L_0x0060
            wgw r4 = defpackage.wdy.f
            boolean r4 = r5.d(r4)
            if (r4 == 0) goto L_0x0060
            r4 = 8
            goto L_0x0061
        L_0x003d:
            boolean r6 = r4 instanceof defpackage.wej
            if (r6 == 0) goto L_0x0060
            wej r4 = (defpackage.wej) r4
            wel r4 = r4.f()
            int r4 = r4.b
            r6 = 101(0x65, float:1.42E-43)
            if (r4 != r6) goto L_0x0060
            wgw r4 = defpackage.wdy.h
            boolean r4 = r5.d(r4)
            if (r4 == 0) goto L_0x0060
            wgw r4 = defpackage.wdy.g
            boolean r4 = r5.d(r4)
            if (r4 == 0) goto L_0x0060
            r4 = 16
            goto L_0x0061
        L_0x0060:
            r4 = -1
        L_0x0061:
            long r4 = (long) r4
            r2 = 0
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 < 0) goto L_0x0069
            return r4
        L_0x0069:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wem.a(wec, long):long");
    }

    public static boolean a(wec wec) {
        return wec.d().a((CharSequence) wdy.k, (CharSequence) wdz.b, true);
    }

    public static void a(wec wec, boolean z) {
        if (z) {
            wec.d().a((CharSequence) wdy.k, (Object) wdz.b);
            wec.d().a((CharSequence) wdy.b);
            return;
        }
        List c = wec.d().c((CharSequence) wdy.k);
        if (!c.isEmpty()) {
            ArrayList arrayList = new ArrayList(c);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (wdz.b.a((CharSequence) it.next())) {
                    it.remove();
                }
            }
            if (arrayList.isEmpty()) {
                wec.d().a((CharSequence) wdy.k);
            } else {
                wec.d().a((CharSequence) wdy.k, (Iterable<?>) arrayList);
            }
        }
    }

    static void a(CharSequence charSequence, vyv vyv) {
        int length = charSequence.length();
        for (int i = 0; i < length; i++) {
            char charAt = charSequence.charAt(i);
            vyv.x(charAt > 255 ? 63 : (byte) charAt);
        }
    }
}
