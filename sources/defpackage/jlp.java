package defpackage;

import java.util.Deque;
import java.util.concurrent.LinkedBlockingDeque;

/* renamed from: jlp reason: default package */
public final class jlp implements jlr {
    public final Deque<hdp> a = new LinkedBlockingDeque(1024);
    public hpo b;

    jlp() {
    }

    public final void a(hdp hdp) {
        hpo hpo = this.b;
        if (hpo != null) {
            hpo.a(hdp.a());
        } else if (!this.a.offerLast(hdp)) {
            this.a.removeFirst();
            this.a.addLast(hdp);
        }
    }
}
