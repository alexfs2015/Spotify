package defpackage;

import com.spotify.music.spotlets.tracker.identifier.InputFieldIdentifier;
import com.spotify.music.spotlets.tracker.identifier.ScreenIdentifier;
import io.reactivex.functions.Consumer;
import java.util.Calendar;

/* renamed from: -$$Lambda$oji$xM7hGDkk4bjaOTsUoYdnydypVBo reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$oji$xM7hGDkk4bjaOTsUoYdnydypVBo implements Consumer {
    private final /* synthetic */ oji f$0;
    private final /* synthetic */ InputFieldIdentifier f$1;
    private final /* synthetic */ ScreenIdentifier f$2;

    public /* synthetic */ $$Lambda$oji$xM7hGDkk4bjaOTsUoYdnydypVBo(oji oji, InputFieldIdentifier inputFieldIdentifier, ScreenIdentifier screenIdentifier) {
        this.f$0 = oji;
        this.f$1 = inputFieldIdentifier;
        this.f$2 = screenIdentifier;
    }

    public final void accept(Object obj) {
        this.f$0.a(this.f$1, this.f$2, (Calendar) obj);
    }
}
