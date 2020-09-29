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

/* renamed from: uji reason: default package */
public final class uji implements ujf {
    final Player a;
    final Flowable<PlayerState> b;
    final aqq c;
    final defpackage.bce.a d;
    final Scheduler e;
    final AudioManager f;
    final jtz g;
    final BehaviorSubject<ujk> h = BehaviorSubject.a(ujk.a);
    final CompositeDisposable i = new CompositeDisposable();
    boolean j;
    boolean k;
    a l;
    Disposable m = Disposables.b();
    final defpackage.ard.a n = new defpackage.ard.a() {
        /* access modifiers changed from: private */
        public /* synthetic */ void a(a aVar, long j) {
            uji.this.h.onNext(ujk.i().a(aVar.a()).b((String) aVar.b().a("")).a(false).a(Long.valueOf(j)).b(Long.valueOf(j)).c(Long.valueOf(uji.this.g.d())).a());
            uji.this.a(true, true);
        }

        public final void a() {
        }

        public final void a(arc arc) {
        }

        public final void a(arl arl, int i) {
        }

        public final void a(ayo ayo, bbv bbv) {
        }

        public final void a(ExoPlaybackException exoPlaybackException) {
            Logger.e(exoPlaybackException, "Error playing preview", new Object[0]);
            uji.this.a(true, true);
        }

        public final void a(boolean z) {
        }

        public final void a(boolean z, int i) {
            if (uji.this.l != null) {
                boolean z2 = false;
                boolean z3 = i == 3;
                boolean z4 = i == 2;
                if (i == 4) {
                    z2 = true;
                }
                a aVar = uji.this.l;
                long longValue = ((Long) aVar.d().a(Long.valueOf(((aqq) fbp.a(uji.this.c)).e()))).longValue();
                long min = Math.min(((aqq) fbp.a(uji.this.c)).f(), longValue);
                if (z3) {
                    uji uji = uji.this;
                    PlayerState lastPlayerState = uji.a.getLastPlayerState();
                    if (lastPlayerState != null && lastPlayerState.isPlaying() && !lastPlayerState.isPaused()) {
                        uji.a.pause();
                        uji.j = true;
                    }
                    uji uji2 = uji.this;
                    if (!uji2.k) {
                        uji2.k = true;
                        uji2.f.requestAudioFocus(null, 3, 2);
                    }
                    if (aVar.d().b() && uji.this.m.b()) {
                        uji uji3 = uji.this;
                        uji3.m = uji3.e.a().a(new $$Lambda$uji$2$VXmXc_iGtIJaj_jVsmmX2N2Jzek(this, aVar, longValue), ((Long) aVar.d().c()).longValue(), TimeUnit.MILLISECONDS);
                    }
                }
                BehaviorSubject<ujk> behaviorSubject = uji.this.h;
                defpackage.ujk.a a2 = ujk.i().a(aVar.a()).b((String) aVar.b().a("")).a(z4);
                if (z2) {
                    min = longValue;
                }
                behaviorSubject.onNext(a2.a(Long.valueOf(min)).b(Long.valueOf(longValue)).c(Long.valueOf(uji.this.g.d())).a());
                if (z2) {
                    uji.this.a(true, true);
                }
            }
        }

        public final void a_(int i) {
        }

        public final void b(int i) {
        }
    };
    private final hgz o;
    private final PublishSubject<a> p = PublishSubject.a();
    private final c q = new c() {
        /* access modifiers changed from: private */
        public /* synthetic */ void a(PlayerState playerState) {
            uji uji = uji.this;
            if (playerState.isPlaying() && !playerState.isPaused() && uji.l != null) {
                uji.a(false, false);
                uji.j = false;
                uji.k = false;
            }
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void a(a aVar) {
            uji uji = uji.this;
            if (uji.a()) {
                uji.m.bd_();
                if (aVar != a.a) {
                    if (uji.l != null) {
                        uji.l = null;
                        uji.a(false, false);
                    }
                    uji.l = aVar;
                    aye aye = new aye(Uri.parse((String) aVar.c().c()), uji.d, new ati(), null, null);
                    uji.c.a((ayg) aye);
                    uji.c.a(true);
                    uji.c.a(0);
                } else if (uji.l != null) {
                    uji.a(true, true);
                }
            }
        }

        public final void a() {
            uji.this.i.c();
            uji.this.a(true, true);
        }

        public final void aN_() {
            uji uji = uji.this;
            if (uji.c != null) {
                uji.c.b(uji.n);
                uji.c.b();
            }
        }

        public final void c() {
            uji.this.i.a(Observable.a((ObservableSource<? extends T1>) uji.this.p, (ObservableSource<? extends T2>) uji.this.o.b("audio-preview-url-template").c(1), (BiFunction<? super T1, ? super T2, ? extends R>) new $$Lambda$uji$ECC7hcznzdhqiLGEz_a0I8oSS8I<Object,Object,Object>(uji.this)).d((Consumer<? super T>) new $$Lambda$uji$1$k0oJV5MbqkDSp9kPQw6SUSm45t4<Object>(this)), uji.this.b.c((Consumer<? super T>) new $$Lambda$uji$1$eYHz_C6LZjx_4NngDAtAiW1EJ3o<Object>(this)));
        }
    };

    /* renamed from: uji$a */
    public static abstract class a {
        public static final a a = f().a("").a();

        /* renamed from: uji$a$a reason: collision with other inner class name */
        public interface C0081a {
            C0081a a(Optional<String> optional);

            C0081a a(String str);

            a a();

            C0081a b(Optional<String> optional);

            C0081a c(Optional<Long> optional);
        }

        public static C0081a f() {
            return new a().a(Optional.e()).b(Optional.e()).c(Optional.e());
        }

        public abstract String a();

        public abstract Optional<String> b();

        public abstract Optional<String> c();

        public abstract Optional<Long> d();

        public abstract C0081a e();
    }

    public uji(com.spotify.mobile.android.util.ui.Lifecycle.a aVar, Player player, aqq aqq, defpackage.bce.a aVar2, Flowable<PlayerState> flowable, hgz hgz, Scheduler scheduler, AudioManager audioManager, jtz jtz) {
        this.a = player;
        this.c = aqq;
        this.d = aVar2;
        this.b = flowable;
        this.o = hgz;
        this.e = scheduler;
        this.f = audioManager;
        this.g = jtz;
        aVar.a(this.q);
        aqq aqq2 = this.c;
        if (aqq2 != null) {
            aqq2.a(this.n);
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

    /* access modifiers changed from: private */
    public static /* synthetic */ boolean a(ujk ujk, ujk ujk2) {
        defpackage.ujk.a g2 = ujk.g();
        Long valueOf = Long.valueOf(0);
        return g2.c(valueOf).a().equals(ujk2.g().c(valueOf).a());
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

    public final void a(String str) {
        this.p.onNext(a.f().a(str).c(Optional.b(Long.valueOf(10000))).a());
    }

    public final void a(String str, String str2) {
        this.p.onNext(a.f().a(str).a(Optional.b(str2)).a());
    }

    /* access modifiers changed from: 0000 */
    public void a(boolean z, boolean z2) {
        if (a()) {
            if (this.l != null) {
                this.l = null;
                this.c.a();
            }
            this.h.onNext(ujk.a);
            if (z2) {
                d();
            }
            if (z) {
                c();
            }
        }
    }

    public final boolean a() {
        return this.c != null;
    }

    public final Observable<ujk> b() {
        return this.h.a((BiPredicate<? super T, ? super T>) $$Lambda$uji$7cNi_qGJYuBYoSEAsHGpx1kX7zQ.INSTANCE);
    }

    public final void b(String str) {
        a aVar = this.l;
        if (aVar != null && aVar.a().equals(str)) {
            this.p.onNext(a.a);
        }
    }

    public final void b(String str, String str2) {
        this.p.onNext(a.f().a(str).a(Optional.b(str2)).c(Optional.b(Long.valueOf(10000))).a());
    }

    public final void c(String str) {
        a aVar = this.l;
        if (aVar != null && aVar.b().b() && ((String) aVar.b().c()).equals(str)) {
            this.p.onNext(a.a);
        }
    }
}
