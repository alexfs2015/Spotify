package defpackage;

import com.google.common.hash.Hashing;
import java.nio.charset.Charset;

/* renamed from: ggs reason: default package */
public final class ggs {
    private static Charset a = Charset.forName("UTF-8");
    private byte[] b;
    private gex c;
    private ggl d;
    private ggu e;

    public ggs(gex gex, ggl ggl, ggu ggu) {
        this.c = gex;
        this.d = ggl;
        this.e = ggu;
    }

    public final synchronized byte[] a() {
        if (this.b == null) {
            this.b = Hashing.d().a().a(this.c.a(), a).a(this.d.a(), a).a(this.e.a(), a).a().d();
        }
        return this.b;
    }
}
