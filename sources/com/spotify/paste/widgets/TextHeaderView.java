package com.spotify.paste.widgets;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.spotify.music.R;

public class TextHeaderView extends LinearLayout {
    public final TextView a;
    private final TextView b;

    public TextHeaderView(Context context) {
        this(context, null);
    }

    public TextHeaderView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.pasteDefaultsHeaderStyle);
    }

    public TextHeaderView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        uut.a(TextHeaderView.class, this);
        setOrientation(1);
        setGravity(17);
        int b2 = uts.b(16.0f, context.getResources());
        int b3 = uts.b(40.0f, context.getResources());
        int b4 = uts.b(16.0f, context.getResources());
        setPadding(b4, b2, b4, b3);
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(context).inflate(R.layout.paste_text_header, this, true);
        this.a = (TextView) linearLayout.findViewById(R.id.title);
        this.b = (TextView) linearLayout.findViewById(R.id.header_subtitle);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.B, i, 0);
        a(obtainStyledAttributes.getString(a.C));
        int resourceId = obtainStyledAttributes.getResourceId(a.E, 0);
        if (resourceId != 0) {
            uuu.a(context, this.a, resourceId);
        }
        obtainStyledAttributes.recycle();
    }

    public final void a(CharSequence charSequence) {
        this.a.setText(charSequence);
        this.a.setVisibility(TextUtils.isEmpty(charSequence) ? 8 : 0);
    }

    public final void b(CharSequence charSequence) {
        this.b.setText(charSequence);
        this.b.setVisibility(TextUtils.isEmpty(charSequence) ? 8 : 0);
    }
}
