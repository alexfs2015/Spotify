package defpackage;

import android.os.Handler;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: axv reason: default package */
public abstract class axv implements ayg {
    private final ArrayList<b> a = new ArrayList<>(1);
    private final a b = new a();
    private aqq c;
    private arl d;
    private Object e;

    /* access modifiers changed from: protected */
    public final a a(int i, a aVar, long j) {
        return this.b.a(i, aVar, 0);
    }

    /* access modifiers changed from: protected */
    public final a a(a aVar) {
        return this.b.a(0, aVar, 0);
    }

    public final void a(Handler handler, ayh ayh) {
        this.b.a(handler, ayh);
    }

    public final void a(aqq aqq, boolean z, b bVar, bcu bcu) {
        aqq aqq2 = this.c;
        bdl.a(aqq2 == null || aqq2 == aqq);
        this.a.add(bVar);
        if (this.c == null) {
            this.c = aqq;
            a(aqq, z, bcu);
            return;
        }
        arl arl = this.d;
        if (arl != null) {
            bVar.onSourceInfoRefreshed(this, arl, this.e);
        }
    }

    /* access modifiers changed from: protected */
    public abstract void a(aqq aqq, boolean z, bcu bcu);

    /* access modifiers changed from: protected */
    public final void a(arl arl, Object obj) {
        this.d = arl;
        this.e = obj;
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((b) it.next()).onSourceInfoRefreshed(this, arl, obj);
        }
    }

    public final void a(b bVar) {
        this.a.remove(bVar);
        if (this.a.isEmpty()) {
            this.c = null;
            this.d = null;
            this.e = null;
            an_();
        }
    }

    public final void a(ayh ayh) {
        this.b.a(ayh);
    }

    /* access modifiers changed from: protected */
    public abstract void an_();
}
