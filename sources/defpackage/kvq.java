package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import com.spotify.music.behindthelyrics.service.BehindTheLyricsResourcesAndTracksFetcher;

/* renamed from: kvq reason: default package */
public final class kvq implements c {
    private final Context a;
    private boolean b;

    public kvq(Context context) {
        this.a = context;
    }

    public final void a() {
        if (!this.b) {
            this.b = true;
            BehindTheLyricsResourcesAndTracksFetcher.a(this.a);
        }
    }

    public final void a(ViewGroup viewGroup) {
    }

    public final void b() {
    }
}