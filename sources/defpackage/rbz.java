package defpackage;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView.u;
import com.google.common.collect.Lists;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.mobile.android.util.SortOption;
import java.util.List;

/* renamed from: rbz reason: default package */
public final class rbz extends androidx.recyclerview.widget.RecyclerView.a<c> implements gjl {
    final b a;
    public List<SortOption> d = Lists.a();
    public SortOption e;

    /* renamed from: rbz$a */
    class a extends c {
        public a(ViewGroup viewGroup) {
            super(rcb.a(viewGroup.getContext(), viewGroup).getView());
        }

        public final void a(SortOption sortOption, int i) {
            SpotifyIconV2 spotifyIconV2;
            rcc rcc = (rcc) fqf.a(this.o, rcc.class);
            rcc.a(this.o.getContext().getResources().getString(sortOption.mResourceId));
            if (sortOption.equals(rbz.this.e)) {
                sortOption = rbz.this.e;
                if (!sortOption.mIsReversible) {
                    spotifyIconV2 = SpotifyIconV2.CHECK;
                } else if (sortOption.b()) {
                    spotifyIconV2 = SpotifyIconV2.ARROW_UP;
                } else {
                    spotifyIconV2 = SpotifyIconV2.ARROW_DOWN;
                }
                rcc.a(spotifyIconV2);
            } else {
                rcc.a();
            }
            this.o.setOnClickListener(new $$Lambda$rbz$a$y7B4r3EDsadvTdIwa46fp99uoc(this, sortOption, i));
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void a(SortOption sortOption, int i, View view) {
            rbz.this.a.onOptionClicked(sortOption, i);
        }
    }

    /* renamed from: rbz$b */
    public interface b {
        void onOptionClicked(SortOption sortOption, int i);
    }

    /* renamed from: rbz$c */
    public static class c extends u {
        public c(View view) {
            super(view);
        }
    }

    public final /* synthetic */ void a(u uVar, int i) {
        ((a) ((c) uVar)).a((SortOption) this.d.get(i), i);
    }

    public rbz(b bVar) {
        this.a = bVar;
        a(true);
    }

    public final int b() {
        return this.d.size();
    }

    public final long b(int i) {
        return (long) ((SortOption) this.d.get(i)).mKey.hashCode();
    }

    public final /* synthetic */ u a(ViewGroup viewGroup, int i) {
        return new a(viewGroup);
    }
}
