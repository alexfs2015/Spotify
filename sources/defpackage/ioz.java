package defpackage;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView.u;
import com.google.common.collect.Lists;
import com.spotify.music.R;
import com.spotify.music.libs.viewuri.ViewUris;
import java.util.List;

/* renamed from: ioz reason: default package */
public final class ioz extends androidx.recyclerview.widget.RecyclerView.a<u> implements gkw {
    public List<vku> a = Lists.a();
    public String d;
    private final xog<Integer> e;
    private final a f;
    private final jyx g;
    private final jor<vku> h;

    /* renamed from: ioz$a */
    public interface a {
        void a(int i, vku vku);
    }

    public ioz(jor<vku> jor, a aVar, xog<Integer> xog, jyx jyx) {
        this.h = (jor) fbp.a(jor);
        this.e = xog;
        this.f = aVar;
        this.g = jyx;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(int i, vku vku, View view) {
        this.f.a(i, vku);
    }

    public final int a(int i) {
        return ((vku) this.a.get(i)).isHeader() ? 0 : 1;
    }

    public final u a(ViewGroup viewGroup, int i) {
        if (i == 0) {
            return fra.a(fqv.e().c(viewGroup.getContext(), viewGroup));
        }
        fqv.b();
        fsc b = fsk.b(viewGroup.getContext(), viewGroup, false);
        b.a(jqq.a(viewGroup.getContext()));
        return fra.a(b);
    }

    public final void a(u uVar, int i) {
        this.e.onNext(Integer.valueOf(i));
        vku vku = (vku) this.a.get(i);
        if (a(i) == 0) {
            ((fsm) fqv.a(uVar.o, fsm.class)).a((CharSequence) vku.getHeader());
            return;
        }
        fsc fsc = (fsc) fqv.a(uVar.o, fsc.class);
        Context context = uVar.o.getContext();
        fsc.a(vku.getName());
        int numTracksInCollection = vku.getNumTracksInCollection();
        if (vku.isFollowed() && numTracksInCollection == 0) {
            fsc.c(context.getString(R.string.collection_artist_subtitle_following));
        } else if (vku.isFollowed()) {
            fsc.c(context.getResources().getQuantityString(R.plurals.cell_tracks_in_collection_count_artist_is_followed, numTracksInCollection, new Object[]{Integer.valueOf(numTracksInCollection)}));
        } else {
            fsc.c(context.getResources().getQuantityString(R.plurals.cell_tracks_in_collection_count, numTracksInCollection, new Object[]{Integer.valueOf(numTracksInCollection)}));
        }
        juf.a(context, fsc.d(), vku.getOfflineState());
        uVar.o.setTag(vku);
        String collectionUri = vku.getCollectionUri();
        fsc.a(vku.getUri().equals(this.d) || (!TextUtils.isEmpty(collectionUri) && collectionUri.equals(this.d)));
        fsc.getView().setEnabled(true);
        fsc.getView().setActivated(false);
        vgl.a(fsc.getView(), (int) R.attr.selectableItemBackground);
        jyx jyx = this.g;
        jyx.a(fsc.c(), !TextUtils.isEmpty(vku.getImageUri()) ? Uri.parse(vku.getImageUri()) : Uri.EMPTY, gaa.g(jyx.a), vgq.a());
        fsc.a(jqq.a(uVar.o.getContext(), this.h, vku, ViewUris.be));
        fsc.getView().setTag(R.id.context_menu_tag, new jqk(this.h, vku));
        fsc.getView().setOnClickListener(new $$Lambda$ioz$QP9rRUFzuAoiszXMHCZSO6P57U(this, i, vku));
        fsc.getView().setOnLongClickListener(new jop(uVar.o.getContext(), ViewUris.be));
    }

    public final int b() {
        return this.a.size();
    }
}
