package defpackage;

/* renamed from: wso reason: default package */
public class wso extends wsm<wsn> {
    /* access modifiers changed from: protected */
    public final /* synthetic */ void a(wnb wnb, wsi wsi) {
        wsn wsn = (wsn) wsi;
        wvc wvc = wsn.a().e;
        wng.a(wvc, wvc.b, wnb, wvc.length());
        wnb.x(32);
        String c = wsn.c();
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
        wnb.b(c.getBytes(wvh.a));
        wnb.x(32);
        wst e = wsn.e();
        if (e.d == null) {
            wss.a((CharSequence) e.c, wnb);
        } else {
            wnb.b(e.d);
        }
        wnb.b(b);
    }

    public final boolean a(Object obj) {
        return super.a(obj) && !(obj instanceof wsp);
    }
}
