package defpackage;

import com.spotify.base.java.logging.Logger;
import com.spotify.music.autoplay.RadioSeedBundle;
import io.reactivex.functions.Consumer;

/* renamed from: -$$Lambda$kua$1C03UJWGolFDWx8tcYyiGevHzGs reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$kua$1C03UJWGolFDWx8tcYyiGevHzGs implements Consumer {
    public static final /* synthetic */ $$Lambda$kua$1C03UJWGolFDWx8tcYyiGevHzGs INSTANCE = new $$Lambda$kua$1C03UJWGolFDWx8tcYyiGevHzGs();

    private /* synthetic */ $$Lambda$kua$1C03UJWGolFDWx8tcYyiGevHzGs() {
    }

    public final void accept(Object obj) {
        Logger.b("AutoPlay: Source %s", (RadioSeedBundle) obj);
    }
}
