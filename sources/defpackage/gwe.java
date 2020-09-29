package defpackage;

import android.view.View;
import com.spotify.mobile.android.glue.GlueLayoutTraits.Trait;
import com.spotify.music.R;
import java.util.EnumSet;

/* renamed from: gwe reason: default package */
public final class gwe extends hav<View> implements gvl<View> {
    public gwe() {
        super(R.layout.loading_view_indeterminate);
    }

    public final EnumSet<Trait> a() {
        return EnumSet.of(Trait.SPINNER);
    }
}
