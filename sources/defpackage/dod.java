package defpackage;

import android.os.RemoteException;

/* renamed from: dod reason: default package */
public final class dod {
    int a;
    int b;
    private final byte[] c;
    private final /* synthetic */ doc d;

    private dod(doc doc, byte[] bArr) {
        this.d = doc;
        this.c = bArr;
    }

    /* synthetic */ dod(doc doc, byte[] bArr, byte b2) {
        this(doc, bArr);
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
            cpn.a(3);
        }
    }
}
