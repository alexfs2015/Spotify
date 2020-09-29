package defpackage;

import android.media.AudioManager;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.common.base.Optional;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.cosmos.player.v2.Player;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.util.ui.Lifecycle.c;
import io.reactivex.Flowable;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Scheduler;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.disposables.Disposables;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.BiPredicate;
import io.reactivex.functions.Consumer;
import io.reactivex.subjects.BehaviorSubject;
import io.reactivex.subjects.PublishSubject;
import java.util.concurrent.TimeUnit;

/* renamed from: txf reason: default package */
public final class txf implements txc {
    final Player a;
    final Flowable<PlayerState> b;
    final apz c;
    final defpackage.bbn.a d;
    final Scheduler e;
    final AudioManager f;
    final jrp g;
    final BehaviorSubject<txh> h = BehaviorSubject.a(txh.a);
    final CompositeDisposable i = new CompositeDisposable();
    boolean j;
    boolean k;
    a l;
    Disposable m = Disposables.b();
    final defpackage.aqm.a n = new defpackage.aqm.a() {
        public final void a() {
        }

        public final void a(aql aql) {
        }

        public final void a(aqu aqu, int i) {
        }

        public final void a(axx axx, bbe bbe) {
        }

        public final void a(boolean z) {
        }

        public final void a_(int i) {
        }

        public final void b(int i) {
        }

        public final void a(boolean z, int i) {
            if (txf.this.l != null) {
                boolean z2 = false;
                boolean z3 = i == 3;
                boolean z4 = i == 2;
                if (i == 4) {
                    z2 = true;
                }
                a aVar = txf.this.l;
                long longValue = ((Long) aVar.d().a(Long.valueOf(((apz) fay.a(txf.this.c)).e()))).longValue();
                long min = Math.min(((apz) fay.a(txf.this.c)).f(), longValue);
                if (z3) {
                    txf txf = txf.this;
                    PlayerState lastPlayerState = txf.a.getLastPlayerState();
                    if (lastPlayerState != null && lastPlayerState.isPlaying() && !lastPlayerState.isPaused()) {
                        txf.a.pause();
                        txf.j = true;
                    }
                    txf txf2 = txf.this;
                    if (!txf2.k) {
                        txf2.k = true;
                        txf2.f.requestAudioFocus(null, 3, 2);
                    }
                    if (aVar.d().b() && txf.this.m.b()) {
                        txf txf3 = txf.this;
                        txf3.m = txf3.e.a().a(new $$Lambda$txf$2$326lGbt6yKcOFjQSPtiikCJ4bY(this, aVar, longValue), ((Long) aVar.d().c()).longValue(), TimeUnit.MILLISECONDS);
                    }
                }
                BehaviorSubject<txh> behaviorSubject = txf.this.h;
                defpackage.txh.a a2 = txh.i().a(aVar.a()).b((String) aVar.b().a("")).a(z4);
                if (z2) {
                    min = longValue;
                }
                behaviorSubject.onNext(a2.a(Long.valueOf(min)).b(Long.valueOf(longValue)).c(Long.valueOf(txf.this.g.d())).a());
                if (z2) {
                    txf.this.a(true, true);
                }
            }
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void a(a aVar, long j) {
            txf.this.h.onNext(txh.i().a(aVar.a()).b((String) aVar.b().a("")).a(false).a(Long.valueOf(j)).b(Long.valueOf(j)).c(Long.valueOf(txf.this.g.d())).a());
            txf.this.a(true, true);
        }

        public final void a(ExoPlaybackException exoPlaybackException) {
            Logger.e(exoPlaybackException, "Error playing preview", new Object[0]);
            txf.this.a(true, true);
        }
    };
    private final hed o;
    private final PublishSubject<a> p = PublishSubject.a();
    private final c q = new c() {
        public final void c() {
            txf.this.i.a(Observable.a((ObservableSource<? extends T1>) txf.this.p, (ObservableSource<? extends T2>) vun.b(txf.this.o.a("audio-preview-url-template")).c(1), (BiFunction<? super T1, ? super T2, ? extends R>) new $$Lambda$txf$6I5tyXBZQAIPQa6ub9i8QdxM7w<Object,Object,Object>(txf.this)).d((Consumer<? super T>) new $$Lambda$txf$1$ECKIwuIiGu3bSIfs3dC3mbHHk0<Object>(this)), txf.this.b.c((Consumer<? super T>) new $$Lambda$txf$1$x5iGNrK7t7JvZyw5fciMMWl8FA<Object>(this)));
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void a(a aVar) {
            txf txf = txf.this;
            if (txf.a()) {
                txf.m.bf_();
                if (aVar != a.a) {
                    if (txf.l != null) {
                        txf.l = null;
                        txf.a(false, false);
                    }
                    txf.l = aVar;
                    axn axn = new axn(Uri.parse((String) aVar.c().c()), txf.d, new asr(), null, null);
                    txf.c.a((axp) axn);
                    txf.c.a(true);
                    txf.c.a(0);
                } else if (txf.l != null) {
                    txf.a(true, true);
                }
            }
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void a(PlayerState playerState) {
            txf txf = txf.this;
            if (playerState.isPlaying() && !playerState.isPaused() && txf.l != null) {
                txf.a(false, false);
                txf.j = false;
                txf.k = false;
            }
        }

        public final void a() {
            txf.this.i.c();
            txf.this.a(true, true);
        }

        public final void aP_() {
            txf txf = txf.this;
            if (txf.c != null) {
                txf.c.b(txf.n);
                txf.c.b();
            }
        }
    };

    /* renamed from: txf$a */
    public static abstract class a {
        public static final a a = f().a("").a();

        /* renamed from: txf$a$a reason: collision with other inner class name */
        public interface C0079a {
            C0079a a(Optional<String> optional);

            C0079a a(String str);

            a a();

            C0079a b(Optional<String> optional);

            C0079a c(Optional<Long> optional);
        }

        public abstract String a();

        public abstract Optional<String> b();

        public abstract Optional<String> c();

        public abstract Optional<Long> d();

        public abstract C0079a e();

        public static C0079a f() {
            return new a().a(Optional.e()).b(Optional.e()).c(Optional.e());
        }
    }

    public txf(com.spotify.mobile.android.util.ui.Lifecycle.a aVar, Player player, apz apz, defpackage.bbn.a aVar2, Flowable<PlayerState> flowable, hed hed, Scheduler scheduler, AudioManager audioManager, jrp jrp) {
        this.a = player;
        this.c = apz;
        this.d = aVar2;
        this.b = flowable;
        this.o = hed;
        this.e = scheduler;
        this.f = audioManager;
        this.g = jrp;
        aVar.a(this.q);
        apz apz2 = this.c;
        if (apz2 != null) {
            apz2.a(this.n);
        }
    }

    public final boolean a() {
        return this.c != null;
    }

    public final void a(String str, String str2) {
        this.p.onNext(a.f().a(str).a(Optional.b(str2)).a());
    }

    public final void b(String str) {
        a aVar = this.l;
        if (aVar != null && aVar.a().equals(str)) {
            this.p.onNext(a.a);
        }
    }

    public final void c(String str) {
        a aVar = this.l;
        if (aVar != null && aVar.b().b() && ((String) aVar.b().c()).equals(str)) {
            this.p.onNext(a.a);
        }
    }

    public final Observable<txh> b() {
        return this.h.a((BiPredicate<? super T, ? super T>) $$Lambda$txf$Ryl5eTo5g40VPkx8NAjt8oVC4jg.INSTANCE);
    }

    /* access modifiers changed from: 0000 */
    public void a(boolean z, boolean z2) {
        if (a()) {
            if (this.l != null) {
                this.l = null;
                this.c.a();
            }
            this.h.onNext(txh.a);
            if (z2) {
                d();
            }
            if (z) {
                c();
            }
        }
    }

    private void c() {
        if (this.j) {
            this.j = false;
            this.a.resume();
        }
    }

    private void d() {
        if (this.k) {
            this.k = false;
            this.f.abandonAudioFocus(null);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ a a(a aVar, String str) {
        if (TextUtils.isEmpty(aVar.a())) {
            return a.a;
        }
        a aVar2 = this.l;
        if (aVar2 != null && aVar2.a().equals(aVar.a())) {
            if (!this.l.b().b() || !aVar.b().b()) {
                return a.a;
            }
            if (((String) this.l.b().c()).equals(aVar.b().c())) {
                return a.a;
            }
        }
        return aVar.e().b(Optional.b(str.replace("{id}", aVar.a()))).a();
    }

    public final void a(String str) {
        this.p.onNext(a.f().a(str).c(Optional.b(Long.valueOf(10000))).a());
    }

    public final void b(String str, String str2) {
        this.p.onNext(a.f().a(str).a(Optional.b(str2)).c(Optional.b(Long.valueOf(10000))).a());
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ boolean a(txh txh, txh txh2) {
        defpackage.txh.a g2 = txh.g();
        Long valueOf = Long.valueOf(0);
        return g2.c(valueOf).a().equals(txh2.g().c(valueOf).a());
    }
}
