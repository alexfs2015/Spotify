package defpackage;

import android.content.Intent;
import android.net.Uri;
import com.spotify.music.behindthelyrics.model.business.TrackAnnotationSet;

/* renamed from: kvn reason: default package */
public final class kvn implements xis<TrackAnnotationSet> {
    private final kwc a;

    public kvn(kwc kwc) {
        this.a = kwc;
    }

    public final /* synthetic */ void call(Object obj) {
        String str = "android.intent.action.VIEW";
        this.a.a(new Intent(str, Uri.parse(String.format("https://genius.com/songs/%s?utm_source=spotify", new Object[]{Integer.valueOf(((TrackAnnotationSet) obj).getGeniusTrackId())}))));
    }
}
