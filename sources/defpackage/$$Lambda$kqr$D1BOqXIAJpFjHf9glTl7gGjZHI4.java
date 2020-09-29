package defpackage;

import com.spotify.base.java.logging.Logger;
import com.spotify.music.autoplay.RadioSeedBundle;
import io.reactivex.functions.Consumer;

/* renamed from: -$$Lambda$kqr$D1BOqXIAJpFjHf9glTl7gGjZHI4 reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$kqr$D1BOqXIAJpFjHf9glTl7gGjZHI4 implements Consumer {
    public static final /* synthetic */ $$Lambda$kqr$D1BOqXIAJpFjHf9glTl7gGjZHI4 INSTANCE = new $$Lambda$kqr$D1BOqXIAJpFjHf9glTl7gGjZHI4();

    private /* synthetic */ $$Lambda$kqr$D1BOqXIAJpFjHf9glTl7gGjZHI4() {
    }

    public final void accept(Object obj) {
        Logger.b("AutoPlay: Source %s", (RadioSeedBundle) obj);
    }
}
