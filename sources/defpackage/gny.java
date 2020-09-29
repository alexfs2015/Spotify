package defpackage;

import com.spotify.accountrecovery.api.models.MagicLinkRequestBody;
import io.reactivex.Scheduler;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;

/* renamed from: gny reason: default package */
public final class gny {
    public final CompositeDisposable a = new CompositeDisposable();
    private final ghm b;
    private final Scheduler c;

    /* renamed from: gny$a */
    public interface a {
        void a();

        void a(int i);

        void b();

        void c();

        void d();
    }

    public gny(Scheduler scheduler, ghm ghm) {
        this.c = scheduler;
        this.b = ghm;
    }

    public final void a(String str, final a aVar) {
        ((fot) this.b.a(fot.class)).a(MagicLinkRequestBody.create(str, MagicLinkRequestBody.TEMPLATE_EMAIL)).a(this.c).b((SingleObserver<? super T>) new SingleObserver<wsj<String>>() {
            public final /* synthetic */ void c_(Object obj) {
                wsj wsj = (wsj) obj;
                if (wsj.a()) {
                    aVar.a();
                } else if (wsj.a.c == 429) {
                    aVar.c();
                } else if (wsj.a.c == 404) {
                    aVar.d();
                } else {
                    aVar.a(wsj.a.c);
                }
            }

            public final void onSubscribe(Disposable disposable) {
                gny.this.a.a(disposable);
            }

            public final void onError(Throwable th) {
                aVar.b();
            }
        });
    }
}
