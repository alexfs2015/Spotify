package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import com.spotify.android.glue.components.card.Card;
import com.spotify.android.glue.components.card.CardAppearance;
import com.spotify.android.glue.components.card.glue.CardView;

/* renamed from: fqs reason: default package */
public final class fqs extends fqp {
    public final fqm a(Context context) {
        return new fqq(new CardView(context), CardAppearance.TITLE_ONLY);
    }

    public final fqn b(Context context) {
        return new fqq(new CardView(context), CardAppearance.TITLE_AND_SUBTITLE);
    }

    public final fqn c(Context context) {
        return new fqq(new CardView(context), CardAppearance.TITLE_AND_METADATA);
    }

    public final Card d(Context context) {
        return new fqq(new CardView(context), CardAppearance.DESCRIPTION_ONLY);
    }

    public final Card e(Context context) {
        return new fqq(new CardView(context), CardAppearance.LARGE_DESCRIPTION_ONLY);
    }

    public final Card f(Context context) {
        return new fqq(new CardView(context), CardAppearance.LARGE_NO_TEXT);
    }

    public final /* synthetic */ Card a(Context context, ViewGroup viewGroup) {
        return new fqq(new CardView(context), CardAppearance.NO_TEXT);
    }
}
