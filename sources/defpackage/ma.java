package defpackage;

import android.content.Context;
import android.os.SystemClock;
import androidx.core.os.OperationCanceledException;
import androidx.loader.content.ModernAsyncTask;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;

/* renamed from: ma reason: default package */
public abstract class ma<D> extends mb<D> {
    volatile a a;
    long b;
    private final Executor i;
    private volatile a j;

    /* renamed from: ma$a */
    final class a extends ModernAsyncTask<Void, Void, D> implements Runnable {
        boolean a;
        private final CountDownLatch f = new CountDownLatch(1);

        a() {
        }

        public final /* bridge */ /* synthetic */ Object a(Object[] objArr) {
            return a();
        }

        private D a() {
            try {
                return ma.this.d();
            } catch (OperationCanceledException e) {
                if (this.d.get()) {
                    return null;
                }
                throw e;
            }
        }

        public final void a(D d) {
            try {
                ma maVar = ma.this;
                if (maVar.a != this) {
                    maVar.a(this, d);
                } else if (!maVar.f) {
                    maVar.h = false;
                    maVar.b = SystemClock.uptimeMillis();
                    maVar.a = null;
                    if (maVar.c != null) {
                        maVar.c.c(d);
                    }
                }
            } finally {
                this.f.countDown();
            }
        }

        public final void b(D d) {
            try {
                ma.this.a(this, d);
            } finally {
                this.f.countDown();
            }
        }

        public final void run() {
            this.a = false;
            ma.this.c();
        }
    }

    public abstract D d();

    public ma(Context context) {
        this(context, ModernAsyncTask.b);
    }

    private ma(Context context, Executor executor) {
        super(context);
        this.b = -10000;
        this.i = executor;
    }

    /* access modifiers changed from: protected */
    public final void a() {
        super.a();
        g();
        this.a = new a<>();
        c();
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [ma$a<>, android.os.Handler] */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r3v0, types: [ma$a<>, android.os.Handler]
      assigns: [?[int, float, boolean, short, byte, char, OBJECT, ARRAY]]
      uses: [ma$a<>, android.os.Handler]
      mth insns count: 37
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
    	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
    	at jadx.core.ProcessClass.process(ProcessClass.java:35)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean b() {
        /*
            r5 = this;
            ma$a<> r0 = r5.a
            r1 = 0
            if (r0 == 0) goto L_0x004b
            boolean r0 = r5.e
            r2 = 1
            if (r0 != 0) goto L_0x000c
            r5.g = r2
        L_0x000c:
            ma$a<> r0 = r5.j
            r3 = 0
            if (r0 == 0) goto L_0x0023
            ma$a<> r0 = r5.a
            boolean r0 = r0.a
            if (r0 == 0) goto L_0x0020
            ma$a<> r0 = r5.a
            r0.a = r1
            ma$a<> r0 = r5.a
            r3.removeCallbacks(r0)
        L_0x0020:
            r5.a = r3
            return r1
        L_0x0023:
            ma$a<> r0 = r5.a
            boolean r0 = r0.a
            if (r0 == 0) goto L_0x0035
            ma$a<> r0 = r5.a
            r0.a = r1
            ma$a<> r0 = r5.a
            r3.removeCallbacks(r0)
            r5.a = r3
            return r1
        L_0x0035:
            ma$a<> r0 = r5.a
            java.util.concurrent.atomic.AtomicBoolean r4 = r0.d
            r4.set(r2)
            java.util.concurrent.FutureTask<Result> r0 = r0.c
            boolean r0 = r0.cancel(r1)
            if (r0 == 0) goto L_0x0048
            ma$a<> r1 = r5.a
            r5.j = r1
        L_0x0048:
            r5.a = r3
            return r0
        L_0x004b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ma.b():boolean");
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [android.os.Handler, java.lang.Object[]] */
    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r1v0, types: [android.os.Handler, java.lang.Object[]]
      assigns: [?[int, float, boolean, short, byte, char, OBJECT, ARRAY]]
      uses: [java.lang.Object[], android.os.Handler]
      mth insns count: 18
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
    	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
    	at jadx.core.ProcessClass.process(ProcessClass.java:35)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c() {
        /*
            r3 = this;
            ma$a<> r0 = r3.j
            if (r0 != 0) goto L_0x0020
            ma$a<> r0 = r3.a
            if (r0 == 0) goto L_0x0020
            ma$a<> r0 = r3.a
            boolean r0 = r0.a
            r1 = 0
            if (r0 == 0) goto L_0x0019
            ma$a<> r0 = r3.a
            r2 = 0
            r0.a = r2
            ma$a<> r0 = r3.a
            r1.removeCallbacks(r0)
        L_0x0019:
            ma$a<> r0 = r3.a
            java.util.concurrent.Executor r2 = r3.i
            r0.a(r2, r1)
        L_0x0020:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ma.c():void");
    }

    /* access modifiers changed from: 0000 */
    public final void a(a aVar, D d) {
        if (this.j == aVar) {
            this.b = SystemClock.uptimeMillis();
            this.j = null;
            c();
        }
    }

    @Deprecated
    public final void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.a(str, fileDescriptor, printWriter, strArr);
        String str2 = " waiting=";
        if (this.a != null) {
            printWriter.print(str);
            printWriter.print("mTask=");
            printWriter.print(this.a);
            printWriter.print(str2);
            printWriter.println(this.a.a);
        }
        if (this.j != null) {
            printWriter.print(str);
            printWriter.print("mCancellingTask=");
            printWriter.print(this.j);
            printWriter.print(str2);
            printWriter.println(this.j.a);
        }
    }
}
