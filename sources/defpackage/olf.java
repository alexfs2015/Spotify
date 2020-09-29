package defpackage;

import android.os.Bundle;
import com.spotify.mobile.android.util.ui.Lifecycle.c;
import io.reactivex.BackpressureStrategy;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Scheduler;
import io.reactivex.Scheduler.Worker;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.disposables.Disposables;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Consumer;
import io.reactivex.internal.functions.Functions;
import java.util.concurrent.TimeUnit;

/* renamed from: olf reason: default package */
public class olf {
    public final olm a;
    public final oky b;
    public final ujf c;
    public final olb d;
    public final hec e;
    public final lav f;
    public final sso g;
    public fqn h;
    /* access modifiers changed from: private */
    public final olc i;
    /* access modifiers changed from: private */
    public final olp j;
    /* access modifiers changed from: private */
    public final lon k;
    /* access modifiers changed from: private */
    public final a l;
    private final Scheduler m;
    /* access modifiers changed from: private */
    public final CompositeDisposable n = new CompositeDisposable();
    private Disposable o = Disposables.b();
    /* access modifiers changed from: private */
    public boolean p;
    /* access modifiers changed from: private */
    public boolean q;

    /* renamed from: olf$a */
    public static class a extends sgc<ole> {
        a(com.spotify.mobile.android.util.ui.Lifecycle.a aVar, sgb sgb, sso sso, rmf rmf) {
            super(aVar, sgb, sso, rmf);
        }

        public final /* bridge */ /* synthetic */ boolean a(Object obj) {
            return true;
        }
    }

    /* renamed from: olf$b */
    public static abstract class b {

        /* renamed from: olf$b$a */
        public interface a {
            a a(fqn fqn);

            a a(ole ole);

            b a();
        }

        public abstract ole a();

        public abstract fqn b();
    }

