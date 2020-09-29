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

/* renamed from: mts reason: default package */
public final class mts extends ke implements jqx {
    private final OnClickListener T = new OnClickListener() {
        public final void onClick(DialogInterface dialogInterface, int i) {
        }
    };
    private final OnClickListener U = new OnClickListener() {
        public final void onClick(DialogInterface dialogInterface, int i) {
            ((Fragment) fbp.a(mts.this.m())).a(mts.this.l, 1, (Intent) null);
        }
    };

    public static mts d(int i) {
        mts mts = new mts();
        Bundle bundle = mts.i;
        if (bundle == null) {
            bundle = new Bundle();
            mts.g(bundle);
        }
        bundle.putInt("friends_count", i);
        return mts;
    }

    public final Dialog a(Bundle bundle) {
        super.a(bundle);
        String str = "friends_count";
        fbp.a(this.i.containsKey(str));
        int i = ((Bundle) fbp.a(this.i)).getInt(str);
        LinearLayout linearLayout = new LinearLayout(p());
        linearLayout.setOrientation(1);
        TextView a = gat.a((Context) fbp.a(p()));
        a.setText(((kf) fbp.a(p())).getResources().getQuantityString(R.plurals.find_friends_flow_confirm_desc, i, new Object[]{Integer.valueOf(i)}));
        a.setFreezesText(true);
        vgl.a(p(), a, R.attr.pasteTextAppearance);
        a.setTextColor(vgl.b(p(), 16842801));
        LayoutParams layoutParams = new LayoutParams(-1, -2);
        int dimension = (int) o().getResources().getDimension(R.dimen.share_margin);
        layoutParams.setMargins(0, dimension, 0, dimension);
        linearLayout.addView(a, layoutParams);
        a aVar = new a(p(), 2132017714);
        aVar.a = o().getResources().getString(R.string.find_friends_flow_confirm_title);
        a a2 = aVar.b(R.string.find_friends_flow_confirm_negative, this.T).a((int) R.string.find_friends_flow_confirm_positive, this.U);
        a2.c = linearLayout;
        return a2.a((rma) p(), PageIdentifiers.DIALOG_FINDFRIENDS_CONFIRMALL.mPageIdentifier, ViewUris.i.toString()).a();
    }

    public /* synthetic */ Fragment ae() {
        return CC.$default$ae(this);
    }

    public final rmf af() {
        return rmf.a("FindFriendsConfirmDialogFragment");
    }

    public final uqm ag() {
        return uqo.V;
    }

    public final String b(Context context) {
        return context.getResources().getString(R.string.find_friends_flow_confirm_title);
    }

    public final String e() {
        return ViewUris.i.toString();
    }
}
