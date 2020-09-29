package com.spotify.termsandconditions;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import com.spotify.music.R;

public class TermsAndConditionsView extends AppCompatTextView {
    public final vog a = new vog();

    public TermsAndConditionsView(Context context) {
        super(context);
        a(context);
    }

    public TermsAndConditionsView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context);
    }

    private void a(Context context) {
        uuu.a(context, this, R.style.SignUpTocTextAppearance);
        c();
    }

    public final void c() {
        Resources resources = getResources();
        this.a.a(this, fau.a("<p>").a(resources.getString(vof.terms_and_conditions_text_terms_and_conditions), resources.getString(vof.terms_and_conditions_text_privacy_policy), new Object[0]));
    }

    public final void d() {
        Resources resources = getResources();
        this.a.a(this, fau.a("<p>").a(resources.getString(vof.terms_and_conditions_text_terms_and_conditions), resources.getString(vof.terms_and_conditions_text_privacy_policy), resources.getString(vof.terms_and_conditions_text_choose_username_accept_tos_email_optout_info)));
    }

    public final void a(View view) {
        post(new Runnable(view) {
            private final /* synthetic */ View f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                TermsAndConditionsView.this.b(this.f$1);
            }
        });
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(View view) {
        Rect rect = new Rect();
        if (!(getGlobalVisibleRect(rect) && getHeight() == rect.height() && getWidth() == rect.width())) {
            ViewGroup viewGroup = (ViewGroup) getParent();
            int indexOfChild = viewGroup.indexOfChild(this);
            int indexOfChild2 = viewGroup.indexOfChild(view);
            viewGroup.removeView(this);
            viewGroup.addView(this, indexOfChild2);
            viewGroup.removeView(view);
            viewGroup.addView(view, indexOfChild);
        }
    }
}
