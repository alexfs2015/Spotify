package com.spotify.music.homecomponents.card;

import android.graphics.drawable.Drawable;
import android.net.Uri;

public interface HomeCardViewBinder extends fqy {

    public enum CardSize {
        SMALL(0.3f, 144),
        MEDIUM(0.4f, 200),
        LARGE(0.5f, 256);
        
        public final int mMaxWidth;
        public final float mPercentage;

        private CardSize(float f, int i) {
            this.mPercentage = f;
            this.mMaxWidth = i;
        }
    }

    public enum CardTextLines {
        ONE_LINE(1),
        TWO_LINES(2);
        
        public final int value;

        private CardTextLines(int i) {
            this.value = i;
        }
    }

    void a();

    void a(Drawable drawable);

    void a(Uri uri, Drawable drawable, String str);

    void a(CardSize cardSize);

    void a(CardTextLines cardTextLines);

    void a(CharSequence charSequence);

    void b();

    void b(CardTextLines cardTextLines);

    void b(CharSequence charSequence);

    void c();

    void d();
}
