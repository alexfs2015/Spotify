package defpackage;

import android.net.Uri;
import com.spotify.music.R;
import com.spotify.music.cappedondemand.dialog.CappedOndemandDialogFragment;
import com.spotify.music.cappedondemand.dialog.CappedOndemandDialogFragment.DialogType;
import com.spotify.music.slate.model.BackgroundColor;
import io.reactivex.Observable;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.disposables.Disposables;
import io.reactivex.functions.Consumer;

/* renamed from: kvu reason: default package */
public final class kvu implements kvm {
    public Disposable a = Disposables.b();
    private final kvs b;
    private final kwg c;
    private final ueb d;
    private final Scheduler e;

    public final boolean a(fpt fpt) {
        return true;
    }

    public kvu(kvs kvs, kwg kwg, ueb ueb, Scheduler scheduler) {
        this.b = (kvs) fay.a(kvs);
        this.c = (kwg) fay.a(kwg);
        this.d = (ueb) fay.a(ueb);
        this.e = scheduler;
    }

    public final void a(kwo kwo) {
        this.a.bf_();
        this.a = (!this.b.a() ? this.c.a.b().d() : Observable.c()).a(this.e).a((Consumer<? super T>) new $$Lambda$zbxRQ4p_F8ixpwx3MKP6Ph0kH9I<Object>(this), (Consumer<? super Throwable>) $$Lambda$kvu$1bmLRLNqklaKD0ui8UKRGLtEw0.INSTANCE);
    }

    public final void a() {
        this.a.bf_();
        this.b.a(false);
        this.a = ((!this.b.b() || this.b.c()) ? Observable.c() : this.c.a.a().d()).a(this.e).a((Consumer<? super T>) new $$Lambda$AdV2x5068347RxstkHnILLmOvs<Object>(this), (Consumer<? super Throwable>) $$Lambda$kvu$9tmkVf8X3guV2_cuGJfgpqkcRpY.INSTANCE);
    }

    private static tzd c(kwn kwn) {
        b a2 = b.d().a((int) R.layout.dialog_view).b(R.layout.dialog_view).a(C0080b.e).a();
        tze a3 = tze.a((CharSequence) kwn.c());
        tze a4 = tze.a((CharSequence) kwn.b());
        return tzd.a(tzo.g().c(a3).a(BackgroundColor.a(-15513721)).a(tzb.a(Uri.parse(kwn.g()))).a(a4).b(tze.a((CharSequence) kwn.a())).a(a2).a(), tze.a((CharSequence) fav.a(kwn.d(), "")));
    }

    /* access modifiers changed from: 0000 */
    public final void a(kwn kwn) {
        if (!this.b.a()) {
            this.b.c.a().a(kvs.a, true).b();
            this.b.a(true);
            this.d.a(CappedOndemandDialogFragment.a(DialogType.POST_CAP, c(kwn)));
        }
    }

    /* access modifiers changed from: 0000 */
    public final void b(kwn kwn) {
        if (this.b.b() && !this.b.c()) {
            this.b.c.a().a(kvs.b, true).b();
            this.d.a(CappedOndemandDialogFragment.a(DialogType.UNDER_CAP, c(kwn)));
        }
    }
}
