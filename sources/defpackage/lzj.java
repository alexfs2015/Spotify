package defpackage;

import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.music.libs.viewuri.ViewUris;

/* renamed from: lzj reason: default package */
public final class lzj {
    public static boolean c(String str) {
        return f(str) || ViewUris.o.b(str) || ViewUris.s.b(str) || g(str);
    }

    private static boolean d(String str) {
        return ViewUris.p.b(str) || ViewUris.af.b(str);
    }

    private static boolean e(String str) {
        return ViewUris.q.b(str) || ViewUris.af.b(str);
    }

    private static boolean f(String str) {
        return d(str) && !e(str);
    }

    public static gjf a(String str) {
        if (ViewUris.o.b(str)) {
            return PageIdentifiers.BROWSE_GENRES;
        }
        return PageIdentifiers.FIND;
    }

    public static sih b(String str) {
        if (ViewUris.s.b(str)) {
            return ViewUris.s.a(str);
        }
        if (ViewUris.o.b(str)) {
            return ViewUris.o.a(str);
        }
        return ViewUris.af;
    }

    private static boolean g(String str) {
        return ViewUris.s.b(str) && !ViewUris.r.b(str);
    }
}
