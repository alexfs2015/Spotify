package defpackage;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import com.spotify.android.glue.components.card.Card.TextLayout;
import com.spotify.android.glue.components.card.CardAppearance;
import com.spotify.android.glue.components.card.glue.CardView;
import com.spotify.music.R;
import com.spotify.paste.graphics.drawable.CardAccessoryDrawable;

/* renamed from: frk reason: default package */
public final class frk implements frg, frh {
    private final CardView a;

    frk(View view, CardAppearance cardAppearance) {
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
                vgl.b(cardView.getContext(), cardView.c, R.attr.pasteTextAppearanceBodySmall);
                cardView.b.setVisibility(0);
                cardView.c.setTextColor(fr.c(cardView.getContext(), R.color.white_70));
                cardView.c.setVisibility(0);
                break;
            case TITLE_AND_METADATA:
                vgl.b(cardView.getContext(), cardView.c, R.attr.pasteTextAppearanceMetadata);
                cardView.b.setVisibility(0);
                cardView.c.setTextColor(fr.c(cardView.getContext(), R.color.white_70));
                cardView.c.setVisibility(0);
                break;
            case DESCRIPTION_ONLY:
                vgl.b(cardView.getContext(), cardView.b, R.attr.pasteTextAppearanceBodySmall);
                cardView.b.setVisibility(0);
                cardView.b.setTextColor(fr.c(cardView.getContext(), R.color.white_70));
                cardView.c.setVisibility(8);
                cardView.a(TextLayout.DOUBLE_LINE_TITLE);
                fzy.a((View) cardView.b, vfj.b(24.0f, cardView.getResources()));
                fzy.b(cardView.b, vfj.b(8.0f, cardView.getResources()));
                break;
            case LARGE_DESCRIPTION_ONLY:
                vgl.b(cardView.getContext(), cardView.b, R.attr.pasteTextAppearanceBodyMedium);
                cardView.b.setVisibility(0);
                cardView.b.setTextColor(fr.c(cardView.getContext(), R.color.white_70));
                cardView.c.setVisibility(8);
                cardView.e = 0.66f;
                cardView.a(TextLayout.DOUBLE_LINE_TITLE);
                fzy.a(cardView.b, vfj.b(24.0f, cardView.getResources()));
                fzy.a((View) cardView.b, vfj.b(24.0f, cardView.getResources()));
                fzy.b(cardView.b, vfj.b(8.0f, cardView.getResources()));
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
        fzy.a((View) cardView);
    }

    public final ImageView a() {
        return this.a.a;
    }

    public final void a(TextLayout textLayout) {
        this.a.a(textLayout);
    }

    public final void a(CardAccessoryDrawable cardAccessoryDrawable) {
        CardView cardView = this.a;
        cardView.d = cardAccessoryDrawable;
        cardView.postInvalidate();
    }

    public final void a(CharSequence charSequence) {
        this.a.a(charSequence);
    }

    public final void a(CharSequence charSequence, Drawable drawable) {
        if (drawable == null) {
            a(charSequence);
        } else {
            this.a.a(frl.a(charSequence, drawable));
        }
    }

    public final void a(boolean z) {
        this.a.a(z);
    }

    public final void b(CharSequence charSequence) {
        this.a.c.setText(charSequence);
    }

    public final View getView() {
        return this.a;
    }
}
