package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import android.content.IntentFilter;
import android.content.IntentSender;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.MediaSessionCompat.Token;
import android.support.v4.media.session.MediaSessionCompat.h;
import android.text.TextUtils;
import android.util.Log;
import android.view.Display;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.Executor;

/* renamed from: nd reason: default package */
public final class nd {
    static final boolean a = Log.isLoggable("MediaRouter", 3);
    static d b;
    final Context c;
    final ArrayList<b> d = new ArrayList<>();

    /* renamed from: nd$a */
    public static abstract class a {
        public void a() {
        }

        public void a(f fVar) {
        }

        public void a(nd ndVar) {
        }

        public void a(nd ndVar, f fVar) {
        }

        public void b(f fVar) {
        }

        public void b(nd ndVar) {
        }

        public void b(nd ndVar, f fVar) {
        }

        public void c(nd ndVar) {
        }

        public void c(nd ndVar, f fVar) {
        }

        public void a(nd ndVar, f fVar, int i) {
            a();
        }
    }

    /* renamed from: nd$b */
    static final class b {
        public final nd a;
        public final a b;
        public nc c = nc.c;
        public int d;

        public b(nd ndVar, a aVar) {
            this.a = ndVar;
            this.b = aVar;
        }
    }

    /* renamed from: nd$c */
    public static abstract class c {
        public void a(Bundle bundle) {
        }

        public void a(String str, Bundle bundle) {
        }
    }

    /* renamed from: nd$d */
    static final class d implements defpackage.nh.a, defpackage.nj.f {
        final Context a;
        final ArrayList<WeakReference<nd>> b = new ArrayList<>();
        final ArrayList<f> c = new ArrayList<>();
        final defpackage.ni.c d = new defpackage.ni.c();
        final a e = new a();
        final nj f;
        nh g;
        f h;
        defpackage.mz.e i;
        b j;
        MediaSessionCompat k;
        MediaSessionCompat l;
        h m = new h() {
            public final void a() {
                if (d.this.k != null) {
                    if (d.this.k.a()) {
                        d dVar = d.this;
                        MediaSessionCompat mediaSessionCompat = dVar.k;
                        dVar.a((Object) null);
                        return;
                    }
                    d dVar2 = d.this;
                    MediaSessionCompat mediaSessionCompat2 = dVar2.k;
                    dVar2.b((Object) null);
                }
            }
        };
        private final Map<ho<String, String>, String> n = new HashMap();
        private final ArrayList<e> o = new ArrayList<>();
        private final ArrayList<C0060d> p = new ArrayList<>();
        private final c q = new c();
        private final gs r;
        private final boolean s;
        private f t;
        private f u;
        private final Map<String, defpackage.mz.e> v = new HashMap();
        private my w;
        private C0059b x = new C0059b() {
            public final void a(defpackage.mz.b bVar, Collection<defpackage.mz.b.a> collection) {
                if (bVar == d.this.i) {
                    f fVar = d.this.h;
                    fVar.s.clear();
                    for (defpackage.mz.b.a aVar : collection) {
                        f b = fVar.a.b(aVar.a.a());
                        if (b != null) {
                            b.r = aVar;
                            if (aVar.b == 2 || aVar.b == 3) {
                                fVar.s.add(b);
                            }
                        }
                    }
                    nd.b.e.a(259, fVar);
                }
            }
        };

        /* renamed from: nd$d$a */
        final class a extends Handler {
            private final ArrayList<b> a = new ArrayList<>();

            a() {
            }

            public final void a(int i, Object obj) {
                obtainMessage(i, obj).sendToTarget();
            }

