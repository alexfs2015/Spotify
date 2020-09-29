package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.concurrent.Callable;

/* renamed from: ccg reason: default package */
final class ccg implements Callable<SharedPreferences> {
    private final /* synthetic */ Context a;

    ccg(Context context) {
        this.a = context;
    }

    public final /* synthetic */ Object call() {
        return this.a.getSharedPreferences("google_sdk_flags", 0);
    }
}
