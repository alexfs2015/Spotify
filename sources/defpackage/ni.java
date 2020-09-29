package defpackage;

import android.content.Context;
import android.media.MediaRouter.UserRouteInfo;
import android.media.RemoteControlClient;
import java.lang.ref.WeakReference;

/* renamed from: ni reason: default package */
abstract class ni {
    protected final Object a;
    protected d b;
    private Context c;

    /* renamed from: ni$a */
    static class a extends ni {
        private final Object c;
        private final Object d = ne.a(this.c, "", false);
        private final Object e = ne.b(this.c, this.d);
        private boolean f;

        /* renamed from: ni$a$a reason: collision with other inner class name */
        static final class C0061a implements g {
            private final WeakReference<a> a;

            public C0061a(a aVar) {
                this.a = new WeakReference<>(aVar);
            }

            public final void b(Object obj, int i) {
                a aVar = (a) this.a.get();
                if (aVar != null && aVar.b != null) {
                    aVar.b.b(i);
                }
            }

            public final void a(Object obj, int i) {
                a aVar = (a) this.a.get();
                if (aVar != null && aVar.b != null) {
                    aVar.b.a(i);
                }
            }
        }

        public a(Context context, Object obj) {
            super(context, obj);
            this.c = context.getSystemService("media_router");
        }

        public final void a(c cVar) {
            f.c(this.e, cVar.a);
            f.d(this.e, cVar.b);
            f.e(this.e, cVar.c);
            f.b(this.e, cVar.d);
            f.a(this.e, cVar.e);
            if (!this.f) {
                this.f = true;
                f.a(this.e, ne.a((g) new C0061a(this)));
                ((UserRouteInfo) this.e).setRemoteControlClient((RemoteControlClient) this.a);
            }
        }
    }

    /* renamed from: ni$b */
    static class b extends ni {
        public b(Context context, Object obj) {
            super(context, obj);
        }
    }

    /* renamed from: ni$c */
    public static final class c {
        public int a;
        public int b;
        public int c = 0;
        public int d = 3;
        public int e = 1;
    }

    /* renamed from: ni$d */
    public interface d {
        void a(int i);

        void b(int i);
    }

    public void a(c cVar) {
    }

    protected ni(Context context, Object obj) {
        this.c = context;
        this.a = obj;
    }

    public final Object a() {
        return this.a;
    }

    public final void a(d dVar) {
        this.b = dVar;
    }
}
