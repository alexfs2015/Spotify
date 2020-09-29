package defpackage;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.media.AudioManager;
import android.media.MediaRouter;
import android.media.MediaRouter.Callback;
import android.media.MediaRouter.RouteInfo;
import android.media.MediaRouter.UserRouteInfo;
import android.os.Build.VERSION;
import android.view.Display;
import com.spotify.music.R;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Locale;

/* renamed from: no reason: default package */
abstract class no extends ne {

    /* renamed from: no$a */
    static class a extends d {
        public a(Context context, f fVar) {
            super(context, fVar);
        }

        /* access modifiers changed from: protected */
        public final void a(C0063b bVar, defpackage.nc.a aVar) {
            super.a(bVar, aVar);
            aVar.a.putInt("deviceType", ((RouteInfo) bVar.a).getDeviceType());
        }
    }

    /* renamed from: no$b */
    static class b extends no implements defpackage.nj.a, g {
        private static final ArrayList<IntentFilter> o;
        private static final ArrayList<IntentFilter> p;
        protected final Object i;
        protected final Object j;
        protected int k;
        protected boolean l;
        protected boolean m;
        protected final ArrayList<C0063b> n = new ArrayList<>();
        private final f q;
        private Object r;
        private Object s;
        private ArrayList<c> t = new ArrayList<>();
        private defpackage.nj.e u;
        private defpackage.nj.c v;

        /* renamed from: no$b$a */
        public static final class a extends defpackage.ne.e {
            private final Object a;

            public a(Object obj) {
                this.a = obj;
            }

            public final void b(int i) {
                ((RouteInfo) this.a).requestSetVolume(i);
            }

            public final void c(int i) {
                ((RouteInfo) this.a).requestUpdateVolume(i);
            }
        }

        /* renamed from: no$b$b reason: collision with other inner class name */
        public static final class C0063b {
            public final Object a;
            public final String b;
            public nc c;

            public C0063b(Object obj, String str) {
                this.a = obj;
                this.b = str;
            }
        }

        /* renamed from: no$b$c */
        public static final class c {
            public final defpackage.ni.f a;
            public final Object b;

            public c(defpackage.ni.f fVar, Object obj) {
                this.a = fVar;
                this.b = obj;
            }
        }

        static {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addCategory("android.media.intent.category.LIVE_AUDIO");
            ArrayList<IntentFilter> arrayList = new ArrayList<>();
            o = arrayList;
            arrayList.add(intentFilter);
            IntentFilter intentFilter2 = new IntentFilter();
            intentFilter2.addCategory("android.media.intent.category.LIVE_VIDEO");
            ArrayList<IntentFilter> arrayList2 = new ArrayList<>();
            p = arrayList2;
            arrayList2.add(intentFilter2);
        }

        public b(Context context, f fVar) {
            super(context);
            this.q = fVar;
            this.i = context.getSystemService("media_router");
            this.j = d();
            this.r = nj.a((g) this);
            this.s = nj.a(this.i, context.getResources().getString(R.string.mr_user_route_category_name), false);
            e();
        }

        private void a(C0063b bVar) {
            defpackage.nc.a aVar = new defpackage.nc.a(bVar.b, k(bVar.a));
            a(bVar, aVar);
            bVar.c = aVar.a();
        }

        private int c(String str) {
            int size = this.n.size();
            for (int i2 = 0; i2 < size; i2++) {
                if (((C0063b) this.n.get(i2)).b.equals(str)) {
                    return i2;
                }
            }
            return -1;
        }

        private int e(defpackage.ni.f fVar) {
            int size = this.t.size();
            for (int i2 = 0; i2 < size; i2++) {
                if (((c) this.t.get(i2)).a == fVar) {
                    return i2;
                }
            }
            return -1;
        }

        private void e() {
            c();
            boolean z = false;
            for (Object f : nj.a(this.i)) {
                z |= f(f);
            }
            if (z) {
                b();
            }
        }

        private boolean f(Object obj) {
            if (j(obj) != null || g(obj) >= 0) {
                return false;
            }
            C0063b bVar = new C0063b(obj, i(obj));
            a(bVar);
            this.n.add(bVar);
            return true;
        }

        private String i(Object obj) {
            String format = a() == obj ? "DEFAULT_ROUTE" : String.format(Locale.US, "ROUTE_%08x", new Object[]{Integer.valueOf(k(obj).hashCode())});
            if (c(format) < 0) {
                return format;
            }
            int i2 = 2;
            while (true) {
                String format2 = String.format(Locale.US, "%s_%d", new Object[]{format, Integer.valueOf(i2)});
                if (c(format2) < 0) {
                    return format2;
                }
                i2++;
            }
        }

        private static c j(Object obj) {
            Object tag = ((RouteInfo) obj).getTag();
            if (tag instanceof c) {
                return (c) tag;
            }
            return null;
        }

