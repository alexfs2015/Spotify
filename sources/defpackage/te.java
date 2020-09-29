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

/* renamed from: te reason: default package */
public final class te implements tc {
    private Context a;
    private sp b;
    private vp c;
    private WorkDatabase d;
    private Map<String, tk> e = new HashMap();
    private List<tf> f;
    private Set<String> g;
    private final List<tc> h;
    private final Object i;

    /* renamed from: te$a */
    static class a implements Runnable {
        private tc a;
        private String b;
        private ffe<Boolean> c;

        a(tc tcVar, String str, ffe<Boolean> ffe) {
            this.a = tcVar;
            this.b = str;
            this.c = ffe;
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
        su.a("Processor");
    }

    public te(Context context, sp spVar, vp vpVar, WorkDatabase workDatabase, List<tf> list) {
        this.a = context;
        this.b = spVar;
        this.c = vpVar;
        this.d = workDatabase;
        this.f = list;
        this.g = new HashSet();
        this.h = new ArrayList();
        this.i = new Object();
    }

    public final void a(String str, boolean z) {
        synchronized (this.i) {
            this.e.remove(str);
            su.a();
            String.format("%s %s executed; reschedule = %s", new Object[]{getClass().getSimpleName(), str, Boolean.valueOf(z)});
            for (tc a2 : this.h) {
                a2.a(str, z);
            }
        }
    }

    public final void a(tc tcVar) {
        synchronized (this.i) {
            this.h.add(tcVar);
        }
    }

    public final boolean a(String str) {
        synchronized (this.i) {
            su.a();
            String.format("Processor stopping %s", new Object[]{str});
            tk tkVar = (tk) this.e.remove(str);
            if (tkVar != null) {
                tkVar.b();
                su.a();
                String.format("WorkerWrapper stopped for %s", new Object[]{str});
                return true;
            }
            su.a();
            String.format("WorkerWrapper could not be found for %s", new Object[]{str});
            return false;
        }
    }

    public final boolean a(String str, androidx.work.WorkerParameters.a aVar) {
        synchronized (this.i) {
            if (this.e.containsKey(str)) {
                su.a();
                String.format("Work %s is already enqueued for processing", new Object[]{str});
                return false;
            }
            defpackage.tk.a aVar2 = new defpackage.tk.a(this.a, this.b, this.c, this.d, str);
            aVar2.f = this.f;
            if (aVar != null) {
                aVar2.g = aVar;
            }
            tk tkVar = new tk(aVar2);
            vo<Boolean> voVar = tkVar.e;
            voVar.addListener(new a(this, str, voVar), this.c.a());
            this.e.put(str, tkVar);
            this.c.b().execute(tkVar);
            su.a();
            String.format("%s: processing %s", new Object[]{getClass().getSimpleName(), str});
            return true;
        }
    }

    public final void b(tc tcVar) {
        synchronized (this.i) {
            this.h.remove(tcVar);
        }
    }

    public final boolean b(String str) {
        synchronized (this.i) {
            su.a();
            String.format("Processor cancelling %s", new Object[]{str});
            this.g.add(str);
            tk tkVar = (tk) this.e.remove(str);
            if (tkVar != null) {
                tkVar.b();
                su.a();
                String.format("WorkerWrapper cancelled for %s", new Object[]{str});
                return true;
            }
            su.a();
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
}
