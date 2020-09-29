package defpackage;

import android.graphics.drawable.Drawable;
import android.view.View;
import com.spotify.music.R;
import com.spotify.music.features.tasteonboarding.artistpicker.view.viewholder.ArtistView;
import com.spotify.music.features.tasteonboarding.model.TasteOnboardingItem;
import com.squareup.picasso.Picasso;

/* renamed from: qqm reason: default package */
public final class qqm extends ith<TasteOnboardingItem> {
    private final ArtistView a;
    private final a<TasteOnboardingItem> b;
    private final Picasso c;

    qqm(ArtistView artistView, a<TasteOnboardingItem> aVar, Picasso picasso) {
        super(artistView);
        this.a = artistView;
        this.b = aVar;
        this.c = picasso;
        this.a.c.setImageDrawable((Drawable) fbp.a(sa.a(this.a.getContext().getResources(), R.drawable.taste_onboarding_checkmark_flattened, null)));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(TasteOnboardingItem tasteOnboardingItem, View view) {
        int e = e();
        a<TasteOnboardingItem> aVar = this.b;
        if (aVar != null && e != -1) {
            aVar.onItemClick(e, this.a, tasteOnboardingItem);
        }
    }

    public final /* synthetic */ void a(Object obj, int i) {
        TasteOnboardingItem tasteOnboardingItem = (TasteOnboardingItem) obj;
        this.a.d.setText(tasteOnboardingItem.name());
        this.c.a(fbo.c(tasteOnboardingItem.image())).a(gaa.a(this.a.getContext())).b(gaa.a(this.a.getContext())).a((wgz) new vgz()).a(this.a.b);
        this.a.setOnClickListener(new $$Lambda$qqm$ndSICOf8TlEkbX2j73OWxfTGFcU(this, tasteOnboardingItem));
        if (tasteOnboardingItem.isLiked()) {
            this.a.c.setVisibility(0);
        } else {
            this.a.c.setVisibility(8);
        }
    }
}
