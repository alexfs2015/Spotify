package defpackage;

import android.os.Handler;
import java.io.FilterOutputStream;
import java.io.OutputStream;
import java.util.Map;

/* renamed from: akm reason: default package */
final class akm extends FilterOutputStream implements akn {
    private final Map<akd, ako> a;
    /* access modifiers changed from: private */
    public final akf b;
    private final long c = akc.j();
    /* access modifiers changed from: private */
    public long d;
    private long e;
    /* access modifiers changed from: private */
    public long f;
    private ako g;

    akm(OutputStream outputStream, akf akf, Map<akd, ako> map, long j) {
        super(outputStream);
        this.b = akf;
        this.a = map;
        this.f = j;
    }

    private void a(long j) {
        ako ako = this.g;
        if (ako != null) {
            ako.b += j;
            if (ako.b >= ako.c + ako.a || ako.b >= ako.d) {
                ako.a();
            }
        }
        this.d += j;
        long j2 = this.d;
        if (j2 >= this.e + this.c || j2 >= this.f) {
            a();
        }
    }

    private void a() {
        if (this.d > this.e) {
            for (a aVar : this.b.d) {
                if (aVar instanceof b) {
                    Handler handler = this.b.a;
                    final b bVar = (b) aVar;
                    if (handler != null) {
                        handler.post(new Runnable() {
                            public final void run() {
                                akm.this.b;
                                akm.this.d;
                                akm.this.f;
                            }
                        });
                    }
                }
            }
            this.e = this.d;
        }
    }

    public final void a(akd akd) {
        this.g = akd != null ? (ako) this.a.get(akd) : null;
    }

    public final void write(byte[] bArr) {
        this.out.write(bArr);
        a((long) bArr.length);
    }

    public final void write(byte[] bArr, int i, int i2) {
        this.out.write(bArr, i, i2);
        a((long) i2);
    }

    public final void write(int i) {
        this.out.write(i);
        a(1);
    }

    public final void close() {
        super.close();
        for (ako a2 : this.a.values()) {
            a2.a();
        }
        a();
    }
}
