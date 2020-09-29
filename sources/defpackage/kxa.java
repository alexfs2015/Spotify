package defpackage;

import com.google.common.collect.Lists;
import com.spotify.messages.AndroidClientReport;

/* renamed from: kxa reason: default package */
public final class kxa implements c {
    private final kwz a;

    public final void aj_() {
    }

    public final String c() {
        return "ClientInfoPublisher";
    }

    public kxa(kwz kwz) {
        this.a = kwz;
    }

    public final void ai_() {
        kwz kwz = this.a;
        kwz.a.a(AndroidClientReport.k().a(kwz.b.d()).a((Iterable<String>) Lists.a((E[]) kwz.b.e().split(":"))).b(fax.b(kwz.b.f())).g());
    }
}
