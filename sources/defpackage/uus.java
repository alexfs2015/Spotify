package defpackage;

import android.graphics.Bitmap;

/* renamed from: uus reason: default package */
public abstract class uus {

    /* renamed from: uus$a */
    public static final class a {
        private final Bitmap a;

        /* synthetic */ a(Bitmap bitmap, byte b) {
            this(bitmap);
        }

        private a(Bitmap bitmap) {
            this.a = bitmap;
        }

        public final uus a() {
            try {
                return new d(nl.a(this.a).a(), 0);
            } catch (Exception unused) {
                return new b(0);
            }
        }

        public final void a(final c cVar) {
            nl.a(this.a).a((defpackage.nl.c) new defpackage.nl.c() {
                public final void a(nl nlVar) {
                    uus uus;
                    if (nlVar == null) {
                        uus = new b(0);
                    } else {
                        uus = new d(nlVar, 0);
                    }
                    cVar.onGenerated(uus);
                }
            });
        }
    }

    /* renamed from: uus$b */
    static class b extends uus {
        public final int a(int i) {
            return i;
        }

        public final int b(int i) {
            return i;
        }

        private b() {
        }

        /* synthetic */ b(byte b) {
            this();
        }
    }

    /* renamed from: uus$c */
    public interface c {
        void onGenerated(uus uus);
    }

    /* renamed from: uus$d */
    static class d extends uus {
        private final nl a;

        /* synthetic */ d(nl nlVar, byte b) {
            this(nlVar);
        }

        private d(nl nlVar) {
            this.a = nlVar;
        }

        public final int a(int i) {
            return this.a.c(i);
        }

        public final int b(int i) {
            return this.a.a(i);
        }
    }

    public abstract int a(int i);

    public abstract int b(int i);

    public static a a(Bitmap bitmap) {
        return new a(bitmap, 0);
    }
}
