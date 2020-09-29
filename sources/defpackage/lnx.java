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

/* renamed from: lnx reason: default package */
public final class lnx extends lnv<AlbumTrack, fqg<frh>> implements gjl {
    public OnClickListener d;
    public jmf<ho<AlbumTrack, Integer>> e;
    public String f = "";
    public boolean g = true;
    private final sih h;
    private boolean i;

    public final /* bridge */ /* synthetic */ void a() {
        super.a();
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ void a(u uVar, int i2, Object obj) {
        AlbumTrack albumTrack = (AlbumTrack) obj;
        frh frh = (frh) ((fqg) uVar).a;
        ho a = ho.a(albumTrack, Integer.valueOf(i2));
        frh.a(albumTrack.getName());
        ArrayList arrayList = new ArrayList(16);
        for (AlbumArtist name : albumTrack.getArtists()) {
            arrayList.add(name.getName());
        }
        frh.b(fau.a(", ").a((Iterable<?>) arrayList));
        frh.c(jtb.a(albumTrack.isPlayable(), this.i, albumTrack.isExplicit()));
        frh.a(TextUtils.equals(this.f, albumTrack.getUri()));
        frh.a(joe.a(this.a, this.e, a, this.h));
        frh.getView().setEnabled(this.g || (albumTrack.getOffline() instanceof a));
        frh.getView().setTag(R.id.context_menu_tag, new jny(this.e, a));
        jxb.a(this.a, frh.d(), albumTrack.isExplicit());
        jrv.a(this.a, frh.d(), albumTrack.getOffline());
        uuu.a(frh.getView(), (int) R.attr.selectableItemBackground);
        frh.getView().setOnClickListener(this.d);
        frh.getView().setOnLongClickListener(new jmd(this.a, this.h));
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

    public lnx(Context context, sih sih) {
        super(context);
        this.h = (sih) fay.a(sih);
    }

    public final void b(boolean z) {
        this.i = z;
        if (super.b() > 0) {
            e();
        }
    }

    public final /* synthetic */ u a(ViewGroup viewGroup, int i2) {
        fqb.b();
        return fqg.a(frq.a(this.a, viewGroup, false));
    }
}
