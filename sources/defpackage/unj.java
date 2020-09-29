package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.spotify.instrumentation.InteractionIntent;
import com.spotify.music.R;

/* renamed from: unj reason: default package */
public class unj extends jor {
    public snp a;
    public unm b;

    public static unj a(int i, int i2, int i3, int i4, boolean z, boolean z2) {
        unj unj = new unj();
        Bundle bundle = new Bundle();
        bundle.putInt("page_title_text", i);
        bundle.putInt("page_title_desc", i2);
        bundle.putInt("page_image", i4);
        bundle.putInt("page_content_description", i3);
        bundle.putBoolean("page_show_done_button", z);
        bundle.putBoolean("page_show_tos", z2);
        unj.g(bundle);
        return unj;
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fragment_voice_onboarding, viewGroup, false);
        Bundle bundle2 = (Bundle) fay.a(this.i);
        ((TextView) inflate.findViewById(R.id.onboarding_title)).setText(bundle2.getInt("page_title_text"));
        ((TextView) inflate.findViewById(R.id.onboarding_description)).setText(bundle2.getInt("page_title_desc"));
        ImageView imageView = (ImageView) inflate.findViewById(R.id.onboarding_image);
        int i = bundle2.getInt("page_content_description");
        imageView.setImageResource(bundle2.getInt("page_image"));
        imageView.setContentDescription(((Context) fay.a(n())).getString(i));
        View findViewById = inflate.findViewById(R.id.onboarding_tos);
        Button button = (Button) inflate.findViewById(R.id.done_button);
        if (bundle2.getBoolean("page_show_done_button", false)) {
            findViewById.setVisibility(8);
            button.setVisibility(0);
            button.setContentDescription(a((int) R.string.voice_onboarding_finish_button));
            button.setOnClickListener(new OnClickListener() {
                public final void onClick(View view) {
                    ka p = unj.this.p();
                    if (p != null) {
                        Intent intent = p.getIntent();
                        unj.this.b.a(InteractionIntent.NEXT);
                        unj.this.a.a(p, fpu.a((Activity) p), intent.getStringExtra("voice_internal_referrer"));
                    }
                }
            });
        } else if (bundle2.getBoolean("page_show_tos", false)) {
            button.setVisibility(8);
            findViewById.setVisibility(0);
            findViewById.setOnClickListener(new OnClickListener() {
                public final void onClick(View view) {
                    view.getContext().startActivity(unj.b(view.getContext()));
                }
            });
        } else {
            findViewById.setVisibility(8);
            button.setVisibility(8);
        }
        return inflate;
    }

    static Intent b(Context context) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(context.getString(R.string.voice_tos)));
        return intent;
    }
}
