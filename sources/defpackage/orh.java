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

/* renamed from: orh reason: default package */
final class orh implements org {
    private final CompositeDisposable a = new CompositeDisposable();
    private final oqz b;
    private final orc c;
    private final CompletableSubject d = CompletableSubject.f();

    /* renamed from: orh$a */
    public static abstract class a {

        /* renamed from: orh$a$a reason: collision with other inner class name */
        public interface C0072a {
            C0072a a(ojb ojb);

            C0072a a(ojc ojc);

            a a();
        }

        public abstract ojc a();

        public abstract ojb b();
    }

    public orh(ora ora, ord ord, oiv oiv, ohf ohf) {
        this.b = new oqz((Player) ora.a(ora.a.get(), 1), (String) ora.a(ora.b.get(), 2));
        this.c = new orc((PlayOrigin) ord.a(ord.a.get(), 1), (oiv) ord.a(oiv, 2), (ohf) ord.a(ohf, 3));
    }

    public final Completable e() {
        return Completable.b((Iterable<? extends CompletableSource>) ImmutableList.a(this.d, this.b.c));
    }

    public final void a(oix oix) {
        oqz oqz = this.b;
        oqz.a.registerPlayerStateObserver(oqz.d);
        this.a.c();
        CompositeDisposable compositeDisposable = this.a;
        Observable h = Observable.a((ObservableSource<? extends T1>) oix.c(), (ObservableSource<? extends T2>) oix.b(), (BiFunction<? super T1, ? super T2, ? extends R>) $$Lambda$orh$f46mTgmzJKOxQyeo_sRxI1IhTRM.INSTANCE).h(new $$Lambda$orh$ceXAG8prpZAAT0fhKFE02RipxQw(this));
        $$Lambda$orh$RhoAEscHjEbDzJOs1Uo5e2EYToU r1 = new $$Lambda$orh$RhoAEscHjEbDzJOs1Uo5e2EYToU(this);
        CompletableSubject completableSubject = this.d;
        completableSubject.getClass();
        compositeDisposable.a(h.a((Consumer<? super T>) r1, (Consumer<? super Throwable>) new $$Lambda$choprRsDTSvpwrZVpXc94jmfwE<Object>(completableSubject)));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ ObservableSource b(a aVar) {
        Completable completable;
        ojc a2 = aVar.a();
        List list = (List) aVar.b().b().a(Collections.emptyList());
        orc orc = this.c;
        boolean z = !list.isEmpty();
        orc.a = a2.a();
        orc.b = z;
        String str = "item_unknown";
        if (!str.equals(orc.c.get())) {
            completable = orc.a((String) orc.c.get());
            orc.c.set(str);
        } else {
            completable = Completable.a();
        }
        return completable.a((ObservableSource<T>) Observable.b(aVar));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(a aVar) {
        this.d.onComplete();
    }

    public final void f() {
        this.a.c();
        oqz oqz = this.b;
        oqz.a.unregisterPlayerStateObserver(oqz.d);
    }

    public final void a(defpackage.orf.a aVar) {
        oqz oqz = this.b;
        oqz.b.add(aVar);
        PlayerState lastPlayerState = oqz.a.getLastPlayerState();
        if (lastPlayerState != null) {
            oqz.a(lastPlayerState, true);
        }
    }

    public final void b(defpackage.orf.a aVar) {
        this.b.b.remove(aVar);
    }

    public final Completable a() {
        return a(false);
    }

    public final Completable a(boolean z) {
        if (this.b.a()) {
            return Completable.a();
        }
        if (z) {
            return c();
        }
        return b();
    }

    public final void a(String str) {
        oqz oqz = this.b;
        PlayerState lastPlayerState = oqz.a.getLastPlayerState();
        if (lastPlayerState != null && oqz.a(lastPlayerState)) {
            PlayerTrack track = lastPlayerState.track();
            if (track != null && lastPlayerState.restrictions().disallowSkippingNextReasons().isEmpty() && faw.a(track.uri(), str)) {
                oqz.a.skipToNextTrack();
            }
        }
    }

    public final Completable b(String str) {
        return this.c.a(str);
    }

    public final Completable b() {
        return this.c.a("item_not_set");
    }

    public final Completable c() {
        return this.c.a("item_shuffle_play");
    }

    public final boolean d() {
        oqz oqz = this.b;
        return oqz.a(oqz.a.getLastPlayerState());
    }
}
