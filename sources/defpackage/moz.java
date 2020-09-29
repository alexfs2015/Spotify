package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.a;
import com.spotify.music.R;
import com.squareup.picasso.Picasso;
import java.util.List;

/* renamed from: moz reason: default package */
public final class moz implements kjd<List<mph>, rsc> {
    public final View a;
    /* access modifiers changed from: private */
    public final RecyclerView b = ((RecyclerView) this.a.findViewById(16908298));
    /* access modifiers changed from: private */
    public final LayoutInflater c;
    /* access modifiers changed from: private */
    public final Picasso d;

    public moz(LayoutInflater layoutInflater, ViewGroup viewGroup, Picasso picasso) {
        this.a = layoutInflater.inflate(R.layout.fragment_feed, viewGroup, false);
        this.c = layoutInflater;
        this.d = picasso;
    }

    public final kje<List<mph>> connect(kkn<rsc> kkn) {
        return new kje<List<mph>>() {
            public final void dispose() {
            }

            public final /* synthetic */ void accept(Object obj) {
                moz.this.b.a((a) new moy((List) obj, moz.this.c, moz.this.d));
            }
        };
    }
}
