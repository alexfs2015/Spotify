package defpackage;

import com.spotify.libs.instrumentation.performance.ViewLoadSequence;

/* renamed from: sga reason: default package */
final class sga implements gnj {
    private final jlr a;

    public sga(jlr jlr) {
        this.a = jlr;
    }

    public /* synthetic */ void a() {
        CC.$default$a(this);
    }

    public /* synthetic */ void c(ViewLoadSequence viewLoadSequence) {
        CC.$default$c(this, viewLoadSequence);
    }

    public final void process(ViewLoadSequence viewLoadSequence) {
        jlr jlr = this.a;
        bm bmVar = new bm(viewLoadSequence.a, viewLoadSequence.b, viewLoadSequence.c, viewLoadSequence.d, viewLoadSequence.e, viewLoadSequence.f, viewLoadSequence.g, viewLoadSequence.h);
        jlr.a(bmVar);
    }
}
