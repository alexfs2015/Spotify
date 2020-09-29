package defpackage;

import com.spotify.music.libs.viewuri.ViewUris;

/* renamed from: jla reason: default package */
public final class jla implements vua<String> {
    private static final jla a = new jla();

    public static jla a() {
        return a;
    }

    public final /* synthetic */ Object get() {
        return (String) vuf.a(ViewUris.t.toString(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
