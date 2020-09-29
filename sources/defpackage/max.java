package defpackage;

import android.content.res.Resources;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.mobile.android.hubframework.model.json.HubsJsonViewModel;
import com.spotify.music.R;

/* renamed from: max reason: default package */
final class max {
    private final Resources a;
    private final wuh<HubsJsonViewModel> b;
    private final wug c;
    private final wug d;
    private final rfd e;

    max(Resources resources, wuh<HubsJsonViewModel> wuh, wug wug, wug wug2, rfd rfd) {
        this.a = resources;
        this.b = wuh;
        this.c = wug;
        this.d = wug2;
        this.e = rfd;
    }

    public final wud<gzz> a() {
        wud h = wuh.a(this.b).a((c<? super T, ? extends R>) this.e).h(new $$Lambda$max$CQnDXITH7_oY9_9WOlePuiR41EY(this));
        a aVar = new a(gyi.a(), this.d);
        aVar.a = 300;
        return h.a((c<? super T, ? extends R>) aVar.a()).a(this.c);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ gzz a(Throwable th) {
        return gyi.a(SpotifyIconV2.WARNING, this.a.getString(R.string.error_general_title), this.a.getString(R.string.error_general_body));
    }
}
