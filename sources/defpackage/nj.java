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

/* renamed from: nj reason: default package */
abstract class nj extends mz {

    /* renamed from: nj$a */
    static class a extends d {
        public a(Context context, f fVar) {
            super(context, fVar);
        }

        /* access modifiers changed from: protected */
        public final void a(C0062b bVar, defpackage.mx.a aVar) {
            super.a(bVar, aVar);
            aVar.a.putInt("deviceType", ((RouteInfo) bVar.a).getDeviceType());
        }
    }

    /* renamed from: nj$b */
    static class b extends nj implements defpackage.ne.a, g {
        private static final ArrayList<IntentFilter> o;
        private static final ArrayList<IntentFilter> p;
        protected final Object i;
        protected final Object j;
        protected int k;
        protected boolean l;
        protected boolean m;
        protected final ArrayList<C0062b> n = new ArrayList<>();
        private final f q;
        private Object r;
        private Object s;
        private ArrayList<c> t = new ArrayList<>();
        private defpackage.ne.e u;
        private defpackage.ne.c v;

        /* renamed from: nj$b$a */
        public static final class a extends defpackage.mz.e {
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

        /* renamed from: nj$b$b reason: collision with other inner class name */
        public static final class C0062b {
            public final Object a;
            public final String b;
            public mx c;

            public C0062b(Object obj, String str) {
                this.a = obj;
                this.b = str;
            }
        }

        /* renamed from: nj$b$c */
        public static final class c {
            public final defpackage.nd.f a;
            public final Object b;

            public c(defpackage.nd.f fVar, Object obj) {
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
            this.r = ne.a((g) this);
            this.s = ne.a(this.i, context.getResources().getString(R.string.mr_user_route_category_name), false);
            e();
        }

        public final defpackage.mz.e a(String str) {
            int c2 = c(str);
            if (c2 >= 0) {
                return new a(((C0062b) this.n.get(c2)).a);
            }
            return null;
        }

