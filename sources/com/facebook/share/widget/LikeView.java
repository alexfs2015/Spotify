package com.facebook.share.widget;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.FacebookException;
import com.facebook.share.internal.LikeBoxCountView;
import com.facebook.share.internal.LikeBoxCountView.LikeBoxCountViewCaretPosition;
import com.spotify.music.R;

@Deprecated
public class LikeView extends FrameLayout {
    /* access modifiers changed from: private */
    public String a;
    /* access modifiers changed from: private */
    public ObjectType b;
    private LinearLayout c;
    private aom d;
    private LikeBoxCountView e;
    private TextView f;
    private aol g;
    private BroadcastReceiver h;
    /* access modifiers changed from: private */
    public a i;
    private Style j = Style.c;
    private HorizontalAlignment k = HorizontalAlignment.d;
    private AuxiliaryViewPosition l = AuxiliaryViewPosition.d;
    private int m = -1;
    private int n;
    private int o;
    private boolean p;

    /* renamed from: com.facebook.share.widget.LikeView$2 reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] a = new int[AuxiliaryViewPosition.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|8) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        static {
            /*
                com.facebook.share.widget.LikeView$AuxiliaryViewPosition[] r0 = com.facebook.share.widget.LikeView.AuxiliaryViewPosition.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                a = r0
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.facebook.share.widget.LikeView$AuxiliaryViewPosition r1 = com.facebook.share.widget.LikeView.AuxiliaryViewPosition.TOP     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x001f }
                com.facebook.share.widget.LikeView$AuxiliaryViewPosition r1 = com.facebook.share.widget.LikeView.AuxiliaryViewPosition.BOTTOM     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x002a }
                com.facebook.share.widget.LikeView$AuxiliaryViewPosition r1 = com.facebook.share.widget.LikeView.AuxiliaryViewPosition.INLINE     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.share.widget.LikeView.AnonymousClass2.<clinit>():void");
        }
    }

    @Deprecated
    public enum AuxiliaryViewPosition {
        BOTTOM("bottom", 0),
        INLINE("inline", 1),
        TOP("top", 2);
        
        static AuxiliaryViewPosition d;
        /* access modifiers changed from: private */
        public int intValue;
        private String stringValue;

        static {
            AuxiliaryViewPosition auxiliaryViewPosition;
            d = auxiliaryViewPosition;
        }

        private AuxiliaryViewPosition(String str, int i) {
            this.stringValue = str;
            this.intValue = i;
        }

        static AuxiliaryViewPosition a(int i) {
            AuxiliaryViewPosition[] values;
            for (AuxiliaryViewPosition auxiliaryViewPosition : values()) {
                if (auxiliaryViewPosition.intValue == i) {
                    return auxiliaryViewPosition;
                }
            }
            return null;
        }

