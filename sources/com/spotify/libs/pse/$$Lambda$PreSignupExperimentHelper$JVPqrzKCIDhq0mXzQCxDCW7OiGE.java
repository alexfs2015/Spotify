package com.spotify.libs.pse;

import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.Consumer;

/* renamed from: com.spotify.libs.pse.-$$Lambda$PreSignupExperimentHelper$JVPqrzKCIDhq0mXzQCxDCW7OiGE reason: invalid class name */
public final /* synthetic */ class $$Lambda$PreSignupExperimentHelper$JVPqrzKCIDhq0mXzQCxDCW7OiGE implements Consumer {
    public static final /* synthetic */ $$Lambda$PreSignupExperimentHelper$JVPqrzKCIDhq0mXzQCxDCW7OiGE INSTANCE = new $$Lambda$PreSignupExperimentHelper$JVPqrzKCIDhq0mXzQCxDCW7OiGE();

    private /* synthetic */ $$Lambda$PreSignupExperimentHelper$JVPqrzKCIDhq0mXzQCxDCW7OiGE() {
    }

    public final void accept(Object obj) {
        Logger.e("PSES fetching flags failed, %s", (Throwable) obj);
    }
}
