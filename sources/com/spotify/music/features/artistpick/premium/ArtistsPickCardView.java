package com.spotify.music.features.artistpick.premium;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;
import com.spotify.android.glue.components.card.Card.TextLayout;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.music.R;
import com.spotify.paste.graphics.drawable.CardAccessoryDrawable;
import com.spotify.paste.widgets.internal.PasteLinearLayout;

public class ArtistsPickCardView extends PasteLinearLayout implements lpn {
    private final ImageView a;
    private final TextView b;
    private final TextView c;
    private final ImageView d;
    private final TextView e;
    /* access modifiers changed from: private */
    public final lpo f;
    private final OnClickListener g;
    private final uud h;

    public final void a(TextLayout textLayout) {
    }

    public View getView() {
        return this;
    }

    public ArtistsPickCardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ArtistsPickCardView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.g = new OnClickListener() {
            public final void onClick(View view) {
                lpo a2 = ArtistsPickCardView.this.f;
                if (a2.g) {
                    a2.b.start();
                    a2.d.start();
                    a2.e.start();
                } else {
                    a2.a.start();
                    a2.c.start();
                    a2.f.start();
                }
                a2.g = !a2.g;
            }
        };
        this.h = new uud(this);
        setOrientation(1);
        LayoutInflater.from(getContext()).inflate(R.layout.artistspick_card, this);
        this.f = new lpo(this);
        this.a = (ImageView) findViewById(16908294);
        this.b = (TextView) findViewById(R.id.title);
        this.c = (TextView) findViewById(R.id.subtitle);
        this.d = (ImageView) findViewById(R.id.artistspick_comment_image);
        this.e = (TextView) findViewById(R.id.artistspick_comment_text);
        fze.a(this.b, this.c);
        fze.a((View) this);
        setClickable(true);
        uui.a(this).b(this.a, this.d).a(this.b, this.c, this.e).a();
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        this.h.b();
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        boolean z = false;
        for (int i = 0; i < drawableState.length; i++) {
            z |= drawableState[i] == -16842910;
        }
        if (z) {
            setAlpha(0.4f);
        }
        this.h.a();
    }

    public final ImageView a() {
        return this.a;
    }

    public final void a(CardAccessoryDrawable cardAccessoryDrawable) {
        Assertion.b("This operation is not supported");
    }

    public final void a(CharSequence charSequence) {
        this.b.setText(charSequence);
    }

    public final void a(CharSequence charSequence, Drawable drawable) {
        a(charSequence);
    }

    public final void b(CharSequence charSequence) {
        this.c.setText(charSequence);
    }
}
