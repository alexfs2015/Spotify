package defpackage;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.hardware.display.DisplayManager.DisplayListener;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Choreographer;
import android.view.Choreographer.FrameCallback;
import android.view.Display;
import android.view.WindowManager;

/* renamed from: bev reason: default package */
public final class bev {
    final WindowManager a;
    final b b;
    final a c;
    long d;
    long e;
    long f;
    long g;
    long h;
    boolean i;
    long j;
    long k;
    long l;

    /* renamed from: bev$a */
    final class a implements DisplayListener {
        final DisplayManager a;

        public a(DisplayManager displayManager) {
            this.a = displayManager;
        }

        public final void onDisplayAdded(int i) {
        }

        public final void onDisplayChanged(int i) {
            if (i == 0) {
                bev.this.a();
            }
        }

        public final void onDisplayRemoved(int i) {
        }
    }

    /* renamed from: bev$b */
    static final class b implements Callback, FrameCallback {
        private static final b c = new b();
        public volatile long a = -9223372036854775807L;
        final Handler b;
        private final HandlerThread d = new HandlerThread("ChoreographerOwner:Handler");
        private Choreographer e;
        private int f;

        private b() {
            this.d.start();
            this.b = ben.a(this.d.getLooper(), (Callback) this);
            this.b.sendEmptyMessage(0);
        }

        public static b a() {
            return c;
        }

        public final void doFrame(long j) {
            this.a = j;
            this.e.postFrameCallbackDelayed(this, 500);
        }

        public final boolean handleMessage(Message message) {
            int i = message.what;
            if (i == 0) {
                this.e = Choreographer.getInstance();
                return true;
            } else if (i == 1) {
                this.f++;
                if (this.f == 1) {
                    this.e.postFrameCallback(this);
                }
                return true;
            } else if (i != 2) {
                return false;
            } else {
                this.f--;
                if (this.f == 0) {
                    this.e.removeFrameCallback(this);
                    this.a = -9223372036854775807L;
                }
                return true;
            }
        }
    }

    public bev() {
        this(null);
    }

    public bev(Context context) {
        a aVar = null;
        if (context != null) {
            context = context.getApplicationContext();
            this.a = (WindowManager) context.getSystemService("window");
        } else {
            this.a = null;
        }
        if (this.a != null) {
            if (ben.a >= 17) {
                DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
                if (displayManager != null) {
                    aVar = new a(displayManager);
                }
            }
            this.c = aVar;
            this.b = b.a();
        } else {
            this.c = null;
            this.b = null;
        }
        this.d = -9223372036854775807L;
        this.e = -9223372036854775807L;
    }

    /* access modifiers changed from: 0000 */
    public void a() {
        Display defaultDisplay = this.a.getDefaultDisplay();
        if (defaultDisplay != null) {
            double refreshRate = (double) defaultDisplay.getRefreshRate();
            Double.isNaN(refreshRate);
            this.d = (long) (1.0E9d / refreshRate);
            this.e = (this.d * 80) / 100;
        }
    }

    /* access modifiers changed from: 0000 */
    public boolean a(long j2, long j3) {
        return Math.abs((j3 - this.j) - (j2 - this.k)) > 20000000;
    }
}
