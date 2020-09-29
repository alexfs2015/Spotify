package defpackage;

import android.graphics.Color;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.spotify.base.java.logging.Logger;
import com.spotify.music.R;
import com.spotify.music.features.tasteonboarding.model.TasteOnboardingItem;

/* renamed from: qqn reason: default package */
public final class qqn extends ith<TasteOnboardingItem> {
    private final a<TasteOnboardingItem> a;
    private final ImageView b = ((ImageView) fbp.a(this.o.findViewById(R.id.image)));
    private final ImageView c = ((ImageView) fbp.a(this.o.findViewById(R.id.flatbg)));
    private final TextView d = ((TextView) fbp.a(this.o.findViewById(R.id.name)));

    qqn(int i, ViewGroup viewGroup, a<TasteOnboardingItem> aVar) {
        super(a(i, viewGroup));
        this.a = aVar;
    }

    private int a(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                return Color.parseColor(str);
            } catch (IllegalArgumentException e) {
                Logger.e(e, "Failed to parse the genre color. Falling back to the default color", new Object[0]);
            }
        }
        return this.o.getResources().getColor(R.color.genre_default_color);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(TasteOnboardingItem tasteOnboardingItem, View view) {
        int e = e();
        a<TasteOnboardingItem> aVar = this.a;
        if (aVar != null && e != -1) {
            aVar.onItemClick(e, this.o, tasteOnboardingItem);
        }
    }

    public final /* synthetic */ void a(Object obj, int i) {
        TasteOnboardingItem tasteOnboardingItem = (TasteOnboardingItem) obj;
        Drawable drawable = this.o.getContext().getResources().getDrawable(R.drawable.taste_onboarding_genre_background);
        drawable.setColorFilter(a(tasteOnboardingItem.color()), Mode.SRC_ATOP);
        this.c.setVisibility(0);
        this.c.setImageDrawable(drawable);
        this.b.setVisibility(8);
        this.d.setText(this.o.getResources().getString(R.string.free_tier_taste_onboarding_artist_picker_genre_more_sthlm_blk, new Object[]{tasteOnboardingItem.name()}));
        this.o.setOnClickListener(new $$Lambda$qqn$xQo2fvWZgTRXkZG5ReexIqCIaM(this, tasteOnboardingItem));
    }
}
