package defpackage;

import java.io.EOFException;

/* renamed from: ass reason: default package */
public final class ass implements atd {
    public final void a(long j, int i, int i2, int i3, a aVar) {
    }

    public final void a(aqe aqe) {
    }

    public final int a(asu asu, int i, boolean z) {
        int a = asu.a(i);
        if (a != -1) {
            return a;
        }
        if (z) {
            return -1;
        }
        throw new EOFException();
    }

    public final void a(bdj bdj, int i) {
        bdj.d(i);
    }
}
