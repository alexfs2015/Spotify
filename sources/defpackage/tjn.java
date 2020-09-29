package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack.Metadata;
import com.spotify.music.features.playlistentity.configuration.ItemListConfiguration;
import com.spotify.music.feedback.FeedbackValue;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposables;
import io.reactivex.disposables.SerialDisposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Consumer;
import io.reactivex.subjects.BehaviorSubject;
import io.reactivex.subjects.CompletableSubject;
import java.util.List;

/* renamed from: tjn reason: default package */
final class tjn implements jmf<ooa>, tke {
    final CompositeDisposable a = new CompositeDisposable();
    oqq b;
    final oni c;
    final CompletableSubject d = CompletableSubject.f();
    private final ItemListConfiguration e;
    private final a f;
    private final heg g;
    private final String h;
    private final BehaviorSubject<ho<ojb, ojc>> i = BehaviorSubject.a();
    private final SerialDisposable j = new SerialDisposable();
    private tjj k;
    private final rbg l;

    /* access modifiers changed from: private */
    public static /* synthetic */ void a() {
    }

    public final void e(int i2, uzb uzb) {
    }

    public final /* synthetic */ jms onCreateContextMenu(Object obj) {
        return this.c.a((ooa) obj);
    }

    public tjn(a aVar, heg heg, a aVar2, rbg rbg, String str, ItemListConfiguration itemListConfiguration) {
        this.e = itemListConfiguration;
        this.f = aVar;
        this.c = aVar2.a(itemListConfiguration);
        this.g = heg;
        this.l = rbg;
        this.h = str;
    }

    public final void a(a aVar) {
        this.b = this.f.a(aVar.a());
        this.a.c();
        CompositeDisposable compositeDisposable = this.a;
        Observable a2 = Observable.a((ObservableSource<? extends T1>) aVar.b().b(), (ObservableSource<? extends T2>) aVar.b().c(), (BiFunction<? super T1, ? super T2, ? extends R>) $$Lambda$VXu11YQ9u2WEimH2XJKkQl3hTqY.INSTANCE).a(AndroidSchedulers.a());
        $$Lambda$tjn$TfSgM1jV6pH4AkRjld6_rLNky2M r2 = new $$Lambda$tjn$TfSgM1jV6pH4AkRjld6_rLNky2M(this);
        CompletableSubject completableSubject = this.d;
        completableSubject.getClass();
        compositeDisposable.a(a2.a((Consumer<? super T>) r2, (Consumer<? super Throwable>) new $$Lambda$choprRsDTSvpwrZVpXc94jmfwE<Object>(completableSubject)));
        this.c.a(aVar);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(ho hoVar) {
        this.i.onNext(hoVar);
        this.d.onComplete();
    }

    public final void a(tjj tjj) {
        this.k = tjj;
        this.c.a((onu) tjj);
        if (tjj != null) {
            this.j.a(this.i.d((Consumer<? super T>) new $$Lambda$tjn$8OaDG3KLBKCMooqW_T7WXBgptb8<Object>(this)));
        } else {
            this.j.a(Disposables.a());
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(ho hoVar) {
        ojb ojb = (ojb) fay.a(hoVar.a);
        ojc ojc = (ojc) fay.a(hoVar.b);
        List a2 = ojb.a();
        this.k.a(ojc.a(), a2);
        this.b.a(a2, this.e.j(), this.e.h(), this.e.i(), this.e.k(), this.e.l(), 0, new $$Lambda$tjn$szEZYXYkiP2VfG0E3MyRYCX0itM(this));
    }

    public final void a(int i2, uzb uzb) {
        this.c.a(i2, uzb);
    }

    public final void b(int i2, uzb uzb) {
        uzc b2 = uzb.b();
        if (b2 != null) {
            this.c.a(i2, uzb, b2.inCollection(), true);
        }
    }

    public final void c(int i2, uzb uzb) {
        String str;
        if (FeedbackValue.ON == FeedbackValue.a((String) uzb.c().get(Metadata.DISLIKE_FEEDBACK_SELECTED))) {
            String str2 = "feedback_uri";
            if (uzb.c().containsKey(str2)) {
                str = (String) uzb.c().get(str2);
            } else {
                str = uzb.getUri();
            }
            this.a.a(this.l.a(str, this.h, uzb.getUri(), "").a(this.g.c()).a((Action) $$Lambda$tjn$nIzAHaQDT6VnKaISBwvH2APixBY.INSTANCE, (Consumer<? super Throwable>) $$Lambda$UuJCr4f1t6RMc8EbyiGeQ5J0UYE.INSTANCE));
            return;
        }
        uzc b2 = uzb.b();
        if (b2 != null) {
            this.c.b(i2, uzb, b2.isBanned(), true);
        }
    }

    public final void d(int i2, uzb uzb) {
        this.c.b(i2, uzb);
    }

    public final void a(int i2, uzb uzb, boolean z) {
        this.c.a(i2, uzb, z);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Integer num) {
        num.intValue();
    }
}
