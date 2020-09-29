package defpackage;

import com.spotify.music.libs.viewuri.ViewUris;

/* renamed from: pgo reason: default package */
public final class pgo implements vua<String> {
    private static final pgo a = new pgo();

    public static pgo a() {
        return a;
    }

    public final /* synthetic */ Object get() {
        return (String) vuf.a(ViewUris.t.toString(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
