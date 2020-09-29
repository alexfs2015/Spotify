package defpackage;

import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.spotlets.ads.model.AdSlot;
import io.reactivex.functions.Consumer;

/* renamed from: -$$Lambda$hmq$zrMOTnzlElLt2fpl6FA_Y4RqfAw reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$hmq$zrMOTnzlElLt2fpl6FA_Y4RqfAw implements Consumer {
    private final /* synthetic */ AdSlot f$0;

    public /* synthetic */ $$Lambda$hmq$zrMOTnzlElLt2fpl6FA_Y4RqfAw(AdSlot adSlot) {
        this.f$0 = adSlot;
    }

    public final void accept(Object obj) {
        Logger.e((Throwable) obj, String.format("error registering %s", new Object[]{this.f$0.slot_id}), new Object[0]);
    }
}
