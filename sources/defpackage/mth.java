package defpackage;

import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView.a;
import androidx.recyclerview.widget.RecyclerView.u;
import com.google.common.collect.ImmutableList;
import com.spotify.music.R;
import com.spotify.music.features.feed.view.custom.FeedPlayButton;
import com.squareup.picasso.Picasso;
import java.util.Collection;
import java.util.List;

/* renamed from: mth reason: default package */
final class mth extends a<u> implements gkw {
    private final ImmutableList<mtq> a;
    private final Picasso d;
    private final LayoutInflater e;

    mth(List<mtq> list, LayoutInflater layoutInflater, Picasso picasso) {
        this.a = ImmutableList.a((Collection<? extends E>) list);
        this.d = picasso;
        this.e = layoutInflater;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(u uVar, a aVar) {
        mtf mtf = (mtf) uVar;
        mtf.a.a((a) new mtg(aVar.a, mtf.b, mtf.c));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(u uVar, b bVar) {
        mtj mtj = (mtj) uVar;
        Picasso picasso = this.d;
        fsc fsc = (fsc) fqz.a(mtj.o, fsc.class);
        fsc.a(bVar.a);
        fsc.b(mtj.o.getResources().getQuantityString(R.plurals.feed_number_of_songs, bVar.c, new Object[]{bVar.b, Integer.valueOf(bVar.c)}));
        FeedPlayButton feedPlayButton = mtj.b;
        feedPlayButton.setBackground(feedPlayButton.a(feedPlayButton.getContext(), bVar.e));
        String str = bVar.d;
        ImageView c = fsc.c();
        if (str == null) {
            c.setImageDrawable(mtj.a);
        } else {
            picasso.a(str).a(mtj.a).a(c);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(u uVar, c cVar) {
        mtk mtk = (mtk) uVar;
        Picasso picasso = this.d;
        fsc fsc = (fsc) fqz.a(mtk.o, fsc.class);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        String str = cVar.b;
        spannableStringBuilder.append(cVar.a).append(" ").append(str);
        int length = spannableStringBuilder.length();
        spannableStringBuilder.setSpan(mtk.b, length - str.length(), length, 34);
        fsc.a(spannableStringBuilder);
        fsc.b(cVar.c);
        String str2 = cVar.d;
        ImageView c = fsc.c();
        if (str2 == null) {
            c.setImageDrawable(mtk.a);
        } else {
            picasso.a(str2).a(mtk.a).a(vhj.a(c));
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(u uVar, d dVar) {
        mtl mtl = (mtl) uVar;
        mtl.a.setText(mtl.o.getResources().getString(R.string.feed_view_full_entity, new Object[]{dVar.a}));
    }

    public final int a(int i) {
        return ((Integer) ((mtq) this.a.get(i)).a((gee<c, R_>) $$Lambda$mth$Crt8K2caKYQGBiWplY_Zzq3SwKI.INSTANCE, (gee<b, R_>) $$Lambda$mth$igUskS5fEu431bFxyYoq7ZrCwaQ.INSTANCE, (gee<d, R_>) $$Lambda$mth$SQx66559QtPoaMs3TThRQ3POK8U.INSTANCE, (gee<a, R_>) $$Lambda$mth$Ho1CEK5KJ8DYOJOKMlW1pteyS_g.INSTANCE)).intValue();
    }

    public final u a(ViewGroup viewGroup, int i) {
        if (3 == i) {
            return new mtf(this.e.inflate(R.layout.feed_artist_list, viewGroup, false), this.d, this.e);
        }
        if (i == 0) {
            return new mtk(viewGroup);
        }
        if (1 == i) {
            return new mtj(viewGroup);
        }
        if (2 == i) {
            return new mtl(this.e.inflate(R.layout.feed_list_view_all, viewGroup, false));
        }
        throw new IllegalArgumentException("Unknown view type");
    }

    public final void a(u uVar, int i) {
        ((mtq) this.a.get(i)).a((ged<c>) new $$Lambda$mth$x4e6BOkNXviPr2jjf4bxilY3bQ<c>(this, uVar), (ged<b>) new $$Lambda$mth$JVjIrExC1ohnEv76jrKcD0k54U<b>(this, uVar), (ged<d>) new $$Lambda$mth$1QMx8VVUhNzmSFM4IZGiSREUp4Y<d>(uVar), (ged<a>) new $$Lambda$mth$5iHMeIdwOGJQ9NX1_Kafc3G57WQ<a>(uVar));
    }

    public final int b() {
        return this.a.size();
    }
}
