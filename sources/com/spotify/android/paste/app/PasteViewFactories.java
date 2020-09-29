package com.spotify.android.paste.app;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CheckedTextView;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.NumberPicker;
import android.widget.RadioButton;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.ToggleButton;
import androidx.appcompat.widget.SwitchCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.android.glue.internal.StateListAnimatorButton;
import com.spotify.android.glue.internal.StateListAnimatorImageButton;
import com.spotify.android.glue.internal.StateListAnimatorImageView;
import com.spotify.android.glue.internal.StateListAnimatorRadioButton;
import com.spotify.android.glue.internal.StateListAnimatorTextView;
import com.spotify.android.glue.internal.StateListAnimatorToggleButton;
import com.spotify.android.glue.internal.StyleableNumberPicker;
import com.spotify.music.R;
import com.spotify.paste.spotifyicon.SpotifyIconView;
import com.spotify.paste.widgets.internal.PasteConstraintLayout;
import com.spotify.paste.widgets.internal.PasteFrameLayout;
import com.spotify.paste.widgets.internal.PasteLinearLayout;
import com.spotify.paste.widgets.internal.PasteRelativeLayout;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import me.grantland.widget.AutofitTextView;

public final class PasteViewFactories {
    private static final Map<String, ViewFactory> a;
    private static final Map<String, ViewFactory> b;
    private static final Map<Class<? extends View>, ViewFactory> c;

    public enum ViewFactory {
        AUTOCOMPLETETEXTVIEW(AutoCompleteTextView.class) {
            public final int a() {
                return R.attr.pasteDefaultsAutoCompleteTextViewStyle;
            }

            public final View a(Context context, AttributeSet attributeSet, int i) {
                return new AutoCompleteTextView(context, attributeSet, i);
            }
        },
        BUTTON(Button.class) {
            public final int a() {
                return R.attr.pasteDefaultsButtonStyle;
            }

            public final View a(Context context, AttributeSet attributeSet, int i) {
                return new StateListAnimatorButton(context, attributeSet, i);
            }
        },
        IMAGEVIEW(ImageView.class) {
            public final View a(Context context, AttributeSet attributeSet, int i) {
                return new StateListAnimatorImageView(context, attributeSet, i);
            }
        },
        IMAGEBUTTON(ImageButton.class) {
            public final int a() {
                return 16842866;
            }

            public final View a(Context context, AttributeSet attributeSet, int i) {
                return new StateListAnimatorImageButton(context, attributeSet, i);
            }
        },
        TOGGLEBUTTON(ToggleButton.class) {
            public final int a() {
                return 16842827;
            }

            public final View a(Context context, AttributeSet attributeSet, int i) {
                return new StateListAnimatorToggleButton(context, attributeSet, i);
            }
        },
        CHECKBOX(CheckBox.class) {
            public final int a() {
                return R.attr.pasteDefaultsCheckboxStyle;
            }

            public final View a(Context context, AttributeSet attributeSet, int i) {
                return new CheckBox(context, attributeSet, i);
            }
        },
        CHECKEDTEXTVIEW(CheckedTextView.class) {
            public final int a() {
                return R.attr.pasteDefaultsCheckedTextViewStyle;
            }

            public final View a(Context context, AttributeSet attributeSet, int i) {
                return new CheckedTextView(context, attributeSet, i);
            }
        },
        EDITTEXT(EditText.class) {
            public final int a() {
                return R.attr.pasteDefaultsEditTextStyle;
            }

            public final View a(Context context, AttributeSet attributeSet, int i) {
                return new EditText(context, attributeSet, i);
            }
        },
        RADIOBUTTON(RadioButton.class) {
            public final int a() {
                return R.attr.pasteDefaultsRadioButtonStyle;
            }

            public final View a(Context context, AttributeSet attributeSet, int i) {
                return new StateListAnimatorRadioButton(context, attributeSet, i);
            }
        },
        TEXTVIEW(TextView.class) {
            public final int a() {
                return R.attr.pasteDefaultsTextStyle;
            }

            public final /* synthetic */ View a(Context context, AttributeSet attributeSet, int i) {
                return new StateListAnimatorTextView(context, attributeSet, i);
            }
        },
        SWITCHCOMPAT_VIEW(SwitchCompat.class) {
            public final int a() {
                return R.attr.pasteDefaultsSwitchStyle;
            }

            public final View a(Context context, AttributeSet attributeSet, int i) {
                return new SwitchCompat(context, attributeSet, i);
            }
        },
        AUTOFIT_TEXTVIEW(AutofitTextView.class) {
            public final int a() {
                return R.attr.pasteDefaultsTextStyle;
            }

            public final View a(Context context, AttributeSet attributeSet, int i) {
                return new AutofitTextView(context, attributeSet, i);
            }
        },
        NUMBERPICKER_VIEW(NumberPicker.class) {
            public final View a(Context context, AttributeSet attributeSet, int i) {
                return new StyleableNumberPicker(context, attributeSet);
            }
        },
        SPOTIFY_ICON_VIEW(SpotifyIconView.class) {
            public final View a(Context context, AttributeSet attributeSet, int i) {
                return new SpotifyIconView(context, attributeSet, i);
            }
        },
        LINEAR_LAYOUT(LinearLayout.class) {
            public final View a(Context context, AttributeSet attributeSet, int i) {
                return new PasteLinearLayout(context, attributeSet, i);
            }
        },
        FRAME_LAYOUT(FrameLayout.class) {
            public final View a(Context context, AttributeSet attributeSet, int i) {
                return new PasteFrameLayout(context, attributeSet, i);
            }
        },
        RELATIVE_LAYOUT(RelativeLayout.class) {
            public final View a(Context context, AttributeSet attributeSet, int i) {
                return new PasteRelativeLayout(context, attributeSet, i);
            }
        },
        CONSTRAINT_LAYOUT(ConstraintLayout.class) {
            public final View a(Context context, AttributeSet attributeSet, int i) {
                return new PasteConstraintLayout(context, attributeSet, i);
            }
        };
        
        public static final ViewFactory[] a = null;
        final Class<? extends View> mName;

        static {
            a = values();
        }

        private ViewFactory(Class<? extends View> cls) {
            this.mName = cls;
        }

        public int a() {
            return 0;
        }

        public abstract View a(Context context, AttributeSet attributeSet, int i);
    }

    static {
        ViewFactory[] viewFactoryArr;
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        HashMap hashMap3 = new HashMap();
        for (ViewFactory viewFactory : ViewFactory.a) {
            hashMap3.put(viewFactory.mName, viewFactory);
            hashMap.put(viewFactory.mName.getSimpleName(), viewFactory);
            hashMap2.put(viewFactory.mName.getName(), viewFactory);
        }
        c = Collections.unmodifiableMap(hashMap3);
        b = Collections.unmodifiableMap(hashMap2);
        a = Collections.unmodifiableMap(hashMap);
    }

    public static ViewFactory a(Class<? extends View> cls) {
        return (ViewFactory) c.get(cls);
    }

    public static ViewFactory a(String str) {
        ViewFactory viewFactory = (ViewFactory) b.get(str);
        return viewFactory == null ? (ViewFactory) a.get(str) : viewFactory;
    }
}
