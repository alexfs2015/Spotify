package defpackage;

import android.content.Context;
import android.media.MediaPlayer;
import com.spotify.base.java.logging.Logger;
import com.spotify.music.ads.voice.domain.CueType;
import io.reactivex.Single;
import io.reactivex.SingleEmitter;
import io.reactivex.SingleOnSubscribe;
import io.reactivex.functions.Cancellable;
import java.lang.ref.WeakReference;

/* renamed from: krk reason: default package */
public final class krk {
    private final WeakReference<Context> a;

    public krk(Context context) {
        this.a = new WeakReference<>(context);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(CueType cueType, SingleEmitter singleEmitter) {
        Context context = (Context) this.a.get();
        if (context == null) {
            Logger.b("[VoiceAd] Missing context - can't play cue %s", cueType);
            singleEmitter.a(new Throwable(String.valueOf(cueType)));
        }
        MediaPlayer create = MediaPlayer.create(context, cueType.mCueRes);
        create.getClass();
        singleEmitter.a((Cancellable) new $$Lambda$x2OHLjrpErIPDXg2267ntL0NYk(create));
        create.setOnCompletionListener(new $$Lambda$krk$9AdubzaLNFvdaS5olpy7lhn3XCM(singleEmitter, cueType));
        try {
            create.start();
        } catch (Exception e) {
            Logger.b("[VoiceAd] CuePlayer start error %s", e);
            singleEmitter.a(new Throwable(String.valueOf(cueType)));
        }
    }

    public final Single<krc> a(CueType cueType) {
        return Single.a((SingleOnSubscribe<T>) new $$Lambda$krk$d2ol4SdrHce9DlnrUmS5PHTI<T>(this, cueType));
    }
}
