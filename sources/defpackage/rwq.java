package defpackage;

import com.spotify.libs.instrumentation.performance.ViewLoadSequence;

/* renamed from: rwq reason: default package */
final class rwq implements glu {
    private final jjf a;

    public /* synthetic */ void a() {
        CC.$default$a(this);
    }

    public /* synthetic */ void c(ViewLoadSequence viewLoadSequence) {
        CC.$default$c(this, viewLoadSequence);
    }

    public rwq(jjf jjf) {
        this.a = jjf;
    }

    public final void process(ViewLoadSequence viewLoadSequence) {
        jjf jjf = this.a;
        bo boVar = new bo(viewLoadSequence.a, viewLoadSequence.b, viewLoadSequence.c, viewLoadSequence.d, viewLoadSequence.e, viewLoadSequence.f, viewLoadSequence.g, viewLoadSequence.h);
        jjf.a(boVar);
    }
}
