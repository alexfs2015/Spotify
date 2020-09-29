package defpackage;

import android.content.Context;
import android.media.MediaRouter.UserRouteInfo;
import android.media.RemoteControlClient;
import java.lang.ref.WeakReference;

/* renamed from: nn reason: default package */
abstract class nn {
    protected final Object a;
    protected d b;
    private Context c;

    /* renamed from: nn$a */
    static class a extends nn {
        private final Object c;
        private final Object d = nj.a(this.c, "", false);
        private final Object e = nj.b(this.c, this.d);
        private boolean f;

        /* renamed from: nn$a$a reason: collision with other inner class name */
        static final class C0062a implements g {
            private final WeakReference<a> a;

            public C0062a(a aVar) {
                this.a = new WeakReference<>(aVar);
            }

            public final void a(Object obj, int i) {
                a aVar = (a) this.a.get();
                if (aVar != null && aVar.b != null) {
                    aVar.b.a(i);
                }
            }

            public final void b(Object obj, int i) {
                a aVar = (a) this.a.get();
                if (aVar != null && aVar.b != null) {
                    aVar.b.b(i);
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
                f.a(this.e, nj.a((g) new C0062a(this)));
                ((UserRouteInfo) this.e).setRemoteControlClient((RemoteControlClient) this.a);
            }
        }
    }

    /* renamed from: nn$b */
    static class b extends nn {
        public b(Context context, Object obj) {
            super(context, obj);
        }
    }

    /* renamed from: nn$c */
    public static final class c {
        public int a;
        public int b;
        public int c = 0;
        public int d = 3;
        public int e = 1;
    }

    /* renamed from: nn$d */
    public interface d {
        void a(int i);

        void b(int i);
    }

    protected nn(Context context, Object obj) {
        this.c = context;
        this.a = obj;
    }

    public final Object a() {
        return this.a;
    }

    public void a(c cVar) {
    }

    public final void a(d dVar) {
        this.b = dVar;
    }
}
