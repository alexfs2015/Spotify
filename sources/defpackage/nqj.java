package defpackage;

import android.content.Context;
import com.google.common.collect.ImmutableMap;
import com.spotify.music.R;
import com.spotify.music.features.homemix.models.HomeMixTuning.Style;
import java.util.EnumMap;

/* renamed from: nqj reason: default package */
public final class nqj implements wig<EnumMap<Style, String>> {
    private final wzi<Context> a;

    private nqj(wzi<Context> wzi) {
        this.a = wzi;
    }

    public static nqj a(wzi<Context> wzi) {
        return new nqj(wzi);
    }

    public final /* synthetic */ Object get() {
        Context context = (Context) this.a.get();
        return (EnumMap) wil.a(new EnumMap(ImmutableMap.a(Style.CHILL, context.getString(R.string.home_mix_chill_empty_tracks_message), Style.UPBEAT, context.getString(R.string.home_mix_upbeat_empty_tracks_message))), "Cannot return null from a non-@Nullable @Provides method");
    }
}
