package defpackage;

import com.google.common.base.Optional;
import com.google.common.collect.ImmutableList;
import com.google.thirdparty.publicsuffix.PublicSuffixType;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: feq reason: default package */
public final class feq {
    private static final fbh a = fbh.a((CharSequence) ".。．｡");
    private static final fbr b = fbr.a('.');
    private static final fbl c = fbl.a('.');
    private static final fbh h = fbh.a((CharSequence) "-_");
    private static final fbh i = fbh.e().a(h);
    private final String d;
    private final ImmutableList<String> e;
    private final int f;
    private final int g;

    private feq(String str) {
        String a2 = fbg.a(a.a((CharSequence) str, '.'));
        boolean z = true;
        if (a2.endsWith(".")) {
            a2 = a2.substring(0, a2.length() - 1);
        }
        fbp.a(a2.length() <= 253, "Domain name too long: '%s':", (Object) a2);
        this.d = a2;
        this.e = ImmutableList.a(b.a((CharSequence) a2));
        if (this.e.size() > 127) {
            z = false;
        }
        fbp.a(z, "Domain has too many parts: '%s'", (Object) a2);
        fbp.a(a((List<String>) this.e), "Not a valid domain name: '%s'", (Object) a2);
        this.f = a(Optional.e());
        this.g = a(Optional.b(PublicSuffixType.REGISTRY));
    }

    private int a(Optional<PublicSuffixType> optional) {
        int size = this.e.size();
        for (int i2 = 0; i2 < size; i2++) {
            String a2 = c.a((Iterable<?>) this.e.subList(i2, size));
            if (a(optional, Optional.c(flu.a.get(a2)))) {
                return i2;
            }
            boolean z = true;
            if (flu.c.containsKey(a2)) {
                return i2 + 1;
            }
            fbr fbr = b;
            fbp.a(true, "must be greater than zero: %s", 2);
            fbr fbr2 = new fbr(fbr.c, fbr.b, fbr.a, 2);
            fbp.a(a2);
            Iterator b2 = fbr2.b(a2);
            ArrayList arrayList = new ArrayList();
            while (b2.hasNext()) {
                arrayList.add(b2.next());
            }
            List unmodifiableList = Collections.unmodifiableList(arrayList);
            if (unmodifiableList.size() != 2 || !a(optional, Optional.c(flu.b.get(unmodifiableList.get(1))))) {
                z = false;
            }
            if (z) {
                return i2;
            }
        }
        return -1;
    }

    public static feq a(String str) {
        return new feq((String) fbp.a(str));
    }

    private static boolean a(Optional<PublicSuffixType> optional, Optional<PublicSuffixType> optional2) {
        return optional.b() ? optional.equals(optional2) : optional2.b();
    }

    private static boolean a(String str, boolean z) {
        if (str.length() > 0 && str.length() <= 63) {
            if (i.b((CharSequence) fbh.c().f(str)) && !h.b(str.charAt(0)) && !h.b(str.charAt(str.length() - 1))) {
                return !z || !fbh.d().b(str.charAt(0));
            }
        }
        return false;
    }

    private static boolean a(List<String> list) {
        int size = list.size() - 1;
        if (!a((String) list.get(size), true)) {
            return false;
        }
        for (int i2 = 0; i2 < size; i2++) {
            if (!a((String) list.get(i2), false)) {
                return false;
            }
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof feq)) {
            return false;
        }
        return this.d.equals(((feq) obj).d);
    }

    public final int hashCode() {
        return this.d.hashCode();
    }

    public final String toString() {
        return this.d;
    }
}
