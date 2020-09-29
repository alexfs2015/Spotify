package defpackage;

import com.google.common.base.Function;
import com.google.common.collect.ImmutableList;
import com.spotify.music.libs.debugtools.flags.DebugFlag;
import java.io.Serializable;

/* renamed from: uqi reason: default package */
public final class uqi {
    private static final fqa[] a = {uqh.a, uqh.b, uqh.c, uqh.d, uqh.e, uqh.f};
    private static final fqa[] b = {uqh.g, uqh.h, uqh.i, uqh.j, uqh.k, uqh.l, uqh.m, uqh.n, uqh.o, uqh.p};
    private static final fqa[] c = {uqh.q, uqh.r, uqh.s, uqh.t};

    public final boolean a(fpt fpt) {
        DebugFlag debugFlag = DebugFlag.DISABLE_NEW_YOUR_LIBRARY;
        if (fpt != null) {
            String str = "Enabled";
            if (a((fps<String>[]) b, str, fpt) || a((fps<T>[]) a, (T) str, fpt) || b(c, "NewLibrary_", fpt) || !((Boolean) fpt.a(twt.a)).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public static boolean b(fpt fpt) {
        if (fpt == null) {
            return false;
        }
        if ("Enabled_SongsTab".equals((String) fpt.a(uqh.g))) {
            return true;
        }
        DebugFlag debugFlag = DebugFlag.YOUR_LIBRARY_MUSIC_PAGES_ENABLE_SONGS_TAB;
        return false;
    }

    private <T extends Serializable> boolean a(fps<T>[] fpsArr, T t, fpt fpt) {
        return a(fpsArr, (faz<T>) new $$Lambda$uqi$wZOpRGDARXDN2Rscqd10tVEZQ<T>(t), fpt);
    }

    private static <T extends Serializable> boolean a(fps<T>[] fpsArr, faz<T> faz, fpt fpt) {
        if (fpt != null) {
            fbx a2 = fbx.a((E[]) fpsArr);
            fpt.getClass();
            if (a2.a((Function<? super E, T>) new $$Lambda$oh1lEtzABQ0PdDI2NjN5ziNdc_U<Object,T>(fpt)).b(faz)) {
                return true;
            }
        }
        return false;
    }

    private static boolean a(fps<String>[] fpsArr, String str, fpt fpt) {
        if (fpt == null) {
            return false;
        }
        fbx a2 = fbx.a((E[]) fpsArr);
        fpt.getClass();
        if (!ImmutableList.a(a2.a((Function<? super E, T>) new $$Lambda$IWhJvx5A13X_lFdDcW5U1fZWpgk<Object,T>(fpt)).a((faz<? super E>) new $$Lambda$uqi$PGC9sjM_jl7p6IZpDoI3KSZWRII<Object>(str)).a()).isEmpty()) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ boolean b(String str, String str2) {
        return str2 != null && str2.startsWith(str);
    }

    private boolean b(fps<String>[] fpsArr, String str, fpt fpt) {
        return a((fps<T>[]) fpsArr, (faz<T>) new $$Lambda$uqi$I3aVOFoH4woZuTpolEb91GB_FY<T>(str), fpt);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ boolean a(String str, String str2) {
        return str2 != null && str2.startsWith(str);
    }
}
