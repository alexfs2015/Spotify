package defpackage;

import com.google.common.base.Optional;
import com.google.common.collect.Lists;
import com.spotify.music.R;
import com.spotify.playlist.models.Covers.Size;
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

/* renamed from: osw reason: default package */
class osw {
    final CompositeDisposable a = new CompositeDisposable();
    final oss b;
    final szp c;
    final String d;
    final CompletableSubject e = CompletableSubject.f();
    otd f;
    Boolean g;
    oqg h;
    private oyl i;
    private final vjv j;
    private final osz k;
    private final ook l;
    private final opw m;
    private final oml n;
    private final Scheduler o;
    private final Optional<ota> p;
    private final BehaviorSubject<oqg> q = BehaviorSubject.a();
    private final CompositeDisposable r = new CompositeDisposable();
    private final a s = new a() {
        public final void a(String str, boolean z) {
        }

        public final void a(boolean z) {
            osw.a(osw.this, z);
        }
    };

    public osw(opw opw, oss oss, szp szp, vjv vjv, osz osz, oml oml, String str, Scheduler scheduler, ook ook, Optional<ota> optional) {
        this.b = oss;
        this.c = szp;
        this.j = vjv;
        this.k = osz;
        this.l = ook;
        this.d = str;
        this.m = opw;
        this.n = oml;
        this.o = scheduler;
        this.p = optional;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(b bVar) {
        this.f.a(this.n.a(bVar));
    }

    /* access modifiers changed from: private */
    public void a(oqg oqg) {
        String str;
        String str2;
        this.h = oqg;
        vlc a2 = oqg.a();
        String imageUri = a2.getImageUri(Size.NORMAL);
        if (!fbo.a(imageUri)) {
            this.f.a(imageUri, a2.getImageUri(Size.LARGE));
        }
        this.f.a(this.l.a() && !a2.k());
        this.f.b(a2.h());
        String str3 = "";
        if (this.p.b()) {
            this.f.a(oqg, (ota) this.p.c());
        } else {
            osz osz = this.k;
            boolean e2 = this.l.e();
            boolean g2 = this.l.g();
            vlc a3 = oqg.a();
            Optional e3 = Optional.e();
            vlg d2 = a3.d();
            if (d2 != null && d2.d()) {
                e3 = Optional.c(d2.c());
            }
            Optional e4 = Optional.e();
            if (e2) {
                vlg w = a3.w();
                if (w != null && w.d()) {
                    e4 = Optional.c(w.c());
                }
            }
            ArrayList a4 = Lists.a();
            if (e4.b()) {
                a4.add(osz.a.getString(R.string.personalized_sets_subtitle_made_for, new Object[]{(String) e4.c()}));
            } else if (e3.b()) {
                a4.add(osz.a.getString(R.string.playlist_header_subtitle_owner, new Object[]{(String) e3.c()}));
            }
            int c2 = oqg.c();
            if (c2 > 0) {
                if (!a4.isEmpty()) {
                    a4.add(" • ");
                }
                if (g2) {
                    a4.add(osz.a.getResources().getQuantityString(R.plurals.playlist_header_subtitle_likes, c2, new Object[]{jun.a(c2, Locale.getDefault())}));
                } else {
                    a4.add(osz.a.getResources().getQuantityString(R.plurals.header_playlist_followers_count, c2, new Object[]{Integer.valueOf(c2)}));
                }
            }
            if (vgi.a(osz.a)) {
                Collections.reverse(a4);
            }
            String a5 = fbl.a(str3).a((Iterable<?>) a4);
            this.f.c(!fbo.a(a5));
            this.f.a(a5, this.l.d());
        }
        vlg d3 = a2.d();
        if (d3 != null) {
            String c3 = d3.c();
            if (c3 == null) {
                c3 = d3.b();
            }
            str2 = !fbo.a(d3.e()) ? d3.e() : d3.f();
            str = c3;
        } else {
            str2 = str3;
            str = str2;
        }
        if (!fbo.a(str2)) {
            this.f.b(str2);
        }
        this.f.a(a2.b(), oqg.d(), (int) oqg.e(), str);
        boolean o2 = oqg.o();
        if (!o2 || oqg.m()) {
            this.f.a(a2.a());
        } else {
            this.f.a(str3);
        }
        this.f.f(!o2);
    }

    static /* synthetic */ void a(osw osw, boolean z) {
        boolean a2 = osw.l.c().a();
        if (osw.l.c().d() || !z) {
            osw.f.d(a2);
        } else {
            osw.f.e(a2);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(oqg oqg) {
        this.q.onNext(oqg);
        this.e.onComplete();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void c() {
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void d() {
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void e() {
    }

    public final void a() {
        boolean b2 = this.l.c().b();
        if (this.l.c().d()) {
            this.b.b(this.d);
            this.a.a((b2 ? this.i.c() : this.i.b()).a((Action) $$Lambda$osw$Pn8_2I1MGFcVXn9AQOA0Gy_9BmM.INSTANCE, (Consumer<? super Throwable>) $$Lambda$osw$pR7rKcURvC2TylWnEtkMW4gz0XQ.INSTANCE));
            return;
        }
        if (this.i.d()) {
            this.b.a(this.d);
        } else {
            this.b.b(this.d);
        }
        this.a.a(this.i.a(b2).a((Action) $$Lambda$osw$EZGfka1rA5diALFaHqPrZ5yhyOg.INSTANCE, (Consumer<? super Throwable>) $$Lambda$osw$2Ppf6Kv4ElspydnMtIZHXf94KJs.INSTANCE));
    }

    public final void a(a aVar) {
        this.i = aVar.a();
        this.a.c();
        CompositeDisposable compositeDisposable = this.a;
        Observable c2 = aVar.b().c();
        opw opw = this.m;
        opw.getClass();
        Observable a2 = c2.a((BiPredicate<? super T, ? super T>) new $$Lambda$NOnjttzPKmBGTL4ar_lrEjmVub8<Object,Object>(opw)).a(this.o);
        $$Lambda$osw$hO1lC5N33RCP2UvAAap86QV5pWY r1 = new $$Lambda$osw$hO1lC5N33RCP2UvAAap86QV5pWY(this);
        CompletableSubject completableSubject = this.e;
        completableSubject.getClass();
        compositeDisposable.a(a2.a((Consumer<? super T>) r1, (Consumer<? super Throwable>) new $$Lambda$choprRsDTSvpwrZVpXc94jmfwE<Object>(completableSubject)));
    }

    public final void a(otd otd) {
        this.f = otd;
        if (otd != null) {
            Boolean bool = this.g;
            if (bool != null) {
                this.f.g(bool.booleanValue());
                this.g = null;
            }
            this.r.a(this.q.d((Consumer<? super T>) new $$Lambda$osw$7aJyjhW0FkVA4to1RiyRGc2uYY<Object>(this)));
            this.r.a(this.n.a.a(this.o).a((Consumer<? super T>) new $$Lambda$osw$gOyjmUTbkhto3CLvKqgkzFUqsVA<Object>(this), (Consumer<? super Throwable>) $$Lambda$osw$xUrLiaQs3bSnEf2NfQnD6OojmSU.INSTANCE));
            if (this.l.b()) {
                this.i.a(this.s);
            }
        } else {
            this.r.c();
            this.i.b(this.s);
        }
    }

    public final void b() {
        boolean h2 = this.h.a().h();
        this.b.a(this.d, h2);
        this.r.a((!h2 ? this.j.a(this.d) : this.j.b(this.d)).a((Action) $$Lambda$osw$IMiOlNkYrOPHelnZvG6lCq18m5s.INSTANCE, (Consumer<? super Throwable>) $$Lambda$osw$47n7caDqLjNAktJUJhNlqse4Ppg.INSTANCE));
    }
}
