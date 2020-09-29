package defpackage;

import com.spotify.music.libs.debugtools.flags.DebugFlag;

/* renamed from: rno reason: default package */
public final class rno implements vua<Boolean> {
    private static final rno a = new rno();

    public static rno a() {
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
