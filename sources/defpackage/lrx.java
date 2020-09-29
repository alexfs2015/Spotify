package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView.u;
import com.spotify.music.R;
import com.spotify.music.libs.album.model.AlbumArtist;
import com.spotify.music.libs.album.model.AlbumTrack;
import java.util.ArrayList;
import java.util.Collection;

/* renamed from: lrx reason: default package */
public final class lrx extends lrv<AlbumTrack, fra<fsb>> implements gkw {
    public OnClickListener d;
    public jor<ho<AlbumTrack, Integer>> e;
    public String f = "";
    public boolean g = true;
    private final sso h;
    private boolean i;

    public lrx(Context context, sso sso) {
        super(context);
        this.h = (sso) fbp.a(sso);
    }

    public final /* synthetic */ u a(ViewGroup viewGroup, int i2) {
        fqv.b();
        return fra.a(fsk.a(this.a, viewGroup, false));
    }

    public final /* bridge */ /* synthetic */ void a() {
        super.a();
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ void a(u uVar, int i2, Object obj) {
        AlbumTrack albumTrack = (AlbumTrack) obj;
        fsb fsb = (fsb) ((fra) uVar).a;
        ho a = ho.a(albumTrack, Integer.valueOf(i2));
        fsb.a(albumTrack.getName());
        ArrayList arrayList = new ArrayList(16);
        for (AlbumArtist name : albumTrack.getArtists()) {
            arrayList.add(name.getName());
        }
        fsb.b(fbl.a(", ").a((Iterable<?>) arrayList));
        fsb.c(jvh.a(albumTrack.isPlayable(), this.i, albumTrack.isExplicit()));
        fsb.a(TextUtils.equals(this.f, albumTrack.getUri()));
        fsb.a(jqq.a(this.a, this.e, a, this.h));
        fsb.getView().setEnabled(this.g || (albumTrack.getOffline() instanceof a));
        fsb.getView().setTag(R.id.context_menu_tag, new jqk(this.e, a));
        jzb.a(this.a, fsb.d(), albumTrack.isExplicit());
        juf.a(this.a, fsb.d(), albumTrack.getOffline());
        vgl.a(fsb.getView(), (int) R.attr.selectableItemBackground);
        fsb.getView().setOnClickListener(this.d);
        fsb.getView().setOnLongClickListener(new jop(this.a, this.h));
    }

    public final /* bridge */ /* synthetic */ void a(Collection collection) {
        super.a(collection);
    }

    public final /* bridge */ /* synthetic */ int b() {
        return super.b();
    }

    public final /* bridge */ /* synthetic */ long b(int i2) {
        return super.b(i2);
    }

    public final void b(boolean z) {
        this.i = z;
        if (super.b() > 0) {
            e();
        }
    }
}
