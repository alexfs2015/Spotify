package defpackage;

import com.google.android.exoplayer2.ParserException;
import java.io.EOFException;

/* renamed from: auk reason: default package */
final class auk {
    private static final int g = bdw.g("OggS");
    public int a;
    public long b;
    public int c;
    public int d;
    public int e;
    public final int[] f = new int[255];
    private int h;
    private long i;
    private long j;
    private long k;
    private final bdj l = new bdj(255);

    auk() {
    }

    public final void a() {
        this.h = 0;
        this.a = 0;
        this.b = 0;
        this.i = 0;
        this.j = 0;
        this.k = 0;
        this.c = 0;
        this.d = 0;
        this.e = 0;
    }

    public final boolean a(asu asu, boolean z) {
        this.l.a();
        a();
        if (!(asu.d() == -1 || asu.d() - asu.b() >= 27) || !asu.b(this.l.a, 0, 27, true)) {
            if (z) {
                return false;
            }
            throw new EOFException();
        } else if (this.l.g() == ((long) g)) {
            this.h = this.l.c();
            if (this.h == 0) {
                this.a = this.l.c();
                this.b = this.l.l();
                this.i = this.l.h();
                this.j = this.l.h();
                this.k = this.l.h();
                this.c = this.l.c();
                this.d = this.c + 27;
                this.l.a();
                asu.c(this.l.a, 0, this.c);
                for (int i2 = 0; i2 < this.c; i2++) {
                    this.f[i2] = this.l.c();
                    this.e += this.f[i2];
                }
                return true;
            } else if (z) {
                return false;
            } else {
                throw new ParserException("unsupported bit stream revision");
            }
        } else if (z) {
            return false;
        } else {
            throw new ParserException("expected OggS capture pattern at begin of page");
        }
    }
}
