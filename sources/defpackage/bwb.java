package defpackage;

import android.util.SparseArray;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* renamed from: bwb reason: default package */
public class bwb extends bwd {
    private final SparseArray<a> b = new SparseArray<>();

    /* renamed from: bwb$a */
    class a implements c {
        public final int a;
        public final bsy b;
        public final c c;

        public a(int i, bsy bsy, c cVar) {
            this.a = i;
            this.b = bsy;
            this.c = cVar;
            bsy.a((c) this);
        }

        public final void a(ConnectionResult connectionResult) {
            String valueOf = String.valueOf(connectionResult);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 27);
            sb.append("beginFailureResolution for ");
            sb.append(valueOf);
            bwb.this.b(connectionResult, this.a);
        }
    }

    private bwb(btm btm) {
        super(btm);
        this.a.a("AutoManageHelper", (LifecycleCallback) this);
    }

    private final a a(int i) {
        if (this.b.size() <= i) {
            return null;
        }
        SparseArray<a> sparseArray = this.b;
        return (a) sparseArray.get(sparseArray.keyAt(i));
    }

    public static bwb b(btl btl) {
        btm a2 = a(btl);
        bwb bwb = (bwb) a2.a("AutoManageHelper", bwb.class);
        return bwb != null ? bwb : new bwb(a2);
    }

    public final void a(int i, bsy bsy, c cVar) {
        bxo.a(bsy, (Object) "GoogleApiClient instance cannot be null");
        boolean z = this.b.indexOfKey(i) < 0;
        StringBuilder sb = new StringBuilder(54);
        sb.append("Already managing a GoogleApiClient with id ");
        sb.append(i);
        bxo.a(z, (Object) sb.toString());
        bwe bwe = (bwe) this.d.get();
        boolean z2 = this.c;
        String valueOf = String.valueOf(bwe);
        StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 49);
        sb2.append("starting AutoManage for client ");
        sb2.append(i);
        String str = " ";
        sb2.append(str);
        sb2.append(z2);
        sb2.append(str);
        sb2.append(valueOf);
        this.b.put(i, new a(i, bsy, cVar));
        if (this.c && bwe == null) {
            String valueOf2 = String.valueOf(bsy);
            StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf2).length() + 11);
            sb3.append("connecting ");
            sb3.append(valueOf2);
            bsy.e();
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

    /* access modifiers changed from: protected */
    public final void e() {
        for (int i = 0; i < this.b.size(); i++) {
            a a2 = a(i);
            if (a2 != null) {
                a2.b.e();
            }
        }
    }
}
