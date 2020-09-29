package defpackage;

import android.net.Uri;

/* renamed from: bco reason: default package */
final class bco {
    public static long a(bcn bcn) {
        return bcn.a("exo_len", -1);
    }

    public static void a(bcp bcp, long j) {
        bcp.a("exo_len", j);
    }

    public static void a(bcp bcp, Uri uri) {
        bcp.a("exo_redir", (Object) uri.toString());
    }
}
