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

/* renamed from: naf reason: default package */
public final class naf implements rnx<DownloadHeaderView> {
    final a a;
    final mzi b;

    naf(a aVar, mzi mzi) {
        this.a = aVar;
        this.b = mzi;
    }

    public final /* synthetic */ View a(ViewGroup viewGroup, gwm gwm) {
        final DownloadHeaderView downloadHeaderView = (DownloadHeaderView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.header_download, viewGroup, false);
        ip.a((View) downloadHeaderView, (Drawable) null);
        this.b.a((a) downloadHeaderView);
        this.a.a(new c() {
            public final void a() {
                mzi mzi = naf.this.b;
                if (mzi.a != null) {
                    mzi.a.bd_();
                }
            }

            public final void aN_() {
                naf.this.a.b(this);
            }

            public final void c() {
                naf.this.b.a((a) downloadHeaderView);
            }
        });
        return downloadHeaderView;
    }

    public final EnumSet<Trait> a() {
        return EnumSet.of(Trait.STACKABLE);
    }

    public final /* bridge */ /* synthetic */ void a(View view, hcm hcm, a aVar, int[] iArr) {
    }

    public final /* synthetic */ void a(View view, final hcm hcm, final gwm gwm, b bVar) {
        DownloadHeaderView downloadHeaderView = (DownloadHeaderView) view;
        downloadHeaderView.a(false);
        downloadHeaderView.b = new DownloadHeaderView.a() {
            public final void a() {
                gwm.c.a(gwy.a("click", hcm, ImmutableBiMap.a("settings", Boolean.TRUE)));
            }

            public final void a(boolean z) {
                gwm.c.a(gwy.a("click", hcm, ImmutableBiMap.a("download", Boolean.valueOf(z))));
            }
        };
    }

    public final int b() {
        return R.id.row_download_toggle;
    }
}
