package defpackage;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import com.spotify.android.glue.components.card.Card.TextLayout;
import com.spotify.android.glue.components.card.CardAppearance;
import com.spotify.android.glue.components.card.glue.CardView;
import com.spotify.music.R;
import com.spotify.paste.graphics.drawable.CardAccessoryDrawable;

/* renamed from: fqq reason: default package */
public final class fqq implements fqm, fqn {
    private final CardView a;

    fqq(View view, CardAppearance cardAppearance) {
        this.a = (CardView) view;
        CardView cardView = this.a;
        switch (cardAppearance) {
            case NO_TEXT:
                cardView.b.setVisibility(4);
                cardView.c.setVisibility(4);
                break;
            case TITLE_ONLY:
                cardView.b.setVisibility(0);
                cardView.c.setVisibility(4);
                break;
            case TITLE_AND_SUBTITLE:
                uuu.b(cardView.getContext(), cardView.c, R.attr.pasteTextAppearanceBodySmall);
                cardView.b.setVisibility(0);
                cardView.c.setTextColor(fr.c(cardView.getContext(), R.color.white_70));
                cardView.c.setVisibility(0);
                break;
            case TITLE_AND_METADATA:
                uuu.b(cardView.getContext(), cardView.c, R.attr.pasteTextAppearanceMetadata);
                cardView.b.setVisibility(0);
                cardView.c.setTextColor(fr.c(cardView.getContext(), R.color.white_70));
                cardView.c.setVisibility(0);
                break;
            case DESCRIPTION_ONLY:
                uuu.b(cardView.getContext(), cardView.b, R.attr.pasteTextAppearanceBodySmall);
                cardView.b.setVisibility(0);
                cardView.b.setTextColor(fr.c(cardView.getContext(), R.color.white_70));
                cardView.c.setVisibility(8);
                cardView.a(TextLayout.DOUBLE_LINE_TITLE);
                fze.a((View) cardView.b, uts.b(24.0f, cardView.getResources()));
                fze.b(cardView.b, uts.b(8.0f, cardView.getResources()));
                break;
            case LARGE_DESCRIPTION_ONLY:
                uuu.b(cardView.getContext(), cardView.b, R.attr.pasteTextAppearanceBodyMedium);
                cardView.b.setVisibility(0);
                cardView.b.setTextColor(fr.c(cardView.getContext(), R.color.white_70));
                cardView.c.setVisibility(8);
                cardView.e = 0.66f;
                cardView.a(TextLayout.DOUBLE_LINE_TITLE);
                fze.a(cardView.b, uts.b(24.0f, cardView.getResources()));
                fze.a((View) cardView.b, uts.b(24.0f, cardView.getResources()));
                fze.b(cardView.b, uts.b(8.0f, cardView.getResources()));
                break;
            case LARGE_NO_TEXT:
                cardView.b.setVisibility(8);
                cardView.c.setVisibility(8);
                cardView.e = 0.66f;
                break;
            default:
                StringBuilder sb = new StringBuilder("Unsupported CardAppearance: ");
                sb.append(cardAppearance);
                throw new IllegalArgumentException(sb.toString());
        }
        fze.a((View) cardView);
    }

    public final void a(CharSequence charSequence) {
        this.a.a(charSequence);
    }

    public final void a(CharSequence charSequence, Drawable drawable) {
        if (drawable == null) {
            a(charSequence);
        } else {
            this.a.a(fqr.a(charSequence, drawable));
        }
    }

    public final void b(CharSequence charSequence) {
        this.a.c.setText(charSequence);
    }

    public final void a(TextLayout textLayout) {
        this.a.a(textLayout);
    }

    public final void a(CardAccessoryDrawable cardAccessoryDrawable) {
        CardView cardView = this.a;
        cardView.d = cardAccessoryDrawable;
        cardView.postInvalidate();
    }

    public final ImageView a() {
        return this.a.a;
    }

    public final View getView() {
        return this.a;
    }

    public final void a(boolean z) {
        this.a.a(z);
    }
}
