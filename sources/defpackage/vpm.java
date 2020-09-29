package defpackage;

import com.google.firebase.iid.FirebaseInstanceId;
import java.util.concurrent.ExecutorService;

/* renamed from: vpm reason: default package */
public final class vpm implements wig<vpl> {
    private final wzi<FirebaseInstanceId> a;
    private final wzi<ExecutorService> b;

    private vpm(wzi<FirebaseInstanceId> wzi, wzi<ExecutorService> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static vpm a(wzi<FirebaseInstanceId> wzi, wzi<ExecutorService> wzi2) {
        return new vpm(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new vpl(this.a, this.b);
    }
}
