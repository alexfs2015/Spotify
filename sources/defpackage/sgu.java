package defpackage;

import com.google.common.base.Function;

/* renamed from: sgu reason: default package */
public final class sgu {
    private static final Function<gzt, String> a = $$Lambda$sgu$7eoFyyiF5XL8cGI9aQrJRsZGnA.INSTANCE;
    private static final faz<String> b = $$Lambda$sgu$j3MBoecobosJ2qtWBDmU4dIK5c.INSTANCE;

    public static Iterable<String> a(Iterable<? extends gzt> iterable) {
        return fbx.a(iterable).a(a).a(b);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ String a(gzt gzt) {
        String str = null;
        if (gzt == null) {
            return null;
        }
        gzt gzt2 = (gzt) fay.a(gzt);
        gzy target = gzt2.target();
        if (target != null) {
            str = ((gzy) fay.a(target)).uri();
        }
        if (str == null) {
            str = ((gzt) fay.a(gzt2)).custom().string("trackUri");
        }
        return str;
    }
}
