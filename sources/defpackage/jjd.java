package defpackage;

import java.util.Deque;
import java.util.concurrent.LinkedBlockingDeque;

/* renamed from: jjd reason: default package */
public final class jjd implements jjf {
    public final Deque<haw> a = new LinkedBlockingDeque(1024);
    public hmx b;

    jjd() {
    }

    public final void a(haw haw) {
        hmx hmx = this.b;
        if (hmx != null) {
            hmx.a(haw.a());
        } else if (!this.a.offerLast(haw)) {
            this.a.removeFirst();
            this.a.addLast(haw);
        }
    }
}
