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

/* renamed from: kwa reason: default package */
public final class kwa implements kvm {
    public Disposable a = Disposables.b();
    private final kvy b;
    private final kvb c;
    private final kwg d;
    private final ueb e;
    private final Flowable<PlayerState> f;
    private final Scheduler g;

    kwa(kvy kvy, kwg kwg, ueb ueb, Scheduler scheduler, Flowable<PlayerState> flowable, kvb kvb) {
        this.b = (kvy) fay.a(kvy);
        this.d = (kwg) fay.a(kwg);
        this.e = (ueb) fay.a(ueb);
        this.g = scheduler;
        this.f = flowable;
        this.c = kvb;
    }

    public final void a(kwo kwo) {
        Observable observable;
        this.a.bf_();
        Intent intent = kwo.a;
        gzp gzp = kwo.b;
        boolean z = kwo.c;
        kvy kvy = this.b;
        boolean z2 = true;
        if (!kvy.a(kvy.b.a(), kvy.a.a(kvy.e, 0)) && kvy.a.a(kvy.f, 0) < 3) {
            z2 = false;
        }
        if (!z2 || z) {
            observable = this.d.a().c((Function<? super T, ? extends R>) new $$Lambda$kwa$HRMKiisqNtoNDGX_jMHH2Tmi10<Object,Object>(intent, gzp));
        } else {
            observable = Observable.c();
        }
        this.a = observable.a(this.g).a((Consumer<? super T>) new $$Lambda$RjJMsgN89qVR8NGlYEx7VUwMyN4<Object>(this), (Consumer<? super Throwable>) $$Lambda$kwa$xszcVM6hJ3mMoyHWGqgOqPYbsX8.INSTANCE);
    }

    public final void a() {
        this.a.bf_();
        kvy kvy = this.b;
        boolean z = true;
        if (!kvy.a(kvy.b.a(), kvy.a.a(kvy.c, 0)) && kvy.a.a(kvy.d, 0) < 3) {
            z = false;
        }
        this.a = Observable.b((ObservableSource<? extends T1>) !z ? this.d.a.c().d() : Observable.c(), (ObservableSource<? extends T2>) this.f.j().a((Predicate<? super T>) $$Lambda$kwa$j5jRrmpKBgzdJkqUWXHWr6Uyw.INSTANCE).a((Predicate<? super T>) $$Lambda$kwa$mO5Xm7zEPab3mIHFqiF0ODLPhX0.INSTANCE).a((Function<? super T, K>) $$Lambda$kwa$BJiBiwwnAuDWDRZc4lT1hzDieo.INSTANCE), (BiFunction<? super T1, ? super T2, ? extends R>) $$Lambda$KPdMVtSPzjORKXzhJnYZ9juOS0c.INSTANCE).c((Function<? super T, ? extends R>) $$Lambda$kwa$FfSS9BhAMiW5fQZ_xC6hwDzMCjY.INSTANCE).a(this.g).a((Consumer<? super T>) new $$Lambda$KOI1JLYstLoVOuwMAMmOK2qxUps<Object>(this), (Consumer<? super Throwable>) $$Lambda$kwa$PqLcmX_quPODrPp7p36lLHo3mKc.INSTANCE);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kwn a(ho hoVar) {
        return (kwn) hoVar.a;
    }

    public final boolean a(fpt fpt) {
        return kvb.f(fpt);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ boolean c(PlayerState playerState) {
        PlayerTrack track = playerState.track();
        return track != null && !PlayerTrackUtil.isAd(track) && !InterruptionUtil.isInterruptionUri(track.uri());
    }

    /* access modifiers changed from: 0000 */
    public final void a(kwn kwn) {
        tze tze;
        boolean z = false;
        this.b.a.a().a(kvy.d, 0).a(kvy.c, 0).b();
        kvy kvy = this.b;
        kvy.a.a().a(kvy.f, kvy.a.a(kvy.f, 0) + 1).a(kvy.e, kvy.b.a()).b();
        DialogType dialogType = DialogType.POST_CAP;
        Intent i = kwn.i();
        if (!(kwn.j() == null && (i == null || i.getStringExtra("playlist_uri") == null))) {
            z = true;
        }
        kwc a2 = kwc.q().a((int) R.layout.dialog_v2_shuffle_view).a(tze.a((CharSequence) kwn.b())).b(tze.a((CharSequence) kwn.a())).a(tzb.a(Uri.parse(kwn.g()))).e(z ? tze.a((CharSequence) kwn.c()) : null).b(1003).a(kwn.j()).f(tze.a((CharSequence) kwn.d())).c(1001).d(1002).a(kwn.i()).a(Long.valueOf(kwn.h())).a();
        if (kwn.i() != null) {
            tze = tze.a((CharSequence) kwn.e());
        } else {
            tze = tze.a((int) R.string.new_capped_dialog_cancel);
        }
        this.e.a(CappedOndemandDialogFragment.a(dialogType, tzd.a(a2, tze)));
    }

    /* access modifiers changed from: 0000 */
    public final void b(kwn kwn) {
        this.b.a.a().a(kvy.f, 0).a(kvy.e, 0).b();
        kvy kvy = this.b;
        kvy.a.a().a(kvy.d, kvy.a.a(kvy.d, 0) + 1).a(kvy.c, kvy.b.a()).b();
        DialogType dialogType = DialogType.UNDER_CAP;
        a d2 = kwc.q().a((int) R.layout.dialog_v2_ondemand_view).a(tze.a((CharSequence) kwn.b())).b(tze.a((CharSequence) kwn.a())).c(tze.a((CharSequence) kwn.f())).d(tze.a((CharSequence) kwn.c()));
        Long valueOf = Long.valueOf(6000);
        this.e.a(CappedOndemandDialogFragment.a(dialogType, tzd.a(d2.b(valueOf).c(valueOf).b(-1).c(-1).d(-1).a(), tze.a((CharSequence) ""))));
    }

    /* access modifiers changed from: private */
    public static boolean a(PlayerState playerState) {
        return !playerState.isPaused() && playerState.isPlaying();
    }
}
