package defpackage;

import android.os.Bundle;
import android.os.Looper;
import androidx.lifecycle.LiveData;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;

/* renamed from: lz reason: default package */
final class lz extends ly {
    static boolean a = false;
    private final lh b;
    private final c c;

    /* renamed from: lz$a */
    public static class a<D> extends ln<D> implements defpackage.mb.a<D> {
        final int f;
        final Bundle g;
        final mb<D> h;
        b<D> i;
        private lh j;
        private mb<D> k;

        a(int i2, Bundle bundle, mb<D> mbVar, mb<D> mbVar2) {
            this.f = i2;
            this.g = bundle;
            this.h = mbVar;
            this.k = mbVar2;
            this.h.a(i2, this);
        }

        public final void a() {
            boolean z = lz.a;
            this.h.e();
        }

        public final void b() {
            boolean z = lz.a;
            this.h.e = false;
        }

        /* access modifiers changed from: 0000 */
        public final mb<D> a(lh lhVar, defpackage.ly.a<D> aVar) {
            b<D> bVar = new b<>(this.h, aVar);
            a(lhVar, bVar);
            b<D> bVar2 = this.i;
            if (bVar2 != null) {
                a((lo<? super D>) bVar2);
            }
            this.j = lhVar;
            this.i = bVar;
            return this.h;
        }

        /* access modifiers changed from: 0000 */
        public final void c() {
            lh lhVar = this.j;
            b<D> bVar = this.i;
            if (lhVar != null && bVar != null) {
                super.a((lo<? super T>) bVar);
                a(lhVar, bVar);
            }
        }

        public final void a(lo<? super D> loVar) {
            super.a(loVar);
            this.j = null;
            this.i = null;
        }

        /* access modifiers changed from: 0000 */
        public final mb<D> a(boolean z) {
            boolean z2 = lz.a;
            this.h.g();
            this.h.f = true;
            b<D> bVar = this.i;
            if (bVar != null) {
                a((lo<? super D>) bVar);
                bVar.a();
            }
            this.h.a(this);
            this.h.i();
            return this.k;
        }

        public final void c(D d) {
            boolean z = lz.a;
            if (Looper.myLooper() == Looper.getMainLooper()) {
                b(d);
                return;
            }
            boolean z2 = lz.a;
            a(d);
        }

        public final void b(D d) {
            super.b(d);
            mb<D> mbVar = this.k;
            if (mbVar != null) {
                mbVar.i();
                this.k = null;
            }
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder(64);
            sb.append("LoaderInfo{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" #");
            sb.append(this.f);
            sb.append(" : ");
            hl.a(this.h, sb);
            sb.append("}}");
            return sb.toString();
        }
    }

    /* renamed from: lz$b */
    static class b<D> implements lo<D> {
        boolean a = false;
        private final mb<D> b;
        private final defpackage.ly.a<D> c;

        b(mb<D> mbVar, defpackage.ly.a<D> aVar) {
            this.b = mbVar;
            this.c = aVar;
        }

        public final void onChanged(D d) {
            boolean z = lz.a;
            this.c.a(this.b, d);
            this.a = true;
        }

        /* access modifiers changed from: 0000 */
        public final void a() {
            if (this.a) {
                boolean z = lz.a;
            }
        }

        public final String toString() {
            return this.c.toString();
        }
    }

    /* renamed from: lz$c */
    static class c extends lt {
        private static final defpackage.lu.b c = new defpackage.lu.b() {
            public final <T extends lt> T a(Class<T> cls) {
                return new c();
            }
        };
        dw<a> a = new dw<>();
        boolean b = false;

        c() {
        }

        static c a(lw lwVar) {
            return (c) new lu(lwVar, c).a(c.class);
        }

        /* access modifiers changed from: 0000 */
        public final <D> a<D> a(int i) {
            return (a) this.a.a(i, null);
        }

        public final void a() {
            super.a();
            int b2 = this.a.b();
            for (int i = 0; i < b2; i++) {
                ((a) this.a.c(i)).a(true);
            }
            dw<a> dwVar = this.a;
            int i2 = dwVar.c;
            Object[] objArr = dwVar.b;
            for (int i3 = 0; i3 < i2; i3++) {
                objArr[i3] = null;
            }
            dwVar.c = 0;
            dwVar.a = false;
        }
    }

