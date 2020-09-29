package defpackage;

import com.spotify.voice.qualifiers.VoiceConsumer;

/* renamed from: kno reason: default package */
public final class kno implements vua<VoiceConsumer> {
    private static final kno a = new kno();

    public static kno a() {
        return a;
    }

    public final /* synthetic */ Object get() {
        return (VoiceConsumer) vuf.a(VoiceConsumer.VOICE_ADS_FEATURE, "Cannot return null from a non-@Nullable @Provides method");
    }
}
