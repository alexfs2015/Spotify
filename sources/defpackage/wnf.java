package defpackage;

/* renamed from: wnf reason: default package */
public final class wnf {
    public static String a(wlx wlx) {
        String f = wlx.f();
        String h = wlx.h();
        if (h == null) {
            return f;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(f);
        sb.append('?');
        sb.append(h);
        return sb.toString();
    }
}