        public final String toString() {
            return this.stringValue;
        }
    }

    @Deprecated
    public enum HorizontalAlignment {
        CENTER("center", 0),
        LEFT("left", 1),
        RIGHT("right", 2);
        
        static HorizontalAlignment d;
        /* access modifiers changed from: private */
        public int intValue;
        private String stringValue;

        static {
            HorizontalAlignment horizontalAlignment;
            d = horizontalAlignment;
        }

        private HorizontalAlignment(String str, int i) {
            this.stringValue = str;
            this.intValue = i;
        }

        static HorizontalAlignment a(int i) {
            HorizontalAlignment[] values;
            for (HorizontalAlignment horizontalAlignment : values()) {
                if (horizontalAlignment.intValue == i) {
                    return horizontalAlignment;
                }
            }
            return null;
        }

        public final String toString() {
            return this.stringValue;
        }
    }

    @Deprecated
    public enum ObjectType {
        UNKNOWN("unknown", 0),
        OPEN_GRAPH("open_graph", 1),
        PAGE("page", 2);
        
        public static ObjectType c;
        public int intValue;
        private String stringValue;

        static {
            ObjectType objectType;
            c = objectType;
        }

        private ObjectType(String str, int i) {
            this.stringValue = str;
            this.intValue = i;
        }

        public static ObjectType a(int i) {
            ObjectType[] values;
            for (ObjectType objectType : values()) {
                if (objectType.intValue == i) {
                    return objectType;
                }
            }
            return null;
        }

        public final String toString() {
            return this.stringValue;
        }
    }

    @Deprecated
    public enum Style {
        STANDARD("standard", 0),
        BUTTON("button", 1),
        BOX_COUNT("box_count", 2);
        
        static Style c;
        /* access modifiers changed from: private */
        public int intValue;
        private String stringValue;

        static {
            Style style;
            c = style;
        }

        private Style(String str, int i) {
            this.stringValue = str;
            this.intValue = i;
        }

        static Style a(int i) {
            Style[] values;
            for (Style style : values()) {
                if (style.intValue == i) {
                    return style;
                }
            }
            return null;
        }

        public final String toString() {
            return this.stringValue;
        }
    }

    class a implements defpackage.aol.c {
        boolean a;

        private a() {
        }

        /* synthetic */ a(LikeView likeView, byte b2) {
            this();
        }

        public final void a(aol aol, FacebookException facebookException) {
            if (!this.a) {
                if (aol != null) {
                    facebookException = new FacebookException("Cannot use LikeView. The device may not be supported.");
                    LikeView.a(LikeView.this, aol);
                    LikeView.this.b();
                }
                if (!(facebookException == null || LikeView.d(LikeView.this) == null)) {
                    LikeView.d(LikeView.this);
                }
                LikeView.this.i = null;
            }
        }
    }

    class b extends BroadcastReceiver {
        private b() {
        }

        /* synthetic */ b(LikeView likeView, byte b) {
            this();
        }

        public final void onReceive(Context context, Intent intent) {
            String action = intent.getAction();
            Bundle extras = intent.getExtras();
            boolean z = true;
            if (extras != null) {
                String string = extras.getString("com.facebook.sdk.LikeActionController.OBJECT_ID");
                if (!ank.a(string) && !ank.a(LikeView.this.a, string)) {
                    z = false;
                }
            }
            if (z) {
                if ("com.facebook.sdk.LikeActionController.UPDATED".equals(action)) {
                    LikeView.this.b();
                    return;
                }
                if ("com.facebook.sdk.LikeActionController.DID_ERROR".equals(action)) {
                    if (LikeView.d(LikeView.this) != null) {
                        LikeView.d(LikeView.this);
                        anf.a(extras);
                    }
                } else if ("com.facebook.sdk.LikeActionController.DID_RESET".equals(action)) {
                    LikeView likeView = LikeView.this;
                    likeView.a(likeView.a, LikeView.this.b);
                    LikeView.this.b();
                }
            }
        }
    }

    public interface c {
    }

    @Deprecated
    public LikeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        boolean z = true;
        this.p = true;
        if (!(attributeSet == null || getContext() == null)) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, defpackage.amd.a.a);
            if (obtainStyledAttributes != null) {
                this.a = ank.a(obtainStyledAttributes.getString(defpackage.amd.a.e), (String) null);
                this.b = ObjectType.a(obtainStyledAttributes.getInt(defpackage.amd.a.f, ObjectType.c.intValue));
                this.j = Style.a(obtainStyledAttributes.getInt(defpackage.amd.a.g, Style.c.intValue));
                if (this.j != null) {
                    this.l = AuxiliaryViewPosition.a(obtainStyledAttributes.getInt(defpackage.amd.a.b, AuxiliaryViewPosition.d.intValue));
                    if (this.l != null) {
                        this.k = HorizontalAlignment.a(obtainStyledAttributes.getInt(defpackage.amd.a.d, HorizontalAlignment.d.intValue));
                        if (this.k != null) {
                            this.m = obtainStyledAttributes.getColor(defpackage.amd.a.c, -1);
                            obtainStyledAttributes.recycle();
                        } else {
                            throw new IllegalArgumentException("Unsupported value for LikeView 'horizontal_alignment'");
                        }
                    } else {
                        throw new IllegalArgumentException("Unsupported value for LikeView 'auxiliary_view_position'");
                    }
                } else {
                    throw new IllegalArgumentException("Unsupported value for LikeView 'style'");
                }
            }
        }
        this.n = getResources().getDimensionPixelSize(R.dimen.com_facebook_likeview_edge_padding);
        this.o = getResources().getDimensionPixelSize(R.dimen.com_facebook_likeview_internal_padding);
        if (this.m == -1) {
            this.m = getResources().getColor(R.color.com_facebook_likeview_text_color);
        }
        setBackgroundColor(0);
        this.c = new LinearLayout(context);
        this.c.setLayoutParams(new LayoutParams(-2, -2));
        aol aol = this.g;
        if (aol == null || !aol.a) {
            z = false;
        }
        this.d = new aom(context, z);
        this.d.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                LikeView.a(LikeView.this);
            }
        });
        this.d.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        this.f = new TextView(context);
        this.f.setTextSize(0, getResources().getDimension(R.dimen.com_facebook_likeview_text_size));
        this.f.setMaxLines(2);
        this.f.setTextColor(this.m);
        this.f.setGravity(17);
        this.f.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
        this.e = new LikeBoxCountView(context);
        this.e.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        this.c.addView(this.d);
        this.c.addView(this.f);
        this.c.addView(this.e);
        addView(this.c);
        a(this.a, this.b);
        b();
    }

    private void a() {
        if (this.h != null) {
            mh.a(getContext()).a(this.h);
            this.h = null;
        }
        a aVar = this.i;
        if (aVar != null) {
            aVar.a = true;
            this.i = null;
        }
        this.g = null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0019  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static /* synthetic */ void a(com.facebook.share.widget.LikeView r6) {
        /*
            aol r0 = r6.g
            if (r0 == 0) goto L_0x008e
            android.content.Context r0 = r6.getContext()
        L_0x0008:
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 != 0) goto L_0x0017
            boolean r2 = r0 instanceof android.content.ContextWrapper
            if (r2 == 0) goto L_0x0017
            android.content.ContextWrapper r0 = (android.content.ContextWrapper) r0
            android.content.Context r0 = r0.getBaseContext()
            goto L_0x0008
        L_0x0017:
            if (r1 == 0) goto L_0x0086
            android.app.Activity r0 = (android.app.Activity) r0
            aol r1 = r6.g
            r2 = 0
            android.os.Bundle r3 = new android.os.Bundle
            r3.<init>()
            com.facebook.share.widget.LikeView$Style r4 = r6.j
            java.lang.String r4 = r4.toString()
            java.lang.String r5 = "style"
            r3.putString(r5, r4)
            com.facebook.share.widget.LikeView$AuxiliaryViewPosition r4 = r6.l
            java.lang.String r4 = r4.toString()
            java.lang.String r5 = "auxiliary_position"
            r3.putString(r5, r4)
            com.facebook.share.widget.LikeView$HorizontalAlignment r4 = r6.k
            java.lang.String r4 = r4.toString()
            java.lang.String r5 = "horizontal_alignment"
            r3.putString(r5, r4)
            java.lang.String r4 = r6.a
            java.lang.String r5 = ""
            java.lang.String r4 = defpackage.ank.a(r4, r5)
            java.lang.String r5 = "object_id"
            r3.putString(r5, r4)
            com.facebook.share.widget.LikeView$ObjectType r6 = r6.b
            java.lang.String r6 = r6.toString()
            java.lang.String r4 = "object_type"
            r3.putString(r4, r6)
            boolean r6 = r1.a
            r6 = r6 ^ 1
            boolean r4 = r1.d()
            if (r4 == 0) goto L_0x0082
            r1.a(r6)
            boolean r4 = r1.b
            if (r4 == 0) goto L_0x0077
            alk r6 = r1.c()
            java.lang.String r0 = "fb_like_control_did_undo_quickly"
            r6.b(r0, r3)
            return
        L_0x0077:
            boolean r4 = r1.a(r6, r3)
            if (r4 != 0) goto L_0x008e
            r6 = r6 ^ 1
            r1.a(r6)
        L_0x0082:
            r1.a(r0, r2, r3)
            goto L_0x008e
        L_0x0086:
            com.facebook.FacebookException r6 = new com.facebook.FacebookException
            java.lang.String r0 = "Unable to get Activity."
            r6.<init>(r0)
            throw r6
        L_0x008e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.share.widget.LikeView.a(com.facebook.share.widget.LikeView):void");
    }

    static /* synthetic */ void a(LikeView likeView, aol aol) {
        likeView.g = aol;
        likeView.h = new b(likeView, 0);
        mh a2 = mh.a(likeView.getContext());
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.facebook.sdk.LikeActionController.UPDATED");
        intentFilter.addAction("com.facebook.sdk.LikeActionController.DID_ERROR");
        intentFilter.addAction("com.facebook.sdk.LikeActionController.DID_RESET");
        a2.a(likeView.h, intentFilter);
    }

    /* access modifiers changed from: private */
    public void a(String str, ObjectType objectType) {
        a();
        this.a = str;
        this.b = objectType;
        if (!ank.a(str)) {
            this.i = new a(this, 0);
            if (!isInEditMode()) {
                aol.a(str, objectType, (defpackage.aol.c) this.i);
            }
        }
    }

    /* access modifiers changed from: private */
    public void b() {
        boolean z = !this.p;
        aol aol = this.g;
        if (aol == null) {
            this.d.setSelected(false);
            this.f.setText(null);
            this.e.a((String) null);
        } else {
            this.d.setSelected(aol.a);
            this.f.setText(this.g.b());
            this.e.a(this.g.a());
            z = false;
        }
        super.setEnabled(z);
        this.d.setEnabled(z);
        c();
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00da  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void c() {
        /*
            r7 = this;
            android.widget.LinearLayout r0 = r7.c
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r0 = (android.widget.FrameLayout.LayoutParams) r0
            aom r1 = r7.d
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r1 = (android.widget.LinearLayout.LayoutParams) r1
            com.facebook.share.widget.LikeView$HorizontalAlignment r2 = r7.k
            com.facebook.share.widget.LikeView$HorizontalAlignment r3 = com.facebook.share.widget.LikeView.HorizontalAlignment.LEFT
            r4 = 3
            r5 = 1
            if (r2 != r3) goto L_0x001a
            r2 = 3
            goto L_0x0023
        L_0x001a:
            com.facebook.share.widget.LikeView$HorizontalAlignment r2 = r7.k
            com.facebook.share.widget.LikeView$HorizontalAlignment r3 = com.facebook.share.widget.LikeView.HorizontalAlignment.CENTER
            if (r2 != r3) goto L_0x0022
            r2 = 1
            goto L_0x0023
        L_0x0022:
            r2 = 5
        L_0x0023:
            r3 = r2 | 48
            r0.gravity = r3
            r1.gravity = r2
            android.widget.TextView r0 = r7.f
            r1 = 8
            r0.setVisibility(r1)
            com.facebook.share.internal.LikeBoxCountView r0 = r7.e
            r0.setVisibility(r1)
            com.facebook.share.widget.LikeView$Style r0 = r7.j
            com.facebook.share.widget.LikeView$Style r1 = com.facebook.share.widget.LikeView.Style.STANDARD
            if (r0 != r1) goto L_0x004c
            aol r0 = r7.g
            if (r0 == 0) goto L_0x004c
            java.lang.String r0 = r0.b()
            boolean r0 = defpackage.ank.a(r0)
            if (r0 != 0) goto L_0x004c
            android.widget.TextView r0 = r7.f
            goto L_0x0065
        L_0x004c:
            com.facebook.share.widget.LikeView$Style r0 = r7.j
            com.facebook.share.widget.LikeView$Style r1 = com.facebook.share.widget.LikeView.Style.BOX_COUNT
            if (r0 != r1) goto L_0x00e1
            aol r0 = r7.g
            if (r0 == 0) goto L_0x00e1
            java.lang.String r0 = r0.a()
            boolean r0 = defpackage.ank.a(r0)
            if (r0 != 0) goto L_0x00e1
            r7.d()
            com.facebook.share.internal.LikeBoxCountView r0 = r7.e
        L_0x0065:
            r1 = 0
            r0.setVisibility(r1)
            android.view.ViewGroup$LayoutParams r3 = r0.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r3 = (android.widget.LinearLayout.LayoutParams) r3
            r3.gravity = r2
            android.widget.LinearLayout r2 = r7.c
            com.facebook.share.widget.LikeView$AuxiliaryViewPosition r3 = r7.l
            com.facebook.share.widget.LikeView$AuxiliaryViewPosition r6 = com.facebook.share.widget.LikeView.AuxiliaryViewPosition.INLINE
            if (r3 != r6) goto L_0x007a
            goto L_0x007b
        L_0x007a:
            r1 = 1
        L_0x007b:
            r2.setOrientation(r1)
            com.facebook.share.widget.LikeView$AuxiliaryViewPosition r1 = r7.l
            com.facebook.share.widget.LikeView$AuxiliaryViewPosition r2 = com.facebook.share.widget.LikeView.AuxiliaryViewPosition.TOP
            if (r1 == r2) goto L_0x009c
            com.facebook.share.widget.LikeView$AuxiliaryViewPosition r1 = r7.l
            com.facebook.share.widget.LikeView$AuxiliaryViewPosition r2 = com.facebook.share.widget.LikeView.AuxiliaryViewPosition.INLINE
            if (r1 != r2) goto L_0x0091
            com.facebook.share.widget.LikeView$HorizontalAlignment r1 = r7.k
            com.facebook.share.widget.LikeView$HorizontalAlignment r2 = com.facebook.share.widget.LikeView.HorizontalAlignment.RIGHT
            if (r1 != r2) goto L_0x0091
            goto L_0x009c
        L_0x0091:
            android.widget.LinearLayout r1 = r7.c
            r1.removeView(r0)
            android.widget.LinearLayout r1 = r7.c
            r1.addView(r0)
            goto L_0x00aa
        L_0x009c:
            android.widget.LinearLayout r1 = r7.c
            aom r2 = r7.d
            r1.removeView(r2)
            android.widget.LinearLayout r1 = r7.c
            aom r2 = r7.d
            r1.addView(r2)
        L_0x00aa:
            int[] r1 = com.facebook.share.widget.LikeView.AnonymousClass2.a
            com.facebook.share.widget.LikeView$AuxiliaryViewPosition r2 = r7.l
            int r2 = r2.ordinal()
            r1 = r1[r2]
            if (r1 == r5) goto L_0x00da
            r2 = 2
            if (r1 == r2) goto L_0x00d2
            if (r1 == r4) goto L_0x00bc
            goto L_0x00d1
        L_0x00bc:
            com.facebook.share.widget.LikeView$HorizontalAlignment r1 = r7.k
            com.facebook.share.widget.LikeView$HorizontalAlignment r2 = com.facebook.share.widget.LikeView.HorizontalAlignment.RIGHT
            if (r1 != r2) goto L_0x00ca
            int r1 = r7.n
            int r2 = r7.o
            r0.setPadding(r1, r1, r2, r1)
            return
        L_0x00ca:
            int r1 = r7.o
            int r2 = r7.n
            r0.setPadding(r1, r2, r2, r2)
        L_0x00d1:
            return
        L_0x00d2:
            int r1 = r7.n
            int r2 = r7.o
            r0.setPadding(r1, r2, r1, r1)
            return
        L_0x00da:
            int r1 = r7.n
            int r2 = r7.o
            r0.setPadding(r1, r1, r1, r2)
        L_0x00e1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.share.widget.LikeView.c():void");
    }

    static /* synthetic */ c d(LikeView likeView) {
        return null;
    }

    private void d() {
        LikeBoxCountViewCaretPosition likeBoxCountViewCaretPosition;
        LikeBoxCountView likeBoxCountView;
        int i2 = AnonymousClass2.a[this.l.ordinal()];
        if (i2 == 1) {
            likeBoxCountView = this.e;
            likeBoxCountViewCaretPosition = LikeBoxCountViewCaretPosition.BOTTOM;
        } else if (i2 == 2) {
            likeBoxCountView = this.e;
            likeBoxCountViewCaretPosition = LikeBoxCountViewCaretPosition.TOP;
        } else if (i2 == 3) {
            likeBoxCountView = this.e;
            likeBoxCountViewCaretPosition = this.k == HorizontalAlignment.RIGHT ? LikeBoxCountViewCaretPosition.RIGHT : LikeBoxCountViewCaretPosition.LEFT;
        } else {
            return;
        }
        likeBoxCountView.a(likeBoxCountViewCaretPosition);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        ObjectType objectType = ObjectType.UNKNOWN;
        String a2 = ank.a((String) null, (String) null);
        if (objectType == null) {
            objectType = ObjectType.c;
        }
        if (!ank.a(a2, this.a) || objectType != this.b) {
            a(a2, objectType);
            b();
        }
        super.onDetachedFromWindow();
    }

    @Deprecated
    public void setEnabled(boolean z) {
        this.p = true;
        b();
    }
}
