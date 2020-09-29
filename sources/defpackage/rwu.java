package defpackage;

import com.spotify.music.libs.debugtools.flags.DebugFlag;

/* renamed from: rwu reason: default package */
public final class rwu implements wig<Boolean> {
    private static final rwu a = new rwu();

    public static rwu a() {
        return a;
    }

    public static boolean b() {
        DebugFlag debugFlag = DebugFlag.ADAPTIVE_UI;
        return false;
    }

    public final /* bridge */ /* synthetic */ Object get() {
        DebugFlag debugFlag = DebugFlag.ADAPTIVE_UI;
        return Boolean.FALSE;
    }
}
