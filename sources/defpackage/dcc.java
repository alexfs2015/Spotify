package defpackage;

import java.io.PrintWriter;
import java.lang.ref.Reference;
import java.util.List;

/* renamed from: dcc reason: default package */
final class dcc extends dbz {
    private final dca a = new dca();

    dcc() {
    }

    public final void a(Throwable th, PrintWriter printWriter) {
        th.printStackTrace(printWriter);
        dca dca = this.a;
        while (true) {
            Reference poll = dca.b.poll();
            if (poll == null) {
                break;
            }
            dca.a.remove(poll);
        }
        List<Throwable> list = (List) dca.a.get(new dcb(th));
        if (list != null) {
            synchronized (list) {
                for (Throwable th2 : list) {
                    printWriter.print("Suppressed: ");
                    th2.printStackTrace(printWriter);
                }
            }
        }
    }
}
