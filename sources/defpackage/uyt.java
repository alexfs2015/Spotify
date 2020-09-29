package defpackage;

import android.text.TextUtils;
import com.spotify.playlist.models.Covers;

/* renamed from: uyt reason: default package */
public final class uyt {
    public static boolean a(Covers covers, Covers covers2) {
        if (covers == null && covers2 == null) {
            return true;
        }
        return covers != null && covers2 != null && TextUtils.equals(covers.getUri(), covers2.getUri()) && TextUtils.equals(covers.getLargeUri(), covers2.getLargeUri()) && TextUtils.equals(covers.getSmallUri(), covers2.getSmallUri()) && TextUtils.equals(covers.getXlargeUri(), covers2.getXlargeUri());
    }

    public final boolean a(uys uys, uys uys2) {
        if (uys == null && uys2 == null) {
            return true;
        }
        return uys != null && uys2 != null && TextUtils.equals(uys.getUri(), uys2.getUri()) && uys.o() == uys2.o() && TextUtils.equals(uys.a(), uys2.a()) && TextUtils.equals(uys.d(), uys2.d()) && TextUtils.equals(uys.e(), uys2.e()) && TextUtils.equals(uys.f(), uys2.f()) && uys.i() == uys2.i() && uys.j() == uys2.j() && uys.k() == uys2.k() && uys.l() == uys2.l() && uys.m() == uys2.m() && uys.p() == uys2.p() && uys.r() == uys2.r() && uys.s() == uys2.s() && uys.w() == uys2.w() && hn.a(uys.q(), uys2.q()) && hn.a(uys.n(), uys2.n()) && hn.a(uys.u(), uys2.u()) && a(uys.b(), uys2.b()) && a(uys.c(), uys2.c());
    }
}
