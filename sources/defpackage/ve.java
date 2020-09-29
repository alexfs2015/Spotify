package defpackage;

import androidx.work.WorkInfo.State;
import androidx.work.impl.WorkDatabase;
import java.util.LinkedList;

/* renamed from: ve reason: default package */
public abstract class ve implements Runnable {
    public final td a = new td();

    public static ve a(final String str, final tj tjVar, final boolean z) {
        return new ve() {
            /* JADX INFO: finally extract failed */
            /* access modifiers changed from: 0000 */
            public final void a() {
                WorkDatabase workDatabase = tjVar.c;
                workDatabase.e();
                try {
                    for (String str : workDatabase.j().h(str)) {
                        tj tjVar = tjVar;
                        WorkDatabase workDatabase2 = tjVar.c;
                        uy j = workDatabase2.j();
                        up k = workDatabase2.k();
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
                        tjVar.f.b(str);
                        for (tf a : tjVar.e) {
                            a.a(str);
                        }
                    }
                    workDatabase.g();
                    workDatabase.f();
                    if (z) {
                        tj tjVar2 = tjVar;
                        tg.a(tjVar2.b, tjVar2.c, tjVar2.e);
                    }
                } catch (Throwable th) {
                    workDatabase.f();
                    throw th;
                }
            }
        };
    }

    /* access modifiers changed from: 0000 */
    public abstract void a();

    public void run() {
        try {
            a();
            this.a.a(sw.a);
        } catch (Throwable th) {
            this.a.a(new C0079a(th));
        }
    }
}
