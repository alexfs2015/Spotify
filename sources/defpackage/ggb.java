package defpackage;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: ggb reason: default package */
final class ggb implements gft {
    private final a a;

    /* renamed from: ggb$a */
    static class a {
        private SharedPreferences a;
        private final Context b;

        a(Context context) {
            this.b = context;
        }

        /* access modifiers changed from: 0000 */
        public final SharedPreferences a() {
            if (this.a == null) {
                this.a = this.b.getSharedPreferences("com.spotify.eventsender.shared.prefs", 0);
            }
            return this.a;
        }
    }

    ggb(a aVar) {
        this.a = aVar;
    }

    public /* synthetic */ String a(String str) {
        return CC.$default$a(this, str);
    }

    public final String a(String str, String str2) {
        return this.a.a().getString(str, null);
    }

    public final void a(String str, int i) {
        this.a.a().edit().putInt(str, i).apply();
    }

    public final int b(String str, int i) {
        return this.a.a().getInt(str, -1);
    }

    public final void b(String str, String str2) {
        this.a.a().edit().putString(str, str2).apply();
    }
}
