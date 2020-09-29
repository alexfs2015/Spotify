package defpackage;

import com.google.android.exoplayer2.ParserException;

/* renamed from: aui reason: default package */
public final class aui implements ast {
    private asv a;
    private aun b;
    private boolean c;

    static {
        $$Lambda$aui$BzVvVatVWVHtNSl4Mud1CTJ_2s r0 = $$Lambda$aui$BzVvVatVWVHtNSl4Mud1CTJ_2s.INSTANCE;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ ast[] a() {
        return new ast[]{new aui()};
    }

    public final boolean a(asu asu) {
        try {
            return b(asu);
        } catch (ParserException unused) {
            return false;
        }
    }

    public final void a(asv asv) {
        this.a = asv;
    }

    public final void a(long j, long j2) {
        aun aun = this.b;
        if (aun != null) {
            aun.a(j, j2);
        }
    }

    public final int a(asu asu, ata ata) {
        if (this.b == null) {
            if (b(asu)) {
                asu.a();
            } else {
                throw new ParserException("Failed to determine bitstream type");
            }
        }
        if (!this.c) {
            atd a2 = this.a.a(0, 1);
            this.a.a();
            this.b.a(this.a, a2);
            this.c = true;
        }
        aun aun = this.b;
        int i = aun.c;
        if (i == 0) {
            return aun.a(asu);
        }
        if (i == 1) {
            asu.b((int) aun.b);
            aun.c = 2;
            return 0;
        } else if (i == 2) {
            return aun.a(asu, ata);
        } else {
            throw new IllegalStateException();
        }
    }

    private boolean b(asu asu) {
        auk auk = new auk();
        if (auk.a(asu, true) && (auk.a & 2) == 2) {
            int min = Math.min(auk.e, 8);
            bdj bdj = new bdj(min);
            asu.c(bdj.a, 0, min);
            bdj.c(0);
            if (auh.a(bdj)) {
                this.b = new auh();
            } else {
                bdj.c(0);
                if (aup.a(bdj)) {
                    this.b = new aup();
                } else {
                    bdj.c(0);
                    if (aum.a(bdj)) {
                        this.b = new aum();
                    }
                }
            }
            return true;
        }
        return false;
    }
}
