package defpackage;

import com.spotify.accountrecovery.api.models.MagicLinkRequestBody;
import io.reactivex.Scheduler;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;

/* renamed from: gpn reason: default package */
public final class gpn {
    public final CompositeDisposable a = new CompositeDisposable();
    private final gix b;
    private final Scheduler c;

    /* renamed from: gpn$a */
    public interface a {
        void a();

        void a(int i);

        void b();

        void c();

        void d();
    }

    public gpn(Scheduler scheduler, gix gix) {
        this.c = scheduler;
        this.b = gix;
    }

    public final void a(String str, final a aVar) {
        ((fpn) this.b.a(fpn.class)).a(MagicLinkRequestBody.create(str, MagicLinkRequestBody.TEMPLATE_EMAIL)).a(this.c).b((SingleObserver<? super T>) new SingleObserver<xgo<String>>() {
            public final /* synthetic */ void c_(Object obj) {
                xgo xgo = (xgo) obj;
                if (xgo.a()) {
                    aVar.a();
                } else if (xgo.a.c == 429) {
                    aVar.c();
                } else if (xgo.a.c == 404) {
                    aVar.d();
                } else {
                    aVar.a(xgo.a.c);
                }
            }

            public final void onError(Throwable th) {
                aVar.b();
            }

            public final void onSubscribe(Disposable disposable) {
                gpn.this.a.a(disposable);
            }
        });
    }
}
