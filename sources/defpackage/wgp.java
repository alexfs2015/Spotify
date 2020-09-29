package defpackage;

import java.net.InetAddress;
import java.net.UnknownHostException;

/* renamed from: wgp reason: default package */
public final class wgp extends wgq {
    public wgp(whw whw) {
        super(whw);
    }

    /* access modifiers changed from: protected */
    public final void a(String str, wim<InetAddress> wim) {
        try {
            wim.a(InetAddress.getByName(str));
        } catch (UnknownHostException e) {
            wim.c((Throwable) e);
        }
    }
}
