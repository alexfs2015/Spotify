package defpackage;

import android.os.Bundle;
import android.os.Looper;
import androidx.lifecycle.LiveData;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;

/* renamed from: me reason: default package */
final class me extends md {
    static boolean a;
    private final lm b;
    private final c c;

    /* renamed from: me$a */
    public static class a<D> extends ls<D> implements defpackage.mg.a<D> {
        final int f;
        final Bundle g;
        final mg<D> h;
        b<D> i;
        private lm j;
        private mg<D> k;

        a(int i2, Bundle bundle, mg<D> mgVar, mg<D> mgVar2) {
            this.f = i2;
            this.g = bundle;
            this.h = mgVar;
            this.k = mgVar2;
            this.h.a(i2, this);
        }

        /* access modifiers changed from: 0000 */
        public final mg<D> a(lm lmVar, defpackage.md.a<D> aVar) {
            b<D> bVar = new b<>(this.h, aVar);
            a(lmVar, bVar);
            b<D> bVar2 = this.i;
            if (bVar2 != null) {
                a((lt<? super D>) bVar2);
            }
            this.j = lmVar;
            this.i = bVar;
            return this.h;
        }

        /* access modifiers changed from: 0000 */
        public final mg<D> a(boolean z) {
            boolean z2 = me.a;
            this.h.g();
            this.h.f = true;
            b<D> bVar = this.i;
            if (bVar != null) {
                a((lt<? super D>) bVar);
                bVar.a();
            }
            this.h.a(this);
            this.h.i();
            return this.k;
        }

        public final void a() {
            boolean z = me.a;
            this.h.e();
        }

        public final void a(lt<? super D> ltVar) {
            super.a(ltVar);
            this.j = null;
            this.i = null;
        }

        public final void b() {
            boolean z = me.a;
            this.h.e = false;
        }

        public final void b(D d) {
            super.b(d);
            mg<D> mgVar = this.k;
            if (mgVar != null) {
                mgVar.i();
                this.k = null;
            }
        }

        /* access modifiers changed from: 0000 */
        public final void c() {
            lm lmVar = this.j;
            b<D> bVar = this.i;
            if (lmVar != null && bVar != null) {
                super.a((lt<? super T>) bVar);
                a(lmVar, bVar);
            }
        }

        public final void c(D d) {
            boolean z = me.a;
            if (Looper.myLooper() == Looper.getMainLooper()) {
                b(d);
                return;
            }
            boolean z2 = me.a;
            a(d);
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

    /* renamed from: me$b */
    static class b<D> implements lt<D> {
        boolean a = false;
        private final mg<D> b;
        private final defpackage.md.a<D> c;

        b(mg<D> mgVar, defpackage.md.a<D> aVar) {
            this.b = mgVar;
            this.c = aVar;
        }

        /* access modifiers changed from: 0000 */
        public final void a() {
            if (this.a) {
                boolean z = me.a;
            }
        }

        public final void onChanged(D d) {
            boolean z = me.a;
            this.c.a(this.b, d);
            this.a = true;
        }

        public final String toString() {
            return this.c.toString();
        }
    }

    /* renamed from: me$c */
    static class c extends ly {
        private static final defpackage.lz.b c = new defpackage.lz.b() {
            public final <T extends ly> T a(Class<T> cls) {
                return new c();
            }
        };
        dw<a> a = new dw<>();
        boolean b = false;

        c() {
        }

        static c a(mb mbVar) {
            return (c) new lz(mbVar, c).a(c.class);
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

    me(lm lmVar, mb mbVar) {
        this.b = lmVar;
        this.c = c.a(mbVar);
    }

    /* JADX INFO: finally extract failed */
    private <D> mg<D> a(int i, Bundle bundle, defpackage.md.a<D> aVar, mg<D> mgVar) {
        try {
            this.c.b = true;
            mg a2 = aVar.a();
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

    public final <D> mg<D> a(int i, Bundle bundle, defpackage.md.a<D> aVar) {
        if (this.c.b) {
            throw new IllegalStateException("Called while creating a loader");
        } else if (Looper.getMainLooper() == Looper.myLooper()) {
            a a2 = this.c.a(i);
            return a2 == null ? a(i, (Bundle) null, aVar, null) : a2.a(this.b, aVar);
        } else {
            throw new IllegalStateException("initLoader must be called on the main thread");
        }
    }

    public final void a() {
        c cVar = this.c;
        int b2 = cVar.a.b();
        for (int i = 0; i < b2; i++) {
            ((a) cVar.a.c(i)).c();
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
                mg<D> mgVar = aVar.h;
                StringBuilder sb3 = new StringBuilder();
                sb3.append(sb2);
                String str2 = "  ";
                sb3.append(str2);
                mgVar.a(sb3.toString(), fileDescriptor, printWriter, strArr);
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

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("LoaderManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        hl.a(this.b, sb);
        sb.append("}}");
        return sb.toString();
    }
}
