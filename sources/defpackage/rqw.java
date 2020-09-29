package defpackage;

import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.music.homecomponents.card.HomeCardViewBinder.CardSize;

/* renamed from: rqw reason: default package */
public final class rqw {
    private final DisplayMetrics a;
    private final Resources b;

    public rqw(DisplayMetrics displayMetrics, Resources resources) {
        this.a = displayMetrics;
        this.b = resources;
    }

    private int a(float f, int i) {
        int i2 = (int) (((float) this.a.widthPixels) * f);
        int b2 = vfj.b((float) i, this.b);
        return i2 < b2 ? i2 : b2;
    }

    private int a(CardSize cardSize) {
        return (cardSize == CardSize.LARGE || cardSize == CardSize.MEDIUM) ? vfj.b(12.0f, this.b) : vfj.b(7.0f, this.b);
    }

    public final void a(View view, CardSize cardSize) {
        fbp.a(view);
        fbp.a(cardSize);
        int a2 = a(cardSize.mPercentage, cardSize.mMaxWidth);
        LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            view.setLayoutParams(new LayoutParams(a2, -2));
        } else {
            layoutParams.width = a2;
        }
    }

    public final void a(ImageView imageView, CardSize cardSize) {
        fbp.a(imageView);
        fbp.a(cardSize);
        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) imageView.getLayoutParams();
        layoutParams.width = a(cardSize.mPercentage, cardSize.mMaxWidth);
        layoutParams.bottomMargin = a(cardSize);
        imageView.setLayoutParams(layoutParams);
    }
}
