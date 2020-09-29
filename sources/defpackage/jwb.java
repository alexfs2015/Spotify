package defpackage;

import android.content.Context;
import android.content.SharedPreferences.Editor;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences.b;
import java.util.Set;

/* renamed from: jwb reason: default package */
final class jwb extends SpSharedPreferences<Object> {
    private final SpSharedPreferences<Object> b;

    /* renamed from: jwb$a */
    static class a extends com.spotify.mobile.android.util.prefs.SpSharedPreferences.a<Object> {
        a(Editor editor) {
            super(editor);
        }
    }

    public jwb(Context context, SpSharedPreferences<Object> spSharedPreferences, String str) {
        super(context, str);
        this.b = spSharedPreferences;
    }

    public final boolean a(b<Object, Boolean> bVar) {
        return a(bVar, false);
    }

    public final String c(b<Object, String> bVar) {
        return a(bVar, (String) null);
    }

    public final int b(b<Object, Integer> bVar) {
        return a(bVar, 0);
    }

    public final com.spotify.mobile.android.util.prefs.SpSharedPreferences.a<Object> a() {
        return new a(this.a.edit());
    }

    public final boolean a(b<Object, Boolean> bVar, boolean z) {
        String str = bVar.a;
        if (this.a.contains(str)) {
            return this.a.getBoolean(str, z);
        }
        if (this.a.contains("__cleared__")) {
            return z;
        }
        return this.b.a.getBoolean(str, z);
    }

    public final String a(b<Object, String> bVar, String str) {
        String str2 = bVar.a;
        if (this.a.contains(str2)) {
            return this.a.getString(str2, str);
        }
        if (this.a.contains("__cleared__")) {
            return str;
        }
        return this.b.a.getString(str2, str);
    }

    public final int a(b<Object, Integer> bVar, int i) {
        String str = bVar.a;
        if (this.a.contains(str)) {
            return this.a.getInt(str, i);
        }
        if (this.a.contains("__cleared__")) {
            return i;
        }
        return this.b.a.getInt(str, i);
    }

    public final long a(b<Object, Long> bVar, long j) {
        String str = bVar.a;
        if (this.a.contains(str)) {
            return this.a.getLong(str, j);
        }
        if (this.a.contains("__cleared__")) {
            return j;
        }
        return this.b.a.getLong(str, j);
    }

    public final Set<String> a(b<Object, Set<String>> bVar, Set<String> set) {
        String str = bVar.a;
        if (this.a.contains(str)) {
            return this.a.getStringSet(str, set);
        }
        if (this.a.contains("__cleared__")) {
            return set;
        }
        return this.b.a.getStringSet(str, set);
    }
}
