package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import com.spotify.android.glue.components.card.Card;
import com.spotify.android.glue.components.card.CardAppearance;
import com.spotify.android.glue.components.card.glue.CardView;

/* renamed from: frm reason: default package */
public final class frm extends frj {
    public final /* synthetic */ Card a(Context context, ViewGroup viewGroup) {
        return new frk(new CardView(context), CardAppearance.NO_TEXT);
    }

    public final frg a(Context context) {
        return new frk(new CardView(context), CardAppearance.TITLE_ONLY);
    }

    public final frh b(Context context) {
        return new frk(new CardView(context), CardAppearance.TITLE_AND_SUBTITLE);
    }

    public final frh c(Context context) {
        return new frk(new CardView(context), CardAppearance.TITLE_AND_METADATA);
    }

    public final Card d(Context context) {
        return new frk(new CardView(context), CardAppearance.DESCRIPTION_ONLY);
    }

    public final Card e(Context context) {
        return new frk(new CardView(context), CardAppearance.LARGE_DESCRIPTION_ONLY);
    }

    public final Card f(Context context) {
        return new frk(new CardView(context), CardAppearance.LARGE_NO_TEXT);
    }
}
