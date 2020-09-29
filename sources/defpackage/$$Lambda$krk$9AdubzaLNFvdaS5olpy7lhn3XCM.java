package defpackage;

import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;
import com.spotify.music.ads.voice.domain.CueType;
import io.reactivex.SingleEmitter;

/* renamed from: -$$Lambda$krk$9AdubzaLNFvdaS5olpy7lhn3XCM reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$krk$9AdubzaLNFvdaS5olpy7lhn3XCM implements OnCompletionListener {
    private final /* synthetic */ SingleEmitter f$0;
    private final /* synthetic */ CueType f$1;

    public /* synthetic */ $$Lambda$krk$9AdubzaLNFvdaS5olpy7lhn3XCM(SingleEmitter singleEmitter, CueType cueType) {
        this.f$0 = singleEmitter;
        this.f$1 = cueType;
    }

    public final void onCompletion(MediaPlayer mediaPlayer) {
        this.f$0.a(krc.a(this.f$1));
    }
}
