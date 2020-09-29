package defpackage;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: vi reason: default package */
public class vi {
    private Context a;
    private SharedPreferences b;

    public vi(Context context) {
        this.a = context;
    }

    public SharedPreferences a() {
        SharedPreferences sharedPreferences;
        synchronized (vi.class) {
            if (this.b == null) {
                this.b = this.a.getSharedPreferences("androidx.work.util.preferences", 0);
            }
            sharedPreferences = this.b;
        }
        return sharedPreferences;
    }

    public final void a(boolean z) {
        a().edit().putBoolean("reschedule_needed", z).apply();
    }
}
