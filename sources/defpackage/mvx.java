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

/* renamed from: mvx reason: default package */
public final class mvx extends androidx.recyclerview.widget.RecyclerView.a<c> implements gjl {
    public List<rft> a = Lists.a();
    final b d;
    final Picasso e;
    final twz f;
    final rge<mvw> g;
    public boolean h;

    /* renamed from: mvx$a */
    class a extends c {
        public a(ViewGroup viewGroup) {
            super(Rows.a(viewGroup.getContext(), viewGroup).getView());
        }

        public final void a(rft rft, int i) {
            SpotifyIconV2 spotifyIconV2;
            SpotifyIconV2 spotifyIconV22;
            fri fri = (fri) fqf.a(this.o, fri.class);
            fri.a(rft.b());
            fri.b(jsx.a(rft.j()));
            Boolean g = rft.g();
            boolean z = true;
            int i2 = 0;
            boolean z2 = g == null || g.booleanValue();
            boolean d = rft.d();
            if (z2 && !rft.f() && (!mvx.this.h || !d)) {
                z = false;
            }
            jxb.a(fri.d().getContext(), fri.d(), d);
            Uri parse = !TextUtils.isEmpty(rft.k()) ? Uri.parse(rft.k()) : Uri.EMPTY;
            ImageView c = fri.c();
            if (z2) {
                c.setContentDescription(c.getContext().getString(R.string.preview_play_pause_content_description));
            } else {
                c.setContentDescription(c.getContext().getString(R.string.generic_content_description_cover_art));
            }
            mvx.this.e.a(parse).a(fzg.i(this.o.getContext())).a((vsr) txa.a(c, mvx.this.f, z2 ? rft.c() : "", mvu.a(rft), z));
            this.o.setOnClickListener(new $$Lambda$mvx$a$0Xq6RRv1MQTdTrM5XSne59Qu7uk(this, rft, i));
            fri.c().setOnClickListener(new $$Lambda$mvx$a$A06VEUf1yZLGiTWmpfvBb2lHva8(this, rft, i));
            fri.c(z);
            com.spotify.music.freetiercommon.uicomponents.Rows.a aVar = (com.spotify.music.freetiercommon.uicomponents.Rows.a) fri;
            rge<mvw> rge = mvx.this.g;
            boolean e = rft.e();
            boolean f = rft.f();
            a aVar2 = new a();
            Map<String, String> emptyMap = Collections.emptyMap();
            if (emptyMap != null) {
                aVar2.a = emptyMap;
                mvw a2 = aVar2.a(rft.a()).b(rft.b()).c(rft.l()).a(i).a();
                $$Lambda$mvx$a$2FCsQVd46lBQlgG9nzcuYc39laA r6 = new $$Lambda$mvx$a$2FCsQVd46lBQlgG9nzcuYc39laA(this, rft, i);
                $$Lambda$mvx$a$CLzvpvizB0n40O2TUoDmLZmbGE r7 = new $$Lambda$mvx$a$CLzvpvizB0n40O2TUoDmLZmbGE(this, rft, i);
                ArrayList a3 = Lists.a();
                a3.add(rge.a(rge.a, e ? SpotifyIconV2.HEART_ACTIVE : SpotifyIconV2.HEART, e ? R.attr.pasteColorAccessoryGreen : 0, e ? R.string.free_tier_common_content_description_collection_remove : R.string.free_tier_common_content_description_collection_add, r6));
                if (rge.e.a(rge.d)) {
                    spotifyIconV2 = SpotifyIconV2.BLOCK;
                    spotifyIconV22 = SpotifyIconV2.BLOCK;
                } else {
                    spotifyIconV2 = SpotifyIconV2.BAN;
                    spotifyIconV22 = SpotifyIconV2.BAN_ACTIVE;
                }
                Context context = rge.a;
                if (f) {
                    spotifyIconV2 = spotifyIconV22;
                }
                if (f) {
                    i2 = R.attr.pasteColorAccessoryRed;
                }
                a3.add(rge.a(context, spotifyIconV2, i2, f ? R.string.free_tier_common_content_description_collection_unban : R.string.free_tier_common_content_description_collection_ban, r7));
                a3.add(joe.a(rge.a, jwz.c(rge.a, SpotifyIconV2.MORE_ANDROID), (jmf) rge.c.get(), a2, rge.b));
                aVar.a(a3);
                return;
            }
            throw new NullPointerException("Null additionalMetadata");
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void d(rft rft, int i, View view) {
            mvx.this.d.a(rft, i);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void c(rft rft, int i, View view) {
            mvx.this.d.b(rft, i);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void b(rft rft, int i, View view) {
            mvx.this.d.c(rft, i);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void a(rft rft, int i, View view) {
            mvx.this.d.d(rft, i);
        }
    }

    /* renamed from: mvx$b */
    public interface b {
        void a(rft rft, int i);

        void b(rft rft, int i);

        void c(rft rft, int i);

        void d(rft rft, int i);
    }

    /* renamed from: mvx$c */
    public static class c extends u {
        public c(View view) {
            super(view);
        }
    }

    public final /* synthetic */ void a(u uVar, int i) {
        ((a) ((c) uVar)).a((rft) this.a.get(i), i);
    }

    public mvx(b bVar, Picasso picasso, twz twz, rge<mvw> rge) {
        this.d = bVar;
        this.e = picasso;
        this.f = twz;
        this.g = rge;
        a(true);
    }

    public final int b() {
        return this.a.size();
    }

    public final long b(int i) {
        rft rft = (rft) this.a.get(i);
        long hashCode = (long) (hashCode() ^ rft.a().hashCode());
        String l = rft.l();
        return l != null ? hashCode ^ ((long) l.hashCode()) : hashCode;
    }

    public final /* synthetic */ u a(ViewGroup viewGroup, int i) {
        return new a(viewGroup);
    }
}
