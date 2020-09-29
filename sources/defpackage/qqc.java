package defpackage;

import com.google.common.collect.Sets;
import java.util.Set;

/* renamed from: qqc reason: default package */
public final class qqc {
    public Set<String> a = Sets.a(5);

    public final int a() {
        return this.a.size();
    }

    public final boolean a(String str) {
        return this.a.contains(str);
    }

    public final void b(String str) {
        this.a.add(str);
    }

    public final void c(String str) {
        this.a.remove(str);
    }
}
