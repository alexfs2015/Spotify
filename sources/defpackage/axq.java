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

/* renamed from: axq reason: default package */
public interface axq {

    /* renamed from: axq$a */
    public static final class a {
        public final int a;
        public final defpackage.axp.a b;
        private final CopyOnWriteArrayList<C0015a> c;
        private final long d;

        /* renamed from: axq$a$a reason: collision with other inner class name */
        static final class C0015a {
            public final Handler a;
            public final axq b;

            public C0015a(Handler handler, axq axq) {
                this.a = handler;
                this.b = axq;
            }
        }

        public a() {
            this(new CopyOnWriteArrayList(), 0, null, 0);
        }

        private a(CopyOnWriteArrayList<C0015a> copyOnWriteArrayList, int i, defpackage.axp.a aVar, long j) {
            this.c = copyOnWriteArrayList;
            this.a = i;
            this.b = aVar;
            this.d = j;
        }

        public final a a(int i, defpackage.axp.a aVar, long j) {
            a aVar2 = new a(this.c, i, aVar, j);
            return aVar2;
        }

        public final void a(Handler handler, axq axq) {
            bcu.a((handler == null || axq == null) ? false : true);
            this.c.add(new C0015a(handler, axq));
        }

        public final void a(axq axq) {
            Iterator it = this.c.iterator();
            while (it.hasNext()) {
                C0015a aVar = (C0015a) it.next();
                if (aVar.b == axq) {
                    this.c.remove(aVar);
                }
            }
        }

