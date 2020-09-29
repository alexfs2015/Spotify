package defpackage;

import android.media.MediaPlayer;
import io.reactivex.functions.Cancellable;

/* renamed from: -$$Lambda$x2OHLjrpErIPDXg2267-ntL0NYk reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$x2OHLjrpErIPDXg2267ntL0NYk implements Cancellable {
    private final /* synthetic */ MediaPlayer f$0;

    public /* synthetic */ $$Lambda$x2OHLjrpErIPDXg2267ntL0NYk(MediaPlayer mediaPlayer) {
        this.f$0 = mediaPlayer;
    }

    public final void cancel() {
        this.f$0.release();
    }
}
