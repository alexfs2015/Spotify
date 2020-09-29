package defpackage;

import android.content.Context;
import android.os.Build.VERSION;
import android.text.TextUtils;
import androidx.work.WorkInfo.State;
import androidx.work.WorkerParameters.a;
import java.util.ArrayList;
import java.util.List;

/* renamed from: sx reason: default package */
public final class sx implements so, sr, tj {
    private sv a;
    private tk b;
    private List<uj> c = new ArrayList();
    private boolean d;
    private final Object e;

    static {
        sg.a("GreedyScheduler");
    }

    public sx(Context context, vb vbVar, sv svVar) {
        this.a = svVar;
        this.b = new tk(context, vbVar, this);
        this.e = new Object();
    }

    public final void a(uj... ujVarArr) {
        a();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (uj ujVar : ujVarArr) {
            if (ujVar.b == State.ENQUEUED && !ujVar.a() && ujVar.g == 0 && !ujVar.b()) {
                if (!ujVar.d()) {
                    sg.a();
                    String.format("Starting work for %s", new Object[]{ujVar.a});
                    this.a.a(ujVar.a, (a) null);
                } else if (VERSION.SDK_INT < 24 || !ujVar.j.a()) {
                    arrayList.add(ujVar);
                    arrayList2.add(ujVar.a);
                }
            }
        }
        synchronized (this.e) {
            if (!arrayList.isEmpty()) {
                sg.a();
                String.format("Starting tracking for [%s]", new Object[]{TextUtils.join(",", arrayList2)});
                this.c.addAll(arrayList);
                this.b.a(this.c);
            }
        }
    }

    public final void a(String str) {
        a();
        sg.a();
        String.format("Cancelling work ID %s", new Object[]{str});
        this.a.b(str);
    }

    public final void a(List<String> list) {
        for (String str : list) {
            sg.a();
            String.format("Constraints met: Scheduling work ID %s", new Object[]{str});
            this.a.a(str, (a) null);
        }
    }

    public final void b(List<String> list) {
        for (String str : list) {
            sg.a();
            String.format("Constraints not met: Cancelling work ID %s", new Object[]{str});
            this.a.b(str);
        }
    }

    private void a() {
        if (!this.d) {
            this.a.f.a((so) this);
            this.d = true;
        }
    }

    public final void a(String str, boolean z) {
        synchronized (this.e) {
            int size = this.c.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    break;
                } else if (((uj) this.c.get(i)).a.equals(str)) {
                    sg.a();
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
}
