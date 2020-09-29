package defpackage;

import android.content.SharedPreferences;
import java.util.concurrent.Callable;

/* renamed from: cce reason: default package */
final class cce implements Callable<String> {
    private final /* synthetic */ SharedPreferences a;
    private final /* synthetic */ String b;
    private final /* synthetic */ String c;

    cce(SharedPreferences sharedPreferences, String str, String str2) {
        this.a = sharedPreferences;
        this.b = str;
        this.c = str2;
    }

    public final /* synthetic */ Object call() {
        return this.a.getString(this.b, this.c);
    }
}
