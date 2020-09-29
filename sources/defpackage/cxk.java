package defpackage;

import java.io.UnsupportedEncodingException;

/* renamed from: cxk reason: default package */
public class cxk extends dwv<String> {
    private final Object k = new Object();
    private eem<String> l;

    public cxk(int i, String str, eem<String> eem, edt edt) {
        super(i, str, edt);
        this.l = eem;
    }

    /* access modifiers changed from: protected */
    public final ecs<String> a(duu duu) {
        String str;
        try {
            byte[] bArr = duu.b;
            String str2 = "ISO-8859-1";
            String str3 = (String) duu.c.get("Content-Type");
            if (str3 != null) {
                String[] split = str3.split(";");
                int i = 1;
                while (true) {
                    if (i >= split.length) {
                        break;
                    }
                    String[] split2 = split[i].trim().split("=");
                    if (split2.length == 2 && split2[0].equals("charset")) {
                        str2 = split2[1];
                        break;
                    }
                    i++;
                }
            }
            str = new String(bArr, str2);
        } catch (UnsupportedEncodingException unused) {
            str = new String(duu.b);
        }
        return ecs.a(str, crk.a(duu));
    }

    /* access modifiers changed from: protected */
    public void a(String str) {
        eem<String> eem;
        synchronized (this.k) {
            eem = this.l;
        }
        if (eem != null) {
            eem.a(str);
        }
    }
}
