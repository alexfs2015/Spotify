package defpackage;

import com.spotify.mobile.android.service.offlinesync.OfflineProgressModel;

/* renamed from: hun reason: default package */
public final class hun implements c {
    private final huk a;
    private final huo b;

    public final String c() {
        return "OfflineSync";
    }

    public hun(huk huk, huo huo) {
        this.a = huk;
        this.b = huo;
    }

    public final void ai_() {
        this.a.a(this.b);
        huk huk = this.a;
        hej.a(huk.c);
        huk.c = huk.b.a((wue<? super T>) new wue<OfflineProgressModel>() {
            public final /* synthetic */ void onNext(Object obj) {
                huk.a(huk.this, (OfflineProgressModel) obj);
            }

            public final void onCompleted() {
                huk.a(huk.this, huk.a);
            }

            public final void onError(Throwable th) {
                huk.a(huk.this, huk.a);
            }
        });
    }

    public final void aj_() {
        hej.a(this.a.c);
        this.a.b(this.b);
    }
}
