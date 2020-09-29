package defpackage;

import android.view.View;
import com.spotify.mobile.android.glue.GlueLayoutTraits.Trait;
import com.spotify.music.R;
import java.util.EnumSet;

/* renamed from: gyf reason: default package */
public final class gyf extends hdo<View> implements gxl<View> {
    public gyf() {
        super(R.layout.loading_view_indeterminate);
    }

    public final EnumSet<Trait> a() {
        return EnumSet.of(Trait.SPINNER);
    }
}
