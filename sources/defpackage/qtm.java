package defpackage;

import android.content.Context;
import android.graphics.Typeface;
import android.view.View;
import android.view.ViewGroup;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.spotify.music.features.yourlibrary.musicpages.item.MusicItem;
import com.spotify.music.features.yourlibrary.musicpages.item.MusicItem.Type;
import com.spotify.music.freetiercommon.uicomponents.Rows;
import com.spotify.music.freetiercommon.uicomponents.Rows.b;

/* renamed from: qtm reason: default package */
public final class qtm implements g<Type, MusicItem> {
    public a a;
    private final qzq b;
    private final Typeface c;

    /* renamed from: qtm$a */
    public interface a {
        void onItemClicked(MusicItem musicItem, int i);
    }

    public qtm(qzq qzq, Context context) {
        this.b = qzq;
        this.c = utw.a(context, 2132017666);
    }

    public final ImmutableList<c<Type, MusicItem>> a() {
        return ImmutableList.a(c.a(ImmutableSet.b(Type.CREATE_PLAYLIST_BUTTON, Type.ADD_ARTISTS_BUTTON), new $$Lambda$qtm$e4xK_hf4CkA2gYVcOKvMvez_sfY(this), new $$Lambda$qtm$p3mgImO2ISt6S7GGsd6Ch0heDiU(this)));
    }

    /* access modifiers changed from: private */
    public fqe a(ViewGroup viewGroup) {
        return Rows.a(viewGroup.getContext(), viewGroup, 64, 8);
    }

    /* access modifiers changed from: private */
    public void a(fqe fqe, MusicItem musicItem, int i) {
        b bVar = (b) fqe;
        bVar.b().setTypeface(this.c);
        bVar.a(musicItem.h());
        bVar.c().setImageDrawable(this.b.a(musicItem));
        bVar.getView().setOnClickListener(new $$Lambda$qtm$2OKVHxmF7RBD5GTNdxDMrvrgISs(this, musicItem, i));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(MusicItem musicItem, int i, View view) {
        this.a.onItemClicked(musicItem, i);
    }
}
