package defpackage;

import com.spotify.music.cappedondemand.core.model.CappedOndemandStatus;
import io.reactivex.functions.Function;

/* renamed from: -$$Lambda$kym$LNPOmIu5tQeQI6QY0AZlo5ctVuo reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$kym$LNPOmIu5tQeQI6QY0AZlo5ctVuo implements Function {
    public static final /* synthetic */ $$Lambda$kym$LNPOmIu5tQeQI6QY0AZlo5ctVuo INSTANCE = new $$Lambda$kym$LNPOmIu5tQeQI6QY0AZlo5ctVuo();

    private /* synthetic */ $$Lambda$kym$LNPOmIu5tQeQI6QY0AZlo5ctVuo() {
    }

    public final Object apply(Object obj) {
        return Boolean.valueOf(!((CappedOndemandStatus) obj).ondemand());
    }
}
