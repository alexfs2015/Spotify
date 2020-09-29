package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.google.common.base.Optional;
import com.spotify.effortlesslogin.EffortlessLoginActivity;
import com.spotify.music.R;
import com.spotify.music.spotlets.tracker.identifier.ClickIdentifier;
import com.spotify.music.spotlets.tracker.identifier.ScreenIdentifier;

/* renamed from: gcz reason: default package */
public class gcz extends eyt {
    public ujc T;
    private Optional<a> U = Optional.e();

    /* renamed from: gcz$a */
    public interface a {
        void a();
    }

    public final void a(Context context) {
        vts.a(this);
        super.a(context);
    }

    public static void a(kf kfVar, String str, a aVar) {
        gcz gcz = new gcz();
        Bundle bundle = new Bundle();
        bundle.putString("username", str);
        gcz.g(bundle);
        gcz.a(kfVar, "EffortlessLoginBottomSheetDialog");
        gcz.a(aVar);
    }

    public final Dialog a(Bundle bundle) {
        this.T.a(ScreenIdentifier.SAMSUNG_EFFORTLESS_LOGIN_SHEET);
        String string = this.i != null ? this.i.getString("username") : null;
        eys eys = new eys(o(), aa_());
        View inflate = LayoutInflater.from(o()).inflate(R.layout.effortless_login_dialog, null);
        TextView textView = (TextView) inflate.findViewById(R.id.textview_username);
        if (string != null) {
            textView.setText(o().getString(R.string.effortless_login_username, new Object[]{string}));
        } else {
            textView.setVisibility(8);
        }
        ((Button) inflate.findViewById(R.id.button_positive)).setOnClickListener(new $$Lambda$gcz$Hkjx5J2jD1ugIc5l11sVAfOzprM(this, string));
        ((Button) inflate.findViewById(R.id.button_negative)).setOnClickListener(new $$Lambda$gcz$9lR6m8Tnzhv5CAy8I_IBjfoWNPs(this));
        eys.setContentView(inflate);
        return eys;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(View view) {
        ae();
        c();
    }

    private void a(a aVar) {
        this.U = Optional.b(aVar);
    }

    public static void a(kf kfVar, a aVar) {
        Fragment a2 = kfVar.a("EffortlessLoginBottomSheetDialog");
        if (a2 != null) {
            ((gcz) a2).a(aVar);
        }
    }

    public final void a(int i, int i2, Intent intent) {
        super.a(i, i2, intent);
        if (i == 11533 && i2 == -1 && this.U.b()) {
            ((a) this.U.c()).a();
        }
        c();
    }

    public void onCancel(DialogInterface dialogInterface) {
        ae();
        super.onCancel(dialogInterface);
    }

    private void ae() {
        this.T.a(ScreenIdentifier.SAMSUNG_EFFORTLESS_LOGIN_SHEET, ClickIdentifier.SAMSUNG_EFFORTLESS_LOGIN_DISMISSED);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(String str, View view) {
        this.T.a(ScreenIdentifier.SAMSUNG_EFFORTLESS_LOGIN_SHEET, ClickIdentifier.SAMSUNG_EFFORTLESS_LOGIN_STARTED);
        startActivityForResult(EffortlessLoginActivity.a(o(), str), 11533);
    }
}
