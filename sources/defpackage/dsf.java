package defpackage;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import org.json.JSONObject;

@cey
/* renamed from: dsf reason: default package */
public abstract class dsf<T> {
    final int a;
    final String b;
    final T c;

    /* synthetic */ dsf(int i, String str, Object obj, byte b2) {
        this(i, str, obj);
    }

    public static dsf<Float> a(int i, String str, float f) {
        return new dsj(i, str, Float.valueOf(f));
    }

    public static dsf<Integer> a(int i, String str, int i2) {
        return new dsh(i, str, Integer.valueOf(i2));
    }

    public static dsf<Long> a(int i, String str, long j) {
        return new dsi(i, str, Long.valueOf(j));
    }

    public static dsf<Boolean> a(int i, String str, Boolean bool) {
        return new dsg(i, str, bool);
    }

    public static dsf<String> a(int i, String str, String str2) {
        return new dsk(i, str, str2);
    }

    /* access modifiers changed from: protected */
    public abstract T a(SharedPreferences sharedPreferences);

    /* access modifiers changed from: protected */
    public abstract T a(JSONObject jSONObject);

    public abstract void a(Editor editor, T t);

    private dsf(int i, String str, T t) {
        this.a = i;
        this.b = str;
        this.c = t;
        dpn.e().a.add(this);
    }

    public static dsf<String> a(int i, String str) {
        dsf<String> a2 = a(i, str, (String) null);
        dpn.e().b.add(a2);
        return a2;
    }

    public static dsf<String> b(int i, String str) {
        dsf<String> a2 = a(i, str, (String) null);
        dpn.e().c.add(a2);
        return a2;
    }
}
