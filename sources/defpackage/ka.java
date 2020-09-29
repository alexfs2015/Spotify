package defpackage;

/* renamed from: ka reason: default package */
public final class ka extends jy<ka> {
    public kb k = null;
    private float l = Float.MAX_VALUE;
    private boolean m = false;

    public <K> ka(K k2, jz<K> jzVar) {
        super(k2, jzVar);
    }

    public final void a() {
        kb kbVar = this.k;
        if (kbVar != null) {
            double d = (double) ((float) kbVar.c);
            if (d > ((double) this.h)) {
                throw new UnsupportedOperationException("Final position of the spring cannot be greater than the max value.");
            } else if (d >= ((double) this.i)) {
                kb kbVar2 = this.k;
                kbVar2.a = Math.abs((double) (this.j * 0.75f));
                kbVar2.b = kbVar2.a * 62.5d;
                super.a();
            } else {
                throw new UnsupportedOperationException("Final position of the spring cannot be less than the min value.");
            }
        } else {
            throw new UnsupportedOperationException("Incomplete SpringAnimation: Either final position or a spring force needs to be set.");
        }
    }

    public final void a(float f) {
        if (this.g) {
            this.l = f;
            return;
        }
        if (this.k == null) {
            this.k = new kb(f);
        }
        this.k.c = (double) f;
        a();
    }

    /* access modifiers changed from: 0000 */
    public final boolean b(long j) {
        if (this.l != Float.MAX_VALUE) {
            long j2 = j / 2;
            a a = this.k.a((double) this.f, (double) this.e, j2);
            kb kbVar = this.k;
            kbVar.c = (double) this.l;
            this.l = Float.MAX_VALUE;
            a a2 = kbVar.a((double) a.a, (double) a.b, j2);
            this.f = a2.a;
            this.e = a2.b;
        } else {
            a a3 = this.k.a((double) this.f, (double) this.e, j);
            this.f = a3.a;
            this.e = a3.b;
        }
        this.f = Math.max(this.f, this.i);
        this.f = Math.min(this.f, this.h);
        float f = this.f;
        float f2 = this.e;
        kb kbVar2 = this.k;
        if (!(((double) Math.abs(f2)) < kbVar2.b && ((double) Math.abs(f - ((float) kbVar2.c))) < kbVar2.a)) {
            return false;
        }
        this.f = (float) this.k.c;
        this.e = 0.0f;
        return true;
    }
}
