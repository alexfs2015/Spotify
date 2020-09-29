package defpackage;

import android.content.Context;

/* renamed from: lsp reason: default package */
public final class lsp extends jsw {
    jyx e;
    jtz f;

    public lsp(Context context) {
        super(context);
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        jyx jyx = this.e;
        if (jyx != null) {
            jyx.a();
        }
    }
}
