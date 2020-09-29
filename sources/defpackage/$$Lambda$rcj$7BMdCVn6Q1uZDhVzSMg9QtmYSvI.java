package defpackage;

import com.spotify.music.features.yourlibrary.musicpages.bans.BansLoader.BansResponse;
import io.reactivex.functions.Function;

/* renamed from: -$$Lambda$rcj$7BMdCVn6Q1uZDhVzSMg9QtmYSvI reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$rcj$7BMdCVn6Q1uZDhVzSMg9QtmYSvI implements Function {
    public static final /* synthetic */ $$Lambda$rcj$7BMdCVn6Q1uZDhVzSMg9QtmYSvI INSTANCE = new $$Lambda$rcj$7BMdCVn6Q1uZDhVzSMg9QtmYSvI();

    private /* synthetic */ $$Lambda$rcj$7BMdCVn6Q1uZDhVzSMg9QtmYSvI() {
    }

    public final Object apply(Object obj) {
        return Boolean.valueOf(!((BansResponse) obj).getArtists().isEmpty());
    }
}
