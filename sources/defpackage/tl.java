package defpackage;

import android.content.Context;
import android.os.Build.VERSION;
import android.text.TextUtils;
import androidx.work.WorkInfo.State;
import androidx.work.WorkerParameters.a;
import java.util.ArrayList;
import java.util.List;

/* renamed from: tl reason: default package */
public final class tl implements tc, tf, tx {
    private tj a;
    private ty b;
    private List<ux> c = new ArrayList();
    private boolean d;
    private final Object e;

    static {
        su.a("GreedyScheduler");
    }

    public tl(Context context, vp vpVar, tj tjVar) {
        this.a = tjVar;
        this.b = new ty(context, vpVar, this);
        this.e = new Object();
    }

    private void a() {
        if (!this.d) {
            this.a.f.a((tc) this);
            this.d = true;
        }
    }

    public final void a(String str) {
        a();
        su.a();
        String.format("Cancelling work ID %s", new Object[]{str});
        this.a.b(str);
    }

    public final void a(String str, boolean z) {
        synchronized (this.e) {
            int size = this.c.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    break;
                } else if (((ux) this.c.get(i)).a.equals(str)) {
                    su.a();
                    String.format("Stopping tracking for %s", new Object[]{str});
                    this.c.remove(i);
                    this.b.a(this.c);
                    break;
                } else {
                    i++;
                }
            }
        }
    }

    public final void a(List<String> list) {
        for (String str : list) {
            su.a();
            String.format("Constraints met: Scheduling work ID %s", new Object[]{str});
            this.a.a(str, (a) null);
        }
    }

    public final void a(ux... uxVarArr) {
        a();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (ux uxVar : uxVarArr) {
            if (uxVar.b == State.ENQUEUED && !uxVar.a() && uxVar.g == 0 && !uxVar.b()) {
                if (!uxVar.d()) {
                    su.a();
                    String.format("Starting work for %s", new Object[]{uxVar.a});
                    this.a.a(uxVar.a, (a) null);
                } else if (VERSION.SDK_INT < 24 || !uxVar.j.a()) {
                    arrayList.add(uxVar);
                    arrayList2.add(uxVar.a);
                }
            }
        }
        synchronized (this.e) {
            if (!arrayList.isEmpty()) {
                su.a();
                String.format("Starting tracking for [%s]", new Object[]{TextUtils.join(",", arrayList2)});
                this.c.addAll(arrayList);
                this.b.a(this.c);
            }
        }
    }

    public final void b(List<String> list) {
        for (String str : list) {
            su.a();
            String.format("Constraints not met: Cancelling work ID %s", new Object[]{str});
            this.a.b(str);
        }
    }
}
