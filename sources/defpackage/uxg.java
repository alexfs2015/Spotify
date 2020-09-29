package defpackage;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: uxg reason: default package */
public final class uxg {
    private final jlr a;

    public uxg(jlr jlr) {
        this.a = jlr;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(View view, boolean z, ViewGroup viewGroup) {
        if (view != null) {
            if (z) {
                ip.n(view).a(400).a(0.0f).a((Runnable) new $$Lambda$uxg$nWTIsmNFHicAGLyZMM6BmsMsK8I(viewGroup, view)).c();
            } else if (viewGroup != null) {
                viewGroup.removeView(view);
            }
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(ViewGroup viewGroup, View view) {
        if (viewGroup != null) {
            viewGroup.removeView(view);
        }
    }

    public final void a(View view, ViewGroup viewGroup, a aVar, boolean z) {
        viewGroup.getHandler().postDelayed(new $$Lambda$uxg$3Y_d6RggmS37MCxaLtbkK6Ok2uM(view, z, viewGroup), 5000);
        jlr jlr = this.a;
        be beVar = new be(null, uqo.aN.a(), aVar.ae_().toString(), "search-page-voice-tooltip-1", 0, null, "page", null, (double) jtp.a.a());
        jlr.a(beVar);
    }
}
