package defpackage;

import android.os.Bundle;
import com.spotify.mobile.android.spotlets.eventshub.model.EventResult;

/* renamed from: ivh reason: default package */
public final class ivh implements wig<EventResult> {
    private final wzi<Bundle> a;

    private ivh(wzi<Bundle> wzi) {
        this.a = wzi;
    }

    public static ivh a(wzi<Bundle> wzi) {
        return new ivh(wzi);
    }

    public final /* synthetic */ Object get() {
        Bundle bundle = (Bundle) this.a.get();
        String str = "event-result-arg";
        return (EventResult) wil.a(bundle.containsKey(str) ? (EventResult) bundle.getParcelable(str) : EventResult.EMPTY, "Cannot return null from a non-@Nullable @Provides method");
    }
}
