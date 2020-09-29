package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.spotify.mobile.android.wrapped2019.stories.playback.previews.WrappedPreviewPlayer;

/* renamed from: kdu reason: default package */
public class kdu extends vtv {
    public WrappedPreviewPlayer T;
    private b<kef, ked> U;
    public kdz a;
    public kft b;

    public final void b(Bundle bundle) {
        super.b(bundle);
        this.Q.a(this.T);
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        kek kek = new kek(layoutInflater, viewGroup, this.b, t());
        kdz kdz = this.a;
        this.U = kjt.a(kdz.a(false), new a().a(ImmutableList.d()).a(ImmutableMap.f()).a(0).b(false).a(false).a(), kkd.a());
        this.U.a(kek);
        return kek.a;
    }

    public final void z() {
        super.z();
        this.U.c();
    }

    public final void A() {
        super.A();
        this.U.d();
    }

    public final void ax_() {
        super.ax_();
        this.U.b();
    }
}
