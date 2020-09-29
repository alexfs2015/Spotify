package defpackage;

import android.util.SparseArray;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* renamed from: bvk reason: default package */
public class bvk extends bvm {
    private final SparseArray<a> b = new SparseArray<>();

    /* renamed from: bvk$a */
    class a implements c {
        public final int a;
        public final bsh b;
        public final c c;

        public a(int i, bsh bsh, c cVar) {
            this.a = i;
            this.b = bsh;
            this.c = cVar;
            bsh.a((c) this);
        }

        public final void a(ConnectionResult connectionResult) {
            String valueOf = String.valueOf(connectionResult);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 27);
            sb.append("beginFailureResolution for ");
            sb.append(valueOf);
            bvk.this.b(connectionResult, this.a);
        }
    }

    public static bvk b(bsu bsu) {
        bsv a2 = a(bsu);
        bvk bvk = (bvk) a2.a("AutoManageHelper", bvk.class);
        if (bvk != null) {
            return bvk;
        }
        return new bvk(a2);
    }

    private bvk(bsv bsv) {
        super(bsv);
        this.a.a("AutoManageHelper", (LifecycleCallback) this);
    }

    public final void a(int i, bsh bsh, c cVar) {
        bwx.a(bsh, (Object) "GoogleApiClient instance cannot be null");
        boolean z = this.b.indexOfKey(i) < 0;
        StringBuilder sb = new StringBuilder(54);
        sb.append("Already managing a GoogleApiClient with id ");
        sb.append(i);
        bwx.a(z, (Object) sb.toString());
        bvn bvn = (bvn) this.d.get();
        boolean z2 = this.c;
        String valueOf = String.valueOf(bvn);
        StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 49);
        sb2.append("starting AutoManage for client ");
        sb2.append(i);
        String str = " ";
        sb2.append(str);
        sb2.append(z2);
        sb2.append(str);
        sb2.append(valueOf);
        this.b.put(i, new a(i, bsh, cVar));
        if (this.c && bvn == null) {
            String valueOf2 = String.valueOf(bsh);
            StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf2).length() + 11);
            sb3.append("connecting ");
            sb3.append(valueOf2);
            bsh.e();
        }
    }

    public final void b() {
        super.b();
        boolean z = this.c;
        String valueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 14);
        sb.append("onStart ");
        sb.append(z);
        sb.append(" ");
        sb.append(valueOf);
        if (this.d.get() == null) {
            for (int i = 0; i < this.b.size(); i++) {
                a a2 = a(i);
                if (a2 != null) {
                    a2.b.e();
                }
            }
        }
    }

    public final void d() {
        super.d();
        for (int i = 0; i < this.b.size(); i++) {
            a a2 = a(i);
            if (a2 != null) {
                a2.b.g();
            }
        }
    }

    public final void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        for (int i = 0; i < this.b.size(); i++) {
            a a2 = a(i);
            if (a2 != null) {
                printWriter.append(str).append("GoogleApiClient #").print(a2.a);
                printWriter.println(":");
                a2.b.a(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void a(ConnectionResult connectionResult, int i) {
        if (i < 0) {
            new Exception();
            return;
        }
        a aVar = (a) this.b.get(i);
        if (aVar != null) {
            a aVar2 = (a) this.b.get(i);
            this.b.remove(i);
            if (aVar2 != null) {
                aVar2.b.b((c) aVar2);
                aVar2.b.g();
            }
            c cVar = aVar.c;
            if (cVar != null) {
                cVar.a(connectionResult);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void e() {
        for (int i = 0; i < this.b.size(); i++) {
            a a2 = a(i);
            if (a2 != null) {
                a2.b.e();
            }
        }
    }

    private final a a(int i) {
        if (this.b.size() <= i) {
            return null;
        }
        SparseArray<a> sparseArray = this.b;
        return (a) sparseArray.get(sparseArray.keyAt(i));
    }
}
