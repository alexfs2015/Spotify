package defpackage;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;

/* renamed from: kws reason: default package */
public abstract class kws {
    private static final Pattern a = Pattern.compile("[\\[\\]]");
    private static final Pattern b = Pattern.compile(", ");

    public static kws a(String str, String str2, String str3, long j, String str4, String str5, long j2) {
        kwr kwr = new kwr(str, str2, str3, j, str4, str5, j2);
        return kwr;
    }

    public abstract String a();

    public abstract String b();

    public abstract String c();

    public abstract long d();

    public abstract String e();

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof kws) {
            kws kws = (kws) obj;
            return fbn.a(a(), kws.a()) && fbn.a(b(), kws.b()) && fbn.a(e(), kws.e()) && fbn.a(f(), kws.f());
        }
    }

    public abstract String f();

    public abstract long g();

    public final Set<String> h() {
        return new HashSet(Arrays.asList(b.split(a.matcher(c()).replaceAll(""))));
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{a(), b(), e(), f()});
    }
}
