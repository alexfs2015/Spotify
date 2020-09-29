package defpackage;

import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol.ImageIdentifier;
import io.reactivex.functions.Action;

/* renamed from: -$$Lambda$iid$9KBrkIIQESWr61HDkxx7Y64S3JU reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$iid$9KBrkIIQESWr61HDkxx7Y64S3JU implements Action {
    private final /* synthetic */ ImageIdentifier f$0;
    private final /* synthetic */ String f$1;

    public /* synthetic */ $$Lambda$iid$9KBrkIIQESWr61HDkxx7Y64S3JU(ImageIdentifier imageIdentifier, String str) {
        this.f$0 = imageIdentifier;
        this.f$1 = str;
    }

    public final void run() {
        iid.b(this.f$0, this.f$1);
    }
}
