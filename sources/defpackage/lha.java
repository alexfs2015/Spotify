package defpackage;

import android.media.MediaPlayer;

/* renamed from: lha reason: default package */
public final class lha implements wig<MediaPlayer> {
    private static final lha a = new lha();

    public static lha a() {
        return a;
    }

    public final /* synthetic */ Object get() {
        return (MediaPlayer) wil.a(new MediaPlayer(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
