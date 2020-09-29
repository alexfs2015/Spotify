package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.a;
import com.spotify.music.R;
import com.squareup.picasso.Picasso;
import java.util.List;

/* renamed from: mti reason: default package */
public final class mti implements kmm<List<mtq>, sbj> {
    public final View a;
    /* access modifiers changed from: private */
    public final RecyclerView b = ((RecyclerView) this.a.findViewById(16908298));
    /* access modifiers changed from: private */
    public final LayoutInflater c;
    /* access modifiers changed from: private */
    public final Picasso d;

    public mti(LayoutInflater layoutInflater, ViewGroup viewGroup, Picasso picasso) {
        this.a = layoutInflater.inflate(R.layout.fragment_feed, viewGroup, false);
        this.c = layoutInflater;
        this.d = picasso;
    }

    public final kmn<List<mtq>> connect(knw<sbj> knw) {
        return new kmn<List<mtq>>() {
            public final /* synthetic */ void accept(Object obj) {
                mti.this.b.a((a) new mth((List) obj, mti.this.c, mti.this.d));
            }

            public final void dispose() {
            }
        };
    }
}