        private String k(Object obj) {
            CharSequence a2 = defpackage.nj.d.a(obj, this.a);
            return a2 != null ? a2.toString() : "";
        }

        /* access modifiers changed from: protected */
        public Object a() {
            if (this.v == null) {
                this.v = new defpackage.nj.c();
            }
            return this.v.a(this.i);
        }

        public final defpackage.ne.e a(String str) {
            int c2 = c(str);
            if (c2 >= 0) {
                return new a(((C0063b) this.n.get(c2)).a);
            }
            return null;
        }

        public final void a(Object obj) {
            if (obj == nj.a(this.i, 8388611)) {
                c j2 = j(obj);
                if (j2 != null) {
                    j2.a.e();
                    return;
                }
                int g = g(obj);
                if (g >= 0) {
                    this.q.b(((C0063b) this.n.get(g)).b);
                }
            }
        }

        public final void a(Object obj, int i2) {
            c j2 = j(obj);
            if (j2 != null) {
                j2.a.a(i2);
            }
        }

        public final void a(defpackage.ni.f fVar) {
            if (fVar.i() != this) {
                Object b = nj.b(this.i, this.s);
                c cVar = new c(fVar, b);
                defpackage.nj.d.a(b, (Object) cVar);
                defpackage.nj.f.a(b, this.r);
                a(cVar);
                this.t.add(cVar);
                ((MediaRouter) this.i).addUserRoute((UserRouteInfo) b);
                return;
            }
            int g = g(nj.a(this.i, 8388611));
            if (g >= 0 && ((C0063b) this.n.get(g)).b.equals(fVar.b)) {
                fVar.e();
            }
        }

        /* access modifiers changed from: protected */
        public void a(C0063b bVar, defpackage.nc.a aVar) {
            int supportedTypes = ((RouteInfo) bVar.a).getSupportedTypes();
            if ((supportedTypes & 1) != 0) {
                aVar.a((Collection<IntentFilter>) o);
            }
            if ((supportedTypes & 2) != 0) {
                aVar.a((Collection<IntentFilter>) p);
            }
            aVar.a(((RouteInfo) bVar.a).getPlaybackType());
            aVar.b(((RouteInfo) bVar.a).getPlaybackStream());
            aVar.c(((RouteInfo) bVar.a).getVolume());
            aVar.d(((RouteInfo) bVar.a).getVolumeMax());
            aVar.e(((RouteInfo) bVar.a).getVolumeHandling());
        }

        /* access modifiers changed from: protected */
        public void a(c cVar) {
            ((UserRouteInfo) cVar.b).setName(cVar.a.d);
            defpackage.nj.f.a(cVar.b, cVar.a.j);
            defpackage.nj.f.b(cVar.b, cVar.a.k);
            defpackage.nj.f.c(cVar.b, cVar.a.n);
            defpackage.nj.f.d(cVar.b, cVar.a.o);
            defpackage.nj.f.e(cVar.b, cVar.a.m);
        }

        /* access modifiers changed from: protected */
        public final void b() {
            defpackage.nf.a aVar = new defpackage.nf.a();
            int size = this.n.size();
            for (int i2 = 0; i2 < size; i2++) {
                aVar.a(((C0063b) this.n.get(i2)).c);
            }
            a(aVar.a());
        }

        public final void b(Object obj) {
            if (f(obj)) {
                b();
            }
        }

        public final void b(Object obj, int i2) {
            c j2 = j(obj);
            if (j2 != null) {
                j2.a.b(i2);
            }
        }

        public final void b(nd ndVar) {
            boolean z;
            int i2 = 0;
            if (ndVar != null) {
                List a2 = ndVar.a().a();
                int size = a2.size();
                int i3 = 0;
                while (i2 < size) {
                    String str = (String) a2.get(i2);
                    i3 = str.equals("android.media.intent.category.LIVE_AUDIO") ? i3 | 1 : str.equals("android.media.intent.category.LIVE_VIDEO") ? i3 | 2 : i3 | 8388608;
                    i2++;
                }
                z = ndVar.b();
                i2 = i3;
            } else {
                z = false;
            }
            if (this.k != i2 || this.l != z) {
                this.k = i2;
                this.l = z;
                e();
            }
        }

        public final void b(defpackage.ni.f fVar) {
            if (fVar.i() != this) {
                int e = e(fVar);
                if (e >= 0) {
                    c cVar = (c) this.t.remove(e);
                    defpackage.nj.d.a(cVar.b, (Object) null);
                    defpackage.nj.f.a(cVar.b, (Object) null);
                    ((MediaRouter) this.i).removeUserRoute((UserRouteInfo) cVar.b);
                }
            }
        }

