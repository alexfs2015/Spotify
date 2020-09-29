package defpackage;

import io.netty.handler.ssl.ReferenceCountedOpenSslEngine;
import javax.net.ssl.X509ExtendedKeyManager;

/* renamed from: wfq reason: default package */
final class wfq extends wfs {
    private final X509ExtendedKeyManager a;

    wfq(X509ExtendedKeyManager x509ExtendedKeyManager, String str) {
        super(x509ExtendedKeyManager, str);
        this.a = x509ExtendedKeyManager;
    }

    /* access modifiers changed from: protected */
    public final String a(ReferenceCountedOpenSslEngine referenceCountedOpenSslEngine, String str) {
        return this.a.chooseEngineServerAlias(str, null, referenceCountedOpenSslEngine);
    }
}
