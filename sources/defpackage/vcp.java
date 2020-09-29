package defpackage;

import com.google.firebase.iid.FirebaseInstanceId;
import java.util.concurrent.ExecutorService;

/* renamed from: vcp reason: default package */
public final class vcp implements vua<vco> {
    private final wlc<FirebaseInstanceId> a;
    private final wlc<ExecutorService> b;

    private vcp(wlc<FirebaseInstanceId> wlc, wlc<ExecutorService> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static vcp a(wlc<FirebaseInstanceId> wlc, wlc<ExecutorService> wlc2) {
        return new vcp(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new vco(this.a, this.b);
    }
}
