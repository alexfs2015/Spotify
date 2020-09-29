package defpackage;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrackUtil;
import com.spotify.music.R;

/* renamed from: qbo reason: default package */
public final class qbo extends ArrayAdapter<PlayerTrack> {
    String a = "";
    public boolean b;
    /* access modifiers changed from: private */
    public final sso c;
    private final fqn d;
    /* access modifiers changed from: private */
    public final jpc e;
    private final jor<PlayerTrack> f = new jor<PlayerTrack>() {
        public final /* synthetic */ jpe onCreateContextMenu(Object obj) {
            PlayerTrack playerTrack = (PlayerTrack) obj;
            return qbo.this.e.a(playerTrack.uri(), (String) playerTrack.metadata().get("title"), qbo.this.c.toString()).a(qbo.this.c).a(!fbo.a((String) playerTrack.metadata().get("album_uri"))).b(!fbo.a((String) playerTrack.metadata().get("artist_uri"))).c(true).d(false).a();
        }
    };

    public qbo(Activity activity, sso sso, fqn fqn, jpc jpc) {
        super(activity, 0);
        this.c = sso;
        this.d = fqn;
        this.e = jpc;
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        StringBuilder sb;
        fsb fsb = (fsb) fqv.b(view, fsb.class);
        boolean z = true;
        boolean z2 = !jus.c(this.d);
        if (fsb == null) {
            fqv.b();
            fsb = fsk.a(getContext(), viewGroup, z2);
        }
        PlayerTrack playerTrack = (PlayerTrack) getItem(i);
        String str = (String) playerTrack.metadata().get("title");
        String str2 = (String) playerTrack.metadata().get("artist_name");
        String str3 = (String) playerTrack.metadata().get("album_title");
        String str4 = " • ";
        if (vgi.a(getContext())) {
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
        fsb.a(str);
        fsb.b(sb2);
        boolean isExplicit = PlayerTrackUtil.isExplicit(playerTrack);
        jzb.a(getContext(), fsb.d(), isExplicit);
        fsb.c(this.b && isExplicit);
        fsb.a(jqq.a(getContext(), this.f, playerTrack, this.c));
        fsb.getView().setTag(R.id.context_menu_tag, new jqk(this.f, playerTrack));
        if (this.a.equals("") || (!this.a.equals(playerTrack.uid()) && !this.a.equals(playerTrack.uri()))) {
            z = false;
        }
        fsb.a(z);
        return fsb.getView();
    }
}
