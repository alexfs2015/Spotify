package com.spotify.android.glue.components.card;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.spotify.paste.graphics.drawable.CardAccessoryDrawable;

public interface Card extends fqx, fqy {

    public enum TextLayout {
        DEFAULT,
        DOUBLE_LINE_TITLE,
        DOUBLE_LINE_SUBTITLE;

        static {
            values();
        }
    }

    ImageView a();

    void a(TextLayout textLayout);

    void a(CardAccessoryDrawable cardAccessoryDrawable);

    void a(CharSequence charSequence);

    void a(CharSequence charSequence, Drawable drawable);
}
