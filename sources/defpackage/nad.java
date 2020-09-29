package defpackage;

import android.content.Context;
import com.spotify.stories.v1.view.proto.TrackChapter;

/* renamed from: nad reason: default package */
public final class nad implements nac {
    private final Context a;
    private final String b;

    public nad(Context context, String str) {
        this.a = context;
        this.b = str;
    }

    public final void a(TrackChapter trackChapter, jmf<? super TrackChapter> jmf) {
        jly.a(this.a, jmf, trackChapter, sih.a(this.b));
    }
}
