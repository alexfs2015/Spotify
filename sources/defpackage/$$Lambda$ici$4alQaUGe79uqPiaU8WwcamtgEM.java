package defpackage;

import com.spotify.base.java.logging.Logger;
import com.spotify.cosmos.router.Response;
import io.reactivex.functions.Consumer;

/* renamed from: -$$Lambda$ici$4alQaUGe79uqPiaU8Wwcam-tgEM reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$ici$4alQaUGe79uqPiaU8WwcamtgEM implements Consumer {
    public static final /* synthetic */ $$Lambda$ici$4alQaUGe79uqPiaU8WwcamtgEM INSTANCE = new $$Lambda$ici$4alQaUGe79uqPiaU8WwcamtgEM();

    private /* synthetic */ $$Lambda$ici$4alQaUGe79uqPiaU8WwcamtgEM() {
    }

    public final void accept(Object obj) {
        Logger.b("[Marquee] - enable marquee %s", ((Response) obj).getBodyString());
    }
}
