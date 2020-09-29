package defpackage;

import com.spotify.music.lowfrictionsearch.flags.LowFrictionSearchVariant;

/* renamed from: suc reason: default package */
public final class suc {
    private final fqn a;
    private final rqb b;
    private final sye c;

    public suc(fqn fqn, rqb rqb, sye sye) {
        this.a = fqn;
        this.b = rqb;
        this.c = sye;
    }

    private boolean d() {
        if (this.b.a(this.a)) {
            sye sye = this.c;
            if (!sye.a(this.a)) {
                return true;
            }
        }
        return false;
    }

    private LowFrictionSearchVariant e() {
        return (LowFrictionSearchVariant) this.a.a(sub.a);
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
}
