package defpackage;

import android.util.Base64;
import java.util.List;

/* renamed from: hb reason: default package */
public final class hb {
    final String a;
    final String b;
    final String c;
    final List<List<byte[]>> d;
    final String e;
    private final int f = 0;

    public hb(String str, String str2, String str3, List<List<byte[]>> list) {
        this.a = (String) hr.a(str);
        this.b = (String) hr.a(str2);
        this.c = (String) hr.a(str3);
        this.d = (List) hr.a(list);
        StringBuilder sb = new StringBuilder(this.a);
        String str4 = "-";
        sb.append(str4);
        sb.append(this.b);
        sb.append(str4);
        sb.append(this.c);
        this.e = sb.toString();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder("FontRequest {mProviderAuthority: ");
        sb2.append(this.a);
        sb2.append(", mProviderPackage: ");
        sb2.append(this.b);
        sb2.append(", mQuery: ");
        sb2.append(this.c);
        sb2.append(", mCertificates:");
        sb.append(sb2.toString());
        for (int i = 0; i < this.d.size(); i++) {
            sb.append(" [");
            List list = (List) this.d.get(i);
            for (int i2 = 0; i2 < list.size(); i2++) {
                sb.append(" \"");
                sb.append(Base64.encodeToString((byte[]) list.get(i2), 0));
                sb.append("\"");
            }
            sb.append(" ]");
        }
        sb.append("}");
        StringBuilder sb3 = new StringBuilder("mCertificatesArray: ");
        sb3.append(0);
        sb.append(sb3.toString());
        return sb.toString();
    }
}
