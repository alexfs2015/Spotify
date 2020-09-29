package defpackage;

import android.view.View;
import android.view.ViewGroup;
import com.spotify.mobile.android.glue.GlueLayoutTraits.Trait;
import com.spotify.mobile.android.hubframework.defaults.HubsComponentCategory;
import com.spotify.music.R;
import java.util.EnumSet;

/* renamed from: rrh reason: default package */
public final class rrh implements rnx<View> {
    public static final hck a = hcv.create("home:sectionHeader", HubsComponentCategory.SECTION_HEADER.mId);

    public final View a(ViewGroup viewGroup, gwm gwm) {
        rrj rrj = new rrj(viewGroup.getContext(), viewGroup);
        fqz.a(rrj);
        return rrj.getView();
    }

    public final EnumSet<Trait> a() {
        return EnumSet.of(Trait.SPACED_VERTICALLY);
    }

    public final void a(View view, hcm hcm, a<View> aVar, int... iArr) {
    }

    public final void a(View view, hcm hcm, gwm gwm, b bVar) {
        ((rrk) fqz.a(view, rrk.class)).a(hcm.text().title());
    }

    public final int b() {
        return R.id.home_section_header;
    }
}
