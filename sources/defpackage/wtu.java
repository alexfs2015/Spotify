package defpackage;

import io.netty.handler.ssl.ReferenceCountedOpenSslEngine;

/* renamed from: wtu reason: default package */
public final class wtu extends ReferenceCountedOpenSslEngine {
    wtu(wts wts, wnc wnc, String str, int i) {
        super(wts, wnc, str, i, false);
    }

    /* access modifiers changed from: protected */
    public final void finalize() {
        super.finalize();
        wtp.a((wvo) this);
    }
}
