package defpackage;

import android.text.TextUtils;

/* renamed from: txh reason: default package */
public abstract class txh {
    public static final txh a;

    /* renamed from: txh$a */
    public interface a {
        a a(Long l);

        a a(String str);

        a a(boolean z);

        txh a();

        a b(Long l);

        a b(String str);

        a c(Long l);
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

    public static a i() {
        return new a();
    }

    static {
        String str = "";
        a b = new a().a(str).b(str);
        Long valueOf = Long.valueOf(0);
        a = b.a(valueOf).b(valueOf).a(false).c(valueOf).a();
    }
}
