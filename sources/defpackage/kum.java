package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.spotify.mobile.android.cosmos.player.v2.PlayOrigin;
import com.spotify.music.autoplay.RadioSeedBundle;
import com.spotify.music.libs.viewuri.ViewUris;
import java.lang.ref.WeakReference;
import java.util.concurrent.Callable;

/* renamed from: kum reason: default package */
public final class kum implements Callable<Boolean> {
    private final RadioSeedBundle a;
    private final WeakReference<Context> b;
    private final ure c;
    private final jlr d;
    private final jtz e;

    public kum(RadioSeedBundle radioSeedBundle, Context context, ure ure, jlr jlr, jtz jtz) {
        this.a = radioSeedBundle;
        this.b = new WeakReference<>(context);
        this.c = ure;
        this.d = jlr;
        this.e = jtz;
    }

    public final /* synthetic */ Object call() {
        if (this.b.get() == null) {
            return Boolean.FALSE;
        }
        String playbackId = this.a.getPlaybackId();
        String radioSeed = this.a.getRadioSeed();
        String radioSeed2 = this.a.getRadioSeed();
        PlayOrigin playOrigin = this.a.getPlayOrigin();
        String[] strArr = null;
        if (radioSeed.contains(":track:")) {
            strArr = new String[]{radioSeed};
        }
        String[] strArr2 = strArr;
        String referrerIdentifier = playOrigin.referrerIdentifier();
        if (TextUtils.isEmpty(referrerIdentifier)) {
            referrerIdentifier = uqo.am.a();
        }
        ure ure = this.c;
        String[] strArr3 = {radioSeed};
        String viewUri = playOrigin.viewUri();
        ure.a(strArr3, !fbo.a(viewUri) ? sso.a(viewUri) : ViewUris.c, false, false, -1, uqo.am, gkm.a(new uqm(referrerIdentifier)), strArr2);
        jlr jlr = this.d;
        be beVar = new be(playbackId, "autoplay", radioSeed, null, 0, radioSeed2, "AUTOPLAY_TRIGGERED", null, (double) this.e.a());
        jlr.a(beVar);
        return Boolean.TRUE;
    }
}
