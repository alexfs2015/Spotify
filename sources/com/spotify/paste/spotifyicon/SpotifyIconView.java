package com.spotify.paste.spotifyicon;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import com.spotify.android.paste.graphics.SpotifyIconV2;

public class SpotifyIconView extends AppCompatImageView implements uue {
    private static final int[] c = {16843105, 16843106, 16843107, 16843108};
    public SpotifyIconDrawable a;
    private SpotifyIconV2 b;
    private final uud d;

    public SpotifyIconView(Context context) {
        this(context, null);
    }

    public SpotifyIconView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x00b7  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x00d3  */
    /* JADX WARNING: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0072  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public SpotifyIconView(android.content.Context r9, android.util.AttributeSet r10, int r11) {
        /*
            r8 = this;
            r8.<init>(r9, r10, r11)
            com.spotify.android.paste.graphics.SpotifyIconV2 r0 = com.spotify.android.paste.graphics.SpotifyIconV2.ALBUM
            r8.b = r0
            uud r0 = new uud
            r0.<init>(r8)
            r8.d = r0
            java.lang.Class<com.spotify.paste.spotifyicon.SpotifyIconView> r0 = com.spotify.paste.spotifyicon.SpotifyIconView.class
            defpackage.uut.a(r0, r8)
            int[] r0 = defpackage.uvw.a.a
            r1 = 0
            android.content.res.TypedArray r0 = r9.obtainStyledAttributes(r10, r0, r11, r1)
            int r2 = defpackage.uvw.a.d
            r3 = -1
            int r2 = r0.getInt(r2, r3)
            if (r2 == r3) goto L_0x003f
            com.spotify.android.paste.graphics.SpotifyIconV2[] r4 = com.spotify.android.paste.graphics.SpotifyIconV2.cS
            int r4 = r4.length
            if (r2 < r4) goto L_0x0039
            com.spotify.android.paste.graphics.SpotifyIcon[] r4 = com.spotify.android.paste.graphics.SpotifyIcon.af
            com.spotify.android.paste.graphics.SpotifyIconV2[] r5 = com.spotify.android.paste.graphics.SpotifyIconV2.cS
            int r5 = r5.length
            int r2 = r2 - r5
            r2 = r4[r2]
            com.spotify.android.paste.graphics.SpotifyIconV2 r4 = com.spotify.android.paste.graphics.SpotifyIconV2.a(r2)
            r8.b = r4
            int r2 = r2.mDefaultSize
            goto L_0x0040
        L_0x0039:
            com.spotify.android.paste.graphics.SpotifyIconV2[] r4 = com.spotify.android.paste.graphics.SpotifyIconV2.cS
            r2 = r4[r2]
            r8.b = r2
        L_0x003f:
            r2 = -1
        L_0x0040:
            int r4 = defpackage.uvw.a.c
            r5 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r4 = r0.getDimension(r4, r5)
            int r6 = defpackage.uvw.a.b
            android.content.res.ColorStateList r6 = r0.getColorStateList(r6)
            r0.recycle()
            int[] r0 = c
            android.content.res.TypedArray r9 = r9.obtainStyledAttributes(r10, r0, r11, r1)
            r10 = 3
            r11 = 0
            float r10 = r9.getFloat(r10, r11)
            r0 = 1
            float r0 = r9.getFloat(r0, r11)
            r7 = 2
            float r11 = r9.getFloat(r7, r11)
            int r1 = r9.getColor(r1, r1)
            r9.recycle()
            int r9 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r9 == 0) goto L_0x0080
            com.spotify.paste.spotifyicon.SpotifyIconDrawable r9 = new com.spotify.paste.spotifyicon.SpotifyIconDrawable
            android.content.Context r2 = r8.getContext()
            com.spotify.android.paste.graphics.SpotifyIconV2 r5 = r8.b
            r9.<init>(r2, r5, r4)
            r8.a = r9
            goto L_0x00b2
        L_0x0080:
            if (r2 == r3) goto L_0x009a
            com.spotify.paste.spotifyicon.SpotifyIconDrawable r9 = new com.spotify.paste.spotifyicon.SpotifyIconDrawable
            android.content.Context r4 = r8.getContext()
            com.spotify.android.paste.graphics.SpotifyIconV2 r5 = r8.b
            float r2 = (float) r2
            android.content.res.Resources r7 = r8.getResources()
            int r2 = defpackage.uts.b(r2, r7)
            float r2 = (float) r2
            r9.<init>(r4, r5, r2)
            r8.a = r9
            goto L_0x00b2
        L_0x009a:
            com.spotify.paste.spotifyicon.SpotifyIconDrawable r9 = new com.spotify.paste.spotifyicon.SpotifyIconDrawable
            android.content.Context r2 = r8.getContext()
            com.spotify.android.paste.graphics.SpotifyIconV2 r4 = r8.b
            r5 = 1107296256(0x42000000, float:32.0)
            android.content.res.Resources r7 = r8.getResources()
            int r5 = defpackage.uts.b(r5, r7)
            float r5 = (float) r5
            r9.<init>(r2, r4, r5)
            r8.a = r9
        L_0x00b2:
            com.spotify.paste.spotifyicon.SpotifyIconDrawable r9 = r8.a
            if (r6 == 0) goto L_0x00b7
            goto L_0x00bb
        L_0x00b7:
            android.content.res.ColorStateList r6 = android.content.res.ColorStateList.valueOf(r3)
        L_0x00bb:
            r9.a(r6)
            com.spotify.paste.spotifyicon.SpotifyIconDrawable r9 = r8.a
            r8.setImageDrawable(r9)
            com.spotify.paste.spotifyicon.SpotifyIconDrawable r9 = r8.a
            android.graphics.Paint r2 = r9.a
            r2.setShadowLayer(r10, r0, r11, r1)
            r9.invalidateSelf()
            boolean r9 = r8.isInEditMode()
            if (r9 != 0) goto L_0x00da
            uug r9 = defpackage.uui.c(r8)
            r9.a()
        L_0x00da:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.paste.spotifyicon.SpotifyIconView.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public final void a(SpotifyIconV2 spotifyIconV2) {
        this.b = spotifyIconV2;
        this.a.a(this.b);
        ip.d(this);
    }

    public final void a(int i) {
        this.a.a(i);
    }

    public final void c(ColorStateList colorStateList) {
        this.a.a(colorStateList);
    }

    public void setImageBitmap(Bitmap bitmap) {
        throw new UnsupportedOperationException("Cannot call this method in SpotifyIconView");
    }

    public void setImageResource(int i) {
        throw new UnsupportedOperationException("Cannot call this method in SpotifyIconView");
    }

    public final void a(b bVar) {
        this.d.a(bVar);
    }

    public final b c() {
        return this.d.a;
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        this.d.b();
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        this.d.a();
    }

    public /* bridge */ /* synthetic */ Drawable getDrawable() {
        return this.a;
    }
}
