package defpackage;

import com.spotify.base.java.logging.Logger;
import java.util.Arrays;

/* renamed from: twp reason: default package */
public final class twp implements xij<vmm> {
    private final twu a;
    private final twz b;

    public twp(twu twu, twz twz) {
        this.a = twu;
        this.b = twz;
    }

    public final void onCompleted() {
    }

    public final void onError(Throwable th) {
        this.a.c();
        this.b.a();
        Logger.e("Failed to load list of shows %s", th.getMessage());
    }

    public final /* synthetic */ void onNext(Object obj) {
        vmm vmm = (vmm) obj;
        this.b.b();
        boolean z = vmm.getUnrangedLength() == 0;
        if (!vmm.isLoading() || !z) {
            this.a.a(Arrays.asList(vmm.getItems()));
            this.a.c();
            if (z) {
                this.a.a();
            } else {
                this.a.b();
            }
            this.a.d();
        }
    }
}
