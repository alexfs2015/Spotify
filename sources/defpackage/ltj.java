package defpackage;

import com.spotify.mobile.android.hubframework.defaults.HubsGlueImageDelegate;

/* renamed from: ltj reason: default package */
public final class ltj implements wig<lti> {
    private final wzi<HubsGlueImageDelegate> a;

    private ltj(wzi<HubsGlueImageDelegate> wzi) {
        this.a = wzi;
    }

    public static ltj a(wzi<HubsGlueImageDelegate> wzi) {
        return new ltj(wzi);
    }

    public final /* synthetic */ Object get() {
        return new lti((HubsGlueImageDelegate) this.a.get());
    }
}
