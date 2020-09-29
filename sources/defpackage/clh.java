package defpackage;

import android.content.Context;
import java.util.concurrent.Callable;

/* renamed from: clh reason: default package */
final /* synthetic */ class clh implements Callable {
    private final clg a;
    private final Context b;

    clh(clg clg, Context context) {
        this.a = clg;
        this.b = context;
    }

    public final Object call() {
        return (String) this.a.a("getAppInstanceId", this.b);
    }
}
