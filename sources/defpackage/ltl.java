package defpackage;

import com.spotify.mobile.android.hubframework.defaults.HubsGlueImageDelegate;

/* renamed from: ltl reason: default package */
public final class ltl implements wig<ltk> {
    private final wzi<HubsGlueImageDelegate> a;

    private ltl(wzi<HubsGlueImageDelegate> wzi) {
        this.a = wzi;
    }

    public static ltl a(wzi<HubsGlueImageDelegate> wzi) {
        return new ltl(wzi);
    }

    public final /* synthetic */ Object get() {
        return new ltk((HubsGlueImageDelegate) this.a.get());
    }
}
