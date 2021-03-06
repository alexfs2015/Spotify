package defpackage;

import android.media.AudioRecord;
import android.os.Build.VERSION;
import com.spotify.base.java.logging.Logger;
import com.spotify.voice.VoiceSessionException;
import com.spotify.voice.model.ErrorDomain;
import java.util.concurrent.Callable;

/* renamed from: vps reason: default package */
public final class vps implements Callable<AudioRecord> {
    private static final int[] c = {16000, 8000};
    final int a;
    final int b;
    private final vpr d;

    vps(vpr vpr) {
        this.d = vpr;
        int[] iArr = c;
        int i = 0;
        while (i < 2) {
            int i2 = iArr[i];
            int minBufferSize = AudioRecord.getMinBufferSize(i2, 16, 2);
            if (minBufferSize == -1 || minBufferSize == -2) {
                i++;
            } else {
                this.a = i2;
                this.b = Math.max(minBufferSize, 1024);
                return;
            }
        }
        throw new VoiceSessionException(ErrorDomain.AUDIO_RECORDER, vrd.k, new IllegalArgumentException("No supported bitrate for AudioRecord"));
    }

    private AudioRecord a() {
        try {
            AudioRecord audioRecord = new AudioRecord(6, this.a, 16, 2, this.b);
            return audioRecord;
        } catch (IllegalArgumentException e) {
            throw new VoiceSessionException(ErrorDomain.AUDIO_RECORDER, vrd.h, e);
        }
    }

    public final /* synthetic */ Object call() {
        AudioRecord a2 = a();
        vpr vpr = this.d;
        if (!(vpr == null || a2 == null || vpr == null)) {
            Logger.c("Registering audio routing listener.", new Object[0]);
            if (VERSION.SDK_INT >= 24) {
                a2.addOnRoutingChangedListener(vpr, null);
            } else if (VERSION.SDK_INT == 23) {
                a2.addOnRoutingChangedListener(vpr, null);
            }
        }
        if (a2.getState() == 1) {
            return a2;
        }
        a2.release();
        ErrorDomain errorDomain = ErrorDomain.AUDIO_RECORDER;
        vrd vrd = vrd.h;
        StringBuilder sb = new StringBuilder("Cannot create AudioRecord, state=");
        int state = a2.getState();
        String str = state != 0 ? state != 1 ? "UNKNOWN" : "INITIALIZED" : "UNINITIALIZED";
        sb.append(str);
        throw new VoiceSessionException(errorDomain, vrd, new IllegalArgumentException(sb.toString()));
    }
}