    public olf(olm olm, olc olc, olp olp, oky oky, Scheduler scheduler, hgy hgy, ujf ujf, olb olb, lon lon, lav lav, a aVar, oli oli, hec hec, sso sso, com.spotify.mobile.android.util.ui.Lifecycle.a aVar2) {
        final olm olm2 = olm;
        this.a = olm2;
        this.i = olc;
        this.j = olp;
        this.b = oky;
        final Scheduler scheduler2 = scheduler;
        this.m = scheduler2;
        this.c = ujf;
        this.d = olb;
        this.k = lon;
        this.f = lav;
        this.e = hec;
        this.g = sso;
        this.l = aVar;
        final oli oli2 = oli;
        final hgy hgy2 = hgy;
        AnonymousClass1 r0 = new c() {
            /* access modifiers changed from: private */
            public /* synthetic */ void a(Boolean bool) {
                olf.this.q = bool.booleanValue();
            }

            /* access modifiers changed from: private */
            /* JADX WARNING: Code restructure failed: missing block: B:25:0x00d1, code lost:
                if (defpackage.olf.g(r7.e).b.a(defpackage.olf.f(r7.e)) == false) goto L_0x00d3;
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public /* synthetic */ void a(defpackage.olm r8, defpackage.olf.b r9) {
                /*
                    r7 = this;
                    ole r0 = r9.a()
                    olf r1 = defpackage.olf.this
                    fqn r9 = r9.b()
                    r1.h = r9
                    vlc r9 = r0.a()
                    boolean r1 = r9.g()
                    r2 = 0
                    r3 = 1
                    if (r1 != 0) goto L_0x0022
                    boolean r1 = r9.k()
                    if (r1 == 0) goto L_0x0020
                    goto L_0x0022
                L_0x0020:
                    r1 = 0
                    goto L_0x0023
                L_0x0022:
                    r1 = 1
                L_0x0023:
                    java.util.List r4 = r0.b()
                    java.util.List r0 = r0.c()
                    boolean r5 = r9.k()
                    if (r5 == 0) goto L_0x004e
                    olf r5 = defpackage.olf.this
                    olp r5 = r5.j
                    boolean r6 = r4.isEmpty()
                    r6 = r6 ^ r3
                    r5.a(r6)
                    olf r5 = defpackage.olf.this
                    olp r5 = r5.j
                    boolean r6 = r0.isEmpty()
                    r6 = r6 ^ r3
                    r5.c(r6)
                    goto L_0x0067
                L_0x004e:
                    olf r5 = defpackage.olf.this
                    olp r5 = r5.j
                    boolean r6 = r4.isEmpty()
                    if (r6 == 0) goto L_0x0063
                    boolean r6 = r0.isEmpty()
                    if (r6 != 0) goto L_0x0061
                    goto L_0x0063
                L_0x0061:
                    r6 = 0
                    goto L_0x0064
                L_0x0063:
                    r6 = 1
                L_0x0064:
                    r5.b(r6)
                L_0x0067:
                    olf r5 = defpackage.olf.this
                    olp r5 = r5.j
                    r5.a(r4)
                    olf r5 = defpackage.olf.this
                    olp r5 = r5.j
                    r5.b(r0)
                    olf r5 = defpackage.olf.this
                    olp r5 = r5.j
                    r5.d(r2)
                    olf r5 = defpackage.olf.this
                    olp r5 = r5.j
                    boolean r4 = r4.isEmpty()
                    if (r4 == 0) goto L_0x0096
                    boolean r0 = r0.isEmpty()
                    if (r0 == 0) goto L_0x0096
                    r0 = 1
                    goto L_0x0097
                L_0x0096:
                    r0 = 0
                L_0x0097:
                    r5.e(r0)
                    olf r0 = defpackage.olf.this
                    olp r0 = r0.j
                    r0.f(r1)
                    olf r0 = defpackage.olf.this
                    olp r0 = r0.j
                    r4 = r1 ^ 1
                    r0.g(r4)
                    olf r0 = defpackage.olf.this
                    olp r0 = r0.j
                    r0.j(r1)
                    olf r0 = defpackage.olf.this
                    olp r0 = r0.j
                    if (r1 == 0) goto L_0x00d3
                    olf r1 = defpackage.olf.this
                    olc r1 = r1.i
                    olf r4 = defpackage.olf.this
                    fqn r4 = r4.h
                    lap r1 = r1.b
                    boolean r1 = r1.a(r4)
                    if (r1 != 0) goto L_0x00d4
                L_0x00d3:
                    r2 = 1
                L_0x00d4:
                    r0.k(r2)
                    olf r0 = defpackage.olf.this
                    olp r0 = r0.j
                    olf r1 = defpackage.olf.this
                    olc r1 = r1.i
                    olf r2 = defpackage.olf.this
                    fqn r2 = r2.h
                    lap r1 = r1.b
                    boolean r1 = r1.a(r2)
                    r0.h(r1)
                    olf r0 = defpackage.olf.this
                    olp r0 = r0.j
                    boolean r1 = r9.g()
                    r0.m(r1)
                    olf r0 = defpackage.olf.this
                    olp r0 = r0.j
                    com.spotify.mobile.android.playlist.navigation.AllSongsConfiguration r8 = r8.n()
                    boolean r8 = r8.b()
                    r0.l(r8)
                    olf r8 = defpackage.olf.this
                    olp r8 = r8.j
                    java.lang.String r0 = r9.a()
                    r8.a(r0)
                    olf r8 = defpackage.olf.this
                    olp r8 = r8.j
                    com.spotify.playlist.models.Covers$Size r0 = com.spotify.playlist.models.Covers.Size.NORMAL
                    java.lang.String r9 = r9.getImageUri(r0)
                    r8.b(r9)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.olf.AnonymousClass1.a(olm, olf$b):void");
            }

            /* access modifiers changed from: private */
            public /* synthetic */ void b(Boolean bool) {
                olf.this.j.i(bool.booleanValue());
                olf.this.p = bool.booleanValue();
            }

            public final void a() {
                olf.this.n.c();
            }

            public final void a(Bundle bundle) {
                bundle.putBoolean(olf.class.getName(), olf.this.q);
            }

            public final void b(Bundle bundle) {
                if (bundle != null) {
                    olf.this.q = bundle.getBoolean(olf.class.getName(), false);
                }
            }

            public final void c() {
                olf.this.j.d(true);
                olf.this.n.a(Observable.a((ObservableSource<? extends T1>) oli2.a().a(wit.a((c<T, R>) olf.this.l, BackpressureStrategy.BUFFER)), (ObservableSource<? extends T2>) hgy2.a().j(), (BiFunction<? super T1, ? super T2, ? extends R>) $$Lambda$olf$1$sONbgKDRHKgDKI99hX4lkkK0LZw.INSTANCE).a(scheduler2).a((Consumer<? super T>) new $$Lambda$olf$1$6_sSihsRazOc4hW6rGifBQ3TlqM<Object>(this, olm2), (Consumer<? super Throwable>) $$Lambda$olf$1$YEs0ws7zL0dkcTNSgVOHF1unep4.INSTANCE));
                olf.this.n.a(wit.b(olf.this.k.a()).a(Functions.a()).a(scheduler2).a((Consumer<? super T>) new $$Lambda$olf$1$K1M3AkH1CMaWcnzSNlLK0jyMEs4<Object>(this), (Consumer<? super Throwable>) $$Lambda$olf$1$S0qWJtL4nc_O8Pe4iZcsT3tBA.INSTANCE));
                olf.this.n.a(oli2.b().a(scheduler2).a((Consumer<? super T>) new $$Lambda$olf$1$Y40TFpyJgVrZVayoQfVsgBZwtbo<Object>(this), (Consumer<? super Throwable>) $$Lambda$olf$1$sicvDibbWnqyYWOZAs3r0zzpSk.INSTANCE));
            }
        };
        aVar2.a(r0);
    }

    public static String b(vle vle) {
        StringBuilder sb = new StringBuilder();
        sb.append(c(vle));
        sb.append(vle.getUri());
        return sb.toString();
    }

    private static String c(vle vle) {
        vlf b2 = vle.b();
        if (b2 != null) {
            return b2.previewId();
        }
        vkv a2 = vle.a();
        if (a2 != null) {
            return a2.g();
        }
        return null;
    }

    public void a() {
        if (!this.q) {
            this.j.k();
        } else if (this.o.b()) {
            this.b.d();
            this.j.l();
            Worker a2 = this.m.a();
            olp olp = this.j;
            olp.getClass();
            this.o = a2.a(new $$Lambda$IRiSFrKv3QRaSmNTSoSfQ47nl_4(olp), 1500, TimeUnit.MILLISECONDS);
        }
    }

    public void a(vle vle) {
        vlf b2 = vle.b();
        vkv a2 = vle.a();
        boolean z = (b2 != null && b2.isExplicit()) || (a2 != null && a2.i());
        if (this.p && z) {
            this.k.a(vle.getUri(), this.a.m());
        } else if (b2 == null || !b2.isBanned()) {
            String c2 = c(vle);
            if (!fbo.a(c2)) {
                if (a2 != null) {
                    this.c.a(c2, b(vle));
                } else {
                    this.c.b(c2, b(vle));
                }
            }
        }
    }
}
