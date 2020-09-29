package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup.LayoutParams;
import android.widget.AbsListView.SelectionBoundsAdjuster;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import com.spotify.music.R;

public class ListMenuItemView extends LinearLayout implements SelectionBoundsAdjuster, a {
    public az a;
    public ImageView b;
    public boolean c;
    public boolean d;
    public boolean e;
    private ImageView f;
    private RadioButton g;
    private TextView h;
    private CheckBox i;
    private TextView j;
    private ImageView k;
    private LinearLayout l;
    private Drawable m;
    private int n;
    private Context o;
    private Drawable p;
    private int q;
    private LayoutInflater r;

    public final boolean a_() {
        return false;
    }

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.listMenuViewStyle);
    }

    public ListMenuItemView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet);
        cp a2 = cp.a(getContext(), attributeSet, a.bO, i2, 0);
        this.m = a2.a(a.bQ);
        this.n = a2.g(a.bP, -1);
        this.c = a2.a(a.bR, false);
        this.o = context;
        this.p = a2.a(a.bS);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{16843049}, R.attr.dropDownListViewStyle, 0);
        this.d = obtainStyledAttributes.hasValue(0);
        a2.a.recycle();
        obtainStyledAttributes.recycle();
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        ip.a((View) this, this.m);
        this.h = (TextView) findViewById(R.id.title);
        int i2 = this.n;
        if (i2 != -1) {
            this.h.setTextAppearance(this.o, i2);
        }
        this.j = (TextView) findViewById(R.id.shortcut);
        this.k = (ImageView) findViewById(R.id.submenuarrow);
        ImageView imageView = this.k;
        if (imageView != null) {
            imageView.setImageDrawable(this.p);
        }
        this.b = (ImageView) findViewById(R.id.group_divider);
        this.l = (LinearLayout) findViewById(R.id.content);
    }

    public final void a(az azVar, int i2) {
        String str;
        CompoundButton compoundButton;
        CompoundButton compoundButton2;
        this.a = azVar;
        int i3 = 0;
        this.q = 0;
        setVisibility(azVar.isVisible() ? 0 : 8);
        CharSequence a2 = azVar.a((a) this);
        if (a2 != null) {
            this.h.setText(a2);
            if (this.h.getVisibility() != 0) {
                this.h.setVisibility(0);
            }
        } else if (this.h.getVisibility() != 8) {
            this.h.setVisibility(8);
        }
        boolean isCheckable = azVar.isCheckable();
        if (!(!isCheckable && this.g == null && this.i == null)) {
            if (this.a.e()) {
                if (this.g == null) {
                    this.g = (RadioButton) c().inflate(R.layout.abc_list_menu_item_radio, this, false);
                    a((View) this.g, -1);
                }
                compoundButton2 = this.g;
                compoundButton = this.i;
            } else {
                if (this.i == null) {
                    this.i = (CheckBox) c().inflate(R.layout.abc_list_menu_item_checkbox, this, false);
                    a((View) this.i, -1);
                }
                compoundButton2 = this.i;
                compoundButton = this.g;
            }
            if (isCheckable) {
                compoundButton2.setChecked(this.a.isChecked());
                if (compoundButton2.getVisibility() != 0) {
                    compoundButton2.setVisibility(0);
                }
                if (!(compoundButton == null || compoundButton.getVisibility() == 8)) {
                    compoundButton.setVisibility(8);
                }
            } else {
                CheckBox checkBox = this.i;
                if (checkBox != null) {
                    checkBox.setVisibility(8);
                }
                RadioButton radioButton = this.g;
                if (radioButton != null) {
                    radioButton.setVisibility(8);
                }
            }
        }
        int i4 = (!azVar.d() || !this.a.d()) ? 8 : 0;
        if (i4 == 0) {
            TextView textView = this.j;
            az azVar2 = this.a;
            char c2 = azVar2.c();
            if (c2 == 0) {
                str = "";
            } else {
                Resources resources = azVar2.d.a.getResources();
                StringBuilder sb = new StringBuilder();
                if (ViewConfiguration.get(azVar2.d.a).hasPermanentMenuKey()) {
                    sb.append(resources.getString(R.string.abc_prepend_shortcut_label));
                }
                int i5 = azVar2.d.c() ? azVar2.c : azVar2.b;
                az.a(sb, i5, 65536, resources.getString(R.string.abc_menu_meta_shortcut_label));
                az.a(sb, i5, 4096, resources.getString(R.string.abc_menu_ctrl_shortcut_label));
                az.a(sb, i5, 2, resources.getString(R.string.abc_menu_alt_shortcut_label));
                az.a(sb, i5, 1, resources.getString(R.string.abc_menu_shift_shortcut_label));
                az.a(sb, i5, 4, resources.getString(R.string.abc_menu_sym_shortcut_label));
                az.a(sb, i5, 8, resources.getString(R.string.abc_menu_function_shortcut_label));
                if (c2 == 8) {
                    sb.append(resources.getString(R.string.abc_menu_delete_shortcut_label));
                } else if (c2 == 10) {
                    sb.append(resources.getString(R.string.abc_menu_enter_shortcut_label));
                } else if (c2 != ' ') {
                    sb.append(c2);
                } else {
                    sb.append(resources.getString(R.string.abc_menu_space_shortcut_label));
                }
                str = sb.toString();
            }
            textView.setText(str);
        }
        if (this.j.getVisibility() != i4) {
            this.j.setVisibility(i4);
        }
        Drawable icon = azVar.getIcon();
        ax axVar = this.a.d;
        boolean z = this.e;
        if ((z || this.c) && !(this.f == null && icon == null && !this.c)) {
            if (this.f == null) {
                this.f = (ImageView) c().inflate(R.layout.abc_list_menu_item_icon, this, false);
                a((View) this.f, 0);
            }
            if (icon != null || this.c) {
                ImageView imageView = this.f;
                if (!z) {
                    icon = null;
                }
                imageView.setImageDrawable(icon);
                if (this.f.getVisibility() != 0) {
                    this.f.setVisibility(0);
                }
            } else {
                this.f.setVisibility(8);
            }
        }
        setEnabled(azVar.isEnabled());
        boolean hasSubMenu = azVar.hasSubMenu();
        ImageView imageView2 = this.k;
        if (imageView2 != null) {
            if (!hasSubMenu) {
                i3 = 8;
            }
            imageView2.setVisibility(i3);
        }
        setContentDescription(azVar.getContentDescription());
    }

    private void a(View view, int i2) {
        LinearLayout linearLayout = this.l;
        if (linearLayout != null) {
            linearLayout.addView(view, i2);
        } else {
            addView(view, i2);
        }
    }

    public final az a() {
        return this.a;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i2, int i3) {
        if (this.f != null && this.c) {
            LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f.getLayoutParams();
            if (layoutParams.height > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = layoutParams.height;
            }
        }
        super.onMeasure(i2, i3);
    }

    private LayoutInflater c() {
        if (this.r == null) {
            this.r = LayoutInflater.from(getContext());
        }
        return this.r;
    }

    public void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.b;
        if (imageView != null && imageView.getVisibility() == 0) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.b.getLayoutParams();
            rect.top += this.b.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
        }
    }
}
