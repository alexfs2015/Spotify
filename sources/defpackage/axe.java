package defpackage;

import android.os.Handler;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: axe reason: default package */
public abstract class axe implements axp {
    private final ArrayList<b> a = new ArrayList<>(1);
    private final a b = new a();
    private apz c;
    private aqu d;
    private Object e;

    /* access modifiers changed from: protected */
    public abstract void a(apz apz, boolean z, bcd bcd);

    /* access modifiers changed from: protected */
    public abstract void ao_();

    /* access modifiers changed from: protected */
    public final void a(aqu aqu, Object obj) {
        this.d = aqu;
        this.e = obj;
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((b) it.next()).onSourceInfoRefreshed(this, aqu, obj);
        }
    }

    /* access modifiers changed from: protected */
    public final a a(a aVar) {
        return this.b.a(0, aVar, 0);
    }

    /* access modifiers changed from: protected */
    public final a a(int i, a aVar, long j) {
        return this.b.a(i, aVar, 0);
    }

    public final void a(Handler handler, axq axq) {
        this.b.a(handler, axq);
    }

    public final void a(axq axq) {
        this.b.a(axq);
    }

    public final void a(apz apz, boolean z, b bVar, bcd bcd) {
        apz apz2 = this.c;
        bcu.a(apz2 == null || apz2 == apz);
        this.a.add(bVar);
        if (this.c == null) {
            this.c = apz;
            a(apz, z, bcd);
            return;
        }
        aqu aqu = this.d;
        if (aqu != null) {
            bVar.onSourceInfoRefreshed(this, aqu, this.e);
        }
    }

    public final void a(b bVar) {
        this.a.remove(bVar);
        if (this.a.isEmpty()) {
            this.c = null;
            this.d = null;
            this.e = null;
            ao_();
        }
    }
}
