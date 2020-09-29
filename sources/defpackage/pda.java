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

/* renamed from: pda reason: default package */
final class pda implements pcy, pcz {
    private static final int a;
    private static final int b;
    private static final Function<vle, a> c = $$Lambda$pda$pS3F4p1umCPjMPbS3rESTiN_Tlg.INSTANCE;
    private final pcu d;
    private final Context e;
    private final pco f;
    private vhx g;
    private ftf h;
    private ftd i;
    private TextView j;

    static {
        Class<pda> cls = pda.class;
        a = cls.hashCode();
        b = cls.hashCode() + 1;
    }

    public pda(pcv pcv, Context context, pco pco, oop oop) {
        pcu pcu = new pcu((hec) pcv.a(pcv.a.get(), 1), (pcq) pcv.a(pcv.b.get(), 2), (String) pcv.a(pcv.c.get(), 3), (TrackCloudShuffling) pcv.a(pcv.d.get(), 4), (a) pcv.a(pcv.e.get(), 5), (Random) pcv.a(pcv.f.get(), 6), (Scheduler) pcv.a(pcv.g.get(), 7), (kyt) pcv.a(pcv.h.get(), 8), (oop) pcv.a(oop, 9));
        this.d = pcu;
        this.f = pco;
        this.e = context;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ a a(vle vle) {
        vle vle2 = (vle) fbp.a(vle);
        vlf b2 = vle2.b();
        if (b2 != null) {
            List artists = b2.getArtists();
            return new a(b2.getName(), (artists == null || artists.isEmpty()) ? null : ((vku) artists.get(0)).getName(), b2.inCollection(), true);
        }
        vkv vkv = (vkv) fbp.a(vle2.a());
        return new a(vkv.a(), ((Show) fbp.a(vkv.t())).a(), false, true);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(View view) {
        pcu pcu = this.d;
        pcu.c.a();
        AllSongsConfiguration i2 = pcu.e.i();
        if (pcu.e.j()) {
            kyt kyt = pcu.g;
            String str = pcu.d;
            a aVar = new a();
            Intent intent = new Intent();
            intent.putExtra("playlist_uri", str);
            intent.putExtra("include_episodes", i2);
            intent.setFlags(268435456);
            aVar.a = intent;
            aVar.c = true;
            kyt.a.a(aVar.a());
            return;
        }
        pcu.b.a(pcu.d, i2);
    }

    public final Completable a() {
        return this.d.h;
    }

    public final void a(Bundle bundle) {
    }

    public final void a(RecyclerView recyclerView, vhx vhx) {
        this.g = vhx;
        fqv.g();
        this.h = fth.a(this.e, recyclerView);
        ftd ftd = new ftd();
        ftd.b = this.e.getString(R.string.free_tier_cloud_and_more_text);
        this.i = ftd;
        ftd ftd2 = this.i;
        ftd2.c = 3;
        ftd2.a = "";
        this.h.getView().setOnClickListener(new $$Lambda$pda$AybLSvGAFZSa1C70kdriZO9YWY(this));
        vhx.a((a<H>) new jog<H>(this.h.getView(), true), a);
        this.j = new TextView(this.e);
        vgl.a(this.e, this.j, 2132017680);
        this.j.setTextColor(fr.c(this.e, R.color.cat_grayscale_70));
        this.j.setPadding(0, 0, 0, vfj.b(16.0f, this.e.getResources()));
        this.j.setLayoutParams(new LayoutParams(-1, -2));
        this.j.setGravity(1);
        vhx.a((a<H>) new jog<H>(this.j, false), b);
        vhx.a(a, b);
    }

    public final void a(List<vle> list) {
        List<a> a2 = Lists.a(list, c);
        ftd ftd = this.i;
        ftd.d = a2;
        this.h.a(ftd);
        this.g.a(true, a);
    }

    public final void a(a aVar) {
        this.d.a(aVar);
    }

    public final void a(boolean z) {
        this.i.g = z;
    }

    public final void a(boolean z, int i2, int i3) {
        TextView textView = this.j;
        pco pco = this.f;
        ArrayList a2 = Lists.a();
        if (i2 > 0) {
            a2.add(pco.a.getResources().getQuantityString(R.plurals.playlist_trackcloud_includes_label_songs, i2, new Object[]{Integer.valueOf(i2)}));
        }
        if (i3 > 0) {
            if (!a2.isEmpty()) {
                a2.add(" • ");
            }
            a2.add(pco.a.getResources().getQuantityString(R.plurals.playlist_trackcloud_includes_label_episodes, i3, new Object[]{Integer.valueOf(i3)}));
        }
        if (vgi.a(pco.a)) {
            Collections.reverse(a2);
        }
        textView.setText(fbl.a("").a((Iterable<?>) a2));
        if (z) {
            this.g.a(true, b);
            return;
        }
        this.g.a(false, b);
    }

    public final void ay_() {
        this.d.a((pcz) this);
    }

    public final void b(Bundle bundle) {
    }

    public final void c() {
        this.d.a((pcz) null);
    }

    public final void d() {
        pcu pcu = this.d;
        pcu.a.c();
        pcu.f.a();
    }
}
