package defpackage;

import io.netty.handler.ssl.ApplicationProtocolConfig;
import io.netty.handler.ssl.ClientAuth;
import java.security.cert.Certificate;
import javax.net.ssl.SSLEngine;

/* renamed from: wts reason: default package */
public abstract class wts extends wuh {
    wts(Iterable<String> iterable, wtb wtb, ApplicationProtocolConfig applicationProtocolConfig, long j, long j2, int i, Certificate[] certificateArr, ClientAuth clientAuth, boolean z) {
        super(iterable, wtb, applicationProtocolConfig, j, j2, 0, certificateArr, clientAuth, false, false);
    }

    wts(Iterable<String> iterable, wtb wtb, wtq wtq, long j, long j2, int i, Certificate[] certificateArr, ClientAuth clientAuth, boolean z) {
        super(iterable, wtb, wtq, j, j2, 1, certificateArr, clientAuth, z, false);
    }

    /* access modifiers changed from: 0000 */
    public final SSLEngine b(wnc wnc, String str, int i) {
        return new wtu(this, wnc, str, i);
    }

    /* access modifiers changed from: protected */
    public final void finalize() {
        super.finalize();
        wtp.a((wvo) this);
    }
}
