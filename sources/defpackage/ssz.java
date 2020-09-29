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

/* renamed from: ssz reason: default package */
public final class ssz {
    public final gbl a;
    final CompositeDisposable b = new CompositeDisposable();
    private final tad c;
    private final Flowable<String> d;
    private final Flowable<stl> e;

    public ssz(tad tad, a aVar, Flowable<String> flowable, Flowable<stl> flowable2) {
        this.c = tad;
        this.d = flowable;
        this.e = flowable2;
        this.a = gbl.a(new $$Lambda$ssz$EVriZGkuqEWzOj7Uh2pjNMX6jQ(this, aVar));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ wrf a(String str) {
        return this.e.a((Predicate<? super T>) $$Lambda$ssz$v1snuStO8aElSu5ptwML4S8lMeM.INSTANCE).c(1);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ boolean b(stl stl) {
        return stl.a() > stl.b();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(stl stl) {
        tad tad = this.c;
        tad.a(PlayerStateUtil.getTrackUri(tad.o()), SectionId.SCROLL, UserIntent.SCROLL, InteractionType.SCROLL);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(a aVar) {
        aVar.a(new c() {
            public final void c() {
                ssz.this.b.a(ssz.this.d.e(new $$Lambda$ssz$x5xj_NGCmkYUyZERpwHiqCYV8tA(ssz.this)).a((Consumer<? super T>) new $$Lambda$ssz$dUBZq7efvADGg3PQhpZJKaCLitg<Object>(ssz.this), (Consumer<? super Throwable>) $$Lambda$ssz$qpoG5hj3doejaa3KzJattVBnT_E.INSTANCE));
            }

            public final void a() {
                ssz.this.b.c();
            }
        });
    }
}
