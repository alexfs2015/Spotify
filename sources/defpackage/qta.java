package defpackage;

import com.spotify.music.features.yourlibrary.musicpages.domain.MusicPagesModel;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.Functions;
import io.reactivex.subjects.PublishSubject;

/* renamed from: qta reason: default package */
public final class qta implements kjd<MusicPagesModel, qwj> {
    /* access modifiers changed from: private */
    public static final a a = $$Lambda$qta$3e4v0nsSDX1YHrhk5EL2nrcsBos.INSTANCE;
    /* access modifiers changed from: private */
    public static final b b = $$Lambda$qta$aUI7Vk1roxGnO8hmcM1y2oXoVaE.INSTANCE;
    /* access modifiers changed from: private */
    public final uqe c;
    /* access modifiers changed from: private */
    public final defpackage.sih.a d;
    private final qvz e;
    /* access modifiers changed from: private */
    public uqg f = uqg.g();
    /* access modifiers changed from: private */
    public a g;
    /* access modifiers changed from: private */
    public a h;
    /* access modifiers changed from: private */
    public b i;

    /* renamed from: qta$a */
    interface a {
        void onMenuItemClicked();
    }

    /* renamed from: qta$b */
    interface b {
        void onMenuItemToggleClicked(defpackage.uqg.b bVar);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(defpackage.uqg.b bVar) {
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void d() {
    }

    public qta(uqe uqe, defpackage.sih.a aVar, qvz qvz) {
        a aVar2 = a;
        this.g = aVar2;
        this.h = aVar2;
        this.i = b;
        this.c = uqe;
        this.d = aVar;
        this.e = qvz;
    }

    public final kje<MusicPagesModel> connect(kkn<qwj> kkn) {
        this.g = new $$Lambda$qta$2aTnZTsBH1wLzcGdoTaJQMMdi9k(kkn);
        this.h = new $$Lambda$qta$IgzENZLvGToXKgZov3ZS3jzX_B0(kkn);
        this.i = new $$Lambda$qta$Q3D9EtaJ23B2C0kG5suvujLkKOg(kkn);
        final PublishSubject a2 = PublishSubject.a();
        final Disposable a3 = a2.c((Function<? super T, ? extends R>) $$Lambda$QNAqZS9Qx4BlvCUa_n6JAbJ6WSk.INSTANCE).a(Functions.a()).a((Consumer<? super T>) new $$Lambda$qta$GFgeqBYhVxrsfIFEAga1X0yCg<Object>(this), (Consumer<? super Throwable>) $$Lambda$qta$psQlQiAWPgJae_oRh7VgYjMIHYY.INSTANCE);
        return new kje<MusicPagesModel>() {
            public final /* synthetic */ void accept(Object obj) {
                a2.onNext((MusicPagesModel) obj);
            }

            public final void dispose() {
                qta.this.g = qta.a;
                qta.this.h = qta.a;
                qta.this.i = qta.b;
                a3.bf_();
            }
        };
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(uqg uqg) {
        this.f = uqg;
        this.e.ak();
    }

    public final fyw a() {
        return new fyw() {
            public final void a(fyt fyt) {
                qta.this.c;
                uqg a2 = qta.this.f;
                AnonymousClass1 r1 = new defpackage.uqe.a() {
                    public final void a() {
                        qta.this.g.onMenuItemClicked();
                    }

                    public final void b() {
                        qta.this.h.onMenuItemClicked();
                    }

                    public final void a(defpackage.uqg.b bVar) {
                        qta.this.i.onMenuItemToggleClicked(bVar);
                    }
                };
                fdh R_ = a2.e().R_();
                while (R_.hasNext()) {
                    uqe.a(fyt, (defpackage.uqg.b) R_.next(), (defpackage.uqe.a) r1);
                }
                if (a2.c()) {
                    uqe.b(fyt, a2.d(), r1);
                }
                if (a2.a()) {
                    uqe.a(fyt, a2.b(), (defpackage.uqe.a) r1);
                }
            }

            public final sih ae_() {
                return qta.this.d.ae_();
            }
        };
    }
}
