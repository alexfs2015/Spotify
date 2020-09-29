package defpackage;

import android.app.Activity;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import com.spotify.mobile.android.util.ui.Lifecycle.a;
import com.spotify.mobile.android.util.ui.Lifecycle.c;
import com.spotify.music.R;
import io.reactivex.Single;
import io.reactivex.SingleSource;
import io.reactivex.disposables.SerialDisposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;

/* renamed from: ogr reason: default package */
public final class ogr extends c {
    private final a a;
    private final ogm b;
    private final ofs c;
    private final ogp d;
    private final hxx e;
    private final ogn f;
    private final q g;
    private final SerialDisposable h = new SerialDisposable();

    public ogr(Activity activity, ogm ogm, ogp ogp, hxx hxx, ogn ogn, ofs ofs) {
        this.g = (q) activity;
        this.a = (a) activity;
        this.a.a(this);
        this.b = ogm;
        this.d = ogp;
        this.e = hxx;
        this.f = ogn;
        this.c = ofs;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ SingleSource a(String str) {
        return this.b.a();
    }

    /* access modifiers changed from: private */
    public void a(boolean z) {
        if (z) {
            ofs ofs = this.c;
            int a2 = this.f.a();
            jlr jlr = ofs.a;
            be beVar = r4;
            be beVar2 = new be("", PageIdentifiers.PARTNERACCOUNTLINKING.mPageIdentifier, "", "", (long) a2, "", "dialog_shown", "", (double) ofs.b.a());
            jlr.a(beVar);
            ogp ogp = this.d;
            int a3 = ogp.a.a();
            String str = "setup needs to be called first";
            if (a3 == 0) {
                ogn ogn = ogp.a;
                long a4 = ogp.b.a();
                if (ogn.d.b()) {
                    ((SpSharedPreferences) ogn.d.c()).a().a(ogn.a, a4).b();
                } else {
                    throw new RuntimeException(str);
                }
            }
            ogn ogn2 = ogp.a;
            int i = a3 + 1;
            if (ogn2.d.b()) {
                ((SpSharedPreferences) ogn2.d.c()).a().a(ogn.b, i).b();
                this.g.i().a().b(R.id.partner_account_linking_dialog_card_container, ogu.c(), "PartnerAccountLinkingSlateFragmentTag").b();
                return;
            }
            throw new RuntimeException(str);
        }
    }

    public final void a() {
        this.h.bd_();
    }

    public final void aN_() {
        this.a.b(this);
    }

    public final void c() {
        SerialDisposable serialDisposable = this.h;
        Single h2 = this.e.a.j().a((Predicate<? super T>) $$Lambda$puTrpWaJ6oyTrcgN8nctm3zYOGE.INSTANCE).c(1).c((Function<? super T, ? extends R>) $$Lambda$DtEvfn0Icv19eGJW_fHdFkt5y4.INSTANCE).h();
        ogn ogn = this.f;
        ogn.getClass();
        serialDisposable.a(h2.f(new $$Lambda$zjBUjnABKyrjR_wyZgvme2Jxl60(ogn)).a((Function<? super T, ? extends SingleSource<? extends R>>) new $$Lambda$ogr$FJLcdH8ZEn0w6ZCKfWvhuWcn5s<Object,Object>(this)).a((Consumer<? super T>) new $$Lambda$ogr$juQvkZ52gP7l6lLX0BoVqWM_JnE<Object>(this), (Consumer<? super Throwable>) $$Lambda$ogr$hAx7Uha9evN3IPJJ0PGxz7eeKlk.INSTANCE));
    }
}
