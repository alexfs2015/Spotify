package defpackage;

import com.google.common.base.Optional;
import com.google.common.collect.Lists;
import com.spotify.music.R;
import com.spotify.playlist.models.Covers.Size;
import io.reactivex.Completable;
import io.reactivex.Observable;
import io.reactivex.Scheduler;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.BiPredicate;
import io.reactivex.functions.Consumer;
import io.reactivex.subjects.BehaviorSubject;
import io.reactivex.subjects.CompletableSubject;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;

/* renamed from: ols reason: default package */
class ols {
    final CompositeDisposable a = new CompositeDisposable();
    final olo b;
    final spi c;
    final String d;
    final CompletableSubject e = CompletableSubject.f();
    olz f;
    Boolean g;
    ojc h;
    private orf i;
    private final uxt j;
    private final olv k;
    private final ohg l;
    private final ois m;
    private final ofh n;
    private final Scheduler o;
    private final ofa p;
    private final Optional<olw> q;
    private final BehaviorSubject<ojc> r = BehaviorSubject.a();
    private final CompositeDisposable s = new CompositeDisposable();
    private final a t = new a() {
        public final void a(String str, boolean z) {
        }

        public final void a(boolean z) {
            ols.a(ols.this, z);
        }
    };

    /* access modifiers changed from: private */
    public static /* synthetic */ void c() {
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void d() {
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void e() {
    }

    public ols(ois ois, olo olo, spi spi, uxt uxt, ofa ofa, olv olv, ofh ofh, String str, Scheduler scheduler, ohg ohg, Optional<olw> optional) {
        this.b = olo;
        this.c = spi;
        this.j = uxt;
        this.k = olv;
        this.l = ohg;
        this.d = str;
        this.m = ois;
        this.n = ofh;
        this.o = scheduler;
        this.q = optional;
        this.p = ofa;
    }

    public final void a(a aVar) {
        this.i = aVar.a();
        this.a.c();
        CompositeDisposable compositeDisposable = this.a;
        Observable c2 = aVar.b().c();
        ois ois = this.m;
        ois.getClass();
        Observable a2 = c2.a((BiPredicate<? super T, ? super T>) new $$Lambda$PjVYt5Nr9pG_VgyEij6HBWsUiE<Object,Object>(ois)).a(this.o);
        $$Lambda$ols$JSQoDXn9EPqGK_HfQLrprehjds r1 = new $$Lambda$ols$JSQoDXn9EPqGK_HfQLrprehjds(this);
        CompletableSubject completableSubject = this.e;
        completableSubject.getClass();
        compositeDisposable.a(a2.a((Consumer<? super T>) r1, (Consumer<? super Throwable>) new $$Lambda$choprRsDTSvpwrZVpXc94jmfwE<Object>(completableSubject)));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(ojc ojc) {
        this.r.onNext(ojc);
        this.e.onComplete();
    }

    public final void a(olz olz) {
        this.f = olz;
        if (olz != null) {
            Boolean bool = this.g;
            if (bool != null) {
                this.f.g(bool.booleanValue());
                this.g = null;
            }
            this.s.a(this.r.d((Consumer<? super T>) new $$Lambda$ols$6cbzQAJYFsWtq_J4717oJUGKCXo<Object>(this)));
            this.s.a(this.n.a.a(this.o).a((Consumer<? super T>) new $$Lambda$ols$b213xIYk0c34GoNlt0iBxLjD2NU<Object>(this), (Consumer<? super Throwable>) $$Lambda$ols$DIpV8KMCU9jaC8JWWsCnSnp9ok.INSTANCE));
            this.s.a(this.p.a.a(this.o).a((Consumer<? super T>) new $$Lambda$ols$8g2psO1wwq9bLw8YtKXIucN8xs<Object>(this), (Consumer<? super Throwable>) $$Lambda$ols$tltYDmuFv_iEmWjFOXImfW7aqoU.INSTANCE));
            if (this.l.b()) {
                this.i.a(this.t);
            }
        } else {
            this.s.c();
            this.i.b(this.t);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(b bVar) {
        this.f.a(this.n.a(bVar));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Boolean bool) {
        if (bool.booleanValue()) {
            this.f.e();
        }
    }

    public final void a() {
        Completable completable;
        boolean b2 = this.l.c().b();
        if (this.l.c().d()) {
            this.b.b(this.d);
            CompositeDisposable compositeDisposable = this.a;
            if (b2) {
                completable = this.i.c();
            } else {
                completable = this.i.b();
            }
            compositeDisposable.a(completable.a((Action) $$Lambda$ols$eIXJAm0k53foNxoFWxIR2cNoAoc.INSTANCE, (Consumer<? super Throwable>) $$Lambda$ols$YkkLrF6HU25A510lq2Ma2Y2EZw.INSTANCE));
            return;
        }
        if (this.i.d()) {
            this.b.a(this.d);
        } else {
            this.b.b(this.d);
        }
        this.a.a(this.i.a(b2).a((Action) $$Lambda$ols$O1cjPxqqJJOiLitoi06QeGYWAZ0.INSTANCE, (Consumer<? super Throwable>) $$Lambda$ols$RMsHcI_g0snfqHF9fGlXtcMy3yQ.INSTANCE));
    }

    public final void b() {
        Completable completable;
        boolean h2 = this.h.a().h();
        this.b.a(this.d, h2);
        if (!h2) {
            completable = this.j.a(this.d);
        } else {
            completable = this.j.b(this.d);
        }
        this.s.a(completable.a((Action) $$Lambda$ols$1tlZBv66NapBLEAFZ0yGCK8o.INSTANCE, (Consumer<? super Throwable>) $$Lambda$ols$oxgtBxPuQHQteWW3hVQDxVp4Xeo.INSTANCE));
    }

    /* access modifiers changed from: private */
    public void a(ojc ojc) {
        String str;
        String str2;
        this.h = ojc;
        uyz a2 = ojc.a();
        String imageUri = a2.getImageUri(Size.NORMAL);
        if (!fax.a(imageUri)) {
            this.f.a(imageUri, a2.getImageUri(Size.LARGE));
        }
        this.f.a(this.l.a() && !a2.k());
        this.f.b(a2.h());
        String str3 = "";
        if (this.q.b()) {
            this.f.a(ojc, (olw) this.q.c());
        } else {
            olv olv = this.k;
            boolean e2 = this.l.e();
            boolean g2 = this.l.g();
            uyz a3 = ojc.a();
            Optional e3 = Optional.e();
            uzd d2 = a3.d();
            if (d2 != null && d2.d()) {
                e3 = Optional.c(d2.c());
            }
            Optional e4 = Optional.e();
            if (e2) {
                uzd w = a3.w();
                if (w != null && w.d()) {
                    e4 = Optional.c(w.c());
                }
            }
            ArrayList a4 = Lists.a();
            if (e4.b()) {
                a4.add(olv.a.getString(R.string.personalized_sets_subtitle_made_for, new Object[]{(String) e4.c()}));
            } else if (e3.b()) {
                a4.add(olv.a.getString(R.string.playlist_header_subtitle_owner, new Object[]{(String) e3.c()}));
            }
            int c2 = ojc.c();
            if (c2 > 0) {
                if (!a4.isEmpty()) {
                    a4.add(" • ");
                }
                if (g2) {
                    a4.add(olv.a.getResources().getQuantityString(R.plurals.playlist_header_subtitle_likes, c2, new Object[]{jsd.a(c2, Locale.getDefault())}));
                } else {
                    a4.add(olv.a.getResources().getQuantityString(R.plurals.header_playlist_followers_count, c2, new Object[]{Integer.valueOf(c2)}));
                }
            }
            if (uur.a(olv.a)) {
                Collections.reverse(a4);
            }
            String a5 = fau.a(str3).a((Iterable<?>) a4);
            this.f.c(!fax.a(a5));
            this.f.a(a5, this.l.d());
        }
        uzd d3 = a2.d();
        if (d3 != null) {
            String c3 = d3.c();
            if (c3 == null) {
                c3 = d3.b();
            }
            if (!fax.a(d3.e())) {
                str2 = d3.e();
            } else {
                str2 = d3.f();
            }
            str = c3;
        } else {
            str2 = str3;
            str = str2;
        }
        if (!fax.a(str2)) {
            this.f.b(str2);
        }
        this.f.a(a2.b(), ojc.d(), (int) ojc.e(), str);
        boolean o2 = ojc.o();
        if (!o2 || ojc.m()) {
            this.f.a(a2.a());
        } else {
            this.f.a(str3);
        }
        this.f.f(!o2);
    }

    static /* synthetic */ void a(ols ols, boolean z) {
        boolean a2 = ols.l.c().a();
        if (ols.l.c().d() || !z) {
            ols.f.d(a2);
        } else {
            ols.f.e(a2);
        }
    }
}
