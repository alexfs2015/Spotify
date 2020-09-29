package defpackage;

import com.spotify.voice.api.qualifiers.VoiceConsumer;

/* renamed from: uwl reason: default package */
public final class uwl implements wig<VoiceConsumer> {
    private static final uwl a = new uwl();

    public static uwl a() {
        return a;
    }

    public final /* synthetic */ Object get() {
        return (VoiceConsumer) wil.a(VoiceConsumer.VOICE_FEATURE, "Cannot return null from a non-@Nullable @Provides method");
    }
}
