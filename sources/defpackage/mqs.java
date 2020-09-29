package defpackage;

import android.view.View;
import android.view.ViewGroup;
import com.spotify.music.features.followfeed.views.ReleaseItemView;
import com.squareup.picasso.Picasso;

/* renamed from: mqs reason: default package */
public final class mqs implements gui<ReleaseItemView> {
    private final Picasso a;

    public final /* bridge */ /* synthetic */ void a(View view, gzt gzt, a aVar, int[] iArr) {
    }

    public final /* synthetic */ void a(View view, gzt gzt, gum gum, b bVar) {
        ReleaseItemView releaseItemView = (ReleaseItemView) view;
        gzq custom = gzt.custom();
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
        mqd.a(releaseItemView.c, gzt, gum);
        mqd.b(releaseItemView.d.i, gzt, gum);
    }

    public mqs(Picasso picasso) {
        this.a = picasso;
    }

    public final /* synthetic */ View a(ViewGroup viewGroup, gum gum) {
        return new ReleaseItemView(viewGroup.getContext(), this.a);
    }
}
