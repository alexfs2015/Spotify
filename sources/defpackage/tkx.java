package defpackage;

import com.spotify.base.java.logging.Logger;
import java.util.Arrays;

/* renamed from: tkx reason: default package */
public final class tkx implements wue<uzy> {
    private final tlc a;
    private final tlh b;

    public final void onCompleted() {
    }

    public final /* synthetic */ void onNext(Object obj) {
        uzy uzy = (uzy) obj;
        this.b.b();
        boolean z = uzy.getUnrangedLength() == 0;
        if (!uzy.isLoading() || !z) {
            this.a.a(Arrays.asList(uzy.getItems()));
            this.a.c();
            if (z) {
                this.a.a();
            } else {
                this.a.b();
            }
            this.a.d();
        }
    }

    public tkx(tlc tlc, tlh tlh) {
        this.a = tlc;
        this.b = tlh;
    }

    public final void onError(Throwable th) {
        this.a.c();
        this.b.a();
        Logger.e("Failed to load list of shows %s", th.getMessage());
    }
}
