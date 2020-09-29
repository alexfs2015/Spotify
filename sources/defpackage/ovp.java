package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.a;
import com.google.common.base.Function;
import com.google.common.collect.Lists;
import com.spotify.mobile.android.playlist.navigation.AllSongsConfiguration;
import com.spotify.music.R;
import com.spotify.music.features.playlistentity.trackcloud.TrackCloudShuffling;
import com.spotify.playlist.models.Show;
import io.reactivex.Completable;
import io.reactivex.Scheduler;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/* renamed from: ovp reason: default package */
final class ovp implements ovn, ovo {
    private static final int a;
    private static final int b;
    private static final Function<uzb, a> c = $$Lambda$ovp$vB8AV5fhvS5uVZzbzfK4e1_wmwk.INSTANCE;
    private final ovj d;
    private final Context e;
    private final ovd f;
    private uwh g;
    private fsl h;
    private fsj i;
    private TextView j;

    public final void a(Bundle bundle) {
    }

    public final void b(Bundle bundle) {
    }

    static {
        Class<ovp> cls = ovp.class;
        a = cls.hashCode();
        b = cls.hashCode() + 1;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ a a(uzb uzb) {
        uzb uzb2 = (uzb) fay.a(uzb);
        uzc b2 = uzb2.b();
        if (b2 != null) {
            List artists = b2.getArtists();
            return new a(b2.getName(), (artists == null || artists.isEmpty()) ? null : ((uyr) artists.get(0)).getName(), b2.inCollection(), true);
        }
        uys uys = (uys) fay.a(uzb2.a());
        return new a(uys.a(), ((Show) fay.a(uys.t())).a(), false, true);
    }

    public ovp(ovk ovk, Context context, ovd ovd, ohl ohl) {
        ovj ovj = new ovj((hbj) ovk.a(ovk.a.get(), 1), (ovf) ovk.a(ovk.b.get(), 2), (String) ovk.a(ovk.c.get(), 3), (TrackCloudShuffling) ovk.a(ovk.d.get(), 4), (a) ovk.a(ovk.e.get(), 5), (Random) ovk.a(ovk.f.get(), 6), (Scheduler) ovk.a(ovk.g.get(), 7), (kvk) ovk.a(ovk.h.get(), 8), (ohl) ovk.a(ohl, 9));
        this.d = ovj;
        this.f = ovd;
        this.e = context;
    }

    public final Completable a() {
        return this.d.h;
    }

    public final void a(a aVar) {
        this.d.a(aVar);
    }

    public final void az_() {
        this.d.a((ovo) this);
    }

    public final void c() {
        this.d.a((ovo) null);
    }

    public final void d() {
        ovj ovj = this.d;
        ovj.a.c();
        ovj.f.a();
    }

    public final void a(RecyclerView recyclerView, uwh uwh) {
        this.g = uwh;
        fqb.g();
        this.h = fsn.a(this.e, recyclerView);
        fsj fsj = new fsj();
        fsj.b = this.e.getString(R.string.free_tier_cloud_and_more_text);
        this.i = fsj;
        fsj fsj2 = this.i;
        fsj2.c = 3;
        fsj2.a = "";
        this.h.getView().setOnClickListener(new $$Lambda$ovp$uPi6sXdhs8RmW_oidfPerKYXhtI(this));
        uwh.a((a<H>) new jlu<H>(this.h.getView(), true), a);
        this.j = new TextView(this.e);
        uuu.a(this.e, this.j, 2132017677);
        this.j.setTextColor(fr.c(this.e, R.color.cat_grayscale_70));
        this.j.setPadding(0, 0, 0, uts.b(16.0f, this.e.getResources()));
        this.j.setLayoutParams(new LayoutParams(-1, -2));
        this.j.setGravity(1);
        uwh.a((a<H>) new jlu<H>(this.j, false), b);
        uwh.a(a, b);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(View view) {
        ovj ovj = this.d;
        ovj.c.a();
        AllSongsConfiguration i2 = ovj.e.i();
        if (ovj.e.j()) {
            kvk kvk = ovj.g;
            String str = ovj.d;
            a aVar = new a();
            Intent intent = new Intent();
            intent.putExtra("playlist_uri", str);
            intent.putExtra("include_episodes", i2);
            intent.setFlags(268435456);
            aVar.a = intent;
            aVar.c = true;
            kvk.a.a(aVar.a());
            return;
        }
        ovj.b.a(ovj.d, i2);
    }

    public final void a(boolean z) {
        this.i.g = z;
    }

    public final void a(boolean z, int i2, int i3) {
        TextView textView = this.j;
        ovd ovd = this.f;
        ArrayList a2 = Lists.a();
        if (i2 > 0) {
            a2.add(ovd.a.getResources().getQuantityString(R.plurals.playlist_trackcloud_includes_label_songs, i2, new Object[]{Integer.valueOf(i2)}));
        }
        if (i3 > 0) {
            if (!a2.isEmpty()) {
                a2.add(" • ");
            }
            a2.add(ovd.a.getResources().getQuantityString(R.plurals.playlist_trackcloud_includes_label_episodes, i3, new Object[]{Integer.valueOf(i3)}));
        }
        if (uur.a(ovd.a)) {
            Collections.reverse(a2);
        }
        textView.setText(fau.a("").a((Iterable<?>) a2));
        if (z) {
            this.g.a(true, b);
            return;
        }
        this.g.a(false, b);
    }

    public final void a(List<uzb> list) {
        List<a> a2 = Lists.a(list, c);
        fsj fsj = this.i;
        fsj.d = a2;
        this.h.a(fsj);
        this.g.a(true, a);
    }
}
