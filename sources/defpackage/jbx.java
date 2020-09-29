package defpackage;

/* renamed from: jbx reason: default package */
public final class jbx {
    public static String a(jcc jcc, jew jew) {
        String str;
        String c = jcc.c();
        if (jew instanceof jev) {
            jev jev = (jev) jew;
            if (jev.e() != null) {
                StringBuilder sb = new StringBuilder();
                sb.append(jev.e());
                sb.append(10);
                str = sb.toString();
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(c);
                return sb2.toString();
            }
        }
        str = "";
        StringBuilder sb22 = new StringBuilder();
        sb22.append(str);
        sb22.append(c);
        return sb22.toString();
    }
}
