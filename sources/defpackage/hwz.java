package defpackage;

import com.spotify.mobile.android.service.offlinesync.OfflineProgressModel;

/* renamed from: hwz reason: default package */
public final class hwz implements c {
    private final hww a;
    private final hxa b;

    public hwz(hww hww, hxa hxa) {
        this.a = hww;
        this.b = hxa;
    }

    public final void ai_() {
        this.a.a(this.b);
        hww hww = this.a;
        hhf.a(hww.c);
        hww.c = hww.b.a((xij<? super T>) new xij<OfflineProgressModel>() {
            public final void onCompleted() {
                hww.a(hww.this, hww.a);
            }

            public final void onError(Throwable th) {
                hww.a(hww.this, hww.a);
            }

            public final /* synthetic */ void onNext(Object obj) {
                hww.a(hww.this, (OfflineProgressModel) obj);
            }
        });
    }

    public final void aj_() {
        hhf.a(this.a.c);
        this.a.b(this.b);
    }

    public final String c() {
        return "OfflineSync";
    }
}
