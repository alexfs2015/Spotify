package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.LinearLayout;
import com.google.common.collect.ImmutableMap;
import com.spotify.mobile.android.hubframework.defaults.HubsComponentCategory;
import com.spotify.mobile.android.hubframework.model.immutable.HubsImmutableComponentBundle;
import com.spotify.music.R;
import com.spotify.music.libs.search.transition.FindSearchFieldView;

/* renamed from: mab reason: default package */
public final class mab implements gwi<View> {
    private FindSearchFieldView a;
    private final boolean b;
    private final uxj c;

    public mab(boolean z, uxj uxj) {
        this.b = z;
        this.c = uxj;
    }

    public static a a(String str, String str2, boolean z) {
        a c2 = hcx.builder().a("find-search-field").a("find:searchField", HubsComponentCategory.ROW.mId).b("primary_buttons").a(hcy.builder().a(str).d(str2)).a("click", hct.builder().a("openSearchWithTransition")).c(HubsImmutableComponentBundle.builder().a("ui:source", uqo.U.a()).a("ui:group", "search-field").a());
        if (!z) {
            return c2;
        }
        return c2.a("voiceMicrophoneClick", hct.builder().a("openVoice"));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(gwm gwm, hcm hcm, View view) {
        gwm.c.a(gwy.a("click", hcm, ImmutableMap.b("buttonData", lzp.a(srp.a(view), this.a.a(), this.a.b()))));
    }

    public final View a(ViewGroup viewGroup, gwm gwm) {
        Context context = viewGroup.getContext();
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setLayoutParams(new LayoutParams(-1, -2));
        int b2 = vfj.b(12.0f, viewGroup.getResources());
        int b3 = vfj.b(4.0f, viewGroup.getResources());
        linearLayout.setPadding(b2, b3, b2, b3);
        linearLayout.setOrientation(0);
        linearLayout.setBackgroundColor(fr.c(context, R.color.gray_7));
        this.a = new FindSearchFieldView(context);
        this.a.a(context.getString(R.string.find_search_field_hint));
        this.a.b(context.getString(R.string.find_search_field_hint_voice));
        linearLayout.addView(this.a);
        if (this.b) {
            linearLayout.addView(this.c.a(context));
        }
        return linearLayout;
    }

    public final void a(View view, hcm hcm, a<View> aVar, int... iArr) {
        hdj.a(view, hcm, aVar, iArr);
    }

    public final void a(View view, hcm hcm, gwm gwm, b bVar) {
        this.a.a(hcm.text().title());
        this.a.b(hcm.text().description());
        this.a.setOnClickListener(new $$Lambda$mab$71TGxHR2yMKOkRPGqvz1UTsQkwE(this, gwm, hcm));
        if (this.b) {
            hdl.a(gwm.c).a("voiceMicrophoneClick").a(hcm).a(view.findViewById(R.id.search_voice_button)).a();
            this.c.b();
        }
    }
}
