package defpackage;

import android.content.SharedPreferences;
import java.util.concurrent.Callable;

/* renamed from: cby reason: default package */
final class cby implements Callable<Boolean> {
    private final /* synthetic */ SharedPreferences a;
    private final /* synthetic */ String b;
    private final /* synthetic */ Boolean c;

    cby(SharedPreferences sharedPreferences, String str, Boolean bool) {
        this.a = sharedPreferences;
        this.b = str;
        this.c = bool;
    }

    public final /* synthetic */ Object call() {
        return Boolean.valueOf(this.a.getBoolean(this.b, this.c.booleanValue()));
    }
}
