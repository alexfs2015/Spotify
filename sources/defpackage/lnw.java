package defpackage;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView.u;
import com.spotify.music.R;
import com.spotify.music.libs.album.model.AlbumRelease;
import java.util.Collection;

/* renamed from: lnw reason: default package */
public final class lnw extends lnv<AlbumRelease, fqg<fri>> implements gjl {
    public OnClickListener d;
    public jmf<ho<AlbumRelease, Integer>> e;
    public String f = "";
    private final sih g;
    private final jwv h;

    public final /* bridge */ /* synthetic */ void a() {
        super.a();
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ void a(u uVar, int i, Object obj) {
        AlbumRelease albumRelease = (AlbumRelease) obj;
        fri fri = (fri) ((fqg) uVar).a;
        ho a = ho.a(albumRelease, Integer.valueOf(i));
        fri.a(albumRelease.getName());
        fri.b(String.valueOf(albumRelease.getYear()));
        fri.a(joe.a(this.a, this.e, a, this.g));
        fri.a(TextUtils.equals(this.f, albumRelease.getUri()));
        fri.getView().setTag(R.id.context_menu_tag, new jny(this.e, a));
        fri.getView().setOnClickListener(this.d);
        fri.getView().setOnLongClickListener(new jmd(this.a, this.g));
        uuu.a(fri.getView(), (int) R.attr.selectableItemBackground);
        this.h.b(fri.c(), !TextUtils.isEmpty(albumRelease.getCoverUri()) ? Uri.parse(albumRelease.getCoverUri()) : Uri.EMPTY);
    }

    public final /* bridge */ /* synthetic */ void a(Collection collection) {
        super.a(collection);
    }

    public final /* bridge */ /* synthetic */ int b() {
        return super.b();
    }

    public final /* bridge */ /* synthetic */ long b(int i) {
        return super.b(i);
    }

    public lnw(Context context, sih sih, jwv jwv) {
        super(context);
        this.g = (sih) fay.a(sih);
        this.h = (jwv) fay.a(jwv);
    }

    public final /* synthetic */ u a(ViewGroup viewGroup, int i) {
        fqb.b();
        return fqg.a(frq.b(this.a, viewGroup, false));
    }
}
