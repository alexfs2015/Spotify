package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.spotify.music.R;
import com.spotify.music.features.tasteonboarding.model.TasteOnboardingItem;

/* renamed from: qli reason: default package */
public final class qli extends iqu<TasteOnboardingItem> {
    private final ImageView a;
    private final TextView b;
    private final a<TasteOnboardingItem> c;
    private final uvf d;
    private final int e = this.o.getResources().getDimensionPixelSize(R.dimen.free_tier_taste_onboarding_artist_search_image_size);
    private final boolean f;

    public final /* synthetic */ void a(Object obj, int i) {
        TasteOnboardingItem tasteOnboardingItem = (TasteOnboardingItem) obj;
        this.b.setText(tasteOnboardingItem.name());
        if (this.f) {
            uuu.a(this.b.getContext(), this.b, 2132017665);
        }
        this.o.setOnClickListener(new $$Lambda$qli$sCtHGZs5VSHreHJDI1Nua9dBi7Q(this, tasteOnboardingItem));
        vsl a2 = this.d.a(tasteOnboardingItem.findSuitableImage(this.e)).a(fzg.a(this.o.getContext()));
        int i2 = this.e;
        a2.b(i2, i2).d().f().a(uvt.a(this.a));
    }

    public qli(fre fre, a<TasteOnboardingItem> aVar, uvf uvf, boolean z) {
        super(fre.getView());
        this.c = (a) fay.a(aVar);
        this.d = (uvf) fay.a(uvf);
        this.a = (ImageView) fay.a(fre.c());
        this.b = (TextView) fay.a(fre.b());
        this.f = z;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(TasteOnboardingItem tasteOnboardingItem, View view) {
        this.c.onItemClick(e(), view, tasteOnboardingItem);
    }
}
