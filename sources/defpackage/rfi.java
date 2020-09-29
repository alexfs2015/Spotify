package defpackage;

import android.content.Context;
import com.spotify.music.features.yourlibrary.musicpages.pages.MusicPageId;

/* renamed from: rfi reason: default package */
public final class rfi {
    private final rbg a;
    private final Context b;
    private final kk c;
    private final rlh d;
    private final rks e;

    public rfi(rbg rbg, Context context, kk kkVar, rlh rlh, rks rks) {
        this.a = rbg;
        this.b = context;
        this.c = kkVar;
        this.d = rlh;
        this.e = rks;
    }

    private rkq a() {
        return new rle(this.b, this.c, this.d);
    }

    private rkq a(boolean z) {
        return this.e.a(z);
    }

    public final rkq a(MusicPageId musicPageId) {
        return musicPageId == MusicPageId.SONGS ? this.a.f() ? a(true) : a() : rbg.e() ? a(false) : a();
    }
}
