package defpackage;

import com.spotify.music.libs.viewuri.ViewUris;

/* renamed from: nml reason: default package */
public final class nml implements wig<String> {
    private static final nml a = new nml();

    public static nml a() {
        return a;
    }

    public final /* synthetic */ Object get() {
        return (String) wil.a(ViewUris.s.toString(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
