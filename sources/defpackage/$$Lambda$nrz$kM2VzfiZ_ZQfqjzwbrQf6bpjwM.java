package defpackage;

import com.spotify.base.java.logging.Logger;
import com.spotify.music.spotlets.tracker.identifier.InputFieldIdentifier;
import io.reactivex.functions.Consumer;

/* renamed from: -$$Lambda$nrz$kM2Vz-fiZ_ZQfqjzwbrQf6bpjwM reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$nrz$kM2VzfiZ_ZQfqjzwbrQf6bpjwM implements Consumer {
    private final /* synthetic */ InputFieldIdentifier f$0;

    public /* synthetic */ $$Lambda$nrz$kM2VzfiZ_ZQfqjzwbrQf6bpjwM(InputFieldIdentifier inputFieldIdentifier) {
        this.f$0 = inputFieldIdentifier;
    }

    public final void accept(Object obj) {
        Logger.e((Throwable) obj, String.format("Failed to observe the %s input text change.", new Object[]{this.f$0.mType}), new Object[0]);
    }
}
