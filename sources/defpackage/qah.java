package defpackage;

import android.os.Bundle;
import com.spotify.music.features.quicksilver.messages.models.QuicksilverCardMessage;

/* renamed from: qah reason: default package */
public final class qah implements wig<QuicksilverCardMessage> {
    private final wzi<Bundle> a;

    private qah(wzi<Bundle> wzi) {
        this.a = wzi;
    }

    public static qah a(wzi<Bundle> wzi) {
        return new qah(wzi);
    }

    public final /* synthetic */ Object get() {
        return (QuicksilverCardMessage) wil.a((QuicksilverCardMessage) ((Bundle) this.a.get()).getParcelable("EXTRA_MESSAGE"), "Cannot return null from a non-@Nullable @Provides method");
    }
}