            /* JADX WARNING: Removed duplicated region for block: B:40:0x00ce A[Catch:{ all -> 0x00f2 }] */
            /* JADX WARNING: Removed duplicated region for block: B:65:0x00e9 A[SYNTHETIC] */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void handleMessage(android.os.Message r12) {
                /*
                    r11 = this;
                    int r0 = r12.what
                    java.lang.Object r1 = r12.obj
                    int r12 = r12.arg1
                    r2 = 1
                    r3 = 259(0x103, float:3.63E-43)
                    if (r0 != r3) goto L_0x0023
                    nd$d r3 = defpackage.nd.d.this
                    nd$f r3 = r3.b()
                    java.lang.String r3 = r3.c
                    r4 = r1
                    nd$f r4 = (defpackage.nd.f) r4
                    java.lang.String r4 = r4.c
                    boolean r3 = r3.equals(r4)
                    if (r3 == 0) goto L_0x0023
                    nd$d r3 = defpackage.nd.d.this
                    r3.a(r2)
                L_0x0023:
                    r3 = 262(0x106, float:3.67E-43)
                    if (r0 == r3) goto L_0x004c
                    switch(r0) {
                        case 257: goto L_0x0041;
                        case 258: goto L_0x0036;
                        case 259: goto L_0x002b;
                        default: goto L_0x002a;
                    }
                L_0x002a:
                    goto L_0x0056
                L_0x002b:
                    nd$d r3 = defpackage.nd.d.this
                    nj r3 = r3.f
                    r4 = r1
                    nd$f r4 = (defpackage.nd.f) r4
                    r3.c(r4)
                    goto L_0x0056
                L_0x0036:
                    nd$d r3 = defpackage.nd.d.this
                    nj r3 = r3.f
                    r4 = r1
                    nd$f r4 = (defpackage.nd.f) r4
                    r3.b(r4)
                    goto L_0x0056
                L_0x0041:
                    nd$d r3 = defpackage.nd.d.this
                    nj r3 = r3.f
                    r4 = r1
                    nd$f r4 = (defpackage.nd.f) r4
                    r3.a(r4)
                    goto L_0x0056
                L_0x004c:
                    nd$d r3 = defpackage.nd.d.this
                    nj r3 = r3.f
                    r4 = r1
                    nd$f r4 = (defpackage.nd.f) r4
                    r3.d(r4)
                L_0x0056:
                    nd$d r3 = defpackage.nd.d.this     // Catch:{ all -> 0x00f2 }
                    java.util.ArrayList<java.lang.ref.WeakReference<nd>> r3 = r3.b     // Catch:{ all -> 0x00f2 }
                    int r3 = r3.size()     // Catch:{ all -> 0x00f2 }
                L_0x005e:
                    int r3 = r3 + -1
                    if (r3 < 0) goto L_0x0084
                    nd$d r4 = defpackage.nd.d.this     // Catch:{ all -> 0x00f2 }
                    java.util.ArrayList<java.lang.ref.WeakReference<nd>> r4 = r4.b     // Catch:{ all -> 0x00f2 }
                    java.lang.Object r4 = r4.get(r3)     // Catch:{ all -> 0x00f2 }
                    java.lang.ref.WeakReference r4 = (java.lang.ref.WeakReference) r4     // Catch:{ all -> 0x00f2 }
                    java.lang.Object r4 = r4.get()     // Catch:{ all -> 0x00f2 }
                    nd r4 = (defpackage.nd) r4     // Catch:{ all -> 0x00f2 }
                    if (r4 != 0) goto L_0x007c
                    nd$d r4 = defpackage.nd.d.this     // Catch:{ all -> 0x00f2 }
                    java.util.ArrayList<java.lang.ref.WeakReference<nd>> r4 = r4.b     // Catch:{ all -> 0x00f2 }
                    r4.remove(r3)     // Catch:{ all -> 0x00f2 }
                    goto L_0x005e
                L_0x007c:
                    java.util.ArrayList<nd$b> r5 = r11.a     // Catch:{ all -> 0x00f2 }
                    java.util.ArrayList<nd$b> r4 = r4.d     // Catch:{ all -> 0x00f2 }
                    r5.addAll(r4)     // Catch:{ all -> 0x00f2 }
                    goto L_0x005e
                L_0x0084:
                    java.util.ArrayList<nd$b> r3 = r11.a     // Catch:{ all -> 0x00f2 }
                    int r3 = r3.size()     // Catch:{ all -> 0x00f2 }
                    r4 = 0
                    r5 = 0
                L_0x008c:
                    if (r5 >= r3) goto L_0x00ec
                    java.util.ArrayList<nd$b> r6 = r11.a     // Catch:{ all -> 0x00f2 }
                    java.lang.Object r6 = r6.get(r5)     // Catch:{ all -> 0x00f2 }
                    nd$b r6 = (defpackage.nd.b) r6     // Catch:{ all -> 0x00f2 }
                    nd r7 = r6.a     // Catch:{ all -> 0x00f2 }
                    nd$a r8 = r6.b     // Catch:{ all -> 0x00f2 }
                    r9 = 65280(0xff00, float:9.1477E-41)
                    r9 = r9 & r0
                    r10 = 256(0x100, float:3.59E-43)
                    if (r9 == r10) goto L_0x00b7
                    r6 = 512(0x200, float:7.175E-43)
                    if (r9 == r6) goto L_0x00a7
                    goto L_0x00e9
                L_0x00a7:
                    switch(r0) {
                        case 513: goto L_0x00b3;
                        case 514: goto L_0x00af;
                        case 515: goto L_0x00ab;
                        default: goto L_0x00aa;
                    }     // Catch:{ all -> 0x00f2 }
                L_0x00aa:
                    goto L_0x00e9
                L_0x00ab:
                    r8.c(r7)     // Catch:{ all -> 0x00f2 }
                    goto L_0x00e9
                L_0x00af:
                    r8.b(r7)     // Catch:{ all -> 0x00f2 }
                    goto L_0x00e9
                L_0x00b3:
                    r8.a(r7)     // Catch:{ all -> 0x00f2 }
                    goto L_0x00e9
                L_0x00b7:
                    r9 = r1
                    nd$f r9 = (defpackage.nd.f) r9     // Catch:{ all -> 0x00f2 }
                    int r10 = r6.d     // Catch:{ all -> 0x00f2 }
                    r10 = r10 & 2
                    if (r10 != 0) goto L_0x00cb
                    nc r6 = r6.c     // Catch:{ all -> 0x00f2 }
                    boolean r6 = r9.a(r6)     // Catch:{ all -> 0x00f2 }
                    if (r6 == 0) goto L_0x00c9
                    goto L_0x00cb
                L_0x00c9:
                    r6 = 0
                    goto L_0x00cc
                L_0x00cb:
                    r6 = 1
                L_0x00cc:
                    if (r6 == 0) goto L_0x00e9
                    switch(r0) {
                        case 257: goto L_0x00e6;
                        case 258: goto L_0x00e2;
                        case 259: goto L_0x00de;
                        case 260: goto L_0x00da;
                        case 261: goto L_0x00e9;
                        case 262: goto L_0x00d6;
                        case 263: goto L_0x00d2;
                        default: goto L_0x00d1;
                    }     // Catch:{ all -> 0x00f2 }
                L_0x00d1:
                    goto L_0x00e9
                L_0x00d2:
                    r8.a(r7, r9, r12)     // Catch:{ all -> 0x00f2 }
                    goto L_0x00e9
                L_0x00d6:
                    r8.a(r9)     // Catch:{ all -> 0x00f2 }
                    goto L_0x00e9
                L_0x00da:
                    r8.b(r9)     // Catch:{ all -> 0x00f2 }
                    goto L_0x00e9
                L_0x00de:
                    r8.c(r7, r9)     // Catch:{ all -> 0x00f2 }
                    goto L_0x00e9
                L_0x00e2:
                    r8.b(r7, r9)     // Catch:{ all -> 0x00f2 }
                    goto L_0x00e9
                L_0x00e6:
                    r8.a(r7, r9)     // Catch:{ all -> 0x00f2 }
                L_0x00e9:
                    int r5 = r5 + 1
                    goto L_0x008c
                L_0x00ec:
                    java.util.ArrayList<nd$b> r12 = r11.a
                    r12.clear()
                    return
                L_0x00f2:
                    r12 = move-exception
                    java.util.ArrayList<nd$b> r0 = r11.a
                    r0.clear()
                    goto L_0x00fa
                L_0x00f9:
                    throw r12
                L_0x00fa:
                    goto L_0x00f9
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.nd.d.a.handleMessage(android.os.Message):void");
            }
        }

        /* renamed from: nd$d$b */
        final class b {
            final MediaSessionCompat a;
            private mk c;

            b(MediaSessionCompat mediaSessionCompat) {
                this.a = mediaSessionCompat;
            }

            public final void a(int i, int i2, int i3) {
                if (this.a != null) {
                    mk mkVar = this.c;
                    if (mkVar != null && i == 0 && i2 == 0) {
                        mkVar.a(i3);
                    } else {
                        this.c = new mk(i, i2, i3) {
                            public final void b(final int i) {
                                d.this.e.post(new Runnable() {
                                    public final void run() {
                                        if (d.this.h != null) {
                                            d.this.h.a(i);
                                        }
                                    }
                                });
                            }

                            public final void c(final int i) {
                                d.this.e.post(new Runnable() {
                                    public final void run() {
                                        if (d.this.h != null) {
                                            d.this.h.b(i);
                                        }
                                    }
                                });
                            }
                        };
                        this.a.a(this.c);
                    }
                }
            }

            public final void a() {
                MediaSessionCompat mediaSessionCompat = this.a;
                if (mediaSessionCompat != null) {
                    mediaSessionCompat.a(d.this.d.d);
                    this.c = null;
                }
            }
        }

        /* renamed from: nd$d$c */
        final class c extends defpackage.mz.a {
            c() {
            }

            public final void a(mz mzVar, na naVar) {
                d dVar = d.this;
                e c = dVar.c(mzVar);
                if (c != null) {
                    dVar.a(c, naVar);
                }
            }
        }

        /* renamed from: nd$d$d reason: collision with other inner class name */
        final class C0060d implements defpackage.ni.d {
            final ni a;
            private boolean b;

            public C0060d(Object obj) {
                ni niVar;
                Context context = d.this.a;
                if (VERSION.SDK_INT >= 16) {
                    niVar = new a(context, obj);
                } else {
                    niVar = new b(context, obj);
                }
                this.a = niVar;
                this.a.a((defpackage.ni.d) this);
                b();
            }

            public final void a() {
                this.b = true;
                this.a.a((defpackage.ni.d) null);
            }

            public final void b() {
                this.a.a(d.this.d);
            }

            public final void a(int i) {
                if (!this.b && d.this.h != null) {
                    d.this.h.a(i);
                }
            }

            public final void b(int i) {
                if (!this.b && d.this.h != null) {
                    d.this.h.b(i);
                }
            }
        }

        d(Context context) {
            this.a = context;
            this.r = gs.a(context);
            this.s = fa.a((ActivityManager) context.getSystemService("activity"));
            this.f = nj.a(context, this);
        }

        public final nd a(Context context) {
            int size = this.b.size();
            while (true) {
                size--;
                if (size >= 0) {
                    nd ndVar = (nd) ((WeakReference) this.b.get(size)).get();
                    if (ndVar == null) {
                        this.b.remove(size);
                    } else if (ndVar.c == context) {
                        return ndVar;
                    }
                } else {
                    nd ndVar2 = new nd(context);
                    this.b.add(new WeakReference(ndVar2));
                    return ndVar2;
                }
            }
        }

        public final void a(f fVar, int i2) {
            if (fVar == this.h) {
                defpackage.mz.e eVar = this.i;
                if (eVar != null) {
                    eVar.b(i2);
                    return;
                }
            }
            if (!this.v.isEmpty()) {
                defpackage.mz.e eVar2 = (defpackage.mz.e) this.v.get(fVar.c);
                if (eVar2 != null) {
                    eVar2.b(i2);
                }
            }
        }

        public final void b(f fVar, int i2) {
            if (fVar == this.h) {
                defpackage.mz.e eVar = this.i;
                if (eVar != null) {
                    eVar.c(i2);
                }
            }
        }

        public final f a(String str) {
            Iterator it = this.c.iterator();
            while (it.hasNext()) {
                f fVar = (f) it.next();
                if (fVar.c.equals(str)) {
                    return fVar;
                }
            }
            return null;
        }

        /* access modifiers changed from: 0000 */
        public final f a() {
            f fVar = this.t;
            if (fVar != null) {
                return fVar;
            }
            throw new IllegalStateException("There is no default route.  The media router has not yet been fully initialized.");
        }

        /* access modifiers changed from: 0000 */
        public final f b() {
            f fVar = this.h;
            if (fVar != null) {
                return fVar;
            }
            throw new IllegalStateException("There is no currently selected route.  The media router has not yet been fully initialized.");
        }

        /* access modifiers changed from: 0000 */
        public final void c(f fVar, int i2) {
            if (!this.c.contains(fVar)) {
                new StringBuilder("Ignoring attempt to select removed route: ").append(fVar);
            } else if (!fVar.g) {
                new StringBuilder("Ignoring attempt to select disabled route: ").append(fVar);
            } else {
                d(fVar, i2);
            }
        }

        public final boolean a(nc ncVar, int i2) {
            if (ncVar.c()) {
                return false;
            }
            if ((i2 & 2) == 0 && this.s) {
                return true;
            }
            int size = this.c.size();
            for (int i3 = 0; i3 < size; i3++) {
                f fVar = (f) this.c.get(i3);
                if (((i2 & 1) == 0 || !fVar.c()) && fVar.a(ncVar)) {
                    return true;
                }
            }
            return false;
        }

        public final void c() {
            defpackage.nc.a aVar = new defpackage.nc.a();
            int size = this.b.size();
            boolean z = false;
            boolean z2 = false;
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                nd ndVar = (nd) ((WeakReference) this.b.get(size)).get();
                if (ndVar == null) {
                    this.b.remove(size);
                } else {
                    int size2 = ndVar.d.size();
                    boolean z3 = z2;
                    boolean z4 = z;
                    for (int i2 = 0; i2 < size2; i2++) {
                        b bVar = (b) ndVar.d.get(i2);
                        aVar.a(bVar.c);
                        if ((bVar.d & 1) != 0) {
                            z4 = true;
                            z3 = true;
                        }
                        if ((bVar.d & 4) != 0 && !this.s) {
                            z4 = true;
                        }
                        if ((bVar.d & 8) != 0) {
                            z4 = true;
                        }
                    }
                    z = z4;
                    z2 = z3;
                }
            }
            nc a2 = z ? aVar.a() : nc.c;
            my myVar = this.w;
            if (myVar == null || !myVar.a().equals(a2) || this.w.b() != z2) {
                if (!a2.c() || z2) {
                    this.w = new my(a2, z2);
                } else if (this.w != null) {
                    this.w = null;
                } else {
                    return;
                }
                if (nd.a) {
                    new StringBuilder("Updated discovery request: ").append(this.w);
                }
                int size3 = this.o.size();
                for (int i3 = 0; i3 < size3; i3++) {
                    ((e) this.o.get(i3)).a.a(this.w);
                }
            }
        }

