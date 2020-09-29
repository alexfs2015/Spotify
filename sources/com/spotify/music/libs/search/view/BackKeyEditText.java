package com.spotify.music.libs.search.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import androidx.appcompat.widget.AppCompatEditText;

public class BackKeyEditText extends AppCompatEditText {
    a a;

    public interface a {
        boolean onBackPressed();
    }

    public BackKeyEditText(Context context) {
        this(context, null);
    }

    public BackKeyEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842862);
    }

    public BackKeyEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        gap.a(this, context, attributeSet, i);
    }

    public boolean onKeyPreIme(int i, KeyEvent keyEvent) {
        if (i == 4 && keyEvent.getAction() == 1) {
            a aVar = this.a;
            if (aVar != null) {
                return aVar.onBackPressed();
            }
        }
        return super.onKeyPreIme(i, keyEvent);
    }
}
