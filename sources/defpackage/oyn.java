package defpackage;

import com.google.common.collect.ImmutableList;
import com.spotify.mobile.android.cosmos.player.v2.PlayOrigin;
import com.spotify.mobile.android.cosmos.player.v2.Player;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import io.reactivex.Completable;
import io.reactivex.CompletableSource;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Consumer;
import io.reactivex.subjects.CompletableSubject;
import java.util.Collections;
import java.util.List;

/* renamed from: oyn reason: default package */
final class oyn implements oym {
    private final CompositeDisposable a = new CompositeDisposable();
    private final oyf b;
    private final oyi c;
    private final CompletableSubject d = CompletableSubject.f();

    /* renamed from: oyn$a */
    public static abstract class a {

        /* renamed from: oyn$a$a reason: collision with other inner class name */
        public interface C0073a {
            C0073a a(oqf oqf);

            C0073a a(oqg oqg);

            a a();
        }

        public abstract oqg a();

        public abstract oqf b();
    }

    public oyn(oyg oyg, oyj oyj, opz opz, ooj ooj) {
        this.b = new oyf((Player) oyg.a(oyg.a.get(), 1), (String) oyg.a(oyg.b.get(), 2));
        this.c = new oyi((PlayOrigin) oyj.a(oyj.a.get(), 1), (opz) oyj.a(opz, 2), (ooj) oyj.a(ooj, 3));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(a aVar) {
        this.d.onComplete();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ ObservableSource b(a aVar) {
        Completable completable;
        oqg a2 = aVar.a();
        List list = (List) aVar.b().b().a(Collections.emptyList());
        oyi oyi = this.c;
        boolean z = !list.isEmpty();
        oyi.a = a2.a();
        oyi.b = z;
        String str = "item_unknown";
        if (!str.equals(oyi.c.get())) {
            completable = oyi.a((String) oyi.c.get());
            oyi.c.set(str);
        } else {
            completable = Completable.a();
        }
        return completable.a((ObservableSource<T>) Observable.b(aVar));
    }

    public final Completable a() {
        return a(false);
    }

    public final Completable a(boolean z) {
        return !this.b.a() ? z ? c() : b() : Completable.a();
    }

    public final void a(String str) {
        oyf oyf = this.b;
        PlayerState lastPlayerState = oyf.a.getLastPlayerState();
        if (lastPlayerState != null && oyf.a(lastPlayerState)) {
            PlayerTrack track = lastPlayerState.track();
            if (track != null && lastPlayerState.restrictions().disallowSkippingNextReasons().isEmpty() && fbn.a(track.uri(), str)) {
                oyf.a.skipToNextTrack();
            }
        }
    }

    public final void a(oqb oqb) {
        oyf oyf = this.b;
        oyf.a.registerPlayerStateObserver(oyf.d);
        this.a.c();
        CompositeDisposable compositeDisposable = this.a;
        Observable h = Observable.a((ObservableSource<? extends T1>) oqb.c(), (ObservableSource<? extends T2>) oqb.b(), (BiFunction<? super T1, ? super T2, ? extends R>) $$Lambda$oyn$_8BQLgUxCDJYhf00p4CgMx4eb8.INSTANCE).h(new $$Lambda$oyn$NBcmCPygZwxzNqvQ5NJGChDeWK4(this));
        $$Lambda$oyn$hKM1kN2QK5eEP1lnAOhTp2ffwo r1 = new $$Lambda$oyn$hKM1kN2QK5eEP1lnAOhTp2ffwo(this);
        CompletableSubject completableSubject = this.d;
        completableSubject.getClass();
        compositeDisposable.a(h.a((Consumer<? super T>) r1, (Consumer<? super Throwable>) new $$Lambda$choprRsDTSvpwrZVpXc94jmfwE<Object>(completableSubject)));
    }

    public final void a(defpackage.oyl.a aVar) {
        oyf oyf = this.b;
        oyf.b.add(aVar);
        PlayerState lastPlayerState = oyf.a.getLastPlayerState();
        if (lastPlayerState != null) {
            oyf.a(lastPlayerState, true);
        }
    }

    public final Completable b() {
        return this.c.a("item_not_set");
    }

    public final Completable b(String str) {
        return this.c.a(str);
    }

    public final void b(defpackage.oyl.a aVar) {
        this.b.b.remove(aVar);
    }

    public final Completable c() {
        return this.c.a("item_shuffle_play");
    }

    public final boolean d() {
        oyf oyf = this.b;
        return oyf.a(oyf.a.getLastPlayerState());
    }

    public final Completable e() {
        return Completable.b((Iterable<? extends CompletableSource>) ImmutableList.a(this.d, this.b.c));
    }

    public final void f() {
        this.a.c();
        oyf oyf = this.b;
        oyf.a.unregisterPlayerStateObserver(oyf.d);
    }
}
