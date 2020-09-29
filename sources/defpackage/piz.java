package defpackage;

import android.content.res.Resources;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.music.R;
import com.spotify.music.features.premiumdestination.domain.ErrorReason;

/* renamed from: piz reason: default package */
public final class piz {
    private static final gzz a = hai.EMPTY;
    private static final gzz b = hai.EMPTY;
    private static final gzz c = gyi.a();
    private final Resources d;

    public piz(Resources resources) {
        this.d = resources;
    }

    public final gzz a(pga pga) {
        return (gzz) pga.a($$Lambda$VR0v0LDHcx6V5RN62fVsPTTimeE.INSTANCE, new $$Lambda$piz$sBbg9B9pOS4vs15Uo1WjE9Nm9w(this), new $$Lambda$piz$waJyFD_uFTtMuRZ08SKglIzJp0(this));
    }

    /* access modifiers changed from: private */
    public gzz a(c cVar) {
        return cVar.a ? c : b;
    }

    /* access modifiers changed from: private */
    public gzz a(a aVar) {
        if (aVar.a == ErrorReason.SERVER_FAILURE) {
            return gyi.a(SpotifyIconV2.WARNING, this.d.getString(R.string.error_general_title), this.d.getString(R.string.error_general_body));
        }
        return a;
    }
}
