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

/* renamed from: oow reason: default package */
public final class oow implements oou, oov {
    private static int a;
    private static final int b;
    private final oog<?> c;
    private final oor d;
    private final ofh e;
    private final onu f = a.a(this.c);
    private ImageButton g;
    private uwh h;

    public final void a(Bundle bundle) {
    }

    public final void b(Bundle bundle) {
    }

    static {
        Class<oow> cls = oow.class;
        a = cls.hashCode();
        b = cls.hashCode() + 1;
    }

    public oow(oos oos, ofh ofh, oew oew, a aVar, ooh<tke, vti<jmf<ooa>>> ooh, ItemListConfiguration itemListConfiguration) {
        oor oor = new oor((Scheduler) oos.a(oos.a.get(), 1), (a) oos.a(oos.b.get(), 2), (a) oos.a(oos.c.get(), 3), (ooz) oos.a(oos.d.get(), 4), (onm) oos.a(oos.e.get(), 5), (ItemListConfiguration) oos.a(itemListConfiguration, 6));
        this.d = oor;
        this.c = ooh.a(this.d, new $$Lambda$oow$610sjfNEWwLDC9Pf_E2tyn2CcKM(this));
        this.e = ofh;
        oew.a(a);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ jmf e() {
        return this.d;
    }

    public final Completable a() {
        oor oor = this.d;
        return Completable.b((Iterable<? extends CompletableSource>) ImmutableList.a(oor.f, oor.c.a()));
    }

    public final void a(a aVar) {
        this.d.a(aVar);
    }

    public final void az_() {
        this.d.a((oov) this);
    }

    public final void c() {
        this.d.a((oov) null);
    }

    public final void d() {
        oor oor = this.d;
        oor.a.c();
        oor.b.a();
        oor.c.b();
    }

    public final void a(LayoutInflater layoutInflater, ViewGroup viewGroup, uwh uwh) {
        this.h = uwh;
        Context context = viewGroup.getContext();
        Resources resources = context.getResources();
        fqb.b();
        frb a2 = frq.a(context, viewGroup, 10);
        TextView b2 = a2.b();
        int b3 = uts.b(16.0f, resources);
        b2.setPadding(0, b3, b2.getPaddingRight(), b3);
        uuu.a(b2.getContext(), b2, 2132017674);
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
        int b4 = uts.b(16.0f, resources);
        int b5 = uts.b(8.0f, resources);
        relativeLayout.setPadding(b4, b5, b4, b5);
        relativeLayout.setLayoutParams(layoutParams);
        relativeLayout.addView(linearLayout);
        AnonymousClass5 r0 = new frb(a2, relativeLayout) {
            private /* synthetic */ frb a;
            private /* synthetic */ RelativeLayout b;

            {
                this.a = r1;
                this.b = r2;
            }

            public final TextView b() {
                return this.a.b();
            }

            public final void a(CharSequence charSequence) {
                this.a.a(charSequence);
            }

            public final void a(int i) {
                this.a.a(i);
            }

            public final void a(View view) {
                this.a.a(view);
            }

            public final View a() {
                return this.a.a();
            }

            public final void b(boolean z) {
                this.a.b(z);
            }

            public final void a(boolean z) {
                this.a.a(z);
            }

            public final View getView() {
                return this.b;
            }

            public final void c(boolean z) {
                this.a.c(z);
            }
        };
        fqf.a(r0);
        this.g = jwz.a(context, (Drawable) (SpotifyIconDrawable) jwz.c(context, SpotifyIconV2.X));
        this.g.setOnClickListener(new $$Lambda$oow$dHKV_gqWBuNqAJx46gCoZhM0s3c(this));
        r0.a(this.g);
        r0.a(context.getString(R.string.shuffle_onboarding_education_row));
        uwh.a((a<H>) new jlu<H>(r0.getView(), false), b);
        uwh.a(this.c.a(), a);
        uwh.a(a, b);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(View view) {
        oor oor = this.d;
        oor.e.b.a().a(ooz.a, true).b();
        oor.d.a();
        oor.g.a(false);
    }

    public final void a(uyz uyz, List<uzb> list) {
        this.c.a(list);
        this.h.a(true, a);
    }

    public final void a(int i) {
        this.e.a(a, i);
    }

    public final void a(boolean z) {
        if (z) {
            this.h.a(true, b);
            return;
        }
        this.h.a(false, b);
    }

    public final void a(String str, boolean z) {
        this.f.a(str, z);
    }

    public final void a(ItemConfiguration itemConfiguration) {
        this.f.a(itemConfiguration);
    }
}
