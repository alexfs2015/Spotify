package defpackage;

import com.spotify.cosmos.router.Request;

/* renamed from: xbi reason: default package */
public final class xbi {
    public static boolean a(String str) {
        return str.equals(Request.POST) || str.equals("PATCH") || str.equals(Request.PUT) || str.equals(Request.DELETE) || str.equals("MOVE");
    }

    public static boolean b(String str) {
        return str.equals(Request.POST) || str.equals(Request.PUT) || str.equals("PATCH") || str.equals("PROPPATCH") || str.equals("REPORT");
    }

    public static boolean c(String str) {
        return !str.equals(Request.GET) && !str.equals("HEAD");
    }
}
