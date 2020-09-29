package defpackage;

import android.os.Handler;
import java.io.FilterOutputStream;
import java.io.OutputStream;
import java.util.Map;

/* renamed from: ala reason: default package */
final class ala extends FilterOutputStream implements alb {
    private final Map<akr, alc> a;
    /* access modifiers changed from: private */
    public final akt b;
    private final long c = akq.j();
    /* access modifiers changed from: private */
    public long d;
    private long e;
    /* access modifiers changed from: private */
    public long f;
    private alc g;

    ala(OutputStream outputStream, akt akt, Map<akr, alc> map, long j) {
        super(outputStream);
        this.b = akt;
        this.a = map;
        this.f = j;
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
                                ala.this.b;
                                ala.this.d;
                                ala.this.f;
                            }
                        });
                    }
                }
            }
            this.e = this.d;
        }
    }

    private void a(long j) {
        alc alc = this.g;
        if (alc != null) {
            alc.b += j;
            if (alc.b >= alc.c + alc.a || alc.b >= alc.d) {
                alc.a();
            }
        }
        this.d += j;
        long j2 = this.d;
        if (j2 >= this.e + this.c || j2 >= this.f) {
            a();
        }
    }

    public final void a(akr akr) {
        this.g = akr != null ? (alc) this.a.get(akr) : null;
    }

    public final void close() {
        super.close();
        for (alc a2 : this.a.values()) {
            a2.a();
        }
        a();
    }

    public final void write(int i) {
        this.out.write(i);
        a(1);
    }

    public final void write(byte[] bArr) {
        this.out.write(bArr);
        a((long) bArr.length);
    }

    public final void write(byte[] bArr, int i, int i2) {
        this.out.write(bArr, i, i2);
        a((long) i2);
    }
}
