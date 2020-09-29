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

/* renamed from: moy reason: default package */
final class moy extends a<u> implements gjl {
    private final ImmutableList<mph> a;
    private final Picasso d;
    private final LayoutInflater e;

    moy(List<mph> list, LayoutInflater layoutInflater, Picasso picasso) {
        this.a = ImmutableList.a((Collection<? extends E>) list);
        this.d = picasso;
        this.e = layoutInflater;
    }

    public final u a(ViewGroup viewGroup, int i) {
        if (3 == i) {
            return new mow(this.e.inflate(R.layout.feed_artist_list, viewGroup, false), this.d, this.e);
        }
        if (i == 0) {
            return new mpb(viewGroup);
        }
        if (1 == i) {
            return new mpa(viewGroup);
        }
        if (2 == i) {
            return new mpc(this.e.inflate(R.layout.feed_list_view_all, viewGroup, false));
        }
        throw new IllegalArgumentException("Unknown view type");
    }

    public final void a(u uVar, int i) {
        ((mph) this.a.get(i)).a((gcs<c>) new $$Lambda$moy$FFwNWyclsNSUSwX5U550NUUSsE<c>(this, uVar), (gcs<b>) new $$Lambda$moy$FOpKFdULvb5EAEPWeYZ1Scug92E<b>(this, uVar), (gcs<d>) new $$Lambda$moy$ZWFVPAfpZj1igDA3QeMSmPhvy6k<d>(uVar), (gcs<a>) new $$Lambda$moy$DvnW5NQsEBwWg4zcfRrrzSqjAUw<a>(uVar));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(u uVar, c cVar) {
        mpb mpb = (mpb) uVar;
        Picasso picasso = this.d;
        fri fri = (fri) fqf.a(mpb.o, fri.class);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        String str = cVar.b;
        spannableStringBuilder.append(cVar.a).append(" ").append(str);
        int length = spannableStringBuilder.length();
        spannableStringBuilder.setSpan(mpb.b, length - str.length(), length, 34);
        fri.a(spannableStringBuilder);
        fri.b(cVar.c);
        String str2 = cVar.d;
        ImageView c = fri.c();
        if (str2 == null) {
            c.setImageDrawable(mpb.a);
        } else {
            picasso.a(str2).a(mpb.a).a(uvt.a(c));
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(u uVar, b bVar) {
        mpa mpa = (mpa) uVar;
        Picasso picasso = this.d;
        fri fri = (fri) fqf.a(mpa.o, fri.class);
        fri.a(bVar.a);
        fri.b(mpa.o.getResources().getQuantityString(R.plurals.feed_number_of_songs, bVar.c, new Object[]{bVar.b, Integer.valueOf(bVar.c)}));
        FeedPlayButton feedPlayButton = mpa.b;
        feedPlayButton.setBackground(feedPlayButton.a(feedPlayButton.getContext(), bVar.e));
        String str = bVar.d;
        ImageView c = fri.c();
        if (str == null) {
            c.setImageDrawable(mpa.a);
        } else {
            picasso.a(str).a(mpa.a).a(c);
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(u uVar, d dVar) {
        mpc mpc = (mpc) uVar;
        mpc.a.setText(mpc.o.getResources().getString(R.string.feed_view_full_entity, new Object[]{dVar.a}));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(u uVar, a aVar) {
        mow mow = (mow) uVar;
        mow.a.a((a) new mox(aVar.a, mow.b, mow.c));
    }

    public final int b() {
        return this.a.size();
    }

    public final int a(int i) {
        return ((Integer) ((mph) this.a.get(i)).a((gct<c, R_>) $$Lambda$moy$OUXKkSQOGfgG_7QAYjLugBFMVU.INSTANCE, (gct<b, R_>) $$Lambda$moy$j2iA4Ox7IGzu4e201aeQrwFlaT8.INSTANCE, (gct<d, R_>) $$Lambda$moy$yWR1DWp8lo3MonrUWyKmUEYKhw.INSTANCE, (gct<a, R_>) $$Lambda$moy$OPgNjpOR5qFIr2k5L6Be0J87mJw.INSTANCE)).intValue();
    }
}
