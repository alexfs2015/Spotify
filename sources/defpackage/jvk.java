package defpackage;

import android.view.Choreographer;
import android.view.Choreographer.FrameCallback;

/* renamed from: jvk reason: default package */
public abstract class jvk {
    private static jvk a = new a(0);

    /* renamed from: jvk$a */
    static class a extends jvk {

        /* renamed from: jvk$a$a reason: collision with other inner class name */
        static class C0045a extends b implements FrameCallback {
            private final Runnable a;

            public C0045a(Runnable runnable) {
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

        public final b a(Runnable runnable) {
            return new C0045a(runnable);
        }

        public final void a(b bVar) {
            Choreographer.getInstance().postFrameCallback((FrameCallback) bVar);
        }

        public final void a(b bVar, long j) {
            Choreographer.getInstance().postFrameCallbackDelayed((FrameCallback) bVar, 16);
        }

        public final void b(b bVar) {
            Choreographer.getInstance().removeFrameCallback((FrameCallback) bVar);
        }
    }

    /* renamed from: jvk$b */
    public static abstract class b {
        private b() {
        }

        /* synthetic */ b(byte b) {
            this();
        }
    }

    public static jvk a() {
        return a;
    }

    public abstract b a(Runnable runnable);

    public abstract void a(b bVar);

    public abstract void a(b bVar, long j);

    public abstract void b(b bVar);
}
