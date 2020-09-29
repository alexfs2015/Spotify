package defpackage;

import androidx.work.WorkInfo.State;
import androidx.work.impl.WorkDatabase;
import java.util.LinkedList;

/* renamed from: uq reason: default package */
public abstract class uq implements Runnable {
    public final sp a = new sp();

    /* access modifiers changed from: 0000 */
    public abstract void a();

    public void run() {
        try {
            a();
            this.a.a(si.a);
        } catch (Throwable th) {
            this.a.a(new C0076a(th));
        }
    }

    public static uq a(final String str, final sv svVar, final boolean z) {
        return new uq() {
            /* JADX INFO: finally extract failed */
            /* access modifiers changed from: 0000 */
            public final void a() {
                WorkDatabase workDatabase = svVar.c;
                workDatabase.e();
                try {
                    for (String str : workDatabase.j().h(str)) {
                        sv svVar = svVar;
                        WorkDatabase workDatabase2 = svVar.c;
                        uk j = workDatabase2.j();
                        ub k = workDatabase2.k();
                        LinkedList linkedList = new LinkedList();
                        linkedList.add(str);
                        while (!linkedList.isEmpty()) {
                            String str2 = (String) linkedList.remove();
                            State f = j.f(str2);
                            if (!(f == State.SUCCEEDED || f == State.FAILED)) {
                                j.a(State.CANCELLED, str2);
                            }
                            linkedList.addAll(k.b(str2));
                        }
                        svVar.f.b(str);
                        for (sr a : svVar.e) {
                            a.a(str);
                        }
                    }
                    workDatabase.g();
                    workDatabase.f();
                    if (z) {
                        sv svVar2 = svVar;
                        ss.a(svVar2.b, svVar2.c, svVar2.e);
                    }
                } catch (Throwable th) {
                    workDatabase.f();
                    throw th;
                }
            }
        };
    }
}
