package defpackage;

import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout.LayoutParams;
import com.spotify.music.homecomponents.card.HomeCardViewBinder.CardSize;

/* renamed from: rhu reason: default package */
public final class rhu {
    private final DisplayMetrics a;
    private final Resources b;

    public rhu(DisplayMetrics displayMetrics, Resources resources) {
        this.a = displayMetrics;
        this.b = resources;
    }

    public final void a(ImageView imageView, CardSize cardSize) {
        fay.a(imageView);
        fay.a(cardSize);
        LayoutParams layoutParams = (LayoutParams) imageView.getLayoutParams();
        layoutParams.width = a(cardSize.mPercentage, cardSize.mMaxWidth);
        layoutParams.bottomMargin = a(cardSize);
        imageView.setLayoutParams(layoutParams);
    }

    public final void a(View view, CardSize cardSize) {
        fay.a(view);
        fay.a(cardSize);
        int a2 = a(cardSize.mPercentage, cardSize.mMaxWidth);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            view.setLayoutParams(new ViewGroup.LayoutParams(a2, -2));
        } else {
            layoutParams.width = a2;
        }
    }

    private int a(float f, int i) {
        int i2 = (int) (((float) this.a.widthPixels) * f);
        int b2 = uts.b((float) i, this.b);
        return i2 < b2 ? i2 : b2;
    }

    private int a(CardSize cardSize) {
        if (cardSize == CardSize.LARGE || cardSize == CardSize.MEDIUM) {
            return uts.b(12.0f, this.b);
        }
        return uts.b(7.0f, this.b);
    }
}
