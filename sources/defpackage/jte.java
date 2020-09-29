package defpackage;

import android.view.Choreographer;
import android.view.Choreographer.FrameCallback;

/* renamed from: jte reason: default package */
public abstract class jte {
    private static jte a = new a(0);

    /* renamed from: jte$a */
    static class a extends jte {

        /* renamed from: jte$a$a reason: collision with other inner class name */
        static class C0044a extends b implements FrameCallback {
            private final Runnable a;

            public C0044a(Runnable runnable) {
                super(0);
                this.a = runnable;
            }

            public final void doFrame(long j) {
                this.a.run();
            }
        }

        private a() {
        }

        /* synthetic */ a(byte b) {
            this();
        }

        public final void a(b bVar) {
            Choreographer.getInstance().postFrameCallback((FrameCallback) bVar);
        }

        public final void b(b bVar) {
            Choreographer.getInstance().removeFrameCallback((FrameCallback) bVar);
        }

        public final void a(b bVar, long j) {
            Choreographer.getInstance().postFrameCallbackDelayed((FrameCallback) bVar, 16);
        }

        public final b a(Runnable runnable) {
            return new C0044a(runnable);
        }
    }

    /* renamed from: jte$b */
    public static abstract class b {
        /* synthetic */ b(byte b) {
            this();
        }

        private b() {
        }
    }

    public abstract b a(Runnable runnable);

    public abstract void a(b bVar);

    public abstract void a(b bVar, long j);

    public abstract void b(b bVar);

    public static jte a() {
        return a;
    }
}
