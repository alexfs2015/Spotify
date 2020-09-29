package defpackage;

import com.spotify.mobile.android.flags.RolloutFlag;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences.b;

/* renamed from: pns reason: default package */
public final class pns {
    public static final b<Object, String> b = b.a("debug_tools_premium_destination_date_override");
    public final vuj a;

    public pns(vuj vuj) {
        this.a = vuj;
    }

    public static boolean a(fqn fqn) {
        return "Treatment".equalsIgnoreCase((String) fqn.a(pnr.a));
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0044 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean a(java.lang.String r4, defpackage.voy r5) {
        /*
            java.lang.String r0 = "US"
            boolean r4 = r0.equals(r4)
            r0 = 0
            if (r4 == 0) goto L_0x0045
            vow r4 = r5.a
            vos r4 = r4.a
            java.lang.String r4 = r4.b()
            java.lang.String r1 = "samsung-mobile-preload"
            boolean r4 = r1.equals(r4)
            r1 = 1
            if (r4 == 0) goto L_0x0041
            vou r4 = r5.b
            com.google.common.collect.ImmutableList<java.util.regex.Pattern> r5 = defpackage.vou.b
            fdz r5 = r5.R_()
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pns.a(java.lang.String, voy):boolean");
    }

    public static boolean c(fqn fqn) {
        return fqn.a(pnr.c) == RolloutFlag.ENABLED;
    }

    public static boolean d(fqn fqn) {
        return fqn.a(pnr.d) == RolloutFlag.ENABLED;
    }

    public static boolean e(fqn fqn) {
        return fqn.a(pnr.e) == RolloutFlag.ENABLED;
    }

    public final boolean b(fqn fqn) {
        return ((RolloutFlag) fqn.a(pnr.b)) == RolloutFlag.ENABLED || ((RolloutFlag) fqn.a(pnr.c)) == RolloutFlag.ENABLED || this.a.a();
    }
}
