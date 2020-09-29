package defpackage;

import android.net.Uri;
import android.net.Uri.Builder;
import com.google.common.base.Optional;
import com.spotify.mobile.android.cosmos.RequestBuilder;
import com.spotify.music.spotlets.radio.formatlist.RadioFormatListSourceModel;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* renamed from: urs reason: default package */
public final class urs {
    private final gmm<RadioFormatListSourceModel> a;

    public urs(gmm<RadioFormatListSourceModel> gmm) {
        this.a = gmm;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Optional a(RadioFormatListSourceModel radioFormatListSourceModel) {
        List mediaItems = radioFormatListSourceModel.mediaItems();
        return (mediaItems == null || mediaItems.isEmpty()) ? Optional.e() : Optional.c(((Map) mediaItems.get(0)).get("uri"));
    }

    public final xii<Optional<String>> a(String str) {
        Builder buildUpon = Uri.parse(String.format(Locale.US, "hm://inspiredby-mix/v2/seed_to_playlist/%s", new Object[]{str})).buildUpon();
        buildUpon.appendQueryParameter("response-format", "json");
        return this.a.resolve(RequestBuilder.get(buildUpon.build().toString()).build()).e((xiy<? super T, ? extends R>) $$Lambda$urs$K3TSarqIXabXJmSYG2obFgElRQ.INSTANCE);
    }
}
