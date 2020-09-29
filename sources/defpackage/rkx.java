package defpackage;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView.u;
import com.google.common.collect.Lists;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.mobile.android.util.SortOption;
import java.util.List;

/* renamed from: rkx reason: default package */
public final class rkx extends androidx.recyclerview.widget.RecyclerView.a<c> implements gkw {
    final b a;
    public List<SortOption> d = Lists.a();
    public SortOption e;

    /* renamed from: rkx$a */
    class a extends c {
        public a(ViewGroup viewGroup) {
            super(rkz.a(viewGroup.getContext(), viewGroup).getView());
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void a(SortOption sortOption, int i, View view) {
            rkx.this.a.onOptionClicked(sortOption, i);
        }

        public final void a(SortOption sortOption, int i) {
            rla rla = (rla) fqz.a(this.o, rla.class);
            rla.a(this.o.getContext().getResources().getString(sortOption.mResourceId));
            if (sortOption.equals(rkx.this.e)) {
                sortOption = rkx.this.e;
                SpotifyIconV2 spotifyIconV2 = !sortOption.mIsReversible ? SpotifyIconV2.CHECK : sortOption.b() ? SpotifyIconV2.ARROW_UP : SpotifyIconV2.ARROW_DOWN;
                rla.a(spotifyIconV2);
            } else {
                rla.a();
            }
            this.o.setOnClickListener(new $$Lambda$rkx$a$2Zb9TWBWLS6liN00jDM9Hvzx1UA(this, sortOption, i));
        }
    }

    /* renamed from: rkx$b */
    public interface b {
        void onOptionClicked(SortOption sortOption, int i);
    }

    /* renamed from: rkx$c */
    public static class c extends u {
        public c(View view) {
            super(view);
        }
    }

    public rkx(b bVar) {
        this.a = bVar;
        a(true);
    }

    public final /* synthetic */ u a(ViewGroup viewGroup, int i) {
        return new a(viewGroup);
    }

    public final /* synthetic */ void a(u uVar, int i) {
        ((a) ((c) uVar)).a((SortOption) this.d.get(i), i);
    }

    public final int b() {
        return this.d.size();
    }

    public final long b(int i) {
        return (long) ((SortOption) this.d.get(i)).mKey.hashCode();
    }
}
