package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageView;

public class AppCompatImageView extends ImageView implements io, jp {
    private final bo a;
    private final bs b;

    public AppCompatImageView(Context context) {
        this(context, null);
    }

    public AppCompatImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AppCompatImageView(Context context, AttributeSet attributeSet, int i) {
        super(cm.a(context), attributeSet, i);
        this.a = new bo(this);
        this.a.a(attributeSet, i);
        this.b = new bs(this);
        this.b.a(attributeSet, i);
    }

    public void setImageResource(int i) {
        bs bsVar = this.b;
        if (bsVar != null) {
            bsVar.a(i);
        }
    }

    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        bs bsVar = this.b;
        if (bsVar != null) {
            bsVar.d();
        }
    }

    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        bs bsVar = this.b;
        if (bsVar != null) {
            bsVar.d();
        }
    }

    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        bs bsVar = this.b;
        if (bsVar != null) {
            bsVar.d();
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        bo boVar = this.a;
        if (boVar != null) {
            boVar.a(i);
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        bo boVar = this.a;
        if (boVar != null) {
            boVar.a();
        }
    }

    public final void a(ColorStateList colorStateList) {
        bo boVar = this.a;
        if (boVar != null) {
            boVar.a(colorStateList);
        }
    }

    public final ColorStateList b_() {
        bo boVar = this.a;
        if (boVar != null) {
            return boVar.b();
        }
        return null;
    }

    public final void a(Mode mode) {
        bo boVar = this.a;
        if (boVar != null) {
            boVar.a(mode);
        }
    }

    public final Mode aA_() {
        bo boVar = this.a;
        if (boVar != null) {
            return boVar.c();
        }
        return null;
    }

    public final void b(ColorStateList colorStateList) {
        bs bsVar = this.b;
        if (bsVar != null) {
            bsVar.a(colorStateList);
        }
    }

    public final ColorStateList U_() {
        bs bsVar = this.b;
        if (bsVar != null) {
            return bsVar.b();
        }
        return null;
    }

    public final void b(Mode mode) {
        bs bsVar = this.b;
        if (bsVar != null) {
            bsVar.a(mode);
        }
    }

    public final Mode d() {
        bs bsVar = this.b;
        if (bsVar != null) {
            return bsVar.c();
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        bo boVar = this.a;
        if (boVar != null) {
            boVar.d();
        }
        bs bsVar = this.b;
        if (bsVar != null) {
            bsVar.d();
        }
    }

    public boolean hasOverlappingRendering() {
        return this.b.a() && super.hasOverlappingRendering();
    }
}
