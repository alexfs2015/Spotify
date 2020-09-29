package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;
import androidx.appcompat.widget.ActionBarContainer;

/* renamed from: bl reason: default package */
public final class bl extends Drawable {
    private ActionBarContainer a;

    public bl(ActionBarContainer actionBarContainer) {
        this.a = actionBarContainer;
    }

    public final void draw(Canvas canvas) {
        if (!this.a.e) {
            if (this.a.b != null) {
                this.a.b.draw(canvas);
            }
            if (this.a.c != null && this.a.f) {
                this.a.c.draw(canvas);
            }
        } else if (this.a.d != null) {
            this.a.d.draw(canvas);
        }
    }

    public final int getOpacity() {
        return 0;
    }

    public final void getOutline(Outline outline) {
        if (this.a.e) {
            if (this.a.d != null) {
                this.a.d.getOutline(outline);
            }
        } else if (this.a.b != null) {
            this.a.b.getOutline(outline);
        }
    }

    public final void setAlpha(int i) {
    }

    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
