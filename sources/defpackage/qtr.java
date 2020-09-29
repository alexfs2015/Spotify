package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.spotify.music.R;
import com.spotify.music.features.tasteonboarding.model.TasteOnboardingItem;

/* renamed from: qtr reason: default package */
public final class qtr extends ith<TasteOnboardingItem> {
    private final ImageView a;
    private final TextView b;
    private final a<TasteOnboardingItem> c;
    private final vgw d;
    private final int e = this.o.getResources().getDimensionPixelSize(R.dimen.free_tier_taste_onboarding_artist_search_image_size);

    public qtr(fry fry, a<TasteOnboardingItem> aVar, vgw vgw) {
        super(fry.getView());
        this.c = (a) fbp.a(aVar);
        this.d = (vgw) fbp.a(vgw);
        this.a = (ImageView) fbp.a(fry.c());
        this.b = (TextView) fbp.a(fry.b());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(TasteOnboardingItem tasteOnboardingItem, View view) {
        this.c.onItemClick(e(), view, tasteOnboardingItem);
    }

    public final /* synthetic */ void a(Object obj, int i) {
        TasteOnboardingItem tasteOnboardingItem = (TasteOnboardingItem) obj;
        this.b.setText(tasteOnboardingItem.name());
        vgl.a(this.b.getContext(), this.b, 2132017668);
        this.o.setOnClickListener(new $$Lambda$qtr$DbERufZuBwAduzRBvqrpw9AlfBg(this, tasteOnboardingItem));
        wgr a2 = this.d.a(tasteOnboardingItem.findSuitableImage(this.e)).a(gaa.a(this.o.getContext()));
        int i2 = this.e;
        a2.b(i2, i2).d().f().a(vhj.a(this.a));
    }
}
