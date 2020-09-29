package defpackage;

import android.content.Context;
import com.google.common.collect.ImmutableMap;
import com.spotify.music.R;
import com.spotify.music.features.homemix.models.HomeMixTuning.Style;
import java.util.EnumMap;

/* renamed from: nqn reason: default package */
public final class nqn implements wig<EnumMap<Style, String>> {
    private final wzi<Context> a;

    private nqn(wzi<Context> wzi) {
        this.a = wzi;
    }

    public static nqn a(wzi<Context> wzi) {
        return new nqn(wzi);
    }

    public final /* synthetic */ Object get() {
        Context context = (Context) this.a.get();
        return (EnumMap) wil.a(new EnumMap(ImmutableMap.a(Style.CHILL, context.getString(R.string.home_mix_chill_text), Style.UPBEAT, context.getString(R.string.home_mix_upbeat_text), Style.DEFAULT, "")), "Cannot return null from a non-@Nullable @Provides method");
    }
}
