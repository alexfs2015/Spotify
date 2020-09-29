package defpackage;

import com.spotify.music.features.yourlibrary.musicpages.bans.BansLoader.BansResponse;
import io.reactivex.functions.Function;

/* renamed from: -$$Lambda$rcj$8MGaiMMlQuwxMa62y9SH1q12-Gg reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$rcj$8MGaiMMlQuwxMa62y9SH1q12Gg implements Function {
    public static final /* synthetic */ $$Lambda$rcj$8MGaiMMlQuwxMa62y9SH1q12Gg INSTANCE = new $$Lambda$rcj$8MGaiMMlQuwxMa62y9SH1q12Gg();

    private /* synthetic */ $$Lambda$rcj$8MGaiMMlQuwxMa62y9SH1q12Gg() {
    }

    public final Object apply(Object obj) {
        return Boolean.valueOf(!((BansResponse) obj).getTracks().isEmpty());
    }
}
