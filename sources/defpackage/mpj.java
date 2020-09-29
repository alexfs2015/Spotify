package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.music.R;
import com.spotify.music.libs.viewuri.ViewUris;

/* renamed from: mpj reason: default package */
public final class mpj extends jz implements jol {
    private final OnClickListener T = new OnClickListener() {
        public final void onClick(DialogInterface dialogInterface, int i) {
        }
    };
    private final OnClickListener U = new OnClickListener() {
        public final void onClick(DialogInterface dialogInterface, int i) {
            ((Fragment) fay.a(mpj.this.m())).a(mpj.this.l, 1, (Intent) null);
        }
    };

    public /* synthetic */ Fragment ae() {
        return CC.$default$ae(this);
    }

    public static mpj d(int i) {
        mpj mpj = new mpj();
        Bundle bundle = mpj.i;
        if (bundle == null) {
            bundle = new Bundle();
            mpj.g(bundle);
        }
        bundle.putInt("friends_count", i);
        return mpj;
    }

    public final Dialog a(Bundle bundle) {
        super.a(bundle);
        String str = "friends_count";
        fay.a(this.i.containsKey(str));
        int i = ((Bundle) fay.a(this.i)).getInt(str);
        LinearLayout linearLayout = new LinearLayout(p());
        linearLayout.setOrientation(1);
        TextView a = fzz.a((Context) fay.a(p()));
        a.setText(((ka) fay.a(p())).getResources().getQuantityString(R.plurals.find_friends_flow_confirm_desc, i, new Object[]{Integer.valueOf(i)}));
        a.setFreezesText(true);
        uuu.a(p(), a, R.attr.pasteTextAppearance);
        a.setTextColor(uuu.b(p(), 16842801));
        LayoutParams layoutParams = new LayoutParams(-1, -2);
        int dimension = (int) o().getResources().getDimension(R.dimen.share_margin);
        layoutParams.setMargins(0, dimension, 0, dimension);
        linearLayout.addView(a, layoutParams);
        a aVar = new a(p(), 2132017711);
        aVar.a = o().getResources().getString(R.string.find_friends_flow_confirm_title);
        a a2 = aVar.b(R.string.find_friends_flow_confirm_negative, this.T).a((int) R.string.find_friends_flow_confirm_positive, this.U);
        a2.c = linearLayout;
        return a2.a((rdc) p(), PageIdentifiers.DIALOG_FINDFRIENDS_CONFIRMALL.mPageIdentifier, ViewUris.j.toString()).a();
    }

    public final String b(Context context) {
        return context.getResources().getString(R.string.find_friends_flow_confirm_title);
    }

    public final udr ag() {
        return udt.V;
    }

    public final rdh af() {
        return rdh.a("FindFriendsConfirmDialogFragment");
    }

    public final String e() {
        return ViewUris.j.toString();
    }
}
