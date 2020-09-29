package defpackage;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: umc reason: default package */
public final class umc {
    private final jjf a;

    public umc(jjf jjf) {
        this.a = jjf;
    }

    public final void a(View view, ViewGroup viewGroup, a aVar, boolean z) {
        viewGroup.getHandler().postDelayed(new $$Lambda$umc$3B81vonAcTe_PPvCD7rrnChs5lg(view, z, viewGroup), 5000);
        jjf jjf = this.a;
        bf bfVar = new bf(null, udt.aN.a(), aVar.ae_().toString(), "search-page-voice-tooltip-1", 0, null, "page", null, (double) jrf.a.a());
        jjf.a(bfVar);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(ViewGroup viewGroup, View view) {
        if (viewGroup != null) {
            viewGroup.removeView(view);
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(View view, boolean z, ViewGroup viewGroup) {
        if (view != null) {
            if (z) {
                ip.n(view).a(400).a(0.0f).a((Runnable) new $$Lambda$umc$lOHpVzAzqWeUjU6bnHQrgc0sy5g(viewGroup, view)).c();
            } else if (viewGroup != null) {
                viewGroup.removeView(view);
            }
        }
    }
}
