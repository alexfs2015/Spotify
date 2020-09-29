package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView.u;
import com.spotify.android.paste.graphics.SpotifyIcon;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrackUtil;
import com.spotify.music.R;
import com.squareup.picasso.Picasso;

/* renamed from: puk reason: default package */
public final class puk extends iti<pvh> {
    private final Context a;
    private final Picasso b;
    private final puz c;

    public puk(Context context, Picasso picasso, puz puz) {
        this.a = (Context) fbp.a(context);
        this.b = (Picasso) fbp.a(picasso);
        this.c = (puz) fbp.a(puz);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(PlayerTrack playerTrack, View view) {
        this.c.a(playerTrack);
    }

    public final u a(ViewGroup viewGroup) {
        fqv.b();
        fra a2 = fra.a(fsk.b(viewGroup.getContext(), viewGroup, false));
        vgl.a(a2.o, (int) R.attr.selectableItemBackground);
        return a2;
    }

    public final /* synthetic */ void b(u uVar, Object obj, int i) {
        fsc fsc = (fsc) fqv.a(uVar.o, fsc.class);
        PlayerTrack playerTrack = ((pvh) obj).a;
        String a2 = jya.a(playerTrack, "image_url");
        Uri parse = !TextUtils.isEmpty(a2) ? Uri.parse(a2) : Uri.EMPTY;
        ImageView c2 = fsc.c();
        Drawable a3 = gaa.a(this.a, SpotifyIcon.ALBUM_32, true);
        fsc.a(jya.a(playerTrack, "title"));
        fsc.b(PlayerTrackUtil.getArtists(playerTrack));
        this.b.d(c2);
        this.b.a(parse).a(a3).a(c2);
        jzb.a(this.a, fsc.d(), PlayerTrackUtil.isExplicit(playerTrack));
        uVar.o.setOnClickListener(new $$Lambda$puk$DHBSmV9EcuBOv2WwkbM_3RyHBng(this, playerTrack));
    }
}
