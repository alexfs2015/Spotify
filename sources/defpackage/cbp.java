package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.concurrent.Callable;

/* renamed from: cbp reason: default package */
final class cbp implements Callable<SharedPreferences> {
    private final /* synthetic */ Context a;

    cbp(Context context) {
        this.a = context;
    }

    public final /* synthetic */ Object call() {
        return this.a.getSharedPreferences("google_sdk_flags", 0);
    }
}
