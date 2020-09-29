package defpackage;

import io.netty.handler.ssl.ReferenceCountedOpenSslEngine;
import javax.net.ssl.X509ExtendedKeyManager;

/* renamed from: wtw reason: default package */
final class wtw extends wty {
    private final X509ExtendedKeyManager a;

    wtw(X509ExtendedKeyManager x509ExtendedKeyManager, String str) {
        super(x509ExtendedKeyManager, str);
        this.a = x509ExtendedKeyManager;
    }

    /* access modifiers changed from: protected */
    public final String a(ReferenceCountedOpenSslEngine referenceCountedOpenSslEngine, String str) {
        return this.a.chooseEngineServerAlias(str, null, referenceCountedOpenSslEngine);
    }
}
