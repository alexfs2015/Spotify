package defpackage;

import android.content.SharedPreferences;
import java.util.concurrent.Callable;

/* renamed from: cca reason: default package */
final class cca implements Callable<Integer> {
    private final /* synthetic */ SharedPreferences a;
    private final /* synthetic */ String b;
    private final /* synthetic */ Integer c;

    cca(SharedPreferences sharedPreferences, String str, Integer num) {
        this.a = sharedPreferences;
        this.b = str;
        this.c = num;
    }

    public final /* synthetic */ Object call() {
        return Integer.valueOf(this.a.getInt(this.b, this.c.intValue()));
    }
}
