package defpackage;

import com.spotify.music.libs.viewuri.ViewUris;

/* renamed from: ngp reason: default package */
public final class ngp implements vua<String> {
    private static final ngp a = new ngp();

    public static ngp a() {
        return a;
    }

    public final /* synthetic */ Object get() {
        return (String) vuf.a(ViewUris.t.toString(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
