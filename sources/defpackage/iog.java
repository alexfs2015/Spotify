package defpackage;

import android.content.res.Resources;
import com.spotify.mobile.android.spotlets.bixbyhomecards.models.StreamingCardData;
import com.spotify.mobile.android.spotlets.bixbyhomecards.models.StreamingCardPendingEventData;
import com.spotify.music.R;

/* renamed from: iog reason: default package */
public final class iog {
    private final StreamingCardData a;
    private final String b;

    public iog(ioe ioe, Resources resources) {
        StreamingCardData streamingCardData = null;
        String a2 = ioe.b.a(ioe.a, (String) null);
        if (!fbo.a(a2)) {
            streamingCardData = ioe.a(a2);
        }
        this.a = streamingCardData;
        this.b = resources.getString(R.string.bixby_home_card_loading);
    }

    public final StreamingCardData a(String str) {
        StreamingCardData streamingCardData = this.a;
        if (streamingCardData == null) {
            return null;
        }
        return new StreamingCardPendingEventData(streamingCardData, str, this.b);
    }
}
