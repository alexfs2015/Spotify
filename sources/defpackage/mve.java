package defpackage;

import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.common.collect.ImmutableBiMap;
import com.spotify.mobile.android.glue.GlueLayoutTraits.Trait;
import com.spotify.mobile.android.ui.view.DownloadHeaderView;
import com.spotify.mobile.android.util.ui.Lifecycle.a;
import com.spotify.mobile.android.util.ui.Lifecycle.c;
import com.spotify.music.R;
import java.util.EnumSet;

/* renamed from: mve reason: default package */
public final class mve implements rev<DownloadHeaderView> {
    final a a;
    final muh b;

    public final /* bridge */ /* synthetic */ void a(View view, gzt gzt, a aVar, int[] iArr) {
    }

    public final int b() {
        return R.id.row_download_toggle;
    }

    public final /* synthetic */ void a(View view, final gzt gzt, final gum gum, b bVar) {
        DownloadHeaderView downloadHeaderView = (DownloadHeaderView) view;
        downloadHeaderView.a(false);
        downloadHeaderView.b = new DownloadHeaderView.a() {
            public final void a() {
                gum.c.a(guy.a("click", gzt, ImmutableBiMap.a("settings", Boolean.TRUE)));
            }

            public final void a(boolean z) {
                gum.c.a(guy.a("click", gzt, ImmutableBiMap.a("download", Boolean.valueOf(z))));
            }
        };
    }

    mve(a aVar, muh muh) {
        this.a = aVar;
        this.b = muh;
    }

    public final EnumSet<Trait> a() {
        return EnumSet.of(Trait.STACKABLE);
    }

    public final /* synthetic */ View a(ViewGroup viewGroup, gum gum) {
        final DownloadHeaderView downloadHeaderView = (DownloadHeaderView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.header_download, viewGroup, false);
        ip.a((View) downloadHeaderView, (Drawable) null);
        this.b.a((a) downloadHeaderView);
        this.a.a(new c() {
            public final void c() {
                mve.this.b.a((a) downloadHeaderView);
            }

            public final void a() {
                muh muh = mve.this.b;
                if (muh.a != null) {
                    muh.a.bf_();
                }
            }

            public final void aP_() {
                mve.this.a.b(this);
            }
        });
        return downloadHeaderView;
    }
}
