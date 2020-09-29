package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.spotify.mobile.android.cosmos.player.v2.PlayOrigin;
import com.spotify.music.autoplay.RadioSeedBundle;
import com.spotify.music.libs.viewuri.ViewUris;
import java.lang.ref.WeakReference;
import java.util.concurrent.Callable;

/* renamed from: krd reason: default package */
public final class krd implements Callable<Boolean> {
    private final RadioSeedBundle a;
    private final WeakReference<Context> b;
    private final ufq c;
    private final jjf d;
    private final jrp e;

    public krd(RadioSeedBundle radioSeedBundle, Context context, ufq ufq, jjf jjf, jrp jrp) {
        this.a = radioSeedBundle;
        this.b = new WeakReference<>(context);
        this.c = ufq;
        this.d = jjf;
        this.e = jrp;
    }

    public final /* synthetic */ Object call() {
        sih sih;
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
            referrerIdentifier = udt.am.a();
        }
        ufq ufq = this.c;
        String[] strArr3 = {radioSeed};
        String viewUri = playOrigin.viewUri();
        sih sih2 = ViewUris.d;
        if (!fax.a(viewUri)) {
            sih = sih.a(viewUri);
        } else {
            sih = sih2;
        }
        ufq.a(strArr3, sih, false, false, -1, udt.am, gjb.a(new udr(referrerIdentifier)), strArr2);
        jjf jjf = this.d;
        bf bfVar = new bf(playbackId, "autoplay", radioSeed, null, 0, radioSeed2, "AUTOPLAY_TRIGGERED", null, (double) this.e.a());
        jjf.a(bfVar);
        return Boolean.TRUE;
    }
}
