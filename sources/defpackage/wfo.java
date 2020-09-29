package defpackage;

import io.netty.handler.ssl.ReferenceCountedOpenSslEngine;

/* renamed from: wfo reason: default package */
public final class wfo extends ReferenceCountedOpenSslEngine {
    wfo(wfm wfm, vyw vyw, String str, int i) {
        super(wfm, vyw, str, i, false);
    }

    /* access modifiers changed from: protected */
    public final void finalize() {
        super.finalize();
        wfj.a((whi) this);
    }
}
