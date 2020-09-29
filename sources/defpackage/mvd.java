package defpackage;

import android.view.View;
import android.view.ViewGroup;
import com.spotify.music.features.followfeed.views.ReleaseItemView;
import com.squareup.picasso.Picasso;

/* renamed from: mvd reason: default package */
public final class mvd implements gwi<ReleaseItemView> {
    private final Picasso a;

    public mvd(Picasso picasso) {
        this.a = picasso;
    }

    public final /* synthetic */ View a(ViewGroup viewGroup, gwm gwm) {
        return new ReleaseItemView(viewGroup.getContext(), this.a);
    }

    public final /* bridge */ /* synthetic */ void a(View view, hcm hcm, a aVar, int[] iArr) {
    }

    public final /* synthetic */ void a(View view, hcm hcm, gwm gwm, b bVar) {
        ReleaseItemView releaseItemView = (ReleaseItemView) view;
        hcj custom = hcm.custom();
        String str = "";
        String string = custom.string("artist_name", str);
        String string2 = custom.string("artist_image", str);
        String string3 = custom.string("release_date", str);
        String string4 = custom.string("title", str);
        String string5 = custom.string("subtitle", str);
        String string6 = custom.string("image_url", str);
        releaseItemView.c.a(string);
        releaseItemView.c.a(string2, releaseItemView.b);
        releaseItemView.c.b(string3);
        releaseItemView.d.a(string6, releaseItemView.b);
        releaseItemView.d.a(string4, string5);
        releaseItemView.d.b();
        muq.a(releaseItemView.c, hcm, gwm);
        muq.b(releaseItemView.d.i, hcm, gwm);
    }
}