        /* access modifiers changed from: protected */
        public void c() {
            if (this.m) {
                this.m = false;
                nj.a(this.i, this.j);
            }
            int i2 = this.k;
            if (i2 != 0) {
                this.m = true;
                ((MediaRouter) this.i).addCallback(i2, (Callback) this.j);
            }
        }

        public final void c(Object obj) {
            if (j(obj) == null) {
                int g = g(obj);
                if (g >= 0) {
                    this.n.remove(g);
                    b();
                }
            }
        }

        public final void c(defpackage.ni.f fVar) {
            if (fVar.i() != this) {
                int e = e(fVar);
                if (e >= 0) {
                    a((c) this.t.get(e));
                }
            }
        }

        /* access modifiers changed from: protected */
        public Object d() {
            return new b(this);
        }

        public final void d(Object obj) {
            if (j(obj) == null) {
                int g = g(obj);
                if (g >= 0) {
                    a((C0063b) this.n.get(g));
                    b();
                }
            }
        }

        public final void d(defpackage.ni.f fVar) {
            if (fVar.a()) {
                if (fVar.i() != this) {
                    int e = e(fVar);
                    if (e >= 0) {
                        h(((c) this.t.get(e)).b);
                    }
                    return;
                }
                int c2 = c(fVar.b);
                if (c2 >= 0) {
                    h(((C0063b) this.n.get(c2)).a);
                }
            }
        }

        public final void e(Object obj) {
            if (j(obj) == null) {
                int g = g(obj);
                if (g >= 0) {
                    C0063b bVar = (C0063b) this.n.get(g);
                    int volume = ((RouteInfo) obj).getVolume();
                    if (volume != bVar.c.n()) {
                        bVar.c = new defpackage.nc.a(bVar.c).c(volume).a();
                        b();
                    }
                }
            }
        }

        /* access modifiers changed from: protected */
        public final int g(Object obj) {
            int size = this.n.size();
            for (int i2 = 0; i2 < size; i2++) {
                if (((C0063b) this.n.get(i2)).a == obj) {
                    return i2;
                }
            }
            return -1;
        }

        /* access modifiers changed from: protected */
        public void h(Object obj) {
            if (this.u == null) {
                this.u = new defpackage.nj.e();
            }
            defpackage.nj.e eVar = this.u;
            MediaRouter mediaRouter = (MediaRouter) this.i;
            RouteInfo routeInfo = (RouteInfo) obj;
            if ((routeInfo.getSupportedTypes() & 8388608) == 0 && eVar.a != null) {
                try {
                    eVar.a.invoke(mediaRouter, new Object[]{Integer.valueOf(8388611), routeInfo});
                    return;
                } catch (IllegalAccessException | InvocationTargetException unused) {
                }
            }
            mediaRouter.selectRoute(8388611, routeInfo);
        }
    }

    /* renamed from: no$c */
    static class c extends b implements defpackage.nk.b {
        private defpackage.nk.a o;
        private defpackage.nk.d p;

        public c(Context context, f fVar) {
            super(context, fVar);
        }

        /* access modifiers changed from: protected */
        public void a(C0063b bVar, defpackage.nc.a aVar) {
            super.a(bVar, aVar);
            if (!((RouteInfo) bVar.a).isEnabled()) {
                aVar.a.putBoolean("enabled", false);
            }
            if (a(bVar)) {
                aVar.a.putBoolean("connecting", true);
            }
            Display a = defpackage.nk.e.a(bVar.a);
            if (a != null) {
                aVar.f(a.getDisplayId());
            }
        }

        /* access modifiers changed from: protected */
        public boolean a(C0063b bVar) {
            if (this.p == null) {
                this.p = new defpackage.nk.d();
            }
            return this.p.a(bVar.a);
        }

        /* access modifiers changed from: protected */
        public void c() {
            super.c();
            if (this.o == null) {
                this.o = new defpackage.nk.a(this.a, this.c);
            }
            defpackage.nk.a aVar = this.o;
            if (((this.l ? this.k : 0) & 2) != 0) {
                if (!aVar.c && aVar.b != null) {
                    aVar.c = true;
                    aVar.a.post(aVar);
                }
            } else if (aVar.c) {
                aVar.c = false;
                aVar.a.removeCallbacks(aVar);
            }
        }

        /* access modifiers changed from: protected */
        public final Object d() {
            return new c(this);
        }

        public final void f(Object obj) {
            int g = g(obj);
            if (g >= 0) {
                C0063b bVar = (C0063b) this.n.get(g);
                Display a = defpackage.nk.e.a(obj);
                int displayId = a != null ? a.getDisplayId() : -1;
                if (displayId != bVar.c.q()) {
                    bVar.c = new defpackage.nc.a(bVar.c).f(displayId).a();
                    b();
                }
            }
        }
    }