        public final void a(mz mzVar) {
            if (c(mzVar) == null) {
                e eVar = new e(mzVar);
                this.o.add(eVar);
                if (nd.a) {
                    new StringBuilder("Provider added: ").append(eVar);
                }
                this.e.a(513, eVar);
                a(eVar, mzVar.g);
                mzVar.a((defpackage.mz.a) this.q);
                mzVar.a(this.w);
            }
        }

        public final void b(mz mzVar) {
            e c2 = c(mzVar);
            if (c2 != null) {
                mzVar.a((defpackage.mz.a) null);
                mzVar.a((my) null);
                a(c2, (na) null);
                if (nd.a) {
                    new StringBuilder("Provider removed: ").append(c2);
                }
                this.e.a(514, c2);
                this.o.remove(c2);
            }
        }

        /* access modifiers changed from: 0000 */
        public e c(mz mzVar) {
            int size = this.o.size();
            for (int i2 = 0; i2 < size; i2++) {
                if (((e) this.o.get(i2)).a == mzVar) {
                    return (e) this.o.get(i2);
                }
            }
            return null;
        }

        /* access modifiers changed from: 0000 */
        public void a(e eVar, na naVar) {
            boolean z;
            String str;
            if (eVar.a(naVar)) {
                int i2 = 0;
                if (naVar == null || (!naVar.a() && naVar != this.f.g)) {
                    new StringBuilder("Ignoring invalid provider descriptor: ").append(naVar);
                    z = false;
                } else {
                    List<mx> list = naVar.a;
                    ArrayList<ho> arrayList = new ArrayList<>();
                    ArrayList<ho> arrayList2 = new ArrayList<>();
                    Iterator it = list.iterator();
                    z = false;
                    while (true) {
                        str = "Route added: ";
                        if (!it.hasNext()) {
                            break;
                        }
                        mx mxVar = (mx) it.next();
                        if (mxVar == null || !mxVar.s()) {
                            new StringBuilder("Ignoring invalid system route descriptor: ").append(mxVar);
                        } else {
                            String a2 = mxVar.a();
                            int a3 = eVar.a(a2);
                            if (a3 < 0) {
                                f fVar = new f(eVar, a2, b(eVar, a2));
                                int i3 = i2 + 1;
                                eVar.b.add(i2, fVar);
                                this.c.add(fVar);
                                if (mxVar.b().size() > 0) {
                                    arrayList.add(new ho(fVar, mxVar));
                                } else {
                                    fVar.a(mxVar);
                                    if (nd.a) {
                                        new StringBuilder(str).append(fVar);
                                    }
                                    this.e.a(257, fVar);
                                }
                                i2 = i3;
                            } else if (a3 < i2) {
                                new StringBuilder("Ignoring route descriptor with duplicate id: ").append(mxVar);
                            } else {
                                f fVar2 = (f) eVar.b.get(a3);
                                int i4 = i2 + 1;
                                Collections.swap(eVar.b, a3, i2);
                                if (mxVar.b().size() > 0) {
                                    arrayList2.add(new ho(fVar2, mxVar));
                                } else if (a(fVar2, mxVar) != 0 && fVar2 == this.h) {
                                    i2 = i4;
                                    z = true;
                                }
                                i2 = i4;
                            }
                        }
                    }
                    for (ho hoVar : arrayList) {
                        f fVar3 = (f) hoVar.a;
                        fVar3.a((mx) hoVar.b);
                        if (nd.a) {
                            new StringBuilder(str).append(fVar3);
                        }
                        this.e.a(257, fVar3);
                    }
                    for (ho hoVar2 : arrayList2) {
                        f fVar4 = (f) hoVar2.a;
                        if (a(fVar4, (mx) hoVar2.b) != 0 && fVar4 == this.h) {
                            z = true;
                        }
                    }
                }
                for (int size = eVar.b.size() - 1; size >= i2; size--) {
                    f fVar5 = (f) eVar.b.get(size);
                    fVar5.a((mx) null);
                    this.c.remove(fVar5);
                }
                a(z);
                for (int size2 = eVar.b.size() - 1; size2 >= i2; size2--) {
                    f fVar6 = (f) eVar.b.remove(size2);
                    if (nd.a) {
                        new StringBuilder("Route removed: ").append(fVar6);
                    }
                    this.e.a(258, fVar6);
                }
                if (nd.a) {
                    new StringBuilder("Provider changed: ").append(eVar);
                }
                this.e.a(515, eVar);
            }
        }

