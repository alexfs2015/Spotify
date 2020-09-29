package defpackage;

import android.content.Intent;
import android.net.Uri;
import com.spotify.music.behindthelyrics.model.business.TrackAnnotationSet;

/* renamed from: kse reason: default package */
public final class kse implements wun<TrackAnnotationSet> {
    private final kst a;

    public final /* synthetic */ void call(Object obj) {
        String str = "android.intent.action.VIEW";
        this.a.a(new Intent(str, Uri.parse(String.format("https://genius.com/songs/%s?utm_source=spotify", new Object[]{Integer.valueOf(((TrackAnnotationSet) obj).getGeniusTrackId())}))));
    }

    public kse(kst kst) {
        this.a = kst;
    }
}
