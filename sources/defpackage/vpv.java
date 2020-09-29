package defpackage;

import android.media.AudioRecord;
import com.spotify.base.java.logging.Logger;
import com.spotify.voice.VoiceSessionException;
import com.spotify.voice.model.ErrorDomain;
import io.reactivex.FlowableEmitter;
import io.reactivex.FlowableOnSubscribe;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: vpv reason: default package */
final class vpv implements FlowableOnSubscribe<ByteBuffer> {
    private final AudioRecord a;
    private final int b;

    vpv(AudioRecord audioRecord, int i) {
        this.a = audioRecord;
        this.b = i;
    }

    public final void subscribe(FlowableEmitter<ByteBuffer> flowableEmitter) {
        Logger.b("Starting to record 16bit mono audio samples at %dkHz", Integer.valueOf(this.a.getSampleRate()));
        flowableEmitter.a(new $$Lambda$vpv$J58LNBhyiZPjWskhcMl0MKn1ifA(this));
        try {
            this.a.startRecording();
            while (true) {
                if (this.a.getRecordingState() != 3) {
                    break;
                }
                ByteBuffer order = ByteBuffer.allocateDirect(this.b).order(ByteOrder.nativeOrder());
                int read = this.a.read(order, this.b);
                if (read < 0) {
                    ErrorDomain errorDomain = ErrorDomain.AUDIO_RECORDER;
                    vrd vrd = vrd.j;
                    StringBuilder sb = new StringBuilder("Recording failed; code: ");
                    sb.append(read);
                    flowableEmitter.a((Throwable) new VoiceSessionException(errorDomain, vrd, new Exception(sb.toString())));
                    break;
                } else if (read > 0) {
                    flowableEmitter.a(order);
                }
            }
            flowableEmitter.c();
        } catch (IllegalStateException e) {
            throw new VoiceSessionException(ErrorDomain.AUDIO_RECORDER, vrd.i, e);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a() {
        this.a.release();
        Logger.b("Subscriber cancelled", new Object[0]);
    }
}
