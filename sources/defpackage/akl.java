package defpackage;

import android.os.Handler;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;

/* renamed from: akl reason: default package */
final class akl extends OutputStream implements akn {
    final Map<akd, ako> a = new HashMap();
    int b;
    private final Handler c;
    private akd d;
    private ako e;

    akl(Handler handler) {
        this.c = handler;
    }

    public final void a(akd akd) {
        this.d = akd;
        this.e = akd != null ? (ako) this.a.get(akd) : null;
    }

    /* access modifiers changed from: 0000 */
    public final void a(long j) {
        if (this.e == null) {
            this.e = new ako(this.c, this.d);
            this.a.put(this.d, this.e);
        }
        this.e.a(j);
        this.b = (int) (((long) this.b) + j);
    }

    public final void write(byte[] bArr) {
        a((long) bArr.length);
    }

    public final void write(byte[] bArr, int i, int i2) {
        a((long) i2);
    }

    public final void write(int i) {
        a(1);
    }
}
