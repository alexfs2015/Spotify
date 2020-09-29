package defpackage;

import android.text.SpannableString;
import android.text.style.UnderlineSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import com.google.common.base.Optional;
import com.google.common.collect.ImmutableMap;
import com.spotify.music.R;
import com.spotify.music.libs.partnerapps.PartnerType;

/* renamed from: nvs reason: default package */
public final class nvs implements kjd<nvn, nvl> {
    public final View a;
    /* access modifiers changed from: private */
    public final SwitchCompat b;
    private rvn c;
    /* access modifiers changed from: private */
    public final Button d;
    private final View e;
    private final View f;
    private rvn g;
    /* access modifiers changed from: private */
    public final Button h;
    private final View i;
    private final View j;

    public nvs(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        ViewGroup viewGroup2 = (ViewGroup) layoutInflater.inflate(R.layout.layout_partners_settings, viewGroup, false);
        this.b = (SwitchCompat) viewGroup2.findViewById(R.id.navigationAppsMasterToggle);
        this.d = (Button) viewGroup2.findViewById(R.id.googleMapsButton);
        this.e = viewGroup2.findViewById(R.id.googleMapsConnected);
        this.f = viewGroup2.findViewById(R.id.googleMapsEntry);
        this.h = (Button) viewGroup2.findViewById(R.id.wazeButton);
        this.i = viewGroup2.findViewById(R.id.wazeConnected);
        this.j = viewGroup2.findViewById(R.id.wazeEntry);
        TextView textView = (TextView) viewGroup2.findViewById(R.id.safetyDisclaimer);
        SpannableString spannableString = new SpannableString(textView.getText());
        spannableString.setSpan(new UnderlineSpan(), 0, spannableString.length(), 0);
        textView.setText(spannableString);
        this.a = viewGroup2;
    }

    public final kje<nvn> connect(kkn<nvl> kkn) {
        AnonymousClass1 r0 = new kje<nvn>() {
            public final /* synthetic */ void accept(Object obj) {
                nvs.a(nvs.this, (nvn) obj);
            }

            public final void dispose() {
                nvs.this.b.setOnCheckedChangeListener(null);
                nvs.this.d.setOnClickListener(null);
                nvs.this.h.setOnClickListener(null);
            }
        };
        this.b.setOnCheckedChangeListener(new $$Lambda$nvs$hDgfZkD9goJAwE8x1lUAnIk787Y(kkn));
        this.d.setOnClickListener(new $$Lambda$nvs$c0DzucsIZIzuyONJAItEqb2WwP4(this, kkn));
        this.h.setOnClickListener(new $$Lambda$nvs$Qk3wTk3Oi2PmWzIY9LTbJufyFV8(this, kkn));
        return r0;
    }

    private static void a(kkn<nvl> kkn, rvn rvn, PartnerType partnerType) {
        if (!rvn.b()) {
            kkn.accept(nvl.b(partnerType));
            return;
        }
        if (!rvn.a()) {
            kkn.accept(nvl.a(partnerType));
        }
    }

    private static void a(rvn rvn, Button button, View view) {
        if (rvn.a() && rvn.b()) {
            view.setVisibility(0);
            button.setVisibility(8);
        } else if (!rvn.b()) {
            view.setVisibility(8);
            button.setVisibility(0);
            button.setText(R.string.partner_settings_install);
        } else {
            view.setVisibility(8);
            button.setVisibility(0);
            button.setText(R.string.partner_settings_connect);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(kkn kkn, View view) {
        a(kkn, (rvn) fay.a(this.g), PartnerType.WAZE);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(kkn kkn, View view) {
        a(kkn, (rvn) fay.a(this.c), PartnerType.GOOGLE_MAPS);
    }

    static /* synthetic */ void a(nvs nvs, nvn nvn) {
        Optional a2 = nvn.a();
        if (a2.b() && ((Boolean) a2.c()).booleanValue() != nvs.b.isChecked()) {
            nvs.b.setChecked(((Boolean) a2.c()).booleanValue());
        }
        ImmutableMap b2 = nvn.b();
        if (b2.containsKey(PartnerType.GOOGLE_MAPS)) {
            nvs.f.setVisibility(0);
            rvn rvn = (rvn) fay.a(b2.get(PartnerType.GOOGLE_MAPS));
            nvs.c = rvn;
            a(rvn, nvs.d, nvs.e);
        } else {
            nvs.f.setVisibility(8);
        }
        if (b2.containsKey(PartnerType.WAZE)) {
            nvs.j.setVisibility(0);
            rvn rvn2 = (rvn) fay.a(b2.get(PartnerType.WAZE));
            nvs.g = rvn2;
            a(rvn2, nvs.h, nvs.i);
            return;
        }
        nvs.j.setVisibility(8);
    }
}
