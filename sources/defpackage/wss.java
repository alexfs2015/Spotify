package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: wss reason: default package */
public final class wss {
    @Deprecated
    static final wrx a = new wrx();

    static {
        StringBuilder sb = new StringBuilder();
        sb.append(wsf.a);
        sb.append("=");
        wvc.b((CharSequence) sb.toString());
        wvc.b((CharSequence) ";");
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x0068 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0069 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static long a(defpackage.wsi r4, long r5) {
        /*
            wsg r5 = r4.d()
            wvc r6 = defpackage.wse.b
            java.lang.String r5 = r5.b(r6)
            r0 = -1
            if (r5 == 0) goto L_0x0014
            long r4 = java.lang.Long.parseLong(r5)     // Catch:{ NumberFormatException -> 0x0013 }
            return r4
        L_0x0013:
            return r0
        L_0x0014:
            wsg r5 = r4.d()
            boolean r6 = r4 instanceof defpackage.wsn
            if (r6 == 0) goto L_0x003d
            wsn r4 = (defpackage.wsn) r4
            wsk r6 = defpackage.wsk.a
            wsk r4 = r4.a()
            boolean r4 = r6.equals(r4)
            if (r4 == 0) goto L_0x0060
            wvc r4 = defpackage.wse.e
            boolean r4 = r5.d(r4)
            if (r4 == 0) goto L_0x0060
            wvc r4 = defpackage.wse.f
            boolean r4 = r5.d(r4)
            if (r4 == 0) goto L_0x0060
            r4 = 8
            goto L_0x0061
        L_0x003d:
            boolean r6 = r4 instanceof defpackage.wsp
            if (r6 == 0) goto L_0x0060
            wsp r4 = (defpackage.wsp) r4
            wsr r4 = r4.f()
            int r4 = r4.b
            r6 = 101(0x65, float:1.42E-43)
            if (r4 != r6) goto L_0x0060
            wvc r4 = defpackage.wse.h
            boolean r4 = r5.d(r4)
            if (r4 == 0) goto L_0x0060
            wvc r4 = defpackage.wse.g
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wss.a(wsi, long):long");
    }

    static void a(CharSequence charSequence, wnb wnb) {
        int length = charSequence.length();
        for (int i = 0; i < length; i++) {
            char charAt = charSequence.charAt(i);
            wnb.x(charAt > 255 ? 63 : (byte) charAt);
        }
    }

    public static void a(wsi wsi, boolean z) {
        if (z) {
            wsi.d().a((CharSequence) wse.k, (Object) wsf.b);
            wsi.d().a((CharSequence) wse.b);
            return;
        }
        List c = wsi.d().c((CharSequence) wse.k);
        if (!c.isEmpty()) {
            ArrayList arrayList = new ArrayList(c);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (wsf.b.a((CharSequence) it.next())) {
                    it.remove();
                }
            }
            if (arrayList.isEmpty()) {
                wsi.d().a((CharSequence) wse.k);
            } else {
                wsi.d().a((CharSequence) wse.k, (Iterable<?>) arrayList);
            }
        }
    }

    public static boolean a(wsi wsi) {
        return wsi.d().a((CharSequence) wse.k, (CharSequence) wsf.b, true);
    }
}
