package defpackage;

import java.io.UnsupportedEncodingException;

/* renamed from: cwt reason: default package */
public class cwt extends dwe<String> {
    private final Object k = new Object();
    private edv<String> l;

    public cwt(int i, String str, edv<String> edv, edc edc) {
        super(i, str, edc);
        this.l = edv;
    }

    /* access modifiers changed from: protected */
    public final ecb<String> a(dud dud) {
        String str;
        try {
            byte[] bArr = dud.b;
            String str2 = "ISO-8859-1";
            String str3 = (String) dud.c.get("Content-Type");
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
            str = new String(dud.b);
        }
        return ecb.a(str, cqt.a(dud));
    }

    /* access modifiers changed from: protected */
    public void a(String str) {
        edv<String> edv;
        synchronized (this.k) {
            edv = this.l;
        }
        if (edv != null) {
            edv.a(str);
        }
    }
}
