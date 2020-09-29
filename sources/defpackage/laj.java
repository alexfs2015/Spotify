package defpackage;

import com.google.common.collect.Lists;
import com.spotify.messages.AndroidClientReport;

/* renamed from: laj reason: default package */
public final class laj implements c {
    private final lai a;

    public laj(lai lai) {
        this.a = lai;
    }

    public final void ai_() {
        lai lai = this.a;
        lai.a.a(AndroidClientReport.k().a(lai.b.d()).a((Iterable<String>) Lists.a((E[]) lai.b.e().split(":"))).b(fbo.b(lai.b.f())).g());
    }

    public final void aj_() {
    }

    public final String c() {
        return "ClientInfoPublisher";
    }
}
