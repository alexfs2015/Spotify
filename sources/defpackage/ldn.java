package defpackage;

import android.media.MediaPlayer;

/* renamed from: ldn reason: default package */
public final class ldn implements vua<MediaPlayer> {
    private static final ldn a = new ldn();

    public static ldn a() {
        return a;
    }

    public final /* synthetic */ Object get() {
        return (MediaPlayer) vuf.a(new MediaPlayer(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
