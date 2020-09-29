package defpackage;

import com.spotify.music.lowfrictionsearch.flags.LowFrictionSearchVariant;

/* renamed from: sjv reason: default package */
public final class sjv {
    private final fpt a;
    private final rgz b;
    private final snx c;

    public sjv(fpt fpt, rgz rgz, snx snx) {
        this.a = fpt;
        this.b = rgz;
        this.c = snx;
    }

    public final boolean a() {
        return d() && e() == LowFrictionSearchVariant.VARIANT_1;
    }

    public final boolean b() {
        return d() && e() == LowFrictionSearchVariant.VARIANT_2;
    }

    public final boolean c() {
        LowFrictionSearchVariant e = e();
        return d() && (e == LowFrictionSearchVariant.VARIANT_1 || e == LowFrictionSearchVariant.VARIANT_2);
    }

    private boolean d() {
        if (this.b.a(this.a)) {
            snx snx = this.c;
            if (!snx.a(this.a)) {
                return true;
            }
        }
        return false;
    }

    private LowFrictionSearchVariant e() {
        return (LowFrictionSearchVariant) this.a.a(sju.a);
    }
}
