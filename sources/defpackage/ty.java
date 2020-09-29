package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;

/* renamed from: ty reason: default package */
public final class ty implements a {
    private final tx a;
    private final ub<?>[] b;
    private final Object c = new Object();

    static {
        su.a("WorkConstraintsTracker");
    }

    public ty(Context context, vp vpVar, tx txVar) {
        Context applicationContext = context.getApplicationContext();
        this.a = txVar;
        this.b = new ub[]{new tz(applicationContext, vpVar), new ua(applicationContext, vpVar), new ug(applicationContext, vpVar), new uc(applicationContext, vpVar), new uf(applicationContext, vpVar), new ue(applicationContext, vpVar), new ud(applicationContext, vpVar)};
    }

    public final void a() {
        synchronized (this.c) {
            ub<?>[] ubVarArr = this.b;
            for (int i = 0; i < 7; i++) {
                ubVarArr[i].a();
            }
        }
    }

    public final void a(List<ux> list) {
        synchronized (this.c) {
            ub<?>[] ubVarArr = this.b;
            for (int i = 0; i < 7; i++) {
                ubVarArr[i].a((a) null);
            }
            ub<?>[] ubVarArr2 = this.b;
            for (int i2 = 0; i2 < 7; i2++) {
                ubVarArr2[i2].a(list);
            }
            ub<?>[] ubVarArr3 = this.b;
            for (int i3 = 0; i3 < 7; i3++) {
                ubVarArr3[i3].a((a) this);
            }
        }
    }

    public final boolean a(String str) {
        synchronized (this.c) {
            ub<?>[] ubVarArr = this.b;
            for (int i = 0; i < 7; i++) {
                ub<?> ubVar = ubVarArr[i];
                if (ubVar.b != null && ubVar.b(ubVar.b) && ubVar.a.contains(str)) {
                    su.a();
                    String.format("Work %s constrained by %s", new Object[]{str, ubVar.getClass().getSimpleName()});
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
                    su.a();
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
