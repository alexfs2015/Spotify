package defpackage;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import com.google.android.material.card.MaterialCardView;

/* renamed from: ezn reason: default package */
public final class ezn {
    public final MaterialCardView a;
    public int b;
    public int c;

    public ezn(MaterialCardView materialCardView) {
        this.a = materialCardView;
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

    public final void a() {
        this.a.setForeground(b());
    }
}
