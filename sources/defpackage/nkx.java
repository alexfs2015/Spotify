package defpackage;

import android.content.Context;
import com.google.common.collect.ImmutableMap;
import com.spotify.music.R;
import com.spotify.music.features.homemix.models.HomeMixTuning.Style;
import java.util.EnumMap;

/* renamed from: nkx reason: default package */
public final class nkx implements vua<EnumMap<Style, String>> {
    private final wlc<Context> a;

    private nkx(wlc<Context> wlc) {
        this.a = wlc;
    }

    public static nkx a(wlc<Context> wlc) {
        return new nkx(wlc);
    }

    public final /* synthetic */ Object get() {
        Context context = (Context) this.a.get();
        return (EnumMap) vuf.a(new EnumMap(ImmutableMap.a(Style.CHILL, context.getString(R.string.home_mix_chill_text), Style.UPBEAT, context.getString(R.string.home_mix_upbeat_text), Style.DEFAULT, "")), "Cannot return null from a non-@Nullable @Provides method");
    }
}
