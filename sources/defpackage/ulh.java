package defpackage;

import com.spotify.voice.qualifiers.VoiceConsumer;

/* renamed from: ulh reason: default package */
public final class ulh implements vua<VoiceConsumer> {
    private static final ulh a = new ulh();

    public static ulh a() {
        return a;
    }

    public final /* synthetic */ Object get() {
        return (VoiceConsumer) vuf.a(VoiceConsumer.VOICE_FEATURE, "Cannot return null from a non-@Nullable @Provides method");
    }
}
