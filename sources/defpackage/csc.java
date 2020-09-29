package defpackage;

import android.content.Context;
import android.os.Handler;
import java.lang.ref.WeakReference;
import java.util.Map;

@cey
/* renamed from: csc reason: default package */
public abstract class csc implements bsj {
    protected Context a;
    private String b;
    private WeakReference<crq> c;

    public csc(crq crq) {
        this.a = crq.getContext();
        this.b = bjl.e().b(this.a, crq.k().a);
        this.c = new WeakReference<>(crq);
    }

    public abstract void a();

    /* access modifiers changed from: protected */
    public final void a(String str, String str2, int i) {
        col.a.post(new cse(this, str, str2, i));
    }

    public final void a(String str, String str2, String str3, String str4) {
        Handler handler = col.a;
        csf csf = new csf(this, str, str2, str3, str4);
        handler.post(csf);
    }

    public abstract boolean a(String str);

    static /* synthetic */ void a(csc csc, String str, Map map) {
        crq crq = (crq) csc.c.get();
        if (crq != null) {
            crq.a(str, map);
        }
    }
}
