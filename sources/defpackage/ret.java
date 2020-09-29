package defpackage;

import java.util.Map;

/* renamed from: ret reason: default package */
public final class ret implements vua<res> {
    private final wlc<Map<String, reu<?>>> a;

    private ret(wlc<Map<String, reu<?>>> wlc) {
        this.a = wlc;
    }

    public static ret a(wlc<Map<String, reu<?>>> wlc) {
        return new ret(wlc);
    }

    public final /* synthetic */ Object get() {
        return new res((Map) this.a.get());
    }
}
