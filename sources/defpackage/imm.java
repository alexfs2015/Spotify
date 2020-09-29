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

/* renamed from: imm reason: default package */
public final class imm extends androidx.recyclerview.widget.RecyclerView.a<u> implements gjl {
    public List<uyr> a = Lists.a();
    public String d;
    private final xac<Integer> e;
    private final a f;
    private final jwv g;
    private final jmf<uyr> h;

    /* renamed from: imm$a */
    public interface a {
        void a(int i, uyr uyr);
    }

    public imm(Context context, jmf<uyr> jmf, a aVar, xac<Integer> xac) {
        this.h = (jmf) fay.a(jmf);
        this.e = xac;
        this.f = aVar;
        ggw.a(jww.class);
        this.g = jww.a(context);
    }

    public final void a(u uVar, int i) {
        this.e.onNext(Integer.valueOf(i));
        uyr uyr = (uyr) this.a.get(i);
        if (a(i) == 0) {
            ((frs) fqb.a(uVar.o, frs.class)).a((CharSequence) uyr.getHeader());
            return;
        }
        fri fri = (fri) fqb.a(uVar.o, fri.class);
        Context context = uVar.o.getContext();
        fri.a(uyr.getName());
        int numTracksInCollection = uyr.getNumTracksInCollection();
        if (uyr.isFollowed() && numTracksInCollection == 0) {
            fri.c(context.getString(R.string.collection_artist_subtitle_following));
        } else if (uyr.isFollowed()) {
            fri.c(context.getResources().getQuantityString(R.plurals.cell_tracks_in_collection_count_artist_is_followed, numTracksInCollection, new Object[]{Integer.valueOf(numTracksInCollection)}));
        } else {
            fri.c(context.getResources().getQuantityString(R.plurals.cell_tracks_in_collection_count, numTracksInCollection, new Object[]{Integer.valueOf(numTracksInCollection)}));
        }
        jrv.a(context, fri.d(), uyr.getOfflineState());
        uVar.o.setTag(uyr);
        String collectionUri = uyr.getCollectionUri();
        fri.a(uyr.getUri().equals(this.d) || (!TextUtils.isEmpty(collectionUri) && collectionUri.equals(this.d)));
        fri.getView().setEnabled(true);
        fri.getView().setActivated(false);
        uuu.a(fri.getView(), (int) R.attr.selectableItemBackground);
        jwv jwv = this.g;
        jwv.a(fri.c(), !TextUtils.isEmpty(uyr.getImageUri()) ? Uri.parse(uyr.getImageUri()) : Uri.EMPTY, fzg.g(jwv.a), uuz.a());
        fri.a(joe.a(uVar.o.getContext(), this.h, uyr, ViewUris.bf));
        fri.getView().setTag(R.id.context_menu_tag, new jny(this.h, uyr));
        fri.getView().setOnClickListener(new $$Lambda$imm$RbGXcSK_E4f6HsyEBgcO6kTcMjs(this, i, uyr));
        fri.getView().setOnLongClickListener(new jmd(uVar.o.getContext(), ViewUris.bf));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(int i, uyr uyr, View view) {
        this.f.a(i, uyr);
    }

    public final u a(ViewGroup viewGroup, int i) {
        if (i == 0) {
            return fqg.a(fqb.e().c(viewGroup.getContext(), viewGroup));
        }
        fqb.b();
        fri b = frq.b(viewGroup.getContext(), viewGroup, false);
        b.a(joe.a(viewGroup.getContext()));
        return fqg.a(b);
    }

    public final int a(int i) {
        return ((uyr) this.a.get(i)).isHeader() ? 0 : 1;
    }

    public final int b() {
        return this.a.size();
    }
}
