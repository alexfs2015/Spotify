package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import android.widget.ToggleButton;
import com.spotify.music.R;

/* renamed from: gyy reason: default package */
final class gyy {
    static View a(Context context) {
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        ToggleButton toggleButton = (ToggleButton) LayoutInflater.from(context).inflate(R.layout.header_toggle_button, linearLayout, false);
        toggleButton.setId(R.id.hubs_header_toggle_button);
        toggleButton.setVisibility(8);
        LayoutParams layoutParams = new LayoutParams(-2, -2);
        layoutParams.bottomMargin = vfj.b(8.0f, context.getResources());
        layoutParams.gravity = 1;
        linearLayout.addView(toggleButton, layoutParams);
        TextView a = gat.a(context);
        a.setId(R.id.hubs_header_metadata);
        a.setGravity(1);
        vgl.b(context, a, R.attr.pasteTextAppearanceMetadata);
        a.setVisibility(8);
        linearLayout.addView(a, new LayoutParams(-2, -2));
        return linearLayout;
    }
}
