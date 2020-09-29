package defpackage;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;

/* renamed from: ktj reason: default package */
public abstract class ktj {
    private static final Pattern a = Pattern.compile("[\\[\\]]");
    private static final Pattern b = Pattern.compile(", ");

    public abstract String a();

    public abstract String b();

    public abstract String c();

    public abstract long d();

    public abstract String e();

    public abstract String f();

    public abstract long g();

    public static ktj a(String str, String str2, String str3, long j, String str4, String str5, long j2) {
        kti kti = new kti(str, str2, str3, j, str4, str5, j2);
        return kti;
    }

    public final Set<String> h() {
        return new HashSet(Arrays.asList(b.split(a.matcher(c()).replaceAll(""))));
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ktj) {
            ktj ktj = (ktj) obj;
            return faw.a(a(), ktj.a()) && faw.a(b(), ktj.b()) && faw.a(e(), ktj.e()) && faw.a(f(), ktj.f());
        }
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{a(), b(), e(), f()});
    }
}
