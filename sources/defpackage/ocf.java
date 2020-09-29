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

/* renamed from: ocf reason: default package */
public final class ocf implements kmm<oca, oby> {
    public final View a;
    /* access modifiers changed from: private */
    public final SwitchCompat b;
    private sex c;
    /* access modifiers changed from: private */
    public final Button d;
    private final View e;
    private final View f;
    private sex g;
    /* access modifiers changed from: private */
    public final Button h;
    private final View i;
    private final View j;

    public ocf(LayoutInflater layoutInflater, ViewGroup viewGroup) {
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

    /* access modifiers changed from: private */
    public /* synthetic */ void a(knw knw, View view) {
        a(knw, (sex) fbp.a(this.g), PartnerType.WAZE);
    }

    private static void a(knw<oby> knw, sex sex, PartnerType partnerType) {
        if (!sex.b()) {
            knw.accept(oby.b(partnerType));
            return;
        }
        if (!sex.a()) {
            knw.accept(oby.a(partnerType));
        }
    }

    static /* synthetic */ void a(ocf ocf, oca oca) {
        Optional a2 = oca.a();
        if (a2.b() && ((Boolean) a2.c()).booleanValue() != ocf.b.isChecked()) {
            ocf.b.setChecked(((Boolean) a2.c()).booleanValue());
        }
        ImmutableMap b2 = oca.b();
        if (b2.containsKey(PartnerType.GOOGLE_MAPS)) {
            ocf.f.setVisibility(0);
            sex sex = (sex) fbp.a(b2.get(PartnerType.GOOGLE_MAPS));
            ocf.c = sex;
            a(sex, ocf.d, ocf.e);
        } else {
            ocf.f.setVisibility(8);
        }
        if (b2.containsKey(PartnerType.WAZE)) {
            ocf.j.setVisibility(0);
            sex sex2 = (sex) fbp.a(b2.get(PartnerType.WAZE));
            ocf.g = sex2;
            a(sex2, ocf.h, ocf.i);
            return;
        }
        ocf.j.setVisibility(8);
    }

    private static void a(sex sex, Button button, View view) {
        if (sex.a() && sex.b()) {
            view.setVisibility(0);
            button.setVisibility(8);
        } else if (!sex.b()) {
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
    public /* synthetic */ void b(knw knw, View view) {
        a(knw, (sex) fbp.a(this.c), PartnerType.GOOGLE_MAPS);
    }

    public final kmn<oca> connect(knw<oby> knw) {
        AnonymousClass1 r0 = new kmn<oca>() {
            public final /* synthetic */ void accept(Object obj) {
                ocf.a(ocf.this, (oca) obj);
            }

            public final void dispose() {
                ocf.this.b.setOnCheckedChangeListener(null);
                ocf.this.d.setOnClickListener(null);
                ocf.this.h.setOnClickListener(null);
            }
        };
        this.b.setOnCheckedChangeListener(new $$Lambda$ocf$d0YEaBGwALQ__ZXShlPhJFzMVo(knw));
        this.d.setOnClickListener(new $$Lambda$ocf$bm7oRw3T0hp3wOY1ZR1MpSvlPSo(this, knw));
        this.h.setOnClickListener(new $$Lambda$ocf$d7bKmnwWWoPrkIssdjQKwkpVL9E(this, knw));
        return r0;
    }
}