        public final void a() {
            defpackage.axp.a aVar = (defpackage.axp.a) bcu.a(this.b);
            Iterator it = this.c.iterator();
            while (it.hasNext()) {
                C0015a aVar2 = (C0015a) it.next();
                a(aVar2.a, (Runnable) new $$Lambda$axq$a$06dMZ_eu5d_9kS9nnoP3rVwKm2w(this, aVar2.b, aVar));
            }
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void c(axq axq, defpackage.axp.a aVar) {
            axq.a(this.a, aVar);
        }

        public final void b() {
            defpackage.axp.a aVar = (defpackage.axp.a) bcu.a(this.b);
            Iterator it = this.c.iterator();
            while (it.hasNext()) {
                C0015a aVar2 = (C0015a) it.next();
                a(aVar2.a, (Runnable) new $$Lambda$axq$a$lDbJ5u3k3zisnvERAbUqrWUsTY(this, aVar2.b, aVar));
            }
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void b(axq axq, defpackage.axp.a aVar) {
            axq.b(this.a, aVar);
        }

        public final void a(bbp bbp, int i, long j) {
            a(bbp, i, -1, (aqe) null, 0, (Object) null, -9223372036854775807L, -9223372036854775807L, j);
        }

        public final void a(bbp bbp, int i, int i2, aqe aqe, int i3, Object obj, long j, long j2, long j3) {
            bbp bbp2 = bbp;
            b bVar = new b(bbp2, bbp2.a, Collections.emptyMap(), j3, 0, 0);
            c cVar = new c(i, i2, aqe, i3, obj, a(j), a(j2));
            a(bVar, cVar);
        }

        public final void a(b bVar, c cVar) {
            Iterator it = this.c.iterator();
            while (it.hasNext()) {
                C0015a aVar = (C0015a) it.next();
                a(aVar.a, (Runnable) new $$Lambda$axq$a$HybjPA6cFi8GV59xCeUmqCNzyE(this, aVar.b, bVar, cVar));
            }
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void c(axq axq, b bVar, c cVar) {
            axq.a(this.a, this.b, bVar, cVar);
        }

        public final void a(bbp bbp, Uri uri, Map<String, List<String>> map, int i, long j, long j2, long j3) {
            a(bbp, uri, map, i, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, j, j2, j3);
        }

        public final void a(bbp bbp, Uri uri, Map<String, List<String>> map, int i, int i2, aqe aqe, int i3, Object obj, long j, long j2, long j3, long j4, long j5) {
            b bVar = new b(bbp, uri, map, j3, j4, j5);
            c cVar = new c(i, i2, aqe, i3, obj, a(j), a(j2));
            b(bVar, cVar);
        }

        public final void b(b bVar, c cVar) {
            Iterator it = this.c.iterator();
            while (it.hasNext()) {
                C0015a aVar = (C0015a) it.next();
                a(aVar.a, (Runnable) new $$Lambda$axq$a$6r7ZFN57BA8DJPcN3XNcjWW70Js(this, aVar.b, bVar, cVar));
            }
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void b(axq axq, b bVar, c cVar) {
            axq.b(this.a, this.b, bVar, cVar);
        }

        public final void b(bbp bbp, Uri uri, Map<String, List<String>> map, int i, long j, long j2, long j3) {
            b(bbp, uri, map, i, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, j, j2, j3);
        }

        public final void b(bbp bbp, Uri uri, Map<String, List<String>> map, int i, int i2, aqe aqe, int i3, Object obj, long j, long j2, long j3, long j4, long j5) {
            b bVar = new b(bbp, uri, map, j3, j4, j5);
            c cVar = new c(i, i2, aqe, i3, obj, a(j), a(j2));
            c(bVar, cVar);
        }

        public final void c(b bVar, c cVar) {
            Iterator it = this.c.iterator();
            while (it.hasNext()) {
                C0015a aVar = (C0015a) it.next();
                a(aVar.a, (Runnable) new $$Lambda$axq$a$nPzqaC6eNoVbU9pvvevlBONSg8Q(this, aVar.b, bVar, cVar));
            }
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void a(axq axq, b bVar, c cVar) {
            axq.c(this.a, this.b, bVar, cVar);
        }

        public final void a(bbp bbp, Uri uri, Map<String, List<String>> map, int i, long j, long j2, long j3, IOException iOException, boolean z) {
            a(bbp, uri, map, i, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, j, j2, j3, iOException, z);
        }

        public final void a(bbp bbp, Uri uri, Map<String, List<String>> map, int i, int i2, aqe aqe, int i3, Object obj, long j, long j2, long j3, long j4, long j5, IOException iOException, boolean z) {
            b bVar = new b(bbp, uri, map, j3, j4, j5);
            c cVar = new c(i, i2, aqe, i3, obj, a(j), a(j2));
            a(bVar, cVar, iOException, z);
        }

        public final void a(b bVar, c cVar, IOException iOException, boolean z) {
            Iterator it = this.c.iterator();
            while (it.hasNext()) {
                C0015a aVar = (C0015a) it.next();
                axq axq = aVar.b;
                Handler handler = aVar.a;
                $$Lambda$axq$a$Hb5aGSa5DOp_eK9xxwQjVi7F8 r2 = new $$Lambda$axq$a$Hb5aGSa5DOp_eK9xxwQjVi7F8(this, axq, bVar, cVar, iOException, z);
                a(handler, (Runnable) r2);
            }
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void a(axq axq, b bVar, c cVar, IOException iOException, boolean z) {
            axq.a(this.a, this.b, bVar, cVar, iOException, z);
        }

        public final void c() {
            defpackage.axp.a aVar = (defpackage.axp.a) bcu.a(this.b);
            Iterator it = this.c.iterator();
            while (it.hasNext()) {
                C0015a aVar2 = (C0015a) it.next();
                a(aVar2.a, (Runnable) new $$Lambda$axq$a$P3mGo3OeWcaSS7POW4vIJq7izY(this, aVar2.b, aVar));
            }
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void a(axq axq, defpackage.axp.a aVar) {
            axq.c(this.a, aVar);
        }

        public final void a(int i, long j, long j2) {
            long j3 = j;
            c cVar = new c(1, i, null, 3, null, a(j), a(j2));
            a(cVar);
        }

        public final void a(c cVar) {
            defpackage.axp.a aVar = (defpackage.axp.a) bcu.a(this.b);
            Iterator it = this.c.iterator();
            while (it.hasNext()) {
                C0015a aVar2 = (C0015a) it.next();
                a(aVar2.a, (Runnable) new $$Lambda$axq$a$KmxxEbgYKs2uca3SWOOTGBZGsUc(this, aVar2.b, aVar, cVar));
            }
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void a(axq axq, defpackage.axp.a aVar, c cVar) {
            axq.a(this.a, aVar, cVar);
        }

        public final void a(int i, aqe aqe, int i2, Object obj, long j) {
            c cVar = new c(1, i, aqe, i2, obj, a(j), -9223372036854775807L);
            b(cVar);
        }

        public final void b(c cVar) {
            Iterator it = this.c.iterator();
            while (it.hasNext()) {
                C0015a aVar = (C0015a) it.next();
                a(aVar.a, (Runnable) new $$Lambda$axq$a$ok3dYUmq0_J6PooJk3KYjli9Gv8(this, aVar.b, cVar));
            }
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void a(axq axq, c cVar) {
            axq.b(this.a, this.b, cVar);
        }

        private long a(long j) {
            long a2 = apv.a(j);
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
    }

    /* renamed from: axq$b */
    public static final class b {
        private bbp a;
        private Uri b;
        private Map<String, List<String>> c;
        private long d;
        private long e;
        private long f;

        public b(bbp bbp, Uri uri, Map<String, List<String>> map, long j, long j2, long j3) {
            this.a = bbp;
            this.b = uri;
            this.c = map;
            this.d = j;
            this.e = j2;
            this.f = j3;
        }
    }

    /* renamed from: axq$c */
    public static final class c {
        public final int a;
        public final int b;
        public final aqe c;
        public final int d;
        public final Object e;
        public final long f;
        public final long g;

        public c(int i, int i2, aqe aqe, int i3, Object obj, long j, long j2) {
            this.a = i;
            this.b = i2;
            this.c = aqe;
            this.d = i3;
            this.e = obj;
            this.f = j;
            this.g = j2;
        }
    }

    void a(int i, defpackage.axp.a aVar);

    void a(int i, defpackage.axp.a aVar, b bVar, c cVar);

    void a(int i, defpackage.axp.a aVar, b bVar, c cVar, IOException iOException, boolean z);

    void a(int i, defpackage.axp.a aVar, c cVar);

    void b(int i, defpackage.axp.a aVar);

    void b(int i, defpackage.axp.a aVar, b bVar, c cVar);

    void b(int i, defpackage.axp.a aVar, c cVar);

    void c(int i, defpackage.axp.a aVar);

    void c(int i, defpackage.axp.a aVar, b bVar, c cVar);
}