        private int a(f fVar, mx mxVar) {
            int a2 = fVar.a(mxVar);
            if (a2 != 0) {
                if ((a2 & 1) != 0) {
                    if (nd.a) {
                        new StringBuilder("Route changed: ").append(fVar);
                    }
                    this.e.a(259, fVar);
                }
                if ((a2 & 2) != 0) {
                    if (nd.a) {
                        new StringBuilder("Route volume changed: ").append(fVar);
                    }
                    this.e.a(260, fVar);
                }
                if ((a2 & 4) != 0) {
                    if (nd.a) {
                        new StringBuilder("Route presentation display changed: ").append(fVar);
                    }
                    this.e.a(261, fVar);
                }
            }
            return a2;
        }

        private int c(String str) {
            int size = this.c.size();
            for (int i2 = 0; i2 < size; i2++) {
                if (((f) this.c.get(i2)).c.equals(str)) {
                    return i2;
                }
            }
            return -1;
        }

        /* access modifiers changed from: 0000 */
        public final void a(boolean z) {
            f fVar = this.t;
            if (fVar != null && !fVar.d()) {
                new StringBuilder("Clearing the default route because it is no longer selectable: ").append(this.t);
                this.t = null;
            }
            if (this.t == null && !this.c.isEmpty()) {
                Iterator it = this.c.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    f fVar2 = (f) it.next();
                    e eVar = fVar2.a;
                    nd.e();
                    if ((eVar.a == this.f && fVar2.b.equals("DEFAULT_ROUTE")) && fVar2.d()) {
                        this.t = fVar2;
                        new StringBuilder("Found default route: ").append(this.t);
                        break;
                    }
                }
            }
            f fVar3 = this.u;
            if (fVar3 != null && !fVar3.d()) {
                new StringBuilder("Clearing the bluetooth route because it is no longer selectable: ").append(this.u);
                this.u = null;
            }
            if (this.u == null && !this.c.isEmpty()) {
                Iterator it2 = this.c.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    f fVar4 = (f) it2.next();
                    if (a(fVar4) && fVar4.d()) {
                        this.u = fVar4;
                        new StringBuilder("Found bluetooth route: ").append(this.u);
                        break;
                    }
                }
            }
            f fVar5 = this.h;
            if (fVar5 == null || !fVar5.g) {
                new StringBuilder("Unselecting the current route because it is no longer selectable: ").append(this.h);
                d(d(), 0);
                return;
            }
            if (z) {
                if (this.h.f()) {
                    List<f> unmodifiableList = Collections.unmodifiableList(this.h.s);
                    HashSet hashSet = new HashSet();
                    for (f fVar6 : unmodifiableList) {
                        hashSet.add(fVar6.c);
                    }
                    Iterator it3 = this.v.entrySet().iterator();
                    while (it3.hasNext()) {
                        Entry entry = (Entry) it3.next();
                        if (!hashSet.contains(entry.getKey())) {
                            defpackage.mz.e eVar2 = (defpackage.mz.e) entry.getValue();
                            eVar2.e();
                            eVar2.c();
                            it3.remove();
                        }
                    }
                    for (f fVar7 : unmodifiableList) {
                        if (!this.v.containsKey(fVar7.c)) {
                            e eVar3 = fVar7.a;
                            nd.e();
                            defpackage.mz.e a2 = eVar3.a.a(fVar7.b, this.h.b);
                            a2.d();
                            this.v.put(fVar7.c, a2);
                        }
                    }
                }
                e();
            }
        }

