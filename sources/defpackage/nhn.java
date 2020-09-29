package defpackage;

import com.spotify.music.libs.viewuri.ViewUris;

/* renamed from: nhn reason: default package */
public final class nhn implements vua<String> {
    private static final nhn a = new nhn();

    public static nhn a() {
        return a;
    }

    public final /* synthetic */ Object get() {
        return (String) vuf.a(ViewUris.e.toString(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
