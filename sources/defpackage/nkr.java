package defpackage;

import android.content.Context;
import com.google.common.collect.ImmutableMap;
import com.spotify.music.R;
import com.spotify.music.features.homemix.models.HomeMixTuning.Style;
import java.util.EnumMap;

/* renamed from: nkr reason: default package */
public final class nkr implements vua<EnumMap<Style, String>> {
    private final wlc<Context> a;

    private nkr(wlc<Context> wlc) {
        this.a = wlc;
    }

    public static nkr a(wlc<Context> wlc) {
        return new nkr(wlc);
    }

    public final /* synthetic */ Object get() {
        Context context = (Context) this.a.get();
        return (EnumMap) vuf.a(new EnumMap(ImmutableMap.a(Style.CHILL, context.getString(R.string.home_mix_chill_empty_tracks_message), Style.UPBEAT, context.getString(R.string.home_mix_upbeat_empty_tracks_message))), "Cannot return null from a non-@Nullable @Provides method");
    }
}
