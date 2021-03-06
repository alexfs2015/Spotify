package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.spotify.android.glue.internal.StateListAnimatorImageButton;

/* renamed from: fyr reason: default package */
public final class fyr extends hu {
    final Menu a;

    public final View a() {
        return null;
    }

    public fyr(Context context, Menu menu) {
        super(context);
        this.a = menu;
    }

    public final View a(final MenuItem menuItem) {
        if (menuItem.getIcon() == null) {
            TextView a2 = fzz.a(this.b);
            a2.setText(menuItem.getTitle());
            uui.c(a2).a(a2).a();
            a2.setOnClickListener(new OnClickListener() {
                public final void onClick(View view) {
                    fyr.this.a.performIdentifierAction(menuItem.getItemId(), 0);
                }
            });
            return a2;
        }
        StateListAnimatorImageButton stateListAnimatorImageButton = new StateListAnimatorImageButton(this.b);
        stateListAnimatorImageButton.setImageDrawable(menuItem.getIcon());
        ip.a((View) stateListAnimatorImageButton, (Drawable) null);
        stateListAnimatorImageButton.setContentDescription(menuItem.getTitle());
        stateListAnimatorImageButton.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                fyr.this.a.performIdentifierAction(menuItem.getItemId(), 0);
            }
        });
        stateListAnimatorImageButton.setOnLongClickListener(new fzi());
        return stateListAnimatorImageButton;
    }
}
