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

/* renamed from: lwa reason: default package */
public final class lwa implements gui<View> {
    private FindSearchFieldView a;
    private final boolean b;
    private final umf c;

    public lwa(boolean z, umf umf) {
        this.b = z;
        this.c = umf;
    }

    public final View a(ViewGroup viewGroup, gum gum) {
        Context context = viewGroup.getContext();
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setLayoutParams(new LayoutParams(-1, -2));
        int b2 = uts.b(12.0f, viewGroup.getResources());
        int b3 = uts.b(4.0f, viewGroup.getResources());
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

    public final void a(View view, gzt gzt, gum gum, b bVar) {
        this.a.a(gzt.text().title());
        this.a.b(gzt.text().description());
        this.a.setOnClickListener(new $$Lambda$lwa$cyOKncfejlv4KGcxfepgzC5C628(this, gum, gzt));
        if (this.b) {
            has.a(gum.c).a("voiceMicrophoneClick").a(gzt).a(view.findViewById(R.id.search_voice_button)).a();
            this.c.b();
        }
    }

    public final void a(View view, gzt gzt, a<View> aVar, int... iArr) {
        haq.a(view, gzt, aVar, iArr);
    }

    public static a a(String str, String str2, boolean z) {
        a c2 = hae.builder().a("find-search-field").a("find:searchField", HubsComponentCategory.ROW.mId).b("primary_buttons").a(haf.builder().a(str).d(str2)).a("click", haa.builder().a("openSearchWithTransition")).c(HubsImmutableComponentBundle.builder().a("ui:source", udt.U.a()).a("ui:group", "search-field").a());
        if (!z) {
            return c2;
        }
        return c2.a("voiceMicrophoneClick", haa.builder().a("openVoice"));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(gum gum, gzt gzt, View view) {
        gum.c.a(guy.a("click", gzt, ImmutableMap.b("buttonData", lvq.a(shi.a(view), this.a.a(), this.a.b()))));
    }
}
