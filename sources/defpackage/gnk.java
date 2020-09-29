package defpackage;

import com.spotify.libs.instrumentation.performance.ViewLoadSequence;
import java.util.ArrayList;
import java.util.List;

/* renamed from: gnk reason: default package */
public class gnk {
    public final List<gnj> a = new ArrayList();
    private volatile boolean b;
    private final List<ViewLoadSequence> c = new ArrayList();

    public synchronized void a() {
        for (ViewLoadSequence b2 : this.c) {
            b(b2);
        }
        this.c.clear();
        this.b = true;
    }

    public final synchronized void a(ViewLoadSequence viewLoadSequence) {
        if (this.b) {
            b(viewLoadSequence);
        } else {
            this.c.add(viewLoadSequence);
        }
    }

    public final void a(gnj gnj) {
        this.a.add(gnj);
    }

    public synchronized void b() {
        for (gnj a2 : this.a) {
            a2.a();
        }
        this.b = false;
    }

    /* access modifiers changed from: protected */
    public void b(ViewLoadSequence viewLoadSequence) {
        c(viewLoadSequence);
    }

    /* access modifiers changed from: protected */
    public void c(ViewLoadSequence viewLoadSequence) {
        for (gnj process : this.a) {
            process.process(viewLoadSequence);
        }
    }
}
