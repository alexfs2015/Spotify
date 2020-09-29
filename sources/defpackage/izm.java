package defpackage;

/* renamed from: izm reason: default package */
public final class izm {
    public static String a(izq izq, jck jck) {
        String str;
        String str2 = izq.c;
        if (jck instanceof jcj) {
            jcj jcj = (jcj) jck;
            if (jcj.e() != null) {
                StringBuilder sb = new StringBuilder();
                sb.append(jcj.e());
                sb.append(10);
                str = sb.toString();
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(str2);
                return sb2.toString();
            }
        }
        str = "";
        StringBuilder sb22 = new StringBuilder();
        sb22.append(str);
        sb22.append(str2);
        return sb22.toString();
    }
}
