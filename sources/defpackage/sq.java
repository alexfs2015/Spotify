package defpackage;

import android.content.Context;
import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutionException;

/* renamed from: sq reason: default package */
public final class sq implements so {
    private Context a;
    private sb b;
    private vb c;
    private WorkDatabase d;
    private Map<String, sw> e = new HashMap();
    private List<sr> f;
    private Set<String> g;
    private final List<so> h;
    private final Object i;

    /* renamed from: sq$a */
    static class a implements Runnable {
        private so a;
        private String b;
        private fek<Boolean> c;

        a(so soVar, String str, fek<Boolean> fek) {
            this.a = soVar;
            this.b = str;
            this.c = fek;
        }

        public final void run() {
            boolean z;
            try {
                z = ((Boolean) this.c.get()).booleanValue();
            } catch (InterruptedException | ExecutionException unused) {
                z = true;
            }
            this.a.a(this.b, z);
        }
    }

    static {
        sg.a("Processor");
    }

    public sq(Context context, sb sbVar, vb vbVar, WorkDatabase workDatabase, List<sr> list) {
        this.a = context;
        this.b = sbVar;
        this.c = vbVar;
        this.d = workDatabase;
        this.f = list;
        this.g = new HashSet();
        this.h = new ArrayList();
        this.i = new Object();
    }

    public final boolean a(String str, androidx.work.WorkerParameters.a aVar) {
        synchronized (this.i) {
            if (this.e.containsKey(str)) {
                sg.a();
                String.format("Work %s is already enqueued for processing", new Object[]{str});
                return false;
            }
            defpackage.sw.a aVar2 = new defpackage.sw.a(this.a, this.b, this.c, this.d, str);
            aVar2.f = this.f;
            if (aVar != null) {
                aVar2.g = aVar;
            }
            sw swVar = new sw(aVar2);
            va<Boolean> vaVar = swVar.e;
            vaVar.addListener(new a(this, str, vaVar), this.c.a());
            this.e.put(str, swVar);
            this.c.b().execute(swVar);
            sg.a();
            String.format("%s: processing %s", new Object[]{getClass().getSimpleName(), str});
            return true;
        }
    }

    public final boolean a(String str) {
        synchronized (this.i) {
            sg.a();
            String.format("Processor stopping %s", new Object[]{str});
            sw swVar = (sw) this.e.remove(str);
            if (swVar != null) {
                swVar.b();
                sg.a();
                String.format("WorkerWrapper stopped for %s", new Object[]{str});
                return true;
            }
            sg.a();
            String.format("WorkerWrapper could not be found for %s", new Object[]{str});
            return false;
        }
    }

    public final boolean b(String str) {
        synchronized (this.i) {
            sg.a();
            String.format("Processor cancelling %s", new Object[]{str});
            this.g.add(str);
            sw swVar = (sw) this.e.remove(str);
            if (swVar != null) {
                swVar.b();
                sg.a();
                String.format("WorkerWrapper cancelled for %s", new Object[]{str});
                return true;
            }
            sg.a();
            String.format("WorkerWrapper could not be found for %s", new Object[]{str});
            return false;
        }
    }

    public final boolean c(String str) {
        boolean contains;
        synchronized (this.i) {
            contains = this.g.contains(str);
        }
        return contains;
    }

    public final boolean d(String str) {
        boolean containsKey;
        synchronized (this.i) {
            containsKey = this.e.containsKey(str);
        }
        return containsKey;
    }

    public final void a(so soVar) {
        synchronized (this.i) {
            this.h.add(soVar);
        }
    }

    public final void b(so soVar) {
        synchronized (this.i) {
            this.h.remove(soVar);
        }
    }

    public final void a(String str, boolean z) {
        synchronized (this.i) {
            this.e.remove(str);
            sg.a();
            String.format("%s %s executed; reschedule = %s", new Object[]{getClass().getSimpleName(), str, Boolean.valueOf(z)});
            for (so a2 : this.h) {
                a2.a(str, z);
            }
        }
    }
}