    lz(lh lhVar, lw lwVar) {
        this.b = lhVar;
        this.c = c.a(lwVar);
    }

    /* JADX INFO: finally extract failed */
    private <D> mb<D> a(int i, Bundle bundle, defpackage.ly.a<D> aVar, mb<D> mbVar) {
        try {
            this.c.b = true;
            mb a2 = aVar.a();
            if (a2.getClass().isMemberClass()) {
                if (!Modifier.isStatic(a2.getClass().getModifiers())) {
                    StringBuilder sb = new StringBuilder("Object returned from onCreateLoader must not be a non-static inner member class: ");
                    sb.append(a2);
                    throw new IllegalArgumentException(sb.toString());
                }
            }
            a aVar2 = new a(i, bundle, a2, null);
            this.c.a.b(i, aVar2);
            this.c.b = false;
            return aVar2.a(this.b, aVar);
        } catch (Throwable th) {
            this.c.b = false;
            throw th;
        }
    }

    public final <D> mb<D> a(int i, Bundle bundle, defpackage.ly.a<D> aVar) {
        if (this.c.b) {
            throw new IllegalStateException("Called while creating a loader");
        } else if (Looper.getMainLooper() == Looper.myLooper()) {
            a a2 = this.c.a(i);
            if (a2 == null) {
                return a(i, (Bundle) null, aVar, null);
            }
            return a2.a(this.b, aVar);
        } else {
            throw new IllegalStateException("initLoader must be called on the main thread");
        }
    }

    public final void a(int i) {
        if (this.c.b) {
            throw new IllegalStateException("Called while creating a loader");
        } else if (Looper.getMainLooper() == Looper.myLooper()) {
            a a2 = this.c.a(i);
            if (a2 != null) {
                a2.a(true);
                this.c.a.a(i);
            }
        } else {
            throw new IllegalStateException("destroyLoader must be called on the main thread");
        }
    }

    public final void a() {
        c cVar = this.c;
        int b2 = cVar.a.b();
        for (int i = 0; i < b2; i++) {
            ((a) cVar.a.c(i)).c();
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("LoaderManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        hl.a(this.b, sb);
        sb.append("}}");
        return sb.toString();
    }

    @Deprecated
    public final void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        c cVar = this.c;
        if (cVar.a.b() > 0) {
            printWriter.print(str);
            printWriter.println("Loaders:");
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append("    ");
            String sb2 = sb.toString();
            for (int i = 0; i < cVar.a.b(); i++) {
                a aVar = (a) cVar.a.c(i);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(cVar.a.b(i));
                printWriter.print(": ");
                printWriter.println(aVar.toString());
                printWriter.print(sb2);
                printWriter.print("mId=");
                printWriter.print(aVar.f);
                printWriter.print(" mArgs=");
                printWriter.println(aVar.g);
                printWriter.print(sb2);
                printWriter.print("mLoader=");
                printWriter.println(aVar.h);
                mb<D> mbVar = aVar.h;
                StringBuilder sb3 = new StringBuilder();
                sb3.append(sb2);
                String str2 = "  ";
                sb3.append(str2);
                mbVar.a(sb3.toString(), fileDescriptor, printWriter, strArr);
                if (aVar.i != null) {
                    printWriter.print(sb2);
                    printWriter.print("mCallbacks=");
                    printWriter.println(aVar.i);
                    b<D> bVar = aVar.i;
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append(sb2);
                    sb4.append(str2);
                    printWriter.print(sb4.toString());
                    printWriter.print("mDeliveredData=");
                    printWriter.println(bVar.a);
                }
                printWriter.print(sb2);
                printWriter.print("mData=");
                Object obj = aVar.d;
                if (obj == LiveData.b) {
                    obj = null;
                }
                StringBuilder sb5 = new StringBuilder(64);
                hl.a(obj, sb5);
                sb5.append("}");
                printWriter.println(sb5.toString());
                printWriter.print(sb2);
                printWriter.print("mStarted=");
                printWriter.println(aVar.c > 0);
            }
        }
    }
}
