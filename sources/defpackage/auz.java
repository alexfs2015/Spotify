package defpackage;

import com.google.android.exoplayer2.ParserException;

/* renamed from: auz reason: default package */
public final class auz implements atk {
    private atm a;
    private ave b;
    private boolean c;

    static {
        $$Lambda$auz$TX4fiTZu69Tb8mYK31XWGxyq6A0 r0 = $$Lambda$auz$TX4fiTZu69Tb8mYK31XWGxyq6A0.INSTANCE;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ atk[] a() {
        return new atk[]{new auz()};
    }

    private boolean b(atl atl) {
        avb avb = new avb();
        if (avb.a(atl, true) && (avb.a & 2) == 2) {
            int min = Math.min(avb.e, 8);
            bea bea = new bea(min);
            atl.c(bea.a, 0, min);
            bea.c(0);
            if (auy.a(bea)) {
                this.b = new auy();
            } else {
                bea.c(0);
                if (avg.a(bea)) {
                    this.b = new avg();
                } else {
                    bea.c(0);
                    if (avd.a(bea)) {
                        this.b = new avd();
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final int a(atl atl, atr atr) {
        if (this.b == null) {
            if (b(atl)) {
                atl.a();
            } else {
                throw new ParserException("Failed to determine bitstream type");
            }
        }
        if (!this.c) {
            atu a2 = this.a.a(0, 1);
            this.a.a();
            this.b.a(this.a, a2);
            this.c = true;
        }
        ave ave = this.b;
        int i = ave.c;
        if (i == 0) {
            return ave.a(atl);
        }
        if (i == 1) {
            atl.b((int) ave.b);
            ave.c = 2;
            return 0;
        } else if (i == 2) {
            return ave.a(atl, atr);
        } else {
            throw new IllegalStateException();
        }
    }

    public final void a(long j, long j2) {
        ave ave = this.b;
        if (ave != null) {
            ave.a(j, j2);
        }
    }

    public final void a(atm atm) {
        this.a = atm;
    }

    public final boolean a(atl atl) {
        try {
            return b(atl);
        } catch (ParserException unused) {
            return false;
        }
    }
}
