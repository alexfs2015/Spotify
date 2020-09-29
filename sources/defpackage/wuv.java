package defpackage;

import java.net.InetAddress;
import java.net.UnknownHostException;

/* renamed from: wuv reason: default package */
public final class wuv extends wuw {
    public wuv(wwc wwc) {
        super(wwc);
    }

    /* access modifiers changed from: protected */
    public final void a(String str, wws<InetAddress> wws) {
        try {
            wws.a(InetAddress.getByName(str));
        } catch (UnknownHostException e) {
            wws.c((Throwable) e);
        }
    }
}
