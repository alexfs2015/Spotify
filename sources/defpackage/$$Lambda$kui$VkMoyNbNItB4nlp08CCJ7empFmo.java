package defpackage;

import com.spotify.music.autoplay.RadioSeedBundle;
import io.reactivex.functions.BiFunction;

/* renamed from: -$$Lambda$kui$VkMoyNbNItB4nlp08CCJ7empFmo reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$kui$VkMoyNbNItB4nlp08CCJ7empFmo implements BiFunction {
    public static final /* synthetic */ $$Lambda$kui$VkMoyNbNItB4nlp08CCJ7empFmo INSTANCE = new $$Lambda$kui$VkMoyNbNItB4nlp08CCJ7empFmo();

    private /* synthetic */ $$Lambda$kui$VkMoyNbNItB4nlp08CCJ7empFmo() {
    }

    public final Object apply(Object obj, Object obj2) {
        return RadioSeedBundle.create((String) obj, ((RadioSeedBundle) obj2).getPlaybackId(), ((RadioSeedBundle) obj2).getPlayOrigin());
    }
}
