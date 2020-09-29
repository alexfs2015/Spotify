package defpackage;

import java.io.PrintWriter;
import java.lang.ref.Reference;
import java.util.List;

/* renamed from: dbl reason: default package */
final class dbl extends dbi {
    private final dbj a = new dbj();

    dbl() {
    }

    public final void a(Throwable th, PrintWriter printWriter) {
        th.printStackTrace(printWriter);
        dbj dbj = this.a;
        while (true) {
            Reference poll = dbj.b.poll();
            if (poll == null) {
                break;
            }
            dbj.a.remove(poll);
        }
        List<Throwable> list = (List) dbj.a.get(new dbk(th));
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
