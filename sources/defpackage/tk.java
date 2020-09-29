package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;

/* renamed from: tk reason: default package */
public final class tk implements a {
    private final tj a;
    private final tn<?>[] b;
    private final Object c = new Object();

    static {
        sg.a("WorkConstraintsTracker");
    }

    public tk(Context context, vb vbVar, tj tjVar) {
        Context applicationContext = context.getApplicationContext();
        this.a = tjVar;
        this.b = new tn[]{new tl(applicationContext, vbVar), new tm(applicationContext, vbVar), new ts(applicationContext, vbVar), new to(applicationContext, vbVar), new tr(applicationContext, vbVar), new tq(applicationContext, vbVar), new tp(applicationContext, vbVar)};
    }

    public final void a(List<uj> list) {
        synchronized (this.c) {
            tn<?>[] tnVarArr = this.b;
            for (int i = 0; i < 7; i++) {
                tnVarArr[i].a((a) null);
            }
            tn<?>[] tnVarArr2 = this.b;
            for (int i2 = 0; i2 < 7; i2++) {
                tnVarArr2[i2].a(list);
            }
            tn<?>[] tnVarArr3 = this.b;
            for (int i3 = 0; i3 < 7; i3++) {
                tnVarArr3[i3].a((a) this);
            }
        }
    }

    public final void a() {
        synchronized (this.c) {
            tn<?>[] tnVarArr = this.b;
            for (int i = 0; i < 7; i++) {
                tnVarArr[i].a();
            }
        }
    }

    public final boolean a(String str) {
        synchronized (this.c) {
            tn<?>[] tnVarArr = this.b;
            for (int i = 0; i < 7; i++) {
                tn<?> tnVar = tnVarArr[i];
                if (tnVar.b != null && tnVar.b(tnVar.b) && tnVar.a.contains(str)) {
                    sg.a();
                    String.format("Work %s constrained by %s", new Object[]{str, tnVar.getClass().getSimpleName()});
                    return false;
                }
            }
            return true;
        }
    }

    public final void b(List<String> list) {
        synchronized (this.c) {
            ArrayList arrayList = new ArrayList();
            for (String str : list) {
                if (a(str)) {
                    sg.a();
                    String.format("Constraints met for %s", new Object[]{str});
                    arrayList.add(str);
                }
            }
            if (this.a != null) {
                this.a.a(arrayList);
            }
        }
    }

    public final void c(List<String> list) {
        synchronized (this.c) {
            if (this.a != null) {
                this.a.b(list);
            }
        }
    }
}
