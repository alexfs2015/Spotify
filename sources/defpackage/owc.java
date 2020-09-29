package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView.a;
import com.google.common.collect.ImmutableList;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.music.R;
import com.spotify.music.features.playlistentity.configuration.ItemListConfiguration;
import com.spotify.music.playlist.ui.ItemConfiguration;
import com.spotify.music.playlist.ui.Rows.AnonymousClass5;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;
import io.reactivex.Completable;
import io.reactivex.CompletableSource;
import io.reactivex.Scheduler;
import java.util.List;

/* renamed from: owc reason: default package */
public final class owc implements owa, owb {
    private static int a;
    private static final int b;
    private final ovm<?> c;
    private final ovx d;
    private final oml e;
    private final ova f = a.a(this.c);
    private ImageButton g;
    private vhx h;

    static {
        Class<owc> cls = owc.class;
        a = cls.hashCode();
        b = cls.hashCode() + 1;
    }

    public owc(ovy ovy, oml oml, omc omc, a aVar, ovn<tvw, who<jor<ovg>>> ovn, ItemListConfiguration itemListConfiguration) {
        ovx ovx = new ovx((Scheduler) ovy.a(ovy.a.get(), 1), (a) ovy.a(ovy.b.get(), 2), (a) ovy.a(ovy.c.get(), 3), (owf) ovy.a(ovy.d.get(), 4), (ous) ovy.a(ovy.e.get(), 5), (ItemListConfiguration) ovy.a(itemListConfiguration, 6));
        this.d = ovx;
        this.c = ovn.a(this.d, new $$Lambda$owc$CnEnQespEcYfwPXyItH0_yui17Q(this));
        this.e = oml;
        omc.b(a);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(View view) {
        ovx ovx = this.d;
        ovx.e.b.a().a(owf.a, true).b();
        ovx.d.a();
        ovx.g.a(false);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ jor e() {
        return this.d;
    }

    public final Completable a() {
        ovx ovx = this.d;
        return Completable.b((Iterable<? extends CompletableSource>) ImmutableList.a(ovx.f, ovx.c.a()));
    }

    public final void a(int i) {
        this.e.a(a, i);
    }

    public final void a(Bundle bundle) {
    }

    public final void a(LayoutInflater layoutInflater, ViewGroup viewGroup, vhx vhx) {
        this.h = vhx;
        Context context = viewGroup.getContext();
        Resources resources = context.getResources();
        fqv.b();
        frv a2 = fsk.a(context, viewGroup, 10);
        TextView b2 = a2.b();
        int b3 = vfj.b(16.0f, resources);
        b2.setPadding(0, b3, b2.getPaddingRight(), b3);
        vgl.a(b2.getContext(), b2, 2132017677);
        b2.setTextColor(fr.c(context, R.color.black));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(16);
        linearLayout.setId(R.id.row_preview_rounded_layout);
        linearLayout.setLayoutParams(new LayoutParams(-1, -2));
        linearLayout.setBackgroundResource(R.drawable.bg_large_row_rounded_white);
        View view = a2.getView();
        a2.getView().setPadding(0, view.getPaddingTop(), view.getPaddingRight(), view.getPaddingBottom());
        linearLayout.addView(a2.getView());
        a2.getView().setDuplicateParentStateEnabled(true);
        RelativeLayout relativeLayout = new RelativeLayout(context);
        relativeLayout.setGravity(80);
        LayoutParams layoutParams = new LayoutParams(-1, -2);
        int b4 = vfj.b(16.0f, resources);
        int b5 = vfj.b(8.0f, resources);
        relativeLayout.setPadding(b4, b5, b4, b5);
        relativeLayout.setLayoutParams(layoutParams);
        relativeLayout.addView(linearLayout);
        AnonymousClass5 r0 = new frv(a2, relativeLayout) {
            private /* synthetic */ frv a;
            private /* synthetic */ RelativeLayout b;

            {
                this.a = r1;
                this.b = r2;
            }

            public final View a() {
                return this.a.a();
            }

            public final void a(int i) {
                this.a.a(i);
            }

            public final void a(View view) {
                this.a.a(view);
            }

            public final void a(CharSequence charSequence) {
                this.a.a(charSequence);
            }

            public final void a(boolean z) {
                this.a.a(z);
            }

            public final TextView b() {
                return this.a.b();
            }

            public final void b(boolean z) {
                this.a.b(z);
            }

            public final void c(boolean z) {
                this.a.c(z);
            }

            public final View getView() {
                return this.b;
            }
        };
        fqz.a(r0);
        this.g = jyz.a(context, (Drawable) (SpotifyIconDrawable) jyz.c(context, SpotifyIconV2.X));
        this.g.setOnClickListener(new $$Lambda$owc$EbOF9jIExeO9YJ2wToYpUdHYY(this));
        r0.a(this.g);
        r0.a(context.getString(R.string.shuffle_onboarding_education_row));
        vhx.a((a<H>) new jog<H>(r0.getView(), false), b);
        vhx.a(this.c.a(), a);
        vhx.a(a, b);
    }

    public final void a(ItemConfiguration itemConfiguration) {
        this.f.a(itemConfiguration);
    }

    public final void a(String str, boolean z) {
        this.f.a(str, z);
    }

    public final void a(a aVar) {
        this.d.a(aVar);
    }

    public final void a(vlc vlc, List<vle> list) {
        this.c.a(list);
        this.h.a(true, a);
    }

    public final void a(boolean z) {
        if (z) {
            this.h.a(true, b);
            return;
        }
        this.h.a(false, b);
    }

    public final void ay_() {
        this.d.a((owb) this);
    }

    public final void b(Bundle bundle) {
    }

    public final void c() {
        this.d.a((owb) null);
    }

    public final void d() {
        ovx ovx = this.d;
        ovx.a.c();
        ovx.b.a();
        ovx.c.b();
    }
}
