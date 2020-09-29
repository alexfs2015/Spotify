package defpackage;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import org.json.JSONObject;

@cfp
/* renamed from: dsw reason: default package */
public abstract class dsw<T> {
    final int a;
    final String b;
    final T c;

    private dsw(int i, String str, T t) {
        this.a = i;
        this.b = str;
        this.c = t;
        dqe.e().a.add(this);
    }

    /* synthetic */ dsw(int i, String str, Object obj, byte b2) {
        this(i, str, obj);
    }

    public static dsw<String> a(int i, String str) {
        dsw<String> a2 = a(i, str, (String) null);
        dqe.e().b.add(a2);
        return a2;
    }

    public static dsw<Float> a(int i, String str, float f) {
        return new dta(i, str, Float.valueOf(f));
    }

    public static dsw<Integer> a(int i, String str, int i2) {
        return new dsy(i, str, Integer.valueOf(i2));
    }

    public static dsw<Long> a(int i, String str, long j) {
        return new dsz(i, str, Long.valueOf(j));
    }

    public static dsw<Boolean> a(int i, String str, Boolean bool) {
        return new dsx(i, str, bool);
    }

    public static dsw<String> a(int i, String str, String str2) {
        return new dtb(i, str, str2);
    }

    public static dsw<String> b(int i, String str) {
        dsw<String> a2 = a(i, str, (String) null);
        dqe.e().c.add(a2);
        return a2;
    }

    /* access modifiers changed from: protected */
    public abstract T a(SharedPreferences sharedPreferences);

    /* access modifiers changed from: protected */
    public abstract T a(JSONObject jSONObject);

    public abstract void a(Editor editor, T t);
}
