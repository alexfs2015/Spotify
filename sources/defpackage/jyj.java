package defpackage;

import android.content.Context;
import android.content.SharedPreferences.Editor;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences.b;
import java.util.Set;

/* renamed from: jyj reason: default package */
final class jyj extends SpSharedPreferences<Object> {
    private final SpSharedPreferences<Object> b;

    /* renamed from: jyj$a */
    static class a extends com.spotify.mobile.android.util.prefs.SpSharedPreferences.a<Object> {
        a(Editor editor) {
            super(editor);
        }
    }

    public jyj(Context context, SpSharedPreferences<Object> spSharedPreferences, String str) {
        super(context, str);
        this.b = spSharedPreferences;
    }

    public final int a(b<Object, Integer> bVar, int i) {
        String str = bVar.a;
        return this.a.contains(str) ? this.a.getInt(str, i) : this.a.contains("__cleared__") ? i : this.b.a.getInt(str, i);
    }

    public final long a(b<Object, Long> bVar, long j) {
        String str = bVar.a;
        return this.a.contains(str) ? this.a.getLong(str, j) : this.a.contains("__cleared__") ? j : this.b.a.getLong(str, j);
    }

    public final com.spotify.mobile.android.util.prefs.SpSharedPreferences.a<Object> a() {
        return new a(this.a.edit());
    }

    public final String a(b<Object, String> bVar, String str) {
        String str2 = bVar.a;
        return this.a.contains(str2) ? this.a.getString(str2, str) : this.a.contains("__cleared__") ? str : this.b.a.getString(str2, str);
    }

    public final Set<String> a(b<Object, Set<String>> bVar, Set<String> set) {
        String str = bVar.a;
        return this.a.contains(str) ? this.a.getStringSet(str, set) : this.a.contains("__cleared__") ? set : this.b.a.getStringSet(str, set);
    }

    public final boolean a(b<Object, Boolean> bVar) {
        return a(bVar, false);
    }

    public final boolean a(b<Object, Boolean> bVar, boolean z) {
        String str = bVar.a;
        return this.a.contains(str) ? this.a.getBoolean(str, z) : this.a.contains("__cleared__") ? z : this.b.a.getBoolean(str, z);
    }

    public final int b(b<Object, Integer> bVar) {
        return a(bVar, 0);
    }

    public final String c(b<Object, String> bVar) {
        return a(bVar, (String) null);
    }
}
