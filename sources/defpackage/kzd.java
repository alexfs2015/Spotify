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

/* renamed from: kzd reason: default package */
public final class kzd implements kyv {
    public Disposable a = Disposables.b();
    private final kzb b;
    private final kzp c;
    private final mip d;
    private final Scheduler e;

    public kzd(kzb kzb, kzp kzp, mip mip, Scheduler scheduler) {
        this.b = (kzb) fbp.a(kzb);
        this.c = (kzp) fbp.a(kzp);
        this.d = (mip) fbp.a(mip);
        this.e = scheduler;
    }

    private static uly c(kzw kzw) {
        b a2 = b.d().a((int) R.layout.dialog_view).b(R.layout.dialog_view).a(C0082b.e).a();
        ulz a3 = ulz.a((CharSequence) kzw.c());
        ulz a4 = ulz.a((CharSequence) kzw.b());
        return uly.a(umj.g().c(a3).a(BackgroundColor.a(-15513721)).a(ulw.a(Uri.parse(kzw.g()))).a(a4).b(ulz.a((CharSequence) kzw.a())).a(a2).a(), ulz.a((CharSequence) fbm.a(kzw.d(), "")));
    }

    public final void a() {
        this.a.bd_();
        this.b.a(false);
        this.a = ((!this.b.b() || this.b.c()) ? Observable.c() : this.c.a.a().d()).a(this.e).a((Consumer<? super T>) new $$Lambda$VMX9CNlMihWBWjNzvRHcHPWkVQ<Object>(this), (Consumer<? super Throwable>) $$Lambda$kzd$YK8qKcsLhAA8_UTILHuMlGyEv9Q.INSTANCE);
    }

    /* access modifiers changed from: 0000 */
    public final void a(kzw kzw) {
        if (!this.b.a()) {
            this.b.c.a().a(kzb.a, true).b();
            this.b.a(true);
            this.d.a(CappedOndemandDialogFragment.a(DialogType.POST_CAP, c(kzw)));
        }
    }

    public final void a(kzx kzx) {
        this.a.bd_();
        this.a = (!this.b.a() ? this.c.a.b().d() : Observable.c()).a(this.e).a((Consumer<? super T>) new $$Lambda$1sXWQWg8wmxDcl4I3IBSF2x26E<Object>(this), (Consumer<? super Throwable>) $$Lambda$kzd$uyWA9lQ0RecB7Xk6skVrLNBlKc.INSTANCE);
    }

    public final boolean a(fqn fqn) {
        return true;
    }

    /* access modifiers changed from: 0000 */
    public final void b(kzw kzw) {
        if (this.b.b() && !this.b.c()) {
            this.b.c.a().a(kzb.b, true).b();
            this.d.a(CappedOndemandDialogFragment.a(DialogType.UNDER_CAP, c(kzw)));
        }
    }
}
