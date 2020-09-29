package defpackage;

import android.content.Context;
import android.os.Handler;
import java.lang.ref.WeakReference;
import java.util.Map;

@cfp
/* renamed from: cst reason: default package */
public abstract class cst implements bta {
    protected Context a;
    private String b;
    private WeakReference<csh> c;

    public cst(csh csh) {
        this.a = csh.getContext();
        this.b = bkc.e().b(this.a, csh.k().a);
        this.c = new WeakReference<>(csh);
    }

    static /* synthetic */ void a(cst cst, String str, Map map) {
        csh csh = (csh) cst.c.get();
        if (csh != null) {
            csh.a(str, map);
        }
    }

    public abstract void a();

    /* access modifiers changed from: protected */
    public final void a(String str, String str2, int i) {
        cpc.a.post(new csv(this, str, str2, i));
    }

    public final void a(String str, String str2, String str3, String str4) {
        Handler handler = cpc.a;
        csw csw = new csw(this, str, str2, str3, str4);
        handler.post(csw);
    }

    public abstract boolean a(String str);
}
