package defpackage;

import android.graphics.Color;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.spotify.music.R;
import com.spotify.music.features.tasteonboarding.model.TasteOnboardingItem;
import com.squareup.picasso.Picasso;

/* renamed from: qid reason: default package */
public final class qid extends iqu<TasteOnboardingItem> {
    private final a<TasteOnboardingItem> a;
    private final ImageView b = ((ImageView) fay.a(this.o.findViewById(R.id.image)));
    private final ImageView c = ((ImageView) fay.a(this.o.findViewById(R.id.flatbg)));
    private final TextView d = ((TextView) fay.a(this.o.findViewById(R.id.name)));
    private final Picasso e;
    private final int f;
    private final boolean g;

    public final /* synthetic */ void a(Object obj, int i) {
        TasteOnboardingItem tasteOnboardingItem = (TasteOnboardingItem) obj;
        int i2 = this.f / 3;
        if (this.g) {
            Drawable drawable = this.o.getContext().getResources().getDrawable(R.drawable.taste_onboarding_genre_background);
            drawable.setColorFilter(Color.parseColor(tasteOnboardingItem.color()), Mode.SRC_ATOP);
            this.c.setVisibility(0);
            this.c.setImageDrawable(drawable);
            this.b.setVisibility(8);
        } else {
            this.e.a(tasteOnboardingItem.image()).b(i2, i2).d().f().a(uvt.a(this.b));
        }
        if (this.g) {
            this.d.setText(this.o.getResources().getString(R.string.free_tier_taste_onboarding_artist_picker_genre_more_sthlm_blk, new Object[]{tasteOnboardingItem.name()}));
        } else {
            this.d.setText(this.o.getResources().getString(R.string.free_tier_taste_onboarding_artist_picker_genre_more, new Object[]{tasteOnboardingItem.name()}));
        }
        this.o.setOnClickListener(new $$Lambda$qid$_PoQ1uJKA_9ftrnGh7i848vriY(this, tasteOnboardingItem));
    }

    qid(int i, ViewGroup viewGroup, a<TasteOnboardingItem> aVar, Picasso picasso, int i2, boolean z) {
        super(a(i, viewGroup));
        this.a = aVar;
        this.f = i2;
        this.e = picasso;
        this.g = z;
        uui.a(this.o).b(this.c).a(this.d).a();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(TasteOnboardingItem tasteOnboardingItem, View view) {
        int e2 = e();
        a<TasteOnboardingItem> aVar = this.a;
        if (aVar != null && e2 != -1) {
            aVar.onItemClick(e2, this.o, tasteOnboardingItem);
        }
    }
}
