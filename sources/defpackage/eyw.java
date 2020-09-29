package defpackage;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import com.google.android.material.card.MaterialCardView;

/* renamed from: eyw reason: default package */
public final class eyw {
    public final MaterialCardView a;
    public int b;
    public int c;

    public eyw(MaterialCardView materialCardView) {
        this.a = materialCardView;
    }

    public final void a() {
        this.a.setForeground(b());
    }

    private Drawable b() {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(this.a.O_());
        int i = this.b;
        if (i != -1) {
            gradientDrawable.setStroke(this.c, i);
        }
        return gradientDrawable;
    }
}
