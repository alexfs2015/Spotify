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

/* renamed from: lrw reason: default package */
public final class lrw extends lrv<AlbumRelease, fra<fsc>> implements gkw {
    public OnClickListener d;
    public jor<ho<AlbumRelease, Integer>> e;
    public String f = "";
    private final sso g;
    private final jyx h;

    public lrw(Context context, sso sso, jyx jyx) {
        super(context);
        this.g = (sso) fbp.a(sso);
        this.h = (jyx) fbp.a(jyx);
    }

    public final /* synthetic */ u a(ViewGroup viewGroup, int i) {
        fqv.b();
        return fra.a(fsk.b(this.a, viewGroup, false));
    }

    public final /* bridge */ /* synthetic */ void a() {
        super.a();
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ void a(u uVar, int i, Object obj) {
        AlbumRelease albumRelease = (AlbumRelease) obj;
        fsc fsc = (fsc) ((fra) uVar).a;
        ho a = ho.a(albumRelease, Integer.valueOf(i));
        fsc.a(albumRelease.getName());
        fsc.b(String.valueOf(albumRelease.getYear()));
        fsc.a(jqq.a(this.a, this.e, a, this.g));
        fsc.a(TextUtils.equals(this.f, albumRelease.getUri()));
        fsc.getView().setTag(R.id.context_menu_tag, new jqk(this.e, a));
        fsc.getView().setOnClickListener(this.d);
        fsc.getView().setOnLongClickListener(new jop(this.a, this.g));
        vgl.a(fsc.getView(), (int) R.attr.selectableItemBackground);
        this.h.b(fsc.c(), !TextUtils.isEmpty(albumRelease.getCoverUri()) ? Uri.parse(albumRelease.getCoverUri()) : Uri.EMPTY);
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
}
