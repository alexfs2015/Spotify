package defpackage;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView.u;
import com.google.common.collect.Lists;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.music.R;
import com.spotify.music.freetiercommon.uicomponents.Rows;
import com.squareup.picasso.Picasso;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: nay reason: default package */
public final class nay extends androidx.recyclerview.widget.RecyclerView.a<c> implements gkw {
    public List<rov> a = Lists.a();
    final b d;
    final Picasso e;
    final ujc f;
    final rpg<nax> g;
    public boolean h;

    /* renamed from: nay$a */
    class a extends c {
        public a(ViewGroup viewGroup) {
            super(Rows.a(viewGroup.getContext(), viewGroup).getView());
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void a(rov rov, int i, View view) {
            nay.this.d.d(rov, i);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void b(rov rov, int i, View view) {
            nay.this.d.c(rov, i);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void c(rov rov, int i, View view) {
            nay.this.d.b(rov, i);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void d(rov rov, int i, View view) {
            nay.this.d.a(rov, i);
        }

        public final void a(rov rov, int i) {
            SpotifyIconV2 spotifyIconV2;
            SpotifyIconV2 spotifyIconV22;
            fsc fsc = (fsc) fqz.a(this.o, fsc.class);
            fsc.a(rov.b());
            fsc.b(jve.a(rov.j()));
            Boolean g = rov.g();
            boolean z = true;
            int i2 = 0;
            boolean z2 = g == null || g.booleanValue();
            boolean d = rov.d();
            if (z2 && !rov.f() && (!nay.this.h || !d)) {
                z = false;
            }
            jzb.a(fsc.d().getContext(), fsc.d(), d);
            Uri parse = !TextUtils.isEmpty(rov.k()) ? Uri.parse(rov.k()) : Uri.EMPTY;
            ImageView c = fsc.c();
            if (z2) {
                c.setContentDescription(c.getContext().getString(R.string.preview_play_pause_content_description));
            } else {
                c.setContentDescription(c.getContext().getString(R.string.generic_content_description_cover_art));
            }
            nay.this.e.a(parse).a(gaa.i(this.o.getContext())).a((wgx) ujd.a(c, nay.this.f, z2 ? rov.c() : "", nav.a(rov), z));
            this.o.setOnClickListener(new $$Lambda$nay$a$dtOix_kCa51YahkO2cnOyRIJWo(this, rov, i));
            fsc.c().setOnClickListener(new $$Lambda$nay$a$RRmpiew4zHOQFvcdZzGDSuqKo00(this, rov, i));
            fsc.c(z);
            com.spotify.music.freetiercommon.uicomponents.Rows.a aVar = (com.spotify.music.freetiercommon.uicomponents.Rows.a) fsc;
            rpg<nax> rpg = nay.this.g;
            boolean e = rov.e();
            boolean f = rov.f();
            a aVar2 = new a();
            Map<String, String> emptyMap = Collections.emptyMap();
            if (emptyMap != null) {
                aVar2.a = emptyMap;
                nax a2 = aVar2.a(rov.a()).b(rov.b()).c(rov.l()).a(i).a();
                $$Lambda$nay$a$Mfp0Q8gVWwBDJvpnkEXoJ7LAQI r6 = new $$Lambda$nay$a$Mfp0Q8gVWwBDJvpnkEXoJ7LAQI(this, rov, i);
                $$Lambda$nay$a$iq4F8CpzcP2b09l9xHutjwZ5WuI r7 = new $$Lambda$nay$a$iq4F8CpzcP2b09l9xHutjwZ5WuI(this, rov, i);
                ArrayList a3 = Lists.a();
                a3.add(rpg.a(rpg.a, e ? SpotifyIconV2.HEART_ACTIVE : SpotifyIconV2.HEART, e ? R.attr.pasteColorAccessoryGreen : 0, e ? R.string.free_tier_common_content_description_collection_remove : R.string.free_tier_common_content_description_collection_add, r6));
                if (rpg.e.a(rpg.d)) {
                    spotifyIconV2 = SpotifyIconV2.BLOCK;
                    spotifyIconV22 = SpotifyIconV2.BLOCK;
                } else {
                    spotifyIconV2 = SpotifyIconV2.BAN;
                    spotifyIconV22 = SpotifyIconV2.BAN_ACTIVE;
                }
                Context context = rpg.a;
                if (f) {
                    spotifyIconV2 = spotifyIconV22;
                }
                if (f) {
                    i2 = R.attr.pasteColorAccessoryRed;
                }
                a3.add(rpg.a(context, spotifyIconV2, i2, f ? R.string.free_tier_common_content_description_collection_unban : R.string.free_tier_common_content_description_collection_ban, r7));
                a3.add(jqq.a(rpg.a, jyz.c(rpg.a, SpotifyIconV2.MORE_ANDROID), (jor) rpg.c.get(), a2, rpg.b));
                aVar.a(a3);
                return;
            }
            throw new NullPointerException("Null additionalMetadata");
        }
    }

    /* renamed from: nay$b */
    public interface b {
        void a(rov rov, int i);

        void b(rov rov, int i);

        void c(rov rov, int i);

        void d(rov rov, int i);
    }

    /* renamed from: nay$c */
    public static class c extends u {
        public c(View view) {
            super(view);
        }
    }

    public nay(b bVar, Picasso picasso, ujc ujc, rpg<nax> rpg) {
        this.d = bVar;
        this.e = picasso;
        this.f = ujc;
        this.g = rpg;
        a(true);
    }

    public final /* synthetic */ u a(ViewGroup viewGroup, int i) {
        return new a(viewGroup);
    }

    public final /* synthetic */ void a(u uVar, int i) {
        ((a) ((c) uVar)).a((rov) this.a.get(i), i);
    }

    public final int b() {
        return this.a.size();
    }

    public final long b(int i) {
        rov rov = (rov) this.a.get(i);
        long hashCode = (long) (hashCode() ^ rov.a().hashCode());
        String l = rov.l();
        return l != null ? hashCode ^ ((long) l.hashCode()) : hashCode;
    }
}
