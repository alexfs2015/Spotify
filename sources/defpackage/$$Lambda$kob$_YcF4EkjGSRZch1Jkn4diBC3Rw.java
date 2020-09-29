package defpackage;

import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;
import com.spotify.music.ads.voice.domain.CueType;
import io.reactivex.SingleEmitter;

/* renamed from: -$$Lambda$kob$_YcF4EkjGSRZch-1Jkn4diBC3Rw reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$kob$_YcF4EkjGSRZch1Jkn4diBC3Rw implements OnCompletionListener {
    private final /* synthetic */ SingleEmitter f$0;
    private final /* synthetic */ CueType f$1;

    public /* synthetic */ $$Lambda$kob$_YcF4EkjGSRZch1Jkn4diBC3Rw(SingleEmitter singleEmitter, CueType cueType) {
        this.f$0 = singleEmitter;
        this.f$1 = cueType;
    }

    public final void onCompletion(MediaPlayer mediaPlayer) {
        this.f$0.a(knt.a(this.f$1));
    }
}
