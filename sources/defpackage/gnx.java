package defpackage;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import com.spotify.libs.signup.validators.LocalEmailValidator;
import com.spotify.libs.signup.validators.LocalEmailValidator.EmailValidation;
import com.spotify.music.R;

/* renamed from: gnx reason: default package */
public final class gnx extends eyt {
    private final LocalEmailValidator T = new LocalEmailValidator();

    public final int aa_() {
        return R.style.MagicLinkBottomSheetDialogTheme;
    }

    public final Dialog a(Bundle bundle) {
        eys eys = new eys(o(), R.style.MagicLinkBottomSheetDialogTheme);
        View inflate = LayoutInflater.from(o()).inflate(R.layout.too_may_attempts_dialog, null);
        String str = (String) fay.a(this.i.getString("arg_email"));
        if (LocalEmailValidator.a(str) != EmailValidation.VALID) {
            ((TextView) inflate.findViewById(R.id.textView_description)).setText(jrw.a(o().getString(R.string.magiclink_too_many_attempts_dialog_subtitle_no_email)));
        } else {
            ((TextView) inflate.findViewById(R.id.textView_description)).setText(jrw.a(o().getString(R.string.magiclink_too_many_attempts_dialog_subtitle, new Object[]{str})));
        }
        inflate.findViewById(R.id.button_positive).setOnClickListener(new $$Lambda$gnx$AJUyNfk7_OhzVgtQDmohDgR0Y(this));
        if (!(!o().getPackageManager().queryIntentActivities(gnp.a(), 0).isEmpty())) {
            inflate.findViewById(R.id.button_positive).setVisibility(8);
            inflate.findViewById(R.id.textView_or).setVisibility(8);
            inflate.findViewById(R.id.left_divider_line).setVisibility(8);
            inflate.findViewById(R.id.right_divider_line).setVisibility(8);
        }
        inflate.findViewById(R.id.button_negative).setOnClickListener(new $$Lambda$gnx$d8BdZUp95J09UkRgMR0a0n1Jtn0(this));
        eys.setContentView(inflate);
        return eys;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void c(View view) {
        Intent a = gnp.a(o());
        if (a != null) {
            a(a);
        }
        c();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(View view) {
        c();
    }

    public static void b(kf kfVar, String str) {
        gnx gnx = new gnx();
        Bundle bundle = new Bundle();
        bundle.putString("arg_email", str);
        gnx.g(bundle);
        gnx.a(kfVar, "too_many_requests_bottom_sheet_dialog");
    }
}
