package defpackage;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: ayh reason: default package */
public interface ayh {

    /* renamed from: ayh$a */
    public static final class a {
        public final int a;
        public final defpackage.ayg.a b;
        private final CopyOnWriteArrayList<C0015a> c;
        private final long d;

        /* renamed from: ayh$a$a reason: collision with other inner class name */
        static final class C0015a {
            public final Handler a;
            public final ayh b;

            public C0015a(Handler handler, ayh ayh) {
                this.a = handler;
                this.b = ayh;
            }
        }

        public a() {
            this(new CopyOnWriteArrayList(), 0, null, 0);
        }

        private a(CopyOnWriteArrayList<C0015a> copyOnWriteArrayList, int i, defpackage.ayg.a aVar, long j) {
            this.c = copyOnWriteArrayList;
            this.a = i;
            this.b = aVar;
            this.d = j;
        }

        private long a(long j) {
            long a2 = aqm.a(j);
            if (a2 == -9223372036854775807L) {
                return -9223372036854775807L;
            }
            return this.d + a2;
        }

        private static void a(Handler handler, Runnable runnable) {
            if (handler.getLooper() == Looper.myLooper()) {
                runnable.run();
            } else {
                handler.post(runnable);
            }
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void a(ayh ayh, defpackage.ayg.a aVar) {
            ayh.c(this.a, aVar);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void a(ayh ayh, defpackage.ayg.a aVar, c cVar) {
            ayh.a(this.a, aVar, cVar);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void a(ayh ayh, b bVar, c cVar) {
            ayh.c(this.a, this.b, bVar, cVar);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void a(ayh ayh, b bVar, c cVar, IOException iOException, boolean z) {
            ayh.a(this.a, this.b, bVar, cVar, iOException, z);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void a(ayh ayh, c cVar) {
            ayh.b(this.a, this.b, cVar);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void b(ayh ayh, defpackage.ayg.a aVar) {
            ayh.b(this.a, aVar);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void b(ayh ayh, b bVar, c cVar) {
            ayh.b(this.a, this.b, bVar, cVar);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void c(ayh ayh, defpackage.ayg.a aVar) {
            ayh.a(this.a, aVar);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void c(ayh ayh, b bVar, c cVar) {
            ayh.a(this.a, this.b, bVar, cVar);
        }

        public final a a(int i, defpackage.ayg.a aVar, long j) {
            a aVar2 = new a(this.c, i, aVar, j);
            return aVar2;
        }

        public final void a() {
            defpackage.ayg.a aVar = (defpackage.ayg.a) bdl.a(this.b);
            Iterator it = this.c.iterator();
            while (it.hasNext()) {
                C0015a aVar2 = (C0015a) it.next();
                a(aVar2.a, (Runnable) new $$Lambda$ayh$a$A5ZZwlGPseV2eI2_02E4F5c3se0(this, aVar2.b, aVar));
            }
        }

        public final void a(int i, long j, long j2) {
            long j3 = j;
            c cVar = new c(1, i, null, 3, null, a(j), a(j2));
            a(cVar);
        }

        public final void a(int i, aqv aqv, int i2, Object obj, long j) {
            c cVar = new c(1, i, aqv, i2, obj, a(j), -9223372036854775807L);
            b(cVar);
        }

        public final void a(Handler handler, ayh ayh) {
            bdl.a((handler == null || ayh == null) ? false : true);
            this.c.add(new C0015a(handler, ayh));
        }

        public final void a(b bVar, c cVar) {
            Iterator it = this.c.iterator();
            while (it.hasNext()) {
                C0015a aVar = (C0015a) it.next();
                a(aVar.a, (Runnable) new $$Lambda$ayh$a$KX5p2PxQvVh4C_U5bCrqPZCqlGI(this, aVar.b, bVar, cVar));
            }
        }

        public final void a(b bVar, c cVar, IOException iOException, boolean z) {
            Iterator it = this.c.iterator();
            while (it.hasNext()) {
                C0015a aVar = (C0015a) it.next();
                ayh ayh = aVar.b;
                Handler handler = aVar.a;
                $$Lambda$ayh$a$kRdYsh59Mfw9VXqEGAZl6Nsho04 r2 = new $$Lambda$ayh$a$kRdYsh59Mfw9VXqEGAZl6Nsho04(this, ayh, bVar, cVar, iOException, z);
                a(handler, (Runnable) r2);
            }
        }

        public final void a(c cVar) {
            defpackage.ayg.a aVar = (defpackage.ayg.a) bdl.a(this.b);
            Iterator it = this.c.iterator();
            while (it.hasNext()) {
                C0015a aVar2 = (C0015a) it.next();
                a(aVar2.a, (Runnable) new $$Lambda$ayh$a$oUuCd4I2zpMktI9cMdjQh9TRnk(this, aVar2.b, aVar, cVar));
            }
        }

        public final void a(ayh ayh) {
            Iterator it = this.c.iterator();
            while (it.hasNext()) {
                C0015a aVar = (C0015a) it.next();
                if (aVar.b == ayh) {
                    this.c.remove(aVar);
                }
            }
        }

        public final void a(bcg bcg, int i, int i2, aqv aqv, int i3, Object obj, long j, long j2, long j3) {
            bcg bcg2 = bcg;
            b bVar = new b(bcg2, bcg2.a, Collections.emptyMap(), j3, 0, 0);
            c cVar = new c(i, i2, aqv, i3, obj, a(j), a(j2));
            a(bVar, cVar);
        }

        public final void a(bcg bcg, int i, long j) {
            a(bcg, i, -1, (aqv) null, 0, (Object) null, -9223372036854775807L, -9223372036854775807L, j);
        }

        public final void a(bcg bcg, Uri uri, Map<String, List<String>> map, int i, int i2, aqv aqv, int i3, Object obj, long j, long j2, long j3, long j4, long j5) {
            b bVar = new b(bcg, uri, map, j3, j4, j5);
            c cVar = new c(i, i2, aqv, i3, obj, a(j), a(j2));
            b(bVar, cVar);
        }

        public final void a(bcg bcg, Uri uri, Map<String, List<String>> map, int i, int i2, aqv aqv, int i3, Object obj, long j, long j2, long j3, long j4, long j5, IOException iOException, boolean z) {
            b bVar = new b(bcg, uri, map, j3, j4, j5);
            c cVar = new c(i, i2, aqv, i3, obj, a(j), a(j2));
            a(bVar, cVar, iOException, z);
        }

        public final void a(bcg bcg, Uri uri, Map<String, List<String>> map, int i, long j, long j2, long j3) {
            a(bcg, uri, map, i, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, j, j2, j3);
        }

        public final void a(bcg bcg, Uri uri, Map<String, List<String>> map, int i, long j, long j2, long j3, IOException iOException, boolean z) {
            a(bcg, uri, map, i, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, j, j2, j3, iOException, z);
        }

        public final void b() {
            defpackage.ayg.a aVar = (defpackage.ayg.a) bdl.a(this.b);
            Iterator it = this.c.iterator();
            while (it.hasNext()) {
                C0015a aVar2 = (C0015a) it.next();
                a(aVar2.a, (Runnable) new $$Lambda$ayh$a$pBYb_7rcLYT6hcJ_QfYkwj7YkfE(this, aVar2.b, aVar));
            }
        }

        public final void b(b bVar, c cVar) {
            Iterator it = this.c.iterator();
            while (it.hasNext()) {
                C0015a aVar = (C0015a) it.next();
                a(aVar.a, (Runnable) new $$Lambda$ayh$a$1MW239u93UjODL8wVLRsjXa0OdE(this, aVar.b, bVar, cVar));
            }
        }

        public final void b(c cVar) {
            Iterator it = this.c.iterator();
            while (it.hasNext()) {
                C0015a aVar = (C0015a) it.next();
                a(aVar.a, (Runnable) new $$Lambda$ayh$a$6pNzfhdDAV5oapVm7qmErszoQ3w(this, aVar.b, cVar));
            }
        }

        public final void b(bcg bcg, Uri uri, Map<String, List<String>> map, int i, int i2, aqv aqv, int i3, Object obj, long j, long j2, long j3, long j4, long j5) {
            b bVar = new b(bcg, uri, map, j3, j4, j5);
            c cVar = new c(i, i2, aqv, i3, obj, a(j), a(j2));
            c(bVar, cVar);
        }

        public final void b(bcg bcg, Uri uri, Map<String, List<String>> map, int i, long j, long j2, long j3) {
            b(bcg, uri, map, i, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, j, j2, j3);
        }

        public final void c() {
            defpackage.ayg.a aVar = (defpackage.ayg.a) bdl.a(this.b);
            Iterator it = this.c.iterator();
            while (it.hasNext()) {
                C0015a aVar2 = (C0015a) it.next();
                a(aVar2.a, (Runnable) new $$Lambda$ayh$a$IWzarSzscEIFsyjSPunAVz4qTU(this, aVar2.b, aVar));
            }
        }

        public final void c(b bVar, c cVar) {
            Iterator it = this.c.iterator();
            while (it.hasNext()) {
                C0015a aVar = (C0015a) it.next();
                a(aVar.a, (Runnable) new $$Lambda$ayh$a$iJJvOyTDIL0RO6jMuUXHYjk1Bw(this, aVar.b, bVar, cVar));
            }
        }
    }

    /* renamed from: ayh$b */
    public static final class b {
        private bcg a;
        private Uri b;
        private Map<String, List<String>> c;
        private long d;
        private long e;
        private long f;

        public b(bcg bcg, Uri uri, Map<String, List<String>> map, long j, long j2, long j3) {
            this.a = bcg;
            this.b = uri;
            this.c = map;
            this.d = j;
            this.e = j2;
            this.f = j3;
        }
    }

    /* renamed from: ayh$c */
    public static final class c {
        public final int a;
        public final int b;
        public final aqv c;
        public final int d;
        public final Object e;
        public final long f;
        public final long g;

        public c(int i, int i2, aqv aqv, int i3, Object obj, long j, long j2) {
            this.a = i;
            this.b = i2;
            this.c = aqv;
            this.d = i3;
            this.e = obj;
            this.f = j;
            this.g = j2;
        }
    }

    void a(int i, defpackage.ayg.a aVar);

    void a(int i, defpackage.ayg.a aVar, b bVar, c cVar);

    void a(int i, defpackage.ayg.a aVar, b bVar, c cVar, IOException iOException, boolean z);

    void a(int i, defpackage.ayg.a aVar, c cVar);

    void b(int i, defpackage.ayg.a aVar);

    void b(int i, defpackage.ayg.a aVar, b bVar, c cVar);

    void b(int i, defpackage.ayg.a aVar, c cVar);

    void c(int i, defpackage.ayg.a aVar);

    void c(int i, defpackage.ayg.a aVar, b bVar, c cVar);
}
