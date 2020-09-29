package com.spotify.music.homecomponents.text;

import android.content.Context;
import android.text.Layout;
import android.text.Layout.Alignment;
import android.text.StaticLayout;
import android.text.TextUtils.TruncateAt;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;

public class CustomEllipsizeTextView extends AppCompatTextView {
    private String a;
    private String b;
    private boolean c;
    private boolean e;
    private boolean f;
    private int g = -1;

    public CustomEllipsizeTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        String str = "";
        this.a = str;
        this.b = str;
    }

    public CustomEllipsizeTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        String str = "";
        this.a = str;
        this.b = str;
    }

    private Layout a(String str) {
        StaticLayout staticLayout = new StaticLayout(str, getPaint(), (getWidth() - getPaddingLeft()) - getPaddingRight(), Alignment.ALIGN_NORMAL, -1.0f, -1.0f, false);
        return staticLayout;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00d7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onDraw(android.graphics.Canvas r9) {
        /*
            r8 = this;
            boolean r0 = r8.e
            if (r0 == 0) goto L_0x00d9
            r0 = 0
            super.setEllipsize(r0)
            int r0 = r8.getMaxLines()
            java.lang.String r1 = r8.b
            r2 = -1
            r3 = 1
            r4 = 0
            if (r0 == r2) goto L_0x007d
            android.text.Layout r5 = r8.a(r1)
            int r6 = r5.getLineCount()
            if (r6 <= r0) goto L_0x007d
            java.lang.String r1 = r8.b
            int r6 = r0 + -1
            int r5 = r5.getLineEnd(r6)
            java.lang.String r1 = r1.substring(r4, r5)
            java.lang.String r1 = r1.trim()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "… "
            r5.<init>(r6)
            java.lang.String r6 = r8.a
            r5.append(r6)
            java.lang.String r5 = r5.toString()
        L_0x003d:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r1)
            r6.append(r5)
            java.lang.String r6 = r6.toString()
            android.text.Layout r6 = r8.a(r6)
            int r6 = r6.getLineCount()
            if (r6 <= r0) goto L_0x0063
            r6 = 32
            int r6 = r1.lastIndexOf(r6)
            if (r6 == r2) goto L_0x0063
            java.lang.String r1 = r1.substring(r4, r6)
            goto L_0x003d
        L_0x0063:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            int r6 = r1.length()
            int r7 = r5.length()
            int r6 = r6 + r7
            r0.<init>(r6)
            r0.append(r1)
            r0.append(r5)
            java.lang.String r1 = r0.toString()
            r0 = 1
            goto L_0x007e
        L_0x007d:
            r0 = 0
        L_0x007e:
            java.lang.CharSequence r5 = r8.getText()
            java.lang.String r5 = r5.toString()
            boolean r5 = r1.equals(r5)
            if (r5 != 0) goto L_0x00d1
            r8.f = r3
            android.text.SpannableString r5 = new android.text.SpannableString     // Catch:{ all -> 0x00cd }
            r5.<init>(r1)     // Catch:{ all -> 0x00cd }
            java.lang.String r6 = r8.a     // Catch:{ all -> 0x00cd }
            int r1 = r1.indexOf(r6)     // Catch:{ all -> 0x00cd }
            android.text.style.StyleSpan r6 = new android.text.style.StyleSpan     // Catch:{ all -> 0x00cd }
            r6.<init>(r3)     // Catch:{ all -> 0x00cd }
            java.lang.String r3 = r8.a     // Catch:{ all -> 0x00cd }
            int r3 = r3.length()     // Catch:{ all -> 0x00cd }
            int r3 = r3 + r1
            r7 = 33
            r5.setSpan(r6, r1, r3, r7)     // Catch:{ all -> 0x00cd }
            int r3 = r8.g     // Catch:{ all -> 0x00cd }
            if (r3 == r2) goto L_0x00c7
            android.text.style.ForegroundColorSpan r2 = new android.text.style.ForegroundColorSpan     // Catch:{ all -> 0x00cd }
            android.content.Context r3 = r8.getContext()     // Catch:{ all -> 0x00cd }
            int r6 = r8.g     // Catch:{ all -> 0x00cd }
            int r3 = defpackage.fr.c(r3, r6)     // Catch:{ all -> 0x00cd }
            r2.<init>(r3)     // Catch:{ all -> 0x00cd }
            java.lang.String r3 = r8.a     // Catch:{ all -> 0x00cd }
            int r3 = r3.length()     // Catch:{ all -> 0x00cd }
            int r3 = r3 + r1
            r5.setSpan(r2, r1, r3, r7)     // Catch:{ all -> 0x00cd }
        L_0x00c7:
            r8.setText(r5)     // Catch:{ all -> 0x00cd }
            r8.f = r4
            goto L_0x00d1
        L_0x00cd:
            r9 = move-exception
            r8.f = r4
            throw r9
        L_0x00d1:
            r8.e = r4
            boolean r1 = r8.c
            if (r0 == r1) goto L_0x00d9
            r8.c = r0
        L_0x00d9:
            super.onDraw(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.music.homecomponents.text.CustomEllipsizeTextView.onDraw(android.graphics.Canvas):void");
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        if (!this.f) {
            this.b = charSequence.toString();
            this.e = true;
        }
    }

    public void setEllipsize(TruncateAt truncateAt) {
    }

    public void setMaxLines(int i) {
        super.setMaxLines(i);
        this.e = true;
    }
}
