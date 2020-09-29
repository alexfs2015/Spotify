package defpackage;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: uu reason: default package */
public class uu {
    private Context a;
    private SharedPreferences b;

    public uu(Context context) {
        this.a = context;
    }

    public final void a(boolean z) {
        a().edit().putBoolean("reschedule_needed", z).apply();
    }

    public SharedPreferences a() {
        SharedPreferences sharedPreferences;
        synchronized (uu.class) {
            if (this.b == null) {
                this.b = this.a.getSharedPreferences("androidx.work.util.preferences", 0);
            }
            sharedPreferences = this.b;
        }
        return sharedPreferences;
    }
}
