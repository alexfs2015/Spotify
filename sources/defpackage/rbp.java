package defpackage;

import com.spotify.music.features.yourlibrary.musicpages.domain.MusicPagesModel;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.Functions;
import io.reactivex.subjects.PublishSubject;

/* renamed from: rbp reason: default package */
public final class rbp implements kmm<MusicPagesModel, rey> {
    /* access modifiers changed from: private */
    public static final a a = $$Lambda$rbp$E4PCJ37cNslYhg08YZBXcA0k0.INSTANCE;
    /* access modifiers changed from: private */
    public static final b b = $$Lambda$rbp$0c5j8hC0KP6etl7Pt5jkyZO1E4g.INSTANCE;
    /* access modifiers changed from: private */
    public final vbj c;
    /* access modifiers changed from: private */
    public final defpackage.sso.a d;
    private final reo e;
    /* access modifiers changed from: private */
    public vbl f = vbl.g();
    /* access modifiers changed from: private */
    public a g;
    /* access modifiers changed from: private */
    public a h;
    /* access modifiers changed from: private */
    public b i;

    /* renamed from: rbp$a */
    interface a {
        void onMenuItemClicked();
    }

    /* renamed from: rbp$b */
    interface b {
        void onMenuItemToggleClicked(defpackage.vbl.b bVar);
    }

    public rbp(vbj vbj, defpackage.sso.a aVar, reo reo) {
        a aVar2 = a;
        this.g = aVar2;
        this.h = aVar2;
        this.i = b;
        this.c = vbj;
        this.d = aVar;
        this.e = reo;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(defpackage.vbl.b bVar) {
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(vbl vbl) {
        this.f = vbl;
        this.e.ak();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void d() {
    }

    public final fzq a() {
        return new fzq() {
            public final void a(fzn fzn) {
                rbp.this.c;
                vbl a2 = rbp.this.f;
                AnonymousClass1 r1 = new defpackage.vbj.a() {
                    public final void a() {
                        rbp.this.g.onMenuItemClicked();
                    }

                    public final void a(defpackage.vbl.b bVar) {
                        rbp.this.i.onMenuItemToggleClicked(bVar);
                    }

                    public final void b() {
                        rbp.this.h.onMenuItemClicked();
                    }
                };
                fdz R_ = a2.e().R_();
                while (R_.hasNext()) {
                    vbj.a(fzn, (defpackage.vbl.b) R_.next(), (defpackage.vbj.a) r1);
                }
                if (a2.c()) {
                    vbj.b(fzn, a2.d(), r1);
                }
                if (a2.a()) {
                    vbj.a(fzn, a2.b(), (defpackage.vbj.a) r1);
                }
            }

            public final sso ae_() {
                return rbp.this.d.ae_();
            }
        };
    }

    public final kmn<MusicPagesModel> connect(knw<rey> knw) {
        this.g = new $$Lambda$rbp$YrsnDQkDhMu8gCyxsqlRQ3MXbcU(knw);
        this.h = new $$Lambda$rbp$vtMJQTSmgF2gVok5FPMHvNuIX8(knw);
        this.i = new $$Lambda$rbp$Y3iSI9Fox924CKoJvqfq3OwSjrY(knw);
        final PublishSubject a2 = PublishSubject.a();
        final Disposable a3 = a2.c((Function<? super T, ? extends R>) $$Lambda$OrDjHO72jGFyaYRR2sEX3BDHPRc.INSTANCE).a(Functions.a()).a((Consumer<? super T>) new $$Lambda$rbp$tCHCJad9bV4kFEQjPI6tyDQb7ZE<Object>(this), (Consumer<? super Throwable>) $$Lambda$rbp$mE18r3d3ziaMqGhAEJIZd1fDGgo.INSTANCE);
        return new kmn<MusicPagesModel>() {
            public final /* synthetic */ void accept(Object obj) {
                a2.onNext((MusicPagesModel) obj);
            }

            public final void dispose() {
                rbp.this.g = rbp.a;
                rbp.this.h = rbp.a;
                rbp.this.i = rbp.b;
                a3.bd_();
            }
        };
    }
}
