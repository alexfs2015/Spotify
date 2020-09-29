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

/* renamed from: plo reason: default package */
public final class plo extends iqv<pml> {
    private final Context a;
    private final Picasso b;
    private final pmd c;

    public final /* synthetic */ void b(u uVar, Object obj, int i) {
        fri fri = (fri) fqb.a(uVar.o, fri.class);
        PlayerTrack playerTrack = ((pml) obj).a;
        String a2 = jvs.a(playerTrack, "image_url");
        Uri parse = !TextUtils.isEmpty(a2) ? Uri.parse(a2) : Uri.EMPTY;
        ImageView c2 = fri.c();
        Drawable a3 = fzg.a(this.a, SpotifyIcon.ALBUM_32, true);
        fri.a(jvs.a(playerTrack, "title"));
        fri.b(PlayerTrackUtil.getArtists(playerTrack));
        this.b.d(c2);
        this.b.a(parse).a(a3).a(c2);
        jxb.a(this.a, fri.d(), PlayerTrackUtil.isExplicit(playerTrack));
        uVar.o.setOnClickListener(new $$Lambda$plo$9RZseKObXHAE99s7nRXybDVzjQ(this, playerTrack));
    }

    public plo(Context context, Picasso picasso, pmd pmd) {
        this.a = (Context) fay.a(context);
        this.b = (Picasso) fay.a(picasso);
        this.c = (pmd) fay.a(pmd);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(PlayerTrack playerTrack, View view) {
        this.c.a(playerTrack);
    }

    public final u a(ViewGroup viewGroup) {
        fqb.b();
        fqg a2 = fqg.a(frq.b(viewGroup.getContext(), viewGroup, false));
        uuu.a(a2.o, (int) R.attr.selectableItemBackground);
        return a2;
    }
}
