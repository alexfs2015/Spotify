package defpackage;

import android.text.TextUtils;

/* renamed from: ujk reason: default package */
public abstract class ujk {
    public static final ujk a;

    /* renamed from: ujk$a */
    public interface a {
        a a(Long l);

        a a(String str);

        a a(boolean z);

        ujk a();

        a b(Long l);

        a b(String str);

        a c(Long l);
    }

    static {
        String str = "";
        a b = new a().a(str).b(str);
        Long valueOf = Long.valueOf(0);
        a = b.a(valueOf).b(valueOf).a(false).c(valueOf).a();
    }

    public static a i() {
        return new a();
    }

    public abstract String a();

    public abstract String b();

    public abstract boolean c();

    public abstract Long d();

    public abstract Long e();

    public abstract Long f();

    public abstract a g();

    public final boolean h() {
        return !TextUtils.isEmpty(a()) && (e().longValue() == 0 || !d().equals(e()));
    }
}
