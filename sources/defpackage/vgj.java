package defpackage;

import android.graphics.Bitmap;

/* renamed from: vgj reason: default package */
public abstract class vgj {

    /* renamed from: vgj$a */
    public static final class a {
        private final Bitmap a;

        private a(Bitmap bitmap) {
            this.a = bitmap;
        }

        /* synthetic */ a(Bitmap bitmap, byte b) {
            this(bitmap);
        }

        public final vgj a() {
            try {
                return new d(nq.a(this.a).a(), 0);
            } catch (Exception unused) {
                return new b(0);
            }
        }

        public final void a(final c cVar) {
            nq.a(this.a).a((defpackage.nq.c) new defpackage.nq.c() {
                public final void a(nq nqVar) {
                    cVar.onGenerated(nqVar == null ? new b(0) : new d(nqVar, 0));
                }
            });
        }
    }

    /* renamed from: vgj$b */
    static class b extends vgj {
        private b() {
        }

        /* synthetic */ b(byte b) {
            this();
        }

        public final int a(int i) {
            return i;
        }

        public final int b(int i) {
            return i;
        }
    }

    /* renamed from: vgj$c */
    public interface c {
        void onGenerated(vgj vgj);
    }

    /* renamed from: vgj$d */
    static class d extends vgj {
        private final nq a;

        private d(nq nqVar) {
            this.a = nqVar;
        }

        /* synthetic */ d(nq nqVar, byte b) {
            this(nqVar);
        }

        public final int a(int i) {
            return this.a.d(i);
        }

        public final int b(int i) {
            return this.a.a(i);
        }
    }

    public static a a(Bitmap bitmap) {
        return new a(bitmap, 0);
    }

    public abstract int a(int i);

    public abstract int b(int i);
}
