package defpackage;

import com.fasterxml.jackson.databind.ObjectMapper;

/* renamed from: vpp reason: default package */
public final class vpp implements vua<vpo> {
    private final wlc<ObjectMapper> a;

    private vpp(wlc<ObjectMapper> wlc) {
        this.a = wlc;
    }

    public static vpp a(wlc<ObjectMapper> wlc) {
        return new vpp(wlc);
    }

    public final /* synthetic */ Object get() {
        return new vpo((ObjectMapper) this.a.get());
    }
}
