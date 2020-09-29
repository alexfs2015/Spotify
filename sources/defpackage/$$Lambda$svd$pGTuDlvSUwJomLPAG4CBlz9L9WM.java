package defpackage;

import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.Consumer;

/* renamed from: -$$Lambda$svd$pGTuDlvSUwJomLPAG4CBlz9L9WM reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$svd$pGTuDlvSUwJomLPAG4CBlz9L9WM implements Consumer {
    public static final /* synthetic */ $$Lambda$svd$pGTuDlvSUwJomLPAG4CBlz9L9WM INSTANCE = new $$Lambda$svd$pGTuDlvSUwJomLPAG4CBlz9L9WM();

    private /* synthetic */ $$Lambda$svd$pGTuDlvSUwJomLPAG4CBlz9L9WM() {
    }

    public final void accept(Object obj) {
        Logger.e("Error observing PlayerTrack: %s", ((Throwable) obj).toString());
    }
}
