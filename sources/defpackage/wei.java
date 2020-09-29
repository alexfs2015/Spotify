package defpackage;

/* renamed from: wei reason: default package */
public class wei extends weg<weh> {
    /* access modifiers changed from: protected */
    public final /* synthetic */ void a(vyv vyv, wec wec) {
        weh weh = (weh) wec;
        wgw wgw = weh.a().e;
        vza.a(wgw, wgw.b, vyv, wgw.length());
        vyv.x(32);
        String c = weh.c();
        if (c.length() == 0) {
            StringBuilder sb = new StringBuilder();
            sb.append(c);
            sb.append('/');
            c = sb.toString();
        } else {
            int indexOf = c.indexOf("://");
            if (!(indexOf == -1 || c.charAt(0) == '/')) {
                int i = indexOf + 3;
                int indexOf2 = c.indexOf(63, i);
                if (indexOf2 == -1) {
                    if (c.lastIndexOf(47) <= i) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(c);
                        sb2.append('/');
                        c = sb2.toString();
                    }
                } else if (c.lastIndexOf(47, indexOf2) <= i) {
                    int length = c.length();
                    StringBuilder sb3 = new StringBuilder(length + 1);
                    sb3.append(c, 0, indexOf2);
                    sb3.append('/');
                    sb3.append(c, indexOf2, length);
                    c = sb3.toString();
                }
            }
        }
        vyv.b(c.getBytes(whb.a));
        vyv.x(32);
        wen e = weh.e();
        if (e.d == null) {
            wem.a((CharSequence) e.c, vyv);
        } else {
            vyv.b(e.d);
        }
        vyv.b(b);
    }

    public final boolean a(Object obj) {
        return super.a(obj) && !(obj instanceof wej);
    }
}
