package defpackage;

import com.google.common.hash.Hashing;
import java.nio.charset.Charset;

/* renamed from: gfh reason: default package */
public final class gfh {
    private static Charset a = Charset.forName("UTF-8");
    private byte[] b;
    private gdm c;
    private gfa d;
    private gfj e;

    public gfh(gdm gdm, gfa gfa, gfj gfj) {
        this.c = gdm;
        this.d = gfa;
        this.e = gfj;
    }

    public final synchronized byte[] a() {
        if (this.b == null) {
            this.b = Hashing.d().a().a(this.c.a(), a).a(this.d.a(), a).a(this.e.a(), a).a().d();
        }
        return this.b;
    }
}
