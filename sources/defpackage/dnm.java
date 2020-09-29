package defpackage;

import android.os.RemoteException;

/* renamed from: dnm reason: default package */
public final class dnm {
    int a;
    int b;
    private final byte[] c;
    private final /* synthetic */ dnl d;

    private dnm(dnl dnl, byte[] bArr) {
        this.d = dnl;
        this.c = bArr;
    }

    /* synthetic */ dnm(dnl dnl, byte[] bArr, byte b2) {
        this(dnl, bArr);
    }

    public final synchronized void a() {
        try {
            if (this.d.b) {
                this.d.a.a(this.c);
                this.d.a.a(this.a);
                this.d.a.b(this.b);
                this.d.a.b();
                this.d.a.a();
            }
        } catch (RemoteException unused) {
            cow.a(3);
        }
    }
}
