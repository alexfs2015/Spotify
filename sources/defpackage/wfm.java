package defpackage;

import io.netty.handler.ssl.ApplicationProtocolConfig;
import io.netty.handler.ssl.ClientAuth;
import java.security.cert.Certificate;
import javax.net.ssl.SSLEngine;

/* renamed from: wfm reason: default package */
public abstract class wfm extends wgb {
    wfm(Iterable<String> iterable, wev wev, ApplicationProtocolConfig applicationProtocolConfig, long j, long j2, int i, Certificate[] certificateArr, ClientAuth clientAuth, boolean z) {
        super(iterable, wev, applicationProtocolConfig, j, j2, 0, certificateArr, clientAuth, false, false);
    }

    wfm(Iterable<String> iterable, wev wev, wfk wfk, long j, long j2, int i, Certificate[] certificateArr, ClientAuth clientAuth, boolean z) {
        super(iterable, wev, wfk, j, j2, 1, certificateArr, clientAuth, z, false);
    }

    /* access modifiers changed from: 0000 */
    public final SSLEngine b(vyw vyw, String str, int i) {
        return new wfo(this, vyw, str, i);
    }

    /* access modifiers changed from: protected */
    public final void finalize() {
        super.finalize();
        wfj.a((whi) this);
    }
}
