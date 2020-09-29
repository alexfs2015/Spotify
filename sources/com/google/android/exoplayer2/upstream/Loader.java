package com.google.android.exoplayer2.upstream;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.comscore.util.crashreport.CrashReportManager;
import java.io.IOException;
import java.util.concurrent.ExecutorService;

public final class Loader implements bcq {
    public static final b a = new b(2, -9223372036854775807L, 0);
    public static final b b = new b(3, -9223372036854775807L, 0);
    /* access modifiers changed from: private */
    public final ExecutorService c;
    /* access modifiers changed from: private */
    public c<? extends d> d;
    /* access modifiers changed from: private */
    public IOException e;

    public static final class UnexpectedLoaderException extends IOException {
        public UnexpectedLoaderException(Throwable th) {
            StringBuilder sb = new StringBuilder("Unexpected ");
            sb.append(th.getClass().getSimpleName());
            sb.append(": ");
            sb.append(th.getMessage());
            super(sb.toString(), th);
        }
    }

    public interface a<T extends d> {
        b a(T t, long j, long j2, IOException iOException, int i);

        void a(T t, long j, long j2);

        void a(T t, long j, long j2, boolean z);
    }

    public static final class b {
        final int a;
        final long b;

        private b(int i, long j) {
            this.a = i;
            this.b = j;
        }

        /* synthetic */ b(int i, long j, byte b2) {
            this(i, j);
        }

        public final boolean a() {
            int i = this.a;
            return i == 0 || i == 1;
        }
    }

    final class c<T extends d> extends Handler implements Runnable {
        public final int a;
        private final T b;
        private final long c;
        private a<T> d;
        private IOException e;
        private int f;
        private volatile Thread g;
        private volatile boolean h;
        private volatile boolean i;

        public c(Looper looper, T t, a<T> aVar, int i2, long j2) {
            super(looper);
            this.b = t;
            this.d = aVar;
            this.a = i2;
            this.c = j2;
        }

        private void a() {
            this.e = null;
            Loader.this.c.execute(Loader.this.d);
        }

        private void b() {
            Loader.this.d = null;
        }

        public final void a(long j2) {
            bdl.b(Loader.this.d == null);
            Loader.this.d = this;
            if (j2 > 0) {
                sendEmptyMessageDelayed(0, j2);
            } else {
                a();
            }
        }

        public final void a(boolean z) {
            this.i = z;
            this.e = null;
            if (hasMessages(0)) {
                removeMessages(0);
                if (!z) {
                    sendEmptyMessage(1);
                }
            } else {
                this.h = true;
                this.b.a();
                if (this.g != null) {
                    this.g.interrupt();
                }
            }
            if (z) {
                b();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                this.d.a(this.b, elapsedRealtime, elapsedRealtime - this.c, true);
                this.d = null;
            }
        }

        public final void handleMessage(Message message) {
            if (!this.i) {
                if (message.what == 0) {
                    a();
                } else if (message.what != 4) {
                    b();
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    long j2 = elapsedRealtime - this.c;
                    if (this.h) {
                        this.d.a(this.b, elapsedRealtime, j2, false);
                        return;
                    }
                    int i2 = message.what;
                    if (i2 == 1) {
                        this.d.a(this.b, elapsedRealtime, j2, false);
                    } else if (i2 != 2) {
                        if (i2 == 3) {
                            this.e = (IOException) message.obj;
                            this.f++;
                            b a2 = this.d.a(this.b, elapsedRealtime, j2, this.e, this.f);
                            if (a2.a == 3) {
                                Loader.this.e = this.e;
                            } else if (a2.a != 2) {
                                if (a2.a == 1) {
                                    this.f = 1;
                                }
                                a(a2.b != -9223372036854775807L ? a2.b : (long) Math.min((this.f - 1) * 1000, CrashReportManager.TIME_WINDOW));
                            }
                        }
                    } else {
                        try {
                            this.d.a(this.b, elapsedRealtime, j2);
                        } catch (RuntimeException e2) {
                            bdu.b("LoadTask", "Unexpected exception handling load completed", e2);
                            Loader.this.e = new UnexpectedLoaderException(e2);
                        }
                    }
                } else {
                    throw ((Error) message.obj);
                }
            }
        }

        public final void run() {
            String str = "LoadTask";
            try {
                this.g = Thread.currentThread();
                if (!this.h) {
                    StringBuilder sb = new StringBuilder("load:");
                    sb.append(this.b.getClass().getSimpleName());
                    bel.a(sb.toString());
                    this.b.b();
                    bel.a();
                }
                if (!this.i) {
                    sendEmptyMessage(2);
                }
            } catch (IOException e2) {
                if (!this.i) {
                    obtainMessage(3, e2).sendToTarget();
                }
            } catch (InterruptedException unused) {
                bdl.b(this.h);
                if (!this.i) {
                    sendEmptyMessage(2);
                }
            } catch (Exception e3) {
                bdu.b(str, "Unexpected exception loading stream", e3);
                if (!this.i) {
                    obtainMessage(3, new UnexpectedLoaderException(e3)).sendToTarget();
                }
            } catch (OutOfMemoryError e4) {
                bdu.b(str, "OutOfMemory error loading stream", e4);
                if (!this.i) {
                    obtainMessage(3, new UnexpectedLoaderException(e4)).sendToTarget();
                }
            } catch (Error e5) {
                bdu.b(str, "Unexpected error loading stream", e5);
                if (!this.i) {
                    obtainMessage(4, e5).sendToTarget();
                }
                throw e5;
            } catch (Throwable th) {
                bel.a();
                throw th;
            }
        }
    }

    public interface d {
        void a();

        void b();
    }

    public interface e {
        void f();
    }

    static final class f implements Runnable {
        private final e a;

        public f(e eVar) {
            this.a = eVar;
        }

        public final void run() {
            this.a.f();
        }
    }

    static {
        a(false, -9223372036854775807L);
        a(true, -9223372036854775807L);
    }

    public Loader(String str) {
        this.c = ben.a(str);
    }

    public static b a(boolean z, long j) {
        return new b(z ? 1 : 0, j, 0);
    }

    public final <T extends d> long a(T t, a<T> aVar, int i) {
        Looper myLooper = Looper.myLooper();
        bdl.b(myLooper != null);
        this.e = null;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        c cVar = new c(myLooper, t, aVar, i, elapsedRealtime);
        cVar.a(0);
        return elapsedRealtime;
    }

    public final void a(e eVar) {
        c<? extends d> cVar = this.d;
        if (cVar != null) {
            cVar.a(true);
        }
        if (eVar != null) {
            this.c.execute(new f(eVar));
        }
        this.c.shutdown();
    }

    public final boolean a() {
        return this.d != null;
    }

    public final void b() {
        this.d.a(false);
    }
}
