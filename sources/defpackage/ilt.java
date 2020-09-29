package defpackage;

import android.content.res.Resources;
import com.spotify.mobile.android.spotlets.bixbyhomecards.models.StreamingCardData;
import com.spotify.mobile.android.spotlets.bixbyhomecards.models.StreamingCardPendingEventData;
import com.spotify.music.R;

/* renamed from: ilt reason: default package */
public final class ilt {
    private final StreamingCardData a;
    private final String b;

    public ilt(ilr ilr, Resources resources) {
        StreamingCardData streamingCardData = null;
        String a2 = ilr.b.a(ilr.a, (String) null);
        if (!fax.a(a2)) {
            streamingCardData = ilr.a(a2);
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
