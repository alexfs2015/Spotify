package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerStateUtil;
import com.spotify.mobile.android.util.ui.Lifecycle.a;
import com.spotify.mobile.android.util.ui.Lifecycle.c;
import com.spotify.music.loggers.InteractionLogger.InteractionType;
import com.spotify.music.nowplaying.common.view.logging.NowPlayingLogConstants.SectionId;
import com.spotify.music.nowplaying.common.view.logging.NowPlayingLogConstants.UserIntent;
import io.reactivex.Flowable;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Predicate;

/* renamed from: tdg reason: default package */
public final class tdg {
    public final gcj a;
    final CompositeDisposable b = new CompositeDisposable();
    private final tkk c;
    private final Flowable<String> d;
    private final Flowable<tds> e;

    public tdg(tkk tkk, a aVar, Flowable<String> flowable, Flowable<tds> flowable2) {
        this.c = tkk;
        this.d = flowable;
        this.e = flowable2;
        this.a = gcj.a(new $$Lambda$tdg$cu_cUmAWe9scThXxky_sk5kfq9Q(this, aVar));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ xfk a(String str) {
        return this.e.a((Predicate<? super T>) $$Lambda$tdg$ICSVuZTu1hTDWchS6Mwrt6gOF1Y.INSTANCE).c(1);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(a aVar) {
        aVar.a(new c() {
            public final void a() {
                tdg.this.b.c();
            }

            public final void c() {
                tdg.this.b.a(tdg.this.d.e(new $$Lambda$tdg$eeK1r9wQ36aHez_M8HEnt2UT5fc(tdg.this)).a((Consumer<? super T>) new $$Lambda$tdg$29CTylWzVGpnARSrFeMdrs5aiw<Object>(tdg.this), (Consumer<? super Throwable>) $$Lambda$tdg$HUpsxy2it2pA6HTN7N8maBirW8Q.INSTANCE));
            }
        });
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(tds tds) {
        tkk tkk = this.c;
        tkk.a(PlayerStateUtil.getTrackUri(tkk.o()), SectionId.SCROLL, UserIntent.SCROLL, InteractionType.SCROLL);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ boolean b(tds tds) {
        return tds.a() > tds.b();
    }
}
