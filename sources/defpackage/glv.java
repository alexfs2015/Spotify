package defpackage;

import com.spotify.libs.instrumentation.performance.ViewLoadSequence;
import java.util.ArrayList;
import java.util.List;

/* renamed from: glv reason: default package */
public class glv {
    public final List<glu> a = new ArrayList();
    private volatile boolean b;
    private final List<ViewLoadSequence> c = new ArrayList();

    public final synchronized void a(ViewLoadSequence viewLoadSequence) {
        if (this.b) {
            b(viewLoadSequence);
        } else {
            this.c.add(viewLoadSequence);
        }
    }

    public final void a(glu glu) {
        this.a.add(glu);
    }

    /* access modifiers changed from: protected */
    public void b(ViewLoadSequence viewLoadSequence) {
        c(viewLoadSequence);
    }

    /* access modifiers changed from: protected */
    public void c(ViewLoadSequence viewLoadSequence) {
        for (glu process : this.a) {
            process.process(viewLoadSequence);
        }
    }

    public synchronized void a() {
        for (ViewLoadSequence b2 : this.c) {
            b(b2);
        }
        this.c.clear();
        this.b = true;
    }

    public synchronized void b() {
        for (glu a2 : this.a) {
            a2.a();
        }
        this.b = false;
    }
}
