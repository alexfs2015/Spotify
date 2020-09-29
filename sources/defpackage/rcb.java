package defpackage;

import android.view.View;
import android.view.ViewGroup;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.spotify.music.features.yourlibrary.musicpages.item.MusicItem;
import com.spotify.music.features.yourlibrary.musicpages.item.MusicItem.Type;
import com.spotify.music.freetiercommon.uicomponents.Rows;
import com.spotify.music.freetiercommon.uicomponents.Rows.b;

/* renamed from: rcb reason: default package */
public final class rcb implements g<Type, MusicItem> {
    public a a;
    private final rim b;

    /* renamed from: rcb$a */
    public interface a {
        void onItemClicked(MusicItem musicItem, int i);
    }

    public rcb(rim rim) {
        this.b = rim;
    }

    /* access modifiers changed from: private */
    public fqy a(ViewGroup viewGroup) {
        return Rows.a(viewGroup.getContext(), viewGroup, 64, 8);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(MusicItem musicItem, int i, View view) {
        this.a.onItemClicked(musicItem, i);
    }

    /* access modifiers changed from: private */
    public void a(fqy fqy, MusicItem musicItem, int i) {
        b bVar = (b) fqy;
        jm.a(bVar.b(), 2132017669);
        bVar.a(musicItem.h());
        bVar.c().setImageDrawable(this.b.a(musicItem));
        bVar.getView().setOnClickListener(new $$Lambda$rcb$B_IG_vIKMJp_16RnUKtCCkW8X4M(this, musicItem, i));
    }

    public final ImmutableList<c<Type, MusicItem>> a() {
        return ImmutableList.a(c.a(ImmutableSet.b(Type.CREATE_PLAYLIST_BUTTON, Type.ADD_ARTISTS_BUTTON), new $$Lambda$rcb$T_xGFraSL6q9w_vmq5rKPGGI2Ow(this), new $$Lambda$rcb$x0YprsRYvmNMmxAG0hMt5MbKpXA(this)));
    }
}
