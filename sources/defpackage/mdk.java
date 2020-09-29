package defpackage;

import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.music.libs.viewuri.ViewUris;

/* renamed from: mdk reason: default package */
public final class mdk {
    public static gkq a(String str) {
        return ViewUris.n.b(str) ? PageIdentifiers.BROWSE_GENRES : PageIdentifiers.FIND;
    }

    public static sso b(String str) {
        return ViewUris.r.b(str) ? ViewUris.r.a(str) : ViewUris.n.b(str) ? ViewUris.n.a(str) : ViewUris.ae;
    }

    public static boolean c(String str) {
        return f(str) || ViewUris.n.b(str) || ViewUris.r.b(str) || g(str);
    }

    private static boolean d(String str) {
        return ViewUris.o.b(str) || ViewUris.ae.b(str);
    }

    private static boolean e(String str) {
        return ViewUris.p.b(str) || ViewUris.ae.b(str);
    }

    private static boolean f(String str) {
        return d(str) && !e(str);
    }

    private static boolean g(String str) {
        return ViewUris.r.b(str) && !ViewUris.q.b(str);
    }
}
