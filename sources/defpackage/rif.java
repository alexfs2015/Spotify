package defpackage;

import android.view.View;
import android.view.ViewGroup;
import com.spotify.mobile.android.glue.GlueLayoutTraits.Trait;
import com.spotify.mobile.android.hubframework.defaults.HubsComponentCategory;
import com.spotify.music.R;
import java.util.EnumSet;

/* renamed from: rif reason: default package */
public final class rif implements rev<View> {
    public static final gzr a = hac.create("home:sectionHeader", HubsComponentCategory.SECTION_HEADER.mId);

    public final void a(View view, gzt gzt, a<View> aVar, int... iArr) {
    }

    public final int b() {
        return R.id.home_section_header;
    }

    public final View a(ViewGroup viewGroup, gum gum) {
        rih rih = new rih(viewGroup.getContext(), viewGroup);
        fqf.a(rih);
        return rih.getView();
    }

    public final void a(View view, gzt gzt, gum gum, b bVar) {
        ((rii) fqf.a(view, rii.class)).a(gzt.text().title());
    }

    public final EnumSet<Trait> a() {
        return EnumSet.of(Trait.SPACED_VERTICALLY);
    }
}
