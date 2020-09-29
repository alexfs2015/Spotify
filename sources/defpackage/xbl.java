package defpackage;

/* renamed from: xbl reason: default package */
public final class xbl {
    public static String a(xad xad) {
        String f = xad.f();
        String h = xad.h();
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
