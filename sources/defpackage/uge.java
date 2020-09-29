package defpackage;

import android.net.Uri;
import android.net.Uri.Builder;
import com.google.common.base.Optional;
import com.spotify.mobile.android.cosmos.RequestBuilder;
import com.spotify.music.spotlets.radio.formatlist.RadioFormatListSourceModel;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* renamed from: uge reason: default package */
public final class uge {
    private final gky<RadioFormatListSourceModel> a;

    public uge(gky<RadioFormatListSourceModel> gky) {
        this.a = gky;
    }

    public final wud<Optional<String>> a(String str) {
        Builder buildUpon = Uri.parse(String.format(Locale.US, "hm://inspiredby-mix/v2/seed_to_playlist/%s", new Object[]{str})).buildUpon();
        buildUpon.appendQueryParameter("response-format", "json");
        return this.a.resolve(RequestBuilder.get(buildUpon.build().toString()).build()).f($$Lambda$uge$xldV25r8GT9AAraOVpISHaW8os.INSTANCE);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Optional a(RadioFormatListSourceModel radioFormatListSourceModel) {
        List mediaItems = radioFormatListSourceModel.mediaItems();
        if (mediaItems == null || mediaItems.isEmpty()) {
            return Optional.e();
        }
        return Optional.c(((Map) mediaItems.get(0)).get("uri"));
    }
}