        /* access modifiers changed from: 0000 */
        public final f d() {
            Iterator it = this.c.iterator();
            while (it.hasNext()) {
                f fVar = (f) it.next();
                if (fVar != this.t && a(fVar) && fVar.d()) {
                    return fVar;
                }
            }
            return this.t;
        }

        private void d(f fVar, int i2) {
            if (nd.b == null || (this.u != null && fVar.b())) {
                StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
                StringBuilder sb = new StringBuilder();
                for (int i3 = 3; i3 < stackTrace.length; i3++) {
                    StackTraceElement stackTraceElement = stackTrace[i3];
                    sb.append(stackTraceElement.getClassName());
                    sb.append(".");
                    sb.append(stackTraceElement.getMethodName());
                    sb.append(":");
                    sb.append(stackTraceElement.getLineNumber());
                    sb.append("  ");
                }
                if (nd.b == null) {
                    StringBuilder sb2 = new StringBuilder("setSelectedRouteInternal is called while sGlobal is null: pkgName=");
                    sb2.append(this.a.getPackageName());
                    sb2.append(", callers=");
                    sb2.append(sb.toString());
                } else {
                    StringBuilder sb3 = new StringBuilder("Default route is selected while a BT route is available: pkgName=");
                    sb3.append(this.a.getPackageName());
                    sb3.append(", callers=");
                    sb3.append(sb.toString());
                }
            }
            f fVar2 = this.h;
            if (fVar2 != fVar) {
                if (fVar2 != null) {
                    if (nd.a) {
                        StringBuilder sb4 = new StringBuilder("Route unselected: ");
                        sb4.append(this.h);
                        sb4.append(" reason: ");
                        sb4.append(i2);
                    }
                    Message obtainMessage = this.e.obtainMessage(263, this.h);
                    obtainMessage.arg1 = i2;
                    obtainMessage.sendToTarget();
                    defpackage.mz.e eVar = this.i;
                    if (eVar != null) {
                        eVar.a(i2);
                        this.i.c();
                        this.i = null;
                    }
                    if (!this.v.isEmpty()) {
                        for (defpackage.mz.e eVar2 : this.v.values()) {
                            eVar2.a(i2);
                            eVar2.c();
                        }
                        this.v.clear();
                    }
                }
                e eVar3 = fVar.a;
                if (eVar3.d != null && eVar3.d.b) {
                    e eVar4 = fVar.a;
                    nd.e();
                    defpackage.mz.b b2 = eVar4.a.b(fVar.b);
                    Executor d2 = fr.d(this.a);
                    C0059b bVar = this.x;
                    synchronized (b2.a) {
                        if (d2 == null) {
                            throw new NullPointerException("Executor shouldn't be null");
                        } else if (bVar != null) {
                            b2.b = d2;
                            b2.c = bVar;
                            if (b2.d != null && !b2.d.isEmpty()) {
                                Collection<defpackage.mz.b.a> collection = b2.d;
                                b2.d = null;
                                b2.b.execute(new Runnable(collection) {
                                    private /* synthetic */ Collection a;

                                    {
                                        this.a = r2;
                                    }

                                    public final void run() {
                                        b.this.c.a(b.this, this.a);
                                    }
                                });
                            }
                        } else {
                            throw new NullPointerException("Listener shouldn't be null");
                        }
                    }
                    this.i = b2;
                    this.h = fVar;
                } else {
                    e eVar5 = fVar.a;
                    nd.e();
                    this.i = eVar5.a.a(fVar.b);
                    this.h = fVar;
                }
                defpackage.mz.e eVar6 = this.i;
                if (eVar6 != null) {
                    eVar6.d();
                }
                if (nd.a) {
                    new StringBuilder("Route selected: ").append(this.h);
                }
                this.e.a(262, this.h);
                if (this.h.f()) {
                    List<f> unmodifiableList = Collections.unmodifiableList(this.h.s);
                    this.v.clear();
                    for (f fVar3 : unmodifiableList) {
                        e eVar7 = fVar3.a;
                        nd.e();
                        defpackage.mz.e a2 = eVar7.a.a(fVar3.b, this.h.b);
                        a2.d();
                        this.v.put(fVar3.c, a2);
                    }
                }
                e();
            }
        }

        public final void b(String str) {
            this.e.removeMessages(262);
            e c2 = c((mz) this.f);
            if (c2 != null) {
                f b2 = c2.b(str);
                if (b2 != null) {
                    b2.e();
                }
            }
        }

        public final void a(Object obj) {
            if (c(obj) < 0) {
                this.p.add(new C0060d(obj));
            }
        }

        public final void b(Object obj) {
            int c2 = c(obj);
            if (c2 >= 0) {
                ((C0060d) this.p.remove(c2)).a();
            }
        }

        private int c(Object obj) {
            int size = this.p.size();
            for (int i2 = 0; i2 < size; i2++) {
                if (((C0060d) this.p.get(i2)).a.a() == obj) {
                    return i2;
                }
            }
            return -1;
        }

        /* access modifiers changed from: 0000 */
        public void e() {
            f fVar = this.h;
            if (fVar != null) {
                this.d.a = fVar.n;
                this.d.b = this.h.o;
                this.d.c = this.h.m;
                this.d.d = this.h.k;
                this.d.e = this.h.j;
                int size = this.p.size();
                int i2 = 0;
                for (int i3 = 0; i3 < size; i3++) {
                    ((C0060d) this.p.get(i3)).b();
                }
                if (this.j != null) {
                    if (this.h == a() || this.h == this.u) {
                        this.j.a();
                    } else {
                        if (this.d.c == 1) {
                            i2 = 2;
                        }
                        this.j.a(i2, this.d.b, this.d.a);
                    }
                }
                return;
            }
            b bVar = this.j;
            if (bVar != null) {
                bVar.a();
            }
        }

