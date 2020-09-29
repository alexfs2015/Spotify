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

/* renamed from: gpm reason: default package */
public final class gpm extends ezk {
    private final LocalEmailValidator T = new LocalEmailValidator();

    /* access modifiers changed from: private */
    public /* synthetic */ void b(View view) {
        c();
    }

    public static void b(kk kkVar, String str) {
        gpm gpm = new gpm();
        Bundle bundle = new Bundle();
        bundle.putString("arg_email", str);
        gpm.g(bundle);
        gpm.a(kkVar, "too_many_requests_bottom_sheet_dialog");
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void c(View view) {
        Intent a = gpe.a(o());
        if (a != null) {
            a(a);
        }
        c();
    }

    public final Dialog a(Bundle bundle) {
        ezj ezj = new ezj(o(), R.style.MagicLinkBottomSheetDialogTheme);
        View inflate = LayoutInflater.from(o()).inflate(R.layout.too_may_attempts_dialog, null);
        String str = (String) fbp.a(this.i.getString("arg_email"));
        if (LocalEmailValidator.a(str) != EmailValidation.VALID) {
            ((TextView) inflate.findViewById(R.id.textView_description)).setText(jug.a(o().getString(R.string.magiclink_too_many_attempts_dialog_subtitle_no_email)));
        } else {
            ((TextView) inflate.findViewById(R.id.textView_description)).setText(jug.a(o().getString(R.string.magiclink_too_many_attempts_dialog_subtitle, new Object[]{str})));
        }
        inflate.findViewById(R.id.button_positive).setOnClickListener(new $$Lambda$gpm$7x69L2QBj9eL_TExcIgzh3Sbcms(this));
        if (!(!o().getPackageManager().queryIntentActivities(gpe.a(), 0).isEmpty())) {
            inflate.findViewById(R.id.button_positive).setVisibility(8);
            inflate.findViewById(R.id.textView_or).setVisibility(8);
            inflate.findViewById(R.id.left_divider_line).setVisibility(8);
            inflate.findViewById(R.id.right_divider_line).setVisibility(8);
        }
        inflate.findViewById(R.id.button_negative).setOnClickListener(new $$Lambda$gpm$jHPlxfjNjyTKLiuJ3F1prew7U1Y(this));
        ezj.setContentView(inflate);
        return ezj;
    }

    public final int aa_() {
        return R.style.MagicLinkBottomSheetDialogTheme;
    }
}
