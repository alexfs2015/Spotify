package defpackage;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrackUtil;
import com.spotify.music.R;

/* renamed from: pss reason: default package */
public final class pss extends ArrayAdapter<PlayerTrack> {
    String a = "";
    public boolean b;
    /* access modifiers changed from: private */
    public final sih c;
    private final fpt d;
    /* access modifiers changed from: private */
    public final jmq e;
    private final jmf<PlayerTrack> f = new jmf<PlayerTrack>() {
        public final /* synthetic */ jms onCreateContextMenu(Object obj) {
            PlayerTrack playerTrack = (PlayerTrack) obj;
            return pss.this.e.a(playerTrack.uri(), (String) playerTrack.metadata().get("title"), pss.this.c.toString()).a(pss.this.c).a(!fax.a((String) playerTrack.metadata().get("album_uri"))).b(!fax.a((String) playerTrack.metadata().get("artist_uri"))).c(true).d(false).a();
        }
    };

    public pss(Activity activity, sih sih, fpt fpt, jmq jmq) {
        super(activity, 0);
        this.c = sih;
        this.d = fpt;
        this.e = jmq;
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        StringBuilder sb;
        frh frh = (frh) fqb.b(view, frh.class);
        boolean z = true;
        boolean z2 = !jsl.c(this.d);
        if (frh == null) {
            fqb.b();
            frh = frq.a(getContext(), viewGroup, z2);
        }
        PlayerTrack playerTrack = (PlayerTrack) getItem(i);
        String str = (String) playerTrack.metadata().get("title");
        String str2 = (String) playerTrack.metadata().get("artist_name");
        String str3 = (String) playerTrack.metadata().get("album_title");
        String str4 = " • ";
        if (uur.a(getContext())) {
            sb = new StringBuilder();
            sb.append(str3);
            sb.append(str4);
            sb.append(str2);
        } else {
            sb = new StringBuilder();
            sb.append(str2);
            sb.append(str4);
            sb.append(str3);
        }
        String sb2 = sb.toString();
        frh.a(str);
        frh.b(sb2);
        boolean isExplicit = PlayerTrackUtil.isExplicit(playerTrack);
        jxb.a(getContext(), frh.d(), isExplicit);
        frh.c(this.b && isExplicit);
        frh.a(joe.a(getContext(), this.f, playerTrack, this.c));
        frh.getView().setTag(R.id.context_menu_tag, new jny(this.f, playerTrack));
        if (this.a.equals("") || (!this.a.equals(playerTrack.uid()) && !this.a.equals(playerTrack.uri()))) {
            z = false;
        }
        frh.a(z);
        return frh.getView();
    }
}