        public final void b(my myVar) {
            boolean z;
            int i2 = 0;
            if (myVar != null) {
                List a2 = myVar.a().a();
                int size = a2.size();
                int i3 = 0;
                while (i2 < size) {
                    String str = (String) a2.get(i2);
                    i3 = str.equals("android.media.intent.category.LIVE_AUDIO") ? i3 | 1 : str.equals("android.media.intent.category.LIVE_VIDEO") ? i3 | 2 : i3 | 8388608;
                    i2++;
                }
                z = myVar.b();
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

        public final void b(Object obj) {
            if (f(obj)) {
                b();
            }
        }

        private void e() {
            c();
            boolean z = false;
            for (Object f : ne.a(this.i)) {
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
            C0062b bVar = new C0062b(obj, i(obj));
            a(bVar);
            this.n.add(bVar);
            return true;
        }

        private String i(Object obj) {
            String str;
            if (a() == obj) {
                str = "DEFAULT_ROUTE";
            } else {
                str = String.format(Locale.US, "ROUTE_%08x", new Object[]{Integer.valueOf(k(obj).hashCode())});
            }
            if (c(str) < 0) {
                return str;
            }
            int i2 = 2;
            while (true) {
                String format = String.format(Locale.US, "%s_%d", new Object[]{str, Integer.valueOf(i2)});
                if (c(format) < 0) {
                    return format;
                }
                i2++;
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

        public final void d(Object obj) {
            if (j(obj) == null) {
                int g = g(obj);
                if (g >= 0) {
                    a((C0062b) this.n.get(g));
                    b();
                }
            }
        }

        public final void e(Object obj) {
            if (j(obj) == null) {
                int g = g(obj);
                if (g >= 0) {
                    C0062b bVar = (C0062b) this.n.get(g);
                    int volume = ((RouteInfo) obj).getVolume();
                    if (volume != bVar.c.n()) {
                        bVar.c = new defpackage.mx.a(bVar.c).c(volume).a();
                        b();
                    }
                }
            }
        }

        public final void a(Object obj) {
            if (obj == ne.a(this.i, 8388611)) {
                c j2 = j(obj);
                if (j2 != null) {
                    j2.a.e();
                    return;
                }
                int g = g(obj);
                if (g >= 0) {
                    this.q.b(((C0062b) this.n.get(g)).b);
                }
            }
        }

        public final void a(Object obj, int i2) {
            c j2 = j(obj);
            if (j2 != null) {
                j2.a.a(i2);
            }
        }

        public final void b(Object obj, int i2) {
            c j2 = j(obj);
            if (j2 != null) {
                j2.a.b(i2);
            }
        }

        public final void a(defpackage.nd.f fVar) {
            if (fVar.i() != this) {
                Object b = ne.b(this.i, this.s);
                c cVar = new c(fVar, b);
                defpackage.ne.d.a(b, (Object) cVar);
                defpackage.ne.f.a(b, this.r);
                a(cVar);
                this.t.add(cVar);
                ((MediaRouter) this.i).addUserRoute((UserRouteInfo) b);
                return;
            }
            int g = g(ne.a(this.i, 8388611));
            if (g >= 0 && ((C0062b) this.n.get(g)).b.equals(fVar.b)) {
                fVar.e();
            }
        }

        public final void b(defpackage.nd.f fVar) {
            if (fVar.i() != this) {
                int e = e(fVar);
                if (e >= 0) {
                    c cVar = (c) this.t.remove(e);
                    defpackage.ne.d.a(cVar.b, (Object) null);
                    defpackage.ne.f.a(cVar.b, (Object) null);
                    ((MediaRouter) this.i).removeUserRoute((UserRouteInfo) cVar.b);
                }
            }
        }

        public final void c(defpackage.nd.f fVar) {
            if (fVar.i() != this) {
                int e = e(fVar);
                if (e >= 0) {
                    a((c) this.t.get(e));
                }
            }
        }

        public final void d(defpackage.nd.f fVar) {
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
                    h(((C0062b) this.n.get(c2)).a);
                }
            }
        }

        /* access modifiers changed from: protected */
        public final void b() {
            defpackage.na.a aVar = new defpackage.na.a();
            int size = this.n.size();
            for (int i2 = 0; i2 < size; i2++) {
                aVar.a(((C0062b) this.n.get(i2)).c);
            }
            a(aVar.a());
        }

        /* access modifiers changed from: protected */
        public final int g(Object obj) {
            int size = this.n.size();
            for (int i2 = 0; i2 < size; i2++) {
                if (((C0062b) this.n.get(i2)).a == obj) {
                    return i2;
                }
            }
            return -1;
        }

        private int c(String str) {
            int size = this.n.size();
            for (int i2 = 0; i2 < size; i2++) {
                if (((C0062b) this.n.get(i2)).b.equals(str)) {
                    return i2;
                }
            }
            return -1;
        }

        private int e(defpackage.nd.f fVar) {
            int size = this.t.size();
            for (int i2 = 0; i2 < size; i2++) {
                if (((c) this.t.get(i2)).a == fVar) {
                    return i2;
                }
            }
            return -1;
        }

        private void a(C0062b bVar) {
            defpackage.mx.a aVar = new defpackage.mx.a(bVar.b, k(bVar.a));
            a(bVar, aVar);
            bVar.c = aVar.a();
        }

        /* access modifiers changed from: protected */
        public void a(C0062b bVar, defpackage.mx.a aVar) {
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
            defpackage.ne.f.a(cVar.b, cVar.a.j);
            defpackage.ne.f.b(cVar.b, cVar.a.k);
            defpackage.ne.f.c(cVar.b, cVar.a.n);
            defpackage.ne.f.d(cVar.b, cVar.a.o);
            defpackage.ne.f.e(cVar.b, cVar.a.m);
        }

        /* access modifiers changed from: protected */
        public void c() {
            if (this.m) {
                this.m = false;
                ne.a(this.i, this.j);
            }
            int i2 = this.k;
            if (i2 != 0) {
                this.m = true;
                ((MediaRouter) this.i).addCallback(i2, (Callback) this.j);
            }
        }

        /* access modifiers changed from: protected */
        public void h(Object obj) {
            if (this.u == null) {
                this.u = new defpackage.ne.e();
            }
            defpackage.ne.e eVar = this.u;
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

        /* access modifiers changed from: protected */
        public Object a() {
            if (this.v == null) {
                this.v = new defpackage.ne.c();
            }
            return this.v.a(this.i);
        }

        private static c j(Object obj) {
            Object tag = ((RouteInfo) obj).getTag();
            if (tag instanceof c) {
                return (c) tag;
            }
            return null;
        }

        private String k(Object obj) {
            CharSequence a2 = defpackage.ne.d.a(obj, this.a);
            return a2 != null ? a2.toString() : "";
        }

        /* access modifiers changed from: protected */
        public Object d() {
            return new b(this);
        }
    }

    /* renamed from: nj$c */
    static class c extends b implements defpackage.nf.b {
        private defpackage.nf.a o;
        private defpackage.nf.d p;

        public c(Context context, f fVar) {
            super(context, fVar);
        }

        public final void f(Object obj) {
            int g = g(obj);
            if (g >= 0) {
                C0062b bVar = (C0062b) this.n.get(g);
                Display a = defpackage.nf.e.a(obj);
                int displayId = a != null ? a.getDisplayId() : -1;
                if (displayId != bVar.c.q()) {
                    bVar.c = new defpackage.mx.a(bVar.c).f(displayId).a();
                    b();
                }
            }
        }

        /* access modifiers changed from: protected */
        public void a(C0062b bVar, defpackage.mx.a aVar) {
            super.a(bVar, aVar);
            if (!((RouteInfo) bVar.a).isEnabled()) {
                aVar.a.putBoolean("enabled", false);
            }
            if (a(bVar)) {
                aVar.a.putBoolean("connecting", true);
            }
            Display a = defpackage.nf.e.a(bVar.a);
            if (a != null) {
                aVar.f(a.getDisplayId());
            }
        }

        /* access modifiers changed from: protected */
        public void c() {
            super.c();
            if (this.o == null) {
                this.o = new defpackage.nf.a(this.a, this.c);
            }
            defpackage.nf.a aVar = this.o;
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
        public boolean a(C0062b bVar) {
            if (this.p == null) {
                this.p = new defpackage.nf.d();
            }
            return this.p.a(bVar.a);
        }

        /* access modifiers changed from: protected */
        public final Object d() {
            return new c(this);
        }
    }

    /* renamed from: nj$d */
    static class d extends c {
        public d(Context context, f fVar) {
            super(context, fVar);
        }

        /* access modifiers changed from: protected */
        public void a(C0062b bVar, defpackage.mx.a aVar) {
            super.a(bVar, aVar);
            CharSequence description = ((RouteInfo) bVar.a).getDescription();
            if (description != null) {
                aVar.a.putString("status", description.toString());
            }
        }

        /* access modifiers changed from: protected */
        public final void h(Object obj) {
            ((MediaRouter) this.i).selectRoute(8388611, (RouteInfo) obj);
        }

        /* access modifiers changed from: protected */
        public final Object a() {
            return ((MediaRouter) this.i).getDefaultRoute();
        }

        /* access modifiers changed from: protected */
        public final void a(c cVar) {
            super.a(cVar);
            ((UserRouteInfo) cVar.b).setDescription(cVar.a.e);
        }

        /* access modifiers changed from: protected */
        public final void c() {
            if (this.m) {
                ne.a(this.i, this.j);
            }
            this.m = true;
            Object obj = this.i;
            ((MediaRouter) obj).addCallback(this.k, (Callback) this.j, this.l | true ? 1 : 0);
        }

        /* access modifiers changed from: protected */
        public final boolean a(C0062b bVar) {
            return ((RouteInfo) bVar.a).isConnecting();
        }
    }

    /* renamed from: nj$e */
    static class e extends nj {
        private static final ArrayList<IntentFilter> k;
        final AudioManager i;
        int j = -1;
        private final b l;

        /* renamed from: nj$e$a */
        final class a extends defpackage.mz.e {
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

        /* renamed from: nj$e$b */
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

        public final defpackage.mz.e a(String str) {
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
            a(new defpackage.na.a().a(new defpackage.mx.a("DEFAULT_ROUTE", resources.getString(R.string.mr_system_route_name)).a((Collection<IntentFilter>) k).b(3).a(0).e(1).d(streamMaxVolume).c(this.j).a()).a());
        }
    }

    /* renamed from: nj$f */
    public interface f {
        void b(String str);
    }

    /* access modifiers changed from: protected */
    public Object a() {
        return null;
    }

    public void a(defpackage.nd.f fVar) {
    }

    public void b(defpackage.nd.f fVar) {
    }

    public void c(defpackage.nd.f fVar) {
    }

    public void d(defpackage.nd.f fVar) {
    }

    protected nj(Context context) {
        super(context, new defpackage.mz.d(new ComponentName("android", nj.class.getName())));
    }

    public static nj a(Context context, f fVar) {
        if (VERSION.SDK_INT >= 24) {
            return new a(context, fVar);
        }
        if (VERSION.SDK_INT >= 18) {
            return new d(context, fVar);
        }
        if (VERSION.SDK_INT >= 17) {
            return new c(context, fVar);
        }
        if (VERSION.SDK_INT >= 16) {
            return new b(context, fVar);
        }
        return new e(context);
    }
}
