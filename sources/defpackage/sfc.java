package defpackage;

import java.util.List;
import java.util.UUID;

/* renamed from: sfc reason: default package */
public abstract class sfc {

    /* renamed from: sfc$a */
    public interface a {
        a a(long j);

        a a(String str);

        a a(List<String> list);

        sfc a();

        a b(long j);

        a b(String str);

        a c(long j);

        a c(String str);
    }

    public static sfc a(long j, String str, String str2, List<String> list, String str3) {
        a aVar = new a();
        String uuid = UUID.randomUUID().toString();
        if (uuid != null) {
            aVar.a = uuid;
            return aVar.a(j).b(0).c(0).a(list).c(str3).a(str).b(str2).a();
        }
        throw new NullPointerException("Null bannerSessionId");
    }

    public abstract String a();

    public abstract String b();

    public abstract String c();

    public abstract List<String> d();

    public abstract String e();

    public abstract long f();

    public abstract long g();

    public abstract long h();

    public abstract a i();
}