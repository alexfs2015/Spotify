package defpackage;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.squareup.picasso.Picasso;

/* renamed from: vsp reason: default package */
public final class vsp {
    final vrs a;
    public final Handler b;
    long c;
    long d;
    long e;
    long f;
    long g;
    long h;
    long i;
    long j;
    int k;
    int l;
    int m;
    private HandlerThread n = new HandlerThread("Picasso-Stats", 10);

    /* renamed from: vsp$a */
    static class a extends Handler {
        private final vsp a;

        public a(Looper looper, vsp vsp) {
            super(looper);
            this.a = vsp;
        }

        public final void handleMessage(final Message message) {
            int i = message.what;
            if (i == 0) {
                this.a.c++;
            } else if (i == 1) {
                this.a.d++;
            } else if (i == 2) {
                vsp vsp = this.a;
                long j = (long) message.arg1;
                vsp.l++;
                vsp.f += j;
                vsp.i = vsp.f / ((long) vsp.l);
            } else if (i == 3) {
                vsp vsp2 = this.a;
                long j2 = (long) message.arg1;
                vsp2.m++;
                vsp2.g += j2;
                vsp2.j = vsp2.g / ((long) vsp2.l);
            } else if (i != 4) {
                Picasso.a.post(new Runnable() {
                    public final void run() {
                        StringBuilder sb = new StringBuilder("Unhandled stats message.");
                        sb.append(message.what);
                        throw new AssertionError(sb.toString());
                    }
                });
            } else {
                vsp vsp3 = this.a;
                Long l = (Long) message.obj;
                vsp3.k++;
                vsp3.e += l.longValue();
                vsp3.h = vsp3.e / ((long) vsp3.k);
            }
        }
    }

    public vsp(vrs vrs) {
        this.a = vrs;
        this.n.start();
        vsv.a(this.n.getLooper());
        this.b = new a(this.n.getLooper(), this);
    }

    public final void a() {
        this.b.sendEmptyMessage(0);
    }

    /* access modifiers changed from: 0000 */
    public void a(Bitmap bitmap, int i2) {
        int a2 = vsv.a(bitmap);
        Handler handler = this.b;
        handler.sendMessage(handler.obtainMessage(i2, a2, 0));
    }
}
