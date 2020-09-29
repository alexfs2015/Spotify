package defpackage;

import android.content.Intent;
import android.net.Uri;
import com.spotify.mobile.android.cosmos.player.v2.InterruptionUtil;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrackUtil;
import com.spotify.music.R;
import com.spotify.music.cappedondemand.dialog.CappedOndemandDialogFragment;
import com.spotify.music.cappedondemand.dialog.CappedOndemandDialogFragment.DialogType;
import io.reactivex.Flowable;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.disposables.Disposables;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;

/* renamed from: kzj reason: default package */
public final class kzj implements kyv {
    public Disposable a = Disposables.b();
    private final kzh b;
    private final kyk c;
    private final kzp d;
    private final mip e;
    private final Flowable<PlayerState> f;
    private final Scheduler g;

    kzj(kzh kzh, kzp kzp, mip mip, Scheduler scheduler, Flowable<PlayerState> flowable, kyk kyk) {
        this.b = (kzh) fbp.a(kzh);
        this.d = (kzp) fbp.a(kzp);
        this.e = (mip) fbp.a(mip);
        this.g = scheduler;
        this.f = flowable;
        this.c = kyk;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kzw a(ho hoVar) {
        return (kzw) hoVar.a;
    }

    /* access modifiers changed from: private */
    public static boolean a(PlayerState playerState) {
        return !playerState.isPaused() && playerState.isPlaying();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ boolean c(PlayerState playerState) {
        PlayerTrack track = playerState.track();
        return track != null && !PlayerTrackUtil.isAd(track) && !InterruptionUtil.isInterruptionUri(track.uri());
    }

    public final void a() {
        this.a.bd_();
        kzh kzh = this.b;
        boolean z = true;
        if (!kzh.a(kzh.b.a(), kzh.a.a(kzh.c, 0)) && kzh.a.a(kzh.d, 0) < 3) {
            z = false;
        }
        this.a = Observable.b((ObservableSource<? extends T1>) !z ? this.d.a.c().d() : Observable.c(), (ObservableSource<? extends T2>) this.f.j().a((Predicate<? super T>) $$Lambda$kzj$HDeS9WOVaR0sFaifsUIz1yzu2bE.INSTANCE).a((Predicate<? super T>) $$Lambda$kzj$zBRpDYETB0zvLi_hUhU3MZKKavU.INSTANCE).a((Function<? super T, K>) $$Lambda$kzj$O4AdM4AlibgfgHVlrrZl5L62Gz0.INSTANCE), (BiFunction<? super T1, ? super T2, ? extends R>) $$Lambda$aqJqaW8z8LhvQfPqjp8936_nHmU.INSTANCE).c((Function<? super T, ? extends R>) $$Lambda$kzj$WfNOrng4RqLftQleuolYpkF4.INSTANCE).a(this.g).a((Consumer<? super T>) new $$Lambda$oqERFWB8nzLdWDRBXhzSJlJh5w<Object>(this), (Consumer<? super Throwable>) $$Lambda$kzj$h40i2xuDAMIIVcAkP5jLxYnTmIo.INSTANCE);
    }

    /* access modifiers changed from: 0000 */
    public final void a(kzw kzw) {
        boolean z = false;
        this.b.a.a().a(kzh.d, 0).a(kzh.c, 0).b();
        kzh kzh = this.b;
        kzh.a.a().a(kzh.f, kzh.a.a(kzh.f, 0) + 1).a(kzh.e, kzh.b.a()).b();
        DialogType dialogType = DialogType.POST_CAP;
        Intent i = kzw.i();
        if (!(kzw.j() == null && (i == null || i.getStringExtra("playlist_uri") == null))) {
            z = true;
        }
        this.e.a(CappedOndemandDialogFragment.a(dialogType, uly.a(kzl.q().a((int) R.layout.dialog_v2_shuffle_view).a(ulz.a((CharSequence) kzw.b())).b(ulz.a((CharSequence) kzw.a())).a(ulw.a(Uri.parse(kzw.g()))).e(z ? ulz.a((CharSequence) kzw.c()) : null).b(1003).a(kzw.j()).f(ulz.a((CharSequence) kzw.d())).c(1001).d(1002).a(kzw.i()).a(Long.valueOf(kzw.h())).a(), kzw.i() != null ? ulz.a((CharSequence) kzw.e()) : ulz.a((int) R.string.new_capped_dialog_cancel))));
    }

    public final void a(kzx kzx) {
        this.a.bd_();
        Intent intent = kzx.a;
        hci hci = kzx.b;
        boolean z = kzx.c;
        kzh kzh = this.b;
        boolean z2 = true;
        if (!kzh.a(kzh.b.a(), kzh.a.a(kzh.e, 0)) && kzh.a.a(kzh.f, 0) < 3) {
            z2 = false;
        }
        this.a = ((!z2 || z) ? this.d.a().c((Function<? super T, ? extends R>) new $$Lambda$kzj$kKboVKL2ZqcjCrVXFNCCRHd97HM<Object,Object>(intent, hci)) : Observable.c()).a(this.g).a((Consumer<? super T>) new $$Lambda$xC9LNtw_MYEd9Wp2lqJObxwQQq4<Object>(this), (Consumer<? super Throwable>) $$Lambda$kzj$y1Q344CCLGqGS5xMhDwOJEaXLeU.INSTANCE);
    }

    public final boolean a(fqn fqn) {
        return kyk.f(fqn);
    }

    /* access modifiers changed from: 0000 */
    public final void b(kzw kzw) {
        this.b.a.a().a(kzh.f, 0).a(kzh.e, 0).b();
        kzh kzh = this.b;
        kzh.a.a().a(kzh.d, kzh.a.a(kzh.d, 0) + 1).a(kzh.c, kzh.b.a()).b();
        DialogType dialogType = DialogType.UNDER_CAP;
        a d2 = kzl.q().a((int) R.layout.dialog_v2_ondemand_view).a(ulz.a((CharSequence) kzw.b())).b(ulz.a((CharSequence) kzw.a())).c(ulz.a((CharSequence) kzw.f())).d(ulz.a((CharSequence) kzw.c()));
        Long valueOf = Long.valueOf(6000);
        this.e.a(CappedOndemandDialogFragment.a(dialogType, uly.a(d2.b(valueOf).c(valueOf).b(-1).c(-1).d(-1).a(), ulz.a((CharSequence) ""))));
    }
}
