package defpackage;

import android.os.Parcelable;

/* renamed from: kgl reason: default package */
public abstract class kgl implements Parcelable {

    /* renamed from: kgl$a */
    public interface a {
        a a(String str);

        kgl a();

        a b(String str);

        a c(String str);

        a d(String str);

        a e(String str);

        a f(String str);

        a g(String str);

        a h(String str);
    }

    public abstract String a();

    public abstract String b();

    public abstract String c();

    public abstract String d();

    public abstract String e();

    public abstract String f();

    public abstract String g();

    public abstract String h();

    public static kgl a(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        return new a().a(str).b(str2).c(str3).d(str4).e(str5).f(str6).g(str7).h(str8).a();
    }
}
