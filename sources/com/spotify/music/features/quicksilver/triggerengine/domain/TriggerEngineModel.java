package com.spotify.music.features.quicksilver.triggerengine.domain;

import com.google.common.collect.ImmutableList;
import java.io.Serializable;

public abstract class TriggerEngineModel implements Serializable {
    public static final TriggerEngineModel a = new a().a(ImmutableList.d()).b(ImmutableList.d()).a(false).b(false).c(false).a();
    private static final long serialVersionUID = 1;

    public interface a {
        a a(ImmutableList<OutboundRequest> immutableList);

        a a(boolean z);

        TriggerEngineModel a();

        a b(ImmutableList<prk> immutableList);

        a b(boolean z);

        a c(boolean z);
    }

    public abstract ImmutableList<OutboundRequest> a();

    public abstract ImmutableList<prk> b();

    public abstract boolean c();

    public abstract boolean d();

    public abstract boolean e();

    public abstract a f();

    public final TriggerEngineModel a(ImmutableList<OutboundRequest> immutableList) {
        return f().a(immutableList).a();
    }

    public final TriggerEngineModel a(boolean z) {
        return f().c(z).a();
    }
}
