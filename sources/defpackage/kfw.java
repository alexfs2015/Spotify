package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.spotify.mobile.android.wrapped2019.stories.playback.previews.WrappedPreviewPlayer;

/* renamed from: kfw reason: default package */
public class kfw extends wib {
    public WrappedPreviewPlayer T;
    private b<kgh, kgf> U;
    public kgb a;
    public kig b;

    public static kfw a(boolean z) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("useBackend", z);
        kfw kfw = new kfw();
        kfw.g(bundle);
        return kfw;
    }

    public final void A() {
        super.A();
        this.U.d();
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        kgm kgm = new kgm(layoutInflater, viewGroup, this.b, t());
        kgb kgb = this.a;
        this.U = knc.a(kgb.a(l().getBoolean("useBackend")), new a().a(ImmutableList.d()).a(ImmutableMap.f()).a(0).b(false).a(false).a(), knm.a());
        this.U.a(kgm);
        return kgm.a;
    }

    public final void aw_() {
        super.aw_();
        this.U.b();
    }

    public final void b(Bundle bundle) {
        super.b(bundle);
        this.Q.a(this.T);
    }

    public final void z() {
        super.z();
        this.U.c();
    }
}
