package defpackage;

import java.io.EOFException;

/* renamed from: atj reason: default package */
public final class atj implements atu {
    public final int a(atl atl, int i, boolean z) {
        int a = atl.a(i);
        if (a != -1) {
            return a;
        }
        if (z) {
            return -1;
        }
        throw new EOFException();
    }

    public final void a(long j, int i, int i2, int i3, a aVar) {
    }

    public final void a(aqv aqv) {
    }

    public final void a(bea bea, int i) {
        bea.d(i);
    }
}
