package defpackage;

import android.content.res.Resources;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.music.R;
import com.spotify.music.features.premiumdestination.domain.ErrorReason;

/* renamed from: ppq reason: default package */
public final class ppq {
    private static final hcs a = hdb.EMPTY;
    private static final hcs b = hdb.EMPTY;
    private static final hcs c = hbb.a();
    private final Resources d;

    public ppq(Resources resources) {
        this.d = resources;
    }

    /* access modifiers changed from: private */
    public hcs a(a aVar) {
        return aVar.a == ErrorReason.SERVER_FAILURE ? hbb.a(SpotifyIconV2.WARNING, this.d.getString(R.string.error_general_title), this.d.getString(R.string.error_general_body)) : a;
    }

    /* access modifiers changed from: private */
    public hcs a(c cVar) {
        return cVar.a ? c : b;
    }

    public final hcs a(pnm pnm) {
        return (hcs) pnm.a($$Lambda$n70ADCF0CTqYnXZ1bx_Y5bAIaDQ.INSTANCE, new $$Lambda$ppq$X8wkAiDmKouxFBl77kLCoBcoPY(this), new $$Lambda$ppq$k7egiYo0pZziggPeAZcEo4MB8GM(this));
    }
}
