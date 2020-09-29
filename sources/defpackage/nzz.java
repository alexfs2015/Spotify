package defpackage;

import android.app.Activity;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import com.spotify.mobile.android.util.ui.Lifecycle.a;
import com.spotify.mobile.android.util.ui.Lifecycle.c;
import com.spotify.music.R;

/* renamed from: nzz reason: default package */
public final class nzz extends c {
    private final a a;
    private final nzu b;
    private final nzi c;
    private final nzx d;
    private final hvl e;
    private final nzv f;
    private final q g;
    private wuk h = xaj.a();

    public nzz(Activity activity, nzu nzu, nzx nzx, hvl hvl, nzv nzv, nzi nzi) {
        this.g = (q) activity;
        this.a = (a) activity;
        this.a.a(this);
        this.b = nzu;
        this.d = nzx;
        this.e = hvl;
        this.f = nzv;
        this.c = nzi;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ wuh a(String str) {
        return this.b.a();
    }

    public final void a() {
        hej.a(this.h);
    }

    /* access modifiers changed from: private */
    public void a(boolean z) {
        if (z) {
            nzi nzi = this.c;
            int a2 = this.f.a();
            jjf jjf = nzi.a;
            bf bfVar = r4;
            bf bfVar2 = new bf("", PageIdentifiers.PARTNERACCOUNTLINKING.mPageIdentifier, "", "", (long) a2, "", "dialog_shown", "", (double) nzi.b.a());
            jjf.a(bfVar);
            nzx nzx = this.d;
            int a3 = nzx.a.a();
            String str = "setup needs to be called first";
            if (a3 == 0) {
                nzv nzv = nzx.a;
                long a4 = nzx.b.a();
                if (nzv.d.b()) {
                    ((SpSharedPreferences) nzv.d.c()).a().a(nzv.a, a4).b();
                } else {
                    throw new RuntimeException(str);
                }
            }
            nzv nzv2 = nzx.a;
            int i = a3 + 1;
            if (nzv2.d.b()) {
                ((SpSharedPreferences) nzv2.d.c()).a().a(nzv.b, i).b();
                this.g.i().a().b(R.id.partner_account_linking_dialog_card_container, oac.c(), "PartnerAccountLinkingSlateFragmentTag").b();
                return;
            }
            throw new RuntimeException(str);
        }
    }

    public final void aP_() {
        this.a.b(this);
    }

    public final void c() {
        wuh a2 = vun.a((wrf<T>) this.e.a).c((wut<? super T, Boolean>) $$Lambda$K6LBDee2P7uQjQt0uNTOG54xquk.INSTANCE).a(1).f($$Lambda$KGsdFp7hwr4JnEfZ19jPX0Xzi_E.INSTANCE).a();
        nzv nzv = this.f;
        nzv.getClass();
        this.h = a2.c(new $$Lambda$OmmiRdY2MxUuAslnII0KtHitqw(nzv)).a((wut<? super T, ? extends wuh<? extends R>>) new $$Lambda$nzz$mfE0O0ZsDovnzgOvok1EDynfmqI<Object,Object>(this)).a((wun<? super T>) new $$Lambda$nzz$cLgKFjvtOFoK_XrmbSjNub5sso<Object>(this), (wun<Throwable>) $$Lambda$nzz$TJ1RBnN_cjk7A4KfYQ4Jbvb_8qA.INSTANCE);
    }
}
