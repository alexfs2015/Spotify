package defpackage;

import com.spotify.mobile.android.flags.RolloutFlag;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences.b;

/* renamed from: pgr reason: default package */
public final class pgr {
    public static final b<Object, String> b = b.a("debug_tools_premium_destination_date_override");
    private static fqa[] c = {pgq.a};
    public final vhe a;
    private final rgz d;

    public pgr(rgz rgz, vhe vhe) {
        this.d = rgz;
        this.a = vhe;
    }

    public final boolean a(fpt fpt) {
        String a2 = a(fpt, c);
        return this.d.a(fpt) && ("PriceAndValue".equals(a2) || "Price".equals(a2) || "ValueAndPrice".equals(a2));
    }

    public final boolean b(fpt fpt) {
        return this.d.a(fpt) && "Price".equals(a(fpt, c));
    }

    public final boolean c(fpt fpt) {
        return this.d.a(fpt) && "ValueAndPrice".equals(a(fpt, c));
    }

    public final boolean d(fpt fpt) {
        return this.d.a(fpt) && "PriceAndValue".equals(a(fpt, c));
    }

    public static boolean e(fpt fpt) {
        return "Treatment".equalsIgnoreCase((String) fpt.a(pgq.b));
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0044 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean a(java.lang.String r4, defpackage.jwl r5) {
        /*
            java.lang.String r0 = "US"
            boolean r4 = r0.equals(r4)
            r0 = 0
            if (r4 == 0) goto L_0x0045
            jwj r4 = r5.a
            jsi r4 = r4.a
            java.lang.String r4 = r4.b()
            java.lang.String r1 = "samsung-mobile-preload"
            boolean r4 = r1.equals(r4)
            r1 = 1
            if (r4 == 0) goto L_0x0041
            jwh r4 = r5.b
            com.google.common.collect.ImmutableList<java.util.regex.Pattern> r5 = defpackage.jwh.b
            fdh r5 = r5.R_()
        L_0x0022:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto L_0x003c
            java.lang.Object r2 = r5.next()
            java.util.regex.Pattern r2 = (java.util.regex.Pattern) r2
            java.lang.String r3 = r4.a
            java.util.regex.Matcher r2 = r2.matcher(r3)
            boolean r2 = r2.matches()
            if (r2 == 0) goto L_0x0022
            r4 = 1
            goto L_0x003d
        L_0x003c:
            r4 = 0
        L_0x003d:
            if (r4 == 0) goto L_0x0041
            r4 = 1
            goto L_0x0042
        L_0x0041:
            r4 = 0
        L_0x0042:
            if (r4 == 0) goto L_0x0045
            return r1
        L_0x0045:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pgr.a(java.lang.String, jwl):boolean");
    }

    public final boolean f(fpt fpt) {
        return ((RolloutFlag) fpt.a(pgq.c)) == RolloutFlag.ENABLED || ((RolloutFlag) fpt.a(pgq.d)) == RolloutFlag.ENABLED || this.a.a();
    }

    public static boolean g(fpt fpt) {
        return fpt.a(pgq.d) == RolloutFlag.ENABLED;
    }

    public static boolean h(fpt fpt) {
        return fpt.a(pgq.e) == RolloutFlag.ENABLED;
    }

    public static boolean i(fpt fpt) {
        return fpt.a(pgq.f) == RolloutFlag.ENABLED;
    }

    private static String a(fpt fpt, fqa[] fqaArr) {
        for (fqa fqa : fqaArr) {
            String str = (String) fpt.a(fqa);
            if (!fqa.f.equals(str)) {
                return str;
            }
        }
        return "";
    }
}