        private String b(e eVar, String str) {
            String flattenToShortString = eVar.c.a.flattenToShortString();
            StringBuilder sb = new StringBuilder();
            sb.append(flattenToShortString);
            sb.append(":");
            sb.append(str);
            String sb2 = sb.toString();
            if (c(sb2) < 0) {
                this.n.put(new ho(flattenToShortString, str), sb2);
                return sb2;
            }
            StringBuilder sb3 = new StringBuilder("Either ");
            sb3.append(str);
            sb3.append(" isn't unique in ");
            sb3.append(flattenToShortString);
            sb3.append(" or we're trying to assign a unique ID for an already added route");
            int i2 = 2;
            while (true) {
                String format = String.format(Locale.US, "%s_%d", new Object[]{sb2, Integer.valueOf(i2)});
                if (c(format) < 0) {
                    this.n.put(new ho(flattenToShortString, str), format);
                    return format;
                }
                i2++;
            }
        }

        /* access modifiers changed from: 0000 */
        public final String a(e eVar, String str) {
            return (String) this.n.get(new ho(eVar.c.a.flattenToShortString(), str));
        }

        private boolean a(f fVar) {
            e eVar = fVar.a;
            nd.e();
            return eVar.a == this.f && fVar.a("android.media.intent.category.LIVE_AUDIO") && !fVar.a("android.media.intent.category.LIVE_VIDEO");
        }
    }

    /* renamed from: nd$e */
    public static final class e {
        final mz a;
        final List<f> b = new ArrayList();
        final defpackage.mz.d c;
        na d;

        e(mz mzVar) {
            this.a = mzVar;
            this.c = mzVar.b;
        }

        public final String a() {
            return this.c.a.getPackageName();
        }

        public final List<f> b() {
            nd.e();
            return Collections.unmodifiableList(this.b);
        }

        /* access modifiers changed from: 0000 */
        public final boolean a(na naVar) {
            if (this.d == naVar) {
                return false;
            }
            this.d = naVar;
            return true;
        }

        /* access modifiers changed from: 0000 */
        public final int a(String str) {
            int size = this.b.size();
            for (int i = 0; i < size; i++) {
                if (((f) this.b.get(i)).b.equals(str)) {
                    return i;
                }
            }
            return -1;
        }

        /* access modifiers changed from: 0000 */
        public final f b(String str) {
            int size = this.b.size();
            for (int i = 0; i < size; i++) {
                if (((f) this.b.get(i)).b.equals(str)) {
                    return (f) this.b.get(i);
                }
            }
            return null;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("MediaRouter.RouteProviderInfo{ packageName=");
            sb.append(a());
            sb.append(" }");
            return sb.toString();
        }
    }

    /* renamed from: nd$f */
    public static class f {
        public final e a;
        final String b;
        public final String c;
        public String d;
        public String e;
        public Uri f;
        public boolean g;
        public int h;
        public boolean i;
        int j;
        int k;
        public int l;
        public int m;
        public int n;
        public int o;
        public int p = -1;
        public Bundle q;
        public defpackage.mz.b.a r;
        public List<f> s = new ArrayList();
        private final ArrayList<IntentFilter> t = new ArrayList<>();
        private Display u;
        private IntentSender v;
        private mx w;
        private a x;

        /* renamed from: nd$f$a */
        public class a {
            public a() {
            }

            public final boolean a() {
                return f.this.r == null || f.this.r.c;
            }

            public final boolean b() {
                return f.this.r != null && f.this.r.d;
            }

            public final boolean c() {
                return f.this.r != null && f.this.r.e;
            }
        }

        f(e eVar, String str, String str2) {
            this.a = eVar;
            this.b = str;
            this.c = str2;
        }

        public final boolean a() {
            nd.e();
            return nd.b.b() == this;
        }

        public final boolean b() {
            nd.e();
            return nd.b.a() == this;
        }

        public final boolean a(nc ncVar) {
            if (ncVar != null) {
                nd.e();
                return ncVar.a((List<IntentFilter>) this.t);
            }
            throw new IllegalArgumentException("selector must not be null");
        }

        public final boolean a(String str) {
            nd.e();
            int size = this.t.size();
            for (int i2 = 0; i2 < size; i2++) {
                if (((IntentFilter) this.t.get(i2)).hasCategory(str)) {
                    return true;
                }
            }
            return false;
        }

        public final boolean c() {
            if (b() || this.l == 3) {
                return true;
            }
            if (!a(this) || !a("android.media.intent.category.LIVE_AUDIO") || a("android.media.intent.category.LIVE_VIDEO")) {
                return false;
            }
            return true;
        }

        /* access modifiers changed from: 0000 */
        public final boolean d() {
            return this.w != null && this.g;
        }

        public final void a(int i2) {
            nd.e();
            nd.b.a(this, Math.min(this.o, Math.max(0, i2)));
        }

        public final void b(int i2) {
            nd.e();
            if (i2 != 0) {
                nd.b.b(this, i2);
            }
        }

        public final void e() {
            nd.e();
            nd.b.c(this, 3);
        }

        public final a g() {
            if (this.x == null && this.r != null) {
                this.x = new a();
            }
            return this.x;
        }

        public static defpackage.mz.b h() {
            defpackage.mz.e eVar = nd.b.i;
            if (eVar instanceof defpackage.mz.b) {
                return (defpackage.mz.b) eVar;
            }
            return null;
        }

        public final String toString() {
            if (f()) {
                StringBuilder sb = new StringBuilder(super.toString());
                sb.append('[');
                int size = this.s.size();
                for (int i2 = 0; i2 < size; i2++) {
                    if (i2 > 0) {
                        sb.append(", ");
                    }
                    sb.append(this.s.get(i2));
                }
                sb.append(']');
                return sb.toString();
            }
            StringBuilder sb2 = new StringBuilder("MediaRouter.RouteInfo{ uniqueId=");
            sb2.append(this.c);
            sb2.append(", name=");
            sb2.append(this.d);
            sb2.append(", description=");
            sb2.append(this.e);
            sb2.append(", iconUri=");
            sb2.append(this.f);
            sb2.append(", enabled=");
            sb2.append(this.g);
            sb2.append(", connectionState=");
            sb2.append(this.h);
            sb2.append(", canDisconnect=");
            sb2.append(this.i);
            sb2.append(", playbackType=");
            sb2.append(this.j);
            sb2.append(", playbackStream=");
            sb2.append(this.k);
            sb2.append(", deviceType=");
            sb2.append(this.l);
            sb2.append(", volumeHandling=");
            sb2.append(this.m);
            sb2.append(", volume=");
            sb2.append(this.n);
            sb2.append(", volumeMax=");
            sb2.append(this.o);
            sb2.append(", presentationDisplayId=");
            sb2.append(this.p);
            sb2.append(", extras=");
            sb2.append(this.q);
            sb2.append(", settingsIntent=");
            sb2.append(this.v);
            sb2.append(", providerPackageName=");
            sb2.append(this.a.a());
            sb2.append(" }");
            return sb2.toString();
        }

        /* access modifiers changed from: 0000 */
        public final int a(mx mxVar) {
            if (this.w != mxVar) {
                return b(mxVar);
            }
            return 0;
        }

        /* JADX WARNING: Removed duplicated region for block: B:41:0x0077 A[SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private boolean a(java.util.List<android.content.IntentFilter> r9, java.util.List<android.content.IntentFilter> r10) {
            /*
                r8 = this;
                r0 = 1
                if (r9 != r10) goto L_0x0004
                return r0
            L_0x0004:
                r1 = 0
                if (r9 == 0) goto L_0x0085
                if (r10 != 0) goto L_0x000b
                goto L_0x0085
            L_0x000b:
                java.util.ListIterator r9 = r9.listIterator()
                java.util.ListIterator r10 = r10.listIterator()
            L_0x0013:
                boolean r2 = r9.hasNext()
                if (r2 == 0) goto L_0x0078
                boolean r2 = r10.hasNext()
                if (r2 == 0) goto L_0x0078
                java.lang.Object r2 = r9.next()
                android.content.IntentFilter r2 = (android.content.IntentFilter) r2
                java.lang.Object r3 = r10.next()
                android.content.IntentFilter r3 = (android.content.IntentFilter) r3
                if (r2 == r3) goto L_0x0074
                if (r2 == 0) goto L_0x0072
                if (r3 != 0) goto L_0x0032
                goto L_0x0072
            L_0x0032:
                int r4 = r2.countActions()
                int r5 = r3.countActions()
                if (r4 == r5) goto L_0x003d
                goto L_0x0072
            L_0x003d:
                r5 = 0
            L_0x003e:
                if (r5 >= r4) goto L_0x0052
                java.lang.String r6 = r2.getAction(r5)
                java.lang.String r7 = r3.getAction(r5)
                boolean r6 = r6.equals(r7)
                if (r6 != 0) goto L_0x004f
                goto L_0x0072
            L_0x004f:
                int r5 = r5 + 1
                goto L_0x003e
            L_0x0052:
                int r4 = r2.countCategories()
                int r5 = r3.countCategories()
                if (r4 == r5) goto L_0x005d
                goto L_0x0072
            L_0x005d:
                r5 = 0
            L_0x005e:
                if (r5 >= r4) goto L_0x0074
                java.lang.String r6 = r2.getCategory(r5)
                java.lang.String r7 = r3.getCategory(r5)
                boolean r6 = r6.equals(r7)
                if (r6 != 0) goto L_0x006f
                goto L_0x0072
            L_0x006f:
                int r5 = r5 + 1
                goto L_0x005e
            L_0x0072:
                r2 = 0
                goto L_0x0075
            L_0x0074:
                r2 = 1
            L_0x0075:
                if (r2 != 0) goto L_0x0013
                return r1
            L_0x0078:
                boolean r9 = r9.hasNext()
                if (r9 != 0) goto L_0x0085
                boolean r9 = r10.hasNext()
                if (r9 != 0) goto L_0x0085
                return r0
            L_0x0085:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.nd.f.a(java.util.List, java.util.List):boolean");
        }

        private int b(mx mxVar) {
            int i2;
            this.w = mxVar;
            boolean z = false;
            if (mxVar == null) {
                return 0;
            }
            if (!hn.a(this.d, mxVar.c())) {
                this.d = mxVar.c();
                i2 = 1;
            } else {
                i2 = 0;
            }
            if (!hn.a(this.e, mxVar.d())) {
                this.e = mxVar.d();
                i2 = 1;
            }
            if (!hn.a(this.f, mxVar.e())) {
                this.f = mxVar.e();
                i2 = 1;
            }
            if (this.g != mxVar.f()) {
                this.g = mxVar.f();
                i2 |= 1;
            }
            if (this.h != mxVar.g()) {
                this.h = mxVar.g();
                i2 |= 1;
            }
            if (!a(this.t, mxVar.j())) {
                this.t.clear();
                this.t.addAll(mxVar.j());
                i2 |= 1;
            }
            if (this.j != mxVar.k()) {
                this.j = mxVar.k();
                i2 |= 1;
            }
            if (this.k != mxVar.l()) {
                this.k = mxVar.l();
                i2 |= 1;
            }
            if (this.l != mxVar.m()) {
                this.l = mxVar.m();
                i2 |= 1;
            }
            if (this.m != mxVar.p()) {
                this.m = mxVar.p();
                i2 |= 3;
            }
            if (this.n != mxVar.n()) {
                this.n = mxVar.n();
                i2 |= 3;
            }
            if (this.o != mxVar.o()) {
                this.o = mxVar.o();
                i2 |= 3;
            }
            if (this.p != mxVar.q()) {
                this.p = mxVar.q();
                this.u = null;
                i2 |= 5;
            }
            if (!hn.a(this.q, mxVar.r())) {
                this.q = mxVar.r();
                i2 |= 1;
            }
            if (!hn.a(this.v, mxVar.i())) {
                this.v = mxVar.i();
                i2 |= 1;
            }
            if (this.i != mxVar.h()) {
                this.i = mxVar.h();
                i2 |= 5;
            }
            List<String> b2 = mxVar.b();
            ArrayList arrayList = new ArrayList();
            if (b2.size() != this.s.size()) {
                z = true;
            }
            for (String a2 : b2) {
                f a3 = nd.b.a(nd.b.a(this.a, a2));
                if (a3 != null) {
                    arrayList.add(a3);
                    if (!z && !this.s.contains(a3)) {
                        z = true;
                    }
                }
            }
            if (!z) {
                return i2;
            }
            this.s = arrayList;
            return i2 | 1;
        }

        public final mz i() {
            e eVar = this.a;
            nd.e();
            return eVar.a;
        }

        private static boolean a(f fVar) {
            e eVar = fVar.a;
            nd.e();
            return TextUtils.equals(eVar.a.b.a.getPackageName(), "android");
        }

        public final boolean f() {
            return Collections.unmodifiableList(this.s).size() > 0;
        }
    }

    nd(Context context) {
        this.c = context;
    }

    public static nd a(Context context) {
        if (context != null) {
            e();
            if (b == null) {
                d dVar = new d(context.getApplicationContext());
                b = dVar;
                dVar.a((mz) dVar.f);
                dVar.g = new nh(dVar.a, dVar);
                nh nhVar = dVar.g;
                if (!nhVar.c) {
                    nhVar.c = true;
                    IntentFilter intentFilter = new IntentFilter();
                    intentFilter.addAction("android.intent.action.PACKAGE_ADDED");
                    intentFilter.addAction("android.intent.action.PACKAGE_REMOVED");
                    intentFilter.addAction("android.intent.action.PACKAGE_CHANGED");
                    intentFilter.addAction("android.intent.action.PACKAGE_REPLACED");
                    intentFilter.addAction("android.intent.action.PACKAGE_RESTARTED");
                    intentFilter.addDataScheme("package");
                    nhVar.a.registerReceiver(nhVar.d, intentFilter, null, nhVar.b);
                    nhVar.b.post(nhVar.e);
                }
            }
            return b.a(context);
        }
        throw new IllegalArgumentException("context must not be null");
    }

    public static List<f> a() {
        e();
        return b.c;
    }

    public static f b() {
        e();
        return b.a();
    }

    public static f c() {
        e();
        return b.b();
    }

    public static void a(f fVar) {
        if (fVar != null) {
            e();
            if (a) {
                new StringBuilder("selectRoute: ").append(fVar);
            }
            b.c(fVar, 3);
            return;
        }
        throw new IllegalArgumentException("route must not be null");
    }

    public static void a(int i) {
        if (i < 0 || i > 3) {
            throw new IllegalArgumentException("Unsupported reason to unselect route");
        }
        e();
        f d2 = b.d();
        if (b.b() != d2) {
            b.c(d2, i);
            return;
        }
        d dVar = b;
        dVar.c(dVar.a(), i);
    }

    public static void b(f fVar) {
        e();
        d dVar = b;
        if (dVar.h.g() == null || !(dVar.i instanceof defpackage.mz.b)) {
            throw new IllegalStateException("There is no currently selected dynamic group route.");
        }
        a g = fVar.g();
        if (Collections.unmodifiableList(dVar.h.s).contains(fVar) || g == null || !g.b()) {
            new StringBuilder("Ignoring attemp to add a non-groupable route to dynamic group : ").append(fVar);
        } else {
            ((defpackage.mz.b) dVar.i).a(fVar.b);
        }
    }

    public static void c(f fVar) {
        e();
        d dVar = b;
        if (dVar.h.g() == null || !(dVar.i instanceof defpackage.mz.b)) {
            throw new IllegalStateException("There is no currently selected dynamic group route.");
        }
        a g = fVar.g();
        if (!Collections.unmodifiableList(dVar.h.s).contains(fVar) || g == null || !g.a()) {
            new StringBuilder("Ignoring attempt to remove a non-unselectable member route : ").append(fVar);
            return;
        }
        if (Collections.unmodifiableList(dVar.h.s).size() > 1) {
            ((defpackage.mz.b) dVar.i).b(fVar.b);
        }
    }

    public static boolean a(nc ncVar, int i) {
        if (ncVar != null) {
            e();
            return b.a(ncVar, i);
        }
        throw new IllegalArgumentException("selector must not be null");
    }

    public final void a(nc ncVar, a aVar, int i) {
        b bVar;
        if (ncVar == null) {
            throw new IllegalArgumentException("selector must not be null");
        } else if (aVar != null) {
            e();
            if (a) {
                StringBuilder sb = new StringBuilder("addCallback: selector=");
                sb.append(ncVar);
                sb.append(", callback=");
                sb.append(aVar);
                sb.append(", flags=");
                sb.append(Integer.toHexString(i));
            }
            int b2 = b(aVar);
            if (b2 < 0) {
                bVar = new b(this, aVar);
                this.d.add(bVar);
            } else {
                bVar = (b) this.d.get(b2);
            }
            boolean z = false;
            if (((bVar.d ^ -1) & i) != 0) {
                bVar.d |= i;
                z = true;
            }
            if (!bVar.c.a(ncVar)) {
                bVar.c = new defpackage.nc.a(bVar.c).a(ncVar).a();
                z = true;
            }
            if (z) {
                b.c();
            }
        } else {
            throw new IllegalArgumentException("callback must not be null");
        }
    }

    public final void a(a aVar) {
        if (aVar != null) {
            e();
            if (a) {
                new StringBuilder("removeCallback: callback=").append(aVar);
            }
            int b2 = b(aVar);
            if (b2 >= 0) {
                this.d.remove(b2);
                b.c();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("callback must not be null");
    }

    private int b(a aVar) {
        int size = this.d.size();
        for (int i = 0; i < size; i++) {
            if (((b) this.d.get(i)).b == aVar) {
                return i;
            }
        }
        return -1;
    }

    public static void a(MediaSessionCompat mediaSessionCompat) {
        if (a) {
            new StringBuilder("addMediaSessionCompat: ").append(mediaSessionCompat);
        }
        d dVar = b;
        dVar.l = mediaSessionCompat;
        b bVar = null;
        if (VERSION.SDK_INT >= 21) {
            if (mediaSessionCompat != null) {
                bVar = new b(mediaSessionCompat);
            }
            if (dVar.j != null) {
                dVar.j.a();
            }
            dVar.j = bVar;
            if (bVar != null) {
                dVar.e();
            }
            return;
        }
        if (VERSION.SDK_INT >= 14) {
            String str = "Listener may not be null";
            if (dVar.k != null) {
                MediaSessionCompat mediaSessionCompat2 = dVar.k;
                dVar.b((Object) null);
                MediaSessionCompat mediaSessionCompat3 = dVar.k;
                h hVar = dVar.m;
                if (hVar != null) {
                    mediaSessionCompat3.c.remove(hVar);
                } else {
                    throw new IllegalArgumentException(str);
                }
            }
            dVar.k = mediaSessionCompat;
            if (mediaSessionCompat != null) {
                h hVar2 = dVar.m;
                if (hVar2 != null) {
                    mediaSessionCompat.c.add(hVar2);
                    if (mediaSessionCompat.a()) {
                        dVar.a((Object) null);
                    }
                } else {
                    throw new IllegalArgumentException(str);
                }
            }
        }
    }

    public static Token d() {
        d dVar = b;
        Token token = null;
        if (dVar.j != null) {
            b bVar = dVar.j;
            if (bVar.a == null) {
                return null;
            }
            token = bVar.a.c();
        } else if (dVar.l != null) {
            return dVar.l.c();
        }
        return token;
    }

    static void e() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("The media router service must only be accessed on the application's main thread.");
        }
    }
}
