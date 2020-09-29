package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import com.spotify.music.R;

/* renamed from: bq reason: default package */
public final class bq {
    /* access modifiers changed from: private */
    public static final Mode a = Mode.SRC_IN;
    private static bq b;
    private cg c;

    public static synchronized void a() {
        synchronized (bq.class) {
            if (b == null) {
                bq bqVar = new bq();
                b = bqVar;
                bqVar.c = cg.a();
                b.c.a((e) new e() {
                    private final int[] a = {R.drawable.abc_textfield_search_default_mtrl_alpha, R.drawable.abc_textfield_default_mtrl_alpha, R.drawable.abc_ab_share_pack_mtrl_alpha};
                    private final int[] b = {R.drawable.abc_ic_commit_search_api_mtrl_alpha, R.drawable.abc_seekbar_tick_mark_material, R.drawable.abc_ic_menu_share_mtrl_alpha, R.drawable.abc_ic_menu_copy_mtrl_am_alpha, R.drawable.abc_ic_menu_cut_mtrl_alpha, R.drawable.abc_ic_menu_selectall_mtrl_alpha, R.drawable.abc_ic_menu_paste_mtrl_am_alpha};
                    private final int[] c = {R.drawable.abc_textfield_activated_mtrl_alpha, R.drawable.abc_textfield_search_activated_mtrl_alpha, R.drawable.abc_cab_background_top_mtrl_alpha, R.drawable.abc_text_cursor_material, R.drawable.abc_text_select_handle_left_mtrl_dark, R.drawable.abc_text_select_handle_middle_mtrl_dark, R.drawable.abc_text_select_handle_right_mtrl_dark, R.drawable.abc_text_select_handle_left_mtrl_light, R.drawable.abc_text_select_handle_middle_mtrl_light, R.drawable.abc_text_select_handle_right_mtrl_light};
                    private final int[] d = {R.drawable.abc_popup_background_mtrl_mult, R.drawable.abc_cab_background_internal_bg, R.drawable.abc_menu_hardkey_panel_mtrl_mult};
                    private final int[] e = {R.drawable.abc_tab_indicator_material, R.drawable.abc_textfield_search_material};
                    private final int[] f = {R.drawable.abc_btn_check_material, R.drawable.abc_btn_radio_material, R.drawable.abc_btn_check_material_anim, R.drawable.abc_btn_radio_material_anim};

                    private static ColorStateList b(Context context, int i) {
                        int a2 = cl.a(context, R.attr.colorControlHighlight);
                        return new ColorStateList(new int[][]{cl.a, cl.c, cl.b, cl.e}, new int[]{cl.c(context, R.attr.colorButtonNormal), gd.a(a2, i), gd.a(a2, i), i});
                    }

                    public final Drawable a(cg cgVar, Context context, int i) {
                        if (i != R.drawable.abc_cab_background_top_material) {
                            return null;
                        }
                        return new LayerDrawable(new Drawable[]{cgVar.a(context, (int) R.drawable.abc_cab_background_internal_bg), cgVar.a(context, (int) R.drawable.abc_cab_background_top_mtrl_alpha)});
                    }

                    private static void a(Drawable drawable, int i, Mode mode) {
                        if (ca.c(drawable)) {
                            drawable = drawable.mutate();
                        }
                        if (mode == null) {
                            mode = bq.a;
                        }
                        drawable.setColorFilter(bq.a(i, mode));
                    }

                    public final boolean a(Context context, int i, Drawable drawable) {
                        if (i == R.drawable.abc_seekbar_track_material) {
                            LayerDrawable layerDrawable = (LayerDrawable) drawable;
                            a(layerDrawable.findDrawableByLayerId(16908288), cl.a(context, R.attr.colorControlNormal), bq.a);
                            a(layerDrawable.findDrawableByLayerId(16908303), cl.a(context, R.attr.colorControlNormal), bq.a);
                            a(layerDrawable.findDrawableByLayerId(16908301), cl.a(context, R.attr.colorControlActivated), bq.a);
                            return true;
                        } else if (i != R.drawable.abc_ratingbar_material && i != R.drawable.abc_ratingbar_indicator_material && i != R.drawable.abc_ratingbar_small_material) {
                            return false;
                        } else {
                            LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
                            a(layerDrawable2.findDrawableByLayerId(16908288), cl.c(context, R.attr.colorControlNormal), bq.a);
                            a(layerDrawable2.findDrawableByLayerId(16908303), cl.a(context, R.attr.colorControlActivated), bq.a);
                            a(layerDrawable2.findDrawableByLayerId(16908301), cl.a(context, R.attr.colorControlActivated), bq.a);
                            return true;
                        }
                    }

                    private static boolean a(int[] iArr, int i) {
                        for (int i2 : iArr) {
                            if (i2 == i) {
                                return true;
                            }
                        }
                        return false;
                    }

                    public final ColorStateList a(Context context, int i) {
                        if (i == R.drawable.abc_edit_text_material) {
                            return ab.a(context, R.color.abc_tint_edittext);
                        }
                        if (i == R.drawable.abc_switch_track_mtrl_alpha) {
                            return ab.a(context, R.color.abc_tint_switch_track);
                        }
                        if (i == R.drawable.abc_switch_thumb_material) {
                            int[][] iArr = new int[3][];
                            int[] iArr2 = new int[3];
                            ColorStateList b2 = cl.b(context, R.attr.colorSwitchThumbNormal);
                            if (b2 == null || !b2.isStateful()) {
                                iArr[0] = cl.a;
                                iArr2[0] = cl.c(context, R.attr.colorSwitchThumbNormal);
                                iArr[1] = cl.d;
                                iArr2[1] = cl.a(context, R.attr.colorControlActivated);
                                iArr[2] = cl.e;
                                iArr2[2] = cl.a(context, R.attr.colorSwitchThumbNormal);
                            } else {
                                iArr[0] = cl.a;
                                iArr2[0] = b2.getColorForState(iArr[0], 0);
                                iArr[1] = cl.d;
                                iArr2[1] = cl.a(context, R.attr.colorControlActivated);
                                iArr[2] = cl.e;
                                iArr2[2] = b2.getDefaultColor();
                            }
                            return new ColorStateList(iArr, iArr2);
                        } else if (i == R.drawable.abc_btn_default_mtrl_shape) {
                            return b(context, cl.a(context, R.attr.colorButtonNormal));
                        } else {
                            if (i == R.drawable.abc_btn_borderless_material) {
                                return b(context, 0);
                            }
                            if (i == R.drawable.abc_btn_colored_material) {
                                return b(context, cl.a(context, R.attr.colorAccent));
                            }
                            if (i == R.drawable.abc_spinner_mtrl_am_alpha || i == R.drawable.abc_spinner_textfield_background_material) {
                                return ab.a(context, R.color.abc_tint_spinner);
                            }
                            if (a(this.b, i)) {
                                return cl.b(context, R.attr.colorControlNormal);
                            }
                            if (a(this.e, i)) {
                                return ab.a(context, R.color.abc_tint_default);
                            }
                            if (a(this.f, i)) {
                                return ab.a(context, R.color.abc_tint_btn_checkable);
                            }
                            if (i == R.drawable.abc_seekbar_thumb_material) {
                                return ab.a(context, R.color.abc_tint_seek_thumb);
                            }
                            return null;
                        }
                    }

                    /* JADX WARNING: Removed duplicated region for block: B:17:0x004c  */
                    /* JADX WARNING: Removed duplicated region for block: B:24:0x0067 A[RETURN] */
                    /* Code decompiled incorrectly, please refer to instructions dump. */
                    public final boolean b(android.content.Context r7, int r8, android.graphics.drawable.Drawable r9) {
                        /*
                            r6 = this;
                            android.graphics.PorterDuff$Mode r0 = defpackage.bq.a
                            int[] r1 = r6.a
                            boolean r1 = a(r1, r8)
                            r2 = 16842801(0x1010031, float:2.3693695E-38)
                            r3 = -1
                            r4 = 0
                            r5 = 1
                            if (r1 == 0) goto L_0x0018
                            r2 = 2130968791(0x7f0400d7, float:1.7546246E38)
                        L_0x0015:
                            r8 = 1
                            r1 = -1
                            goto L_0x004a
                        L_0x0018:
                            int[] r1 = r6.c
                            boolean r1 = a(r1, r8)
                            if (r1 == 0) goto L_0x0024
                            r2 = 2130968789(0x7f0400d5, float:1.7546242E38)
                            goto L_0x0015
                        L_0x0024:
                            int[] r1 = r6.d
                            boolean r1 = a(r1, r8)
                            if (r1 == 0) goto L_0x002f
                            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.MULTIPLY
                            goto L_0x0015
                        L_0x002f:
                            r1 = 2131230773(0x7f080035, float:1.8077608E38)
                            if (r8 != r1) goto L_0x0041
                            r2 = 16842800(0x1010030, float:2.3693693E-38)
                            r8 = 1109603123(0x42233333, float:40.8)
                            int r8 = java.lang.Math.round(r8)
                            r1 = r8
                            r8 = 1
                            goto L_0x004a
                        L_0x0041:
                            r1 = 2131230749(0x7f08001d, float:1.807756E38)
                            if (r8 != r1) goto L_0x0047
                            goto L_0x0015
                        L_0x0047:
                            r8 = 0
                            r1 = -1
                            r2 = 0
                        L_0x004a:
                            if (r8 == 0) goto L_0x0067
                            boolean r8 = defpackage.ca.c(r9)
                            if (r8 == 0) goto L_0x0056
                            android.graphics.drawable.Drawable r9 = r9.mutate()
                        L_0x0056:
                            int r7 = defpackage.cl.a(r7, r2)
                            android.graphics.PorterDuffColorFilter r7 = defpackage.bq.a(r7, r0)
                            r9.setColorFilter(r7)
                            if (r1 == r3) goto L_0x0066
                            r9.setAlpha(r1)
                        L_0x0066:
                            return r5
                        L_0x0067:
                            return r4
                        */
                        throw new UnsupportedOperationException("Method not decompiled: defpackage.bq.AnonymousClass1.b(android.content.Context, int, android.graphics.drawable.Drawable):boolean");
                    }

                    public final Mode a(int i) {
                        if (i == R.drawable.abc_switch_thumb_material) {
                            return Mode.MULTIPLY;
                        }
                        return null;
                    }
                });
            }
        }
    }

    public static synchronized bq b() {
        bq bqVar;
        synchronized (bq.class) {
            if (b == null) {
                a();
            }
            bqVar = b;
        }
        return bqVar;
    }

    public final synchronized Drawable a(Context context, int i) {
        return this.c.a(context, i);
    }

    /* access modifiers changed from: 0000 */
    public final synchronized Drawable a(Context context, int i, boolean z) {
        return this.c.a(context, i, true);
    }

    public final synchronized void a(Context context) {
        this.c.a(context);
    }

    /* access modifiers changed from: 0000 */
    public final synchronized ColorStateList b(Context context, int i) {
        return this.c.b(context, i);
    }

    static void a(Drawable drawable, cn cnVar, int[] iArr) {
        cg.a(drawable, cnVar, iArr);
    }

    public static synchronized PorterDuffColorFilter a(int i, Mode mode) {
        PorterDuffColorFilter a2;
        synchronized (bq.class) {
            a2 = cg.a(i, mode);
        }
        return a2;
    }
}