    /* renamed from: no$d */
    static class d extends c {
        public d(Context context, f fVar) {
            super(context, fVar);
        }

        /* access modifiers changed from: protected */
        public final Object a() {
            return ((MediaRouter) this.i).getDefaultRoute();
        }

        /* access modifiers changed from: protected */
        public void a(C0063b bVar, defpackage.nc.a aVar) {
            super.a(bVar, aVar);
            CharSequence description = ((RouteInfo) bVar.a).getDescription();
            if (description != null) {
                aVar.a.putString("status", description.toString());
            }
        }

        /* access modifiers changed from: protected */
        public final void a(c cVar) {
            super.a(cVar);
            ((UserRouteInfo) cVar.b).setDescription(cVar.a.e);
        }

        /* access modifiers changed from: protected */
        public final boolean a(C0063b bVar) {
            return ((RouteInfo) bVar.a).isConnecting();
        }

        /* access modifiers changed from: protected */
        public final void c() {
            if (this.m) {
                nj.a(this.i, this.j);
            }
            this.m = true;
            Object obj = this.i;
            ((MediaRouter) obj).addCallback(this.k, (Callback) this.j, this.l | true ? 1 : 0);
        }

        /* access modifiers changed from: protected */
        public final void h(Object obj) {
            ((MediaRouter) this.i).selectRoute(8388611, (RouteInfo) obj);
        }
    }

    /* renamed from: no$e */
    static class e extends no {
        private static final ArrayList<IntentFilter> k;
        final AudioManager i;
        int j = -1;
        private final b l;

        /* renamed from: no$e$a */
        final class a extends defpackage.ne.e {
            a() {
            }

            public final void b(int i) {
                e.this.i.setStreamVolume(3, i, 0);
                e.this.b();
            }

            public final void c(int i) {
                int streamVolume = e.this.i.getStreamVolume(3);
                if (Math.min(e.this.i.getStreamMaxVolume(3), Math.max(0, i + streamVolume)) != streamVolume) {
                    e.this.i.setStreamVolume(3, streamVolume, 0);
                }
                e.this.b();
            }
        }

        /* renamed from: no$e$b */
        final class b extends BroadcastReceiver {
            b() {
            }

            public final void onReceive(Context context, Intent intent) {
                if (intent.getAction().equals("android.media.VOLUME_CHANGED_ACTION") && intent.getIntExtra("android.media.EXTRA_VOLUME_STREAM_TYPE", -1) == 3) {
                    int intExtra = intent.getIntExtra("android.media.EXTRA_VOLUME_STREAM_VALUE", -1);
                    if (intExtra >= 0 && intExtra != e.this.j) {
                        e.this.b();
                    }
                }
            }
        }

        static {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addCategory("android.media.intent.category.LIVE_AUDIO");
            intentFilter.addCategory("android.media.intent.category.LIVE_VIDEO");
            ArrayList<IntentFilter> arrayList = new ArrayList<>();
            k = arrayList;
            arrayList.add(intentFilter);
        }

        public e(Context context) {
            super(context);
            this.i = (AudioManager) context.getSystemService("audio");
            this.l = new b();
            context.registerReceiver(this.l, new IntentFilter("android.media.VOLUME_CHANGED_ACTION"));
            b();
        }

        public final defpackage.ne.e a(String str) {
            if (str.equals("DEFAULT_ROUTE")) {
                return new a();
            }
            return null;
        }

        /* access modifiers changed from: 0000 */
        public final void b() {
            Resources resources = this.a.getResources();
            int streamMaxVolume = this.i.getStreamMaxVolume(3);
            this.j = this.i.getStreamVolume(3);
            a(new defpackage.nf.a().a(new defpackage.nc.a("DEFAULT_ROUTE", resources.getString(R.string.mr_system_route_name)).a((Collection<IntentFilter>) k).b(3).a(0).e(1).d(streamMaxVolume).c(this.j).a()).a());
        }
    }

    /* renamed from: no$f */
    public interface f {
        void b(String str);
    }

    protected no(Context context) {
        super(context, new defpackage.ne.d(new ComponentName("android", no.class.getName())));
    }

    public static no a(Context context, f fVar) {
        return VERSION.SDK_INT >= 24 ? new a(context, fVar) : VERSION.SDK_INT >= 18 ? new d(context, fVar) : VERSION.SDK_INT >= 17 ? new c(context, fVar) : VERSION.SDK_INT >= 16 ? new b(context, fVar) : new e(context);
    }

    /* access modifiers changed from: protected */
    public Object a() {
        return null;
    }

    public void a(defpackage.ni.f fVar) {
    }

    public void b(defpackage.ni.f fVar) {
    }

    public void c(defpackage.ni.f fVar) {
    }

    public void d(defpackage.ni.f fVar) {
    }
}
