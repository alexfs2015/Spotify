package defpackage;

import android.text.TextUtils;
import com.spotify.playlist.models.Covers;

/* renamed from: vkw reason: default package */
public final class vkw {
    public static boolean a(Covers covers, Covers covers2) {
        if (covers == null && covers2 == null) {
            return true;
        }
        return covers != null && covers2 != null && TextUtils.equals(covers.getUri(), covers2.getUri()) && TextUtils.equals(covers.getLargeUri(), covers2.getLargeUri()) && TextUtils.equals(covers.getSmallUri(), covers2.getSmallUri()) && TextUtils.equals(covers.getXlargeUri(), covers2.getXlargeUri());
    }

    public final boolean a(vkv vkv, vkv vkv2) {
        if (vkv == null && vkv2 == null) {
            return true;
        }
        return vkv != null && vkv2 != null && TextUtils.equals(vkv.getUri(), vkv2.getUri()) && vkv.o() == vkv2.o() && TextUtils.equals(vkv.a(), vkv2.a()) && TextUtils.equals(vkv.d(), vkv2.d()) && TextUtils.equals(vkv.e(), vkv2.e()) && TextUtils.equals(vkv.f(), vkv2.f()) && vkv.i() == vkv2.i() && vkv.j() == vkv2.j() && vkv.k() == vkv2.k() && vkv.l() == vkv2.l() && vkv.m() == vkv2.m() && vkv.p() == vkv2.p() && vkv.r() == vkv2.r() && vkv.s() == vkv2.s() && vkv.w() == vkv2.w() && hn.a(vkv.q(), vkv2.q()) && hn.a(vkv.n(), vkv2.n()) && hn.a(vkv.u(), vkv2.u()) && a(vkv.b(), vkv2.b()) && a(vkv.c(), vkv2.c());
    }
}
