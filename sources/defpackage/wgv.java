package defpackage;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.squareup.picasso.Picasso;

/* renamed from: wgv reason: default package */
public final class wgv {
    final wfy a;
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

    /* renamed from: wgv$a */
    static class a extends Handler {
        private final wgv a;

        public a(Looper looper, wgv wgv) {
            super(looper);
            this.a = wgv;
        }

        public final void handleMessage(final Message message) {
            int i = message.what;
            if (i == 0) {
                this.a.c++;
            } else if (i == 1) {
                this.a.d++;
            } else if (i == 2) {
                wgv wgv = this.a;
                long j = (long) message.arg1;
                wgv.l++;
                wgv.f += j;
                wgv.i = wgv.f / ((long) wgv.l);
            } else if (i == 3) {
                wgv wgv2 = this.a;
                long j2 = (long) message.arg1;
                wgv2.m++;
                wgv2.g += j2;
                wgv2.j = wgv2.g / ((long) wgv2.l);
            } else if (i != 4) {
                Picasso.a.post(new Runnable() {
                    public final void run() {
                        StringBuilder sb = new StringBuilder("Unhandled stats message.");
                        sb.append(message.what);
                        throw new AssertionError(sb.toString());
                    }
                });
            } else {
                wgv wgv3 = this.a;
                Long l = (Long) message.obj;
                wgv3.k++;
                wgv3.e += l.longValue();
                wgv3.h = wgv3.e / ((long) wgv3.k);
            }
        }
    }

    public wgv(wfy wfy) {
        this.a = wfy;
        this.n.start();
        whb.a(this.n.getLooper());
        this.b = new a(this.n.getLooper(), this);
    }

    public final void a() {
        this.b.sendEmptyMessage(0);
    }

    /* access modifiers changed from: 0000 */
    public void a(Bitmap bitmap, int i2) {
        int a2 = whb.a(bitmap);
        Handler handler = this.b;
        handler.sendMessage(handler.obtainMessage(i2, a2, 0));
    }
}
