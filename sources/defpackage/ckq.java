package defpackage;

import android.content.Context;
import java.util.concurrent.Callable;

/* renamed from: ckq reason: default package */
final /* synthetic */ class ckq implements Callable {
    private final ckp a;
    private final Context b;

    ckq(ckp ckp, Context context) {
        this.a = ckp;
        this.b = context;
    }

    public final Object call() {
        return (String) this.a.a("getAppInstanceId", this.b);
    }
}
