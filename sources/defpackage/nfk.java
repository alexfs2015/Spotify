package defpackage;

import android.content.Context;
import com.spotify.stories.v1.view.proto.TrackChapter;

/* renamed from: nfk reason: default package */
public final class nfk implements nfj {
    private final Context a;
    private final String b;

    public nfk(Context context, String str) {
        this.a = context;
        this.b = str;
    }

    public final void a(TrackChapter trackChapter, jor<? super TrackChapter> jor) {
        jok.a(this.a, jor, trackChapter, sso.a(this.b));
    }
}
