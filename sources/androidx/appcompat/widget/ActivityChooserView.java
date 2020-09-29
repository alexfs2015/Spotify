package androidx.appcompat.widget;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import android.os.Build.VERSION;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.AccessibilityDelegate;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.PopupWindow.OnDismissListener;
import android.widget.TextView;
import com.spotify.music.R;
import java.util.ArrayList;

public class ActivityChooserView extends ViewGroup {
    final a a;
    final View b;
    final Drawable c;
    final FrameLayout d;
    final FrameLayout e;
    final ImageView f;
    boolean g;
    int h;
    boolean i;
    private final b j;
    private final ImageView k;
    private final int l;
    private DataSetObserver m;
    private final OnGlobalLayoutListener n;
    private ListPopupWindow o;

    public static class InnerLayout extends LinearLayout {
        private static final int[] a = {16842964};

        public InnerLayout(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            cp a2 = cp.a(context, attributeSet, a);
            setBackgroundDrawable(a2.a(0));
            a2.a.recycle();
        }
    }

    class a extends BaseAdapter {
        boolean a;
        private int b = 4;
        private boolean c;
        private boolean d;

        a() {
        }

        public final int getCount() {
            bn bnVar = null;
            int a2 = bnVar.a();
            if (!this.a && bnVar.b() != null) {
                a2--;
            }
            int min = Math.min(a2, this.b);
            return this.d ? min + 1 : min;
        }

        public final Object getItem(int i) {
            int itemViewType = getItemViewType(i);
            bn bnVar = null;
            if (itemViewType == 0) {
                if (!this.a && bnVar.b() != null) {
                    i++;
                }
                return bnVar.a(i);
            } else if (itemViewType == 1) {
                return bnVar;
            } else {
                throw new IllegalArgumentException();
            }
        }

        public final long getItemId(int i) {
            return (long) i;
        }

        public final int getItemViewType(int i) {
            return (!this.d || i != getCount() - 1) ? 0 : 1;
        }

        public final View getView(int i, View view, ViewGroup viewGroup) {
            int itemViewType = getItemViewType(i);
            if (itemViewType == 0) {
                if (view == null || view.getId() != R.id.list_item) {
                    view = LayoutInflater.from(ActivityChooserView.this.getContext()).inflate(R.layout.abc_activity_chooser_view_list_item, viewGroup, false);
                }
                PackageManager packageManager = ActivityChooserView.this.getContext().getPackageManager();
                ResolveInfo resolveInfo = (ResolveInfo) getItem(i);
                ((ImageView) view.findViewById(R.id.icon)).setImageDrawable(resolveInfo.loadIcon(packageManager));
                ((TextView) view.findViewById(R.id.title)).setText(resolveInfo.loadLabel(packageManager));
                if (!this.a || i != 0 || !this.c) {
                    view.setActivated(false);
                } else {
                    view.setActivated(true);
                }
                return view;
            } else if (itemViewType == 1) {
                if (view == null || view.getId() != 1) {
                    view = LayoutInflater.from(ActivityChooserView.this.getContext()).inflate(R.layout.abc_activity_chooser_view_list_item, viewGroup, false);
                    view.setId(1);
                    ((TextView) view.findViewById(R.id.title)).setText(ActivityChooserView.this.getContext().getString(R.string.abc_activity_chooser_view_see_all));
                }
                return view;
            } else {
                throw new IllegalArgumentException();
            }
        }

        public final int getViewTypeCount() {
            return 3;
        }
    }

    class b implements OnClickListener, OnLongClickListener, OnItemClickListener, OnDismissListener {
        b() {
        }

        public final void onClick(View view) {
            if (view == ActivityChooserView.this.e) {
                ActivityChooserView.this.a();
                a aVar = ActivityChooserView.this.a;
                bn bnVar = null;
                ResolveInfo b = bnVar.b();
                a aVar2 = ActivityChooserView.this.a;
                int a2 = bnVar.a(b);
                a aVar3 = ActivityChooserView.this.a;
                Intent b2 = bnVar.b(a2);
                if (b2 != null) {
                    b2.addFlags(524288);
                    ActivityChooserView.this.getContext().startActivity(b2);
                }
            } else if (view == ActivityChooserView.this.d) {
                ActivityChooserView activityChooserView = ActivityChooserView.this;
                activityChooserView.g = false;
                activityChooserView.a(activityChooserView.h);
            } else {
                throw new IllegalArgumentException();
            }
        }

        public final void onDismiss() {
        }

        public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            int itemViewType = ((a) adapterView.getAdapter()).getItemViewType(i);
            if (itemViewType == 0) {
                ActivityChooserView.this.a();
                bn bnVar = null;
                if (ActivityChooserView.this.g) {
                    if (i > 0) {
                        a aVar = ActivityChooserView.this.a;
                        synchronized (bnVar.b) {
                            bnVar.d();
                            defpackage.bn.a aVar2 = (defpackage.bn.a) bnVar.c.get(i);
                            if (bnVar.d.add(new defpackage.bn.b(new ComponentName(aVar2.a.activityInfo.packageName, aVar2.a.activityInfo.name), System.currentTimeMillis(), ((defpackage.bn.a) bnVar.c.get(0)) != null ? 5.0f : 1.0f))) {
                                bnVar.i = true;
                                bnVar.e();
                                if (bnVar.h) {
                                    if (bnVar.i) {
                                        bnVar.i = false;
                                        if (!TextUtils.isEmpty(bnVar.f)) {
                                            new c().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Object[]{new ArrayList(bnVar.d), bnVar.f});
                                        }
                                    }
                                    bnVar.notifyChanged();
                                } else {
                                    throw new IllegalStateException("No preceding call to #readHistoricalData");
                                }
                            }
                        }
                    }
                    return;
                }
                if (!ActivityChooserView.this.a.a) {
                    i++;
                }
                a aVar3 = ActivityChooserView.this.a;
                Intent b = bnVar.b(i);
                if (b != null) {
                    b.addFlags(524288);
                    ActivityChooserView.this.getContext().startActivity(b);
                }
            } else if (itemViewType == 1) {
                ActivityChooserView.this.a(Integer.MAX_VALUE);
            } else {
                throw new IllegalArgumentException();
            }
        }

        public final boolean onLongClick(View view) {
            if (view == ActivityChooserView.this.e) {
                if (ActivityChooserView.this.a.getCount() > 0) {
                    ActivityChooserView activityChooserView = ActivityChooserView.this;
                    activityChooserView.g = true;
                    activityChooserView.a(activityChooserView.h);
                }
                return true;
            }
            throw new IllegalArgumentException();
        }
    }

    public ActivityChooserView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ActivityChooserView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.m = new DataSetObserver() {
            public final void onChanged() {
                super.onChanged();
                ActivityChooserView.this.a.notifyDataSetChanged();
            }

            public final void onInvalidated() {
                super.onInvalidated();
                ActivityChooserView.this.a.notifyDataSetInvalidated();
            }
        };
        this.n = new OnGlobalLayoutListener() {
            public final void onGlobalLayout() {
                if (ActivityChooserView.this.b()) {
                    if (!ActivityChooserView.this.isShown()) {
                        ActivityChooserView.this.c().d();
                        return;
                    }
                    ActivityChooserView.this.c().d_();
                }
            }
        };
        this.h = 4;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, defpackage.o.a.D, i2, 0);
        if (VERSION.SDK_INT >= 29) {
            saveAttributeDataForStyleable(context, defpackage.o.a.D, attributeSet, obtainStyledAttributes, i2, 0);
        }
        this.h = obtainStyledAttributes.getInt(defpackage.o.a.F, 4);
        Drawable drawable = obtainStyledAttributes.getDrawable(defpackage.o.a.E);
        obtainStyledAttributes.recycle();
        LayoutInflater.from(getContext()).inflate(R.layout.abc_activity_chooser_view, this, true);
        this.j = new b();
        this.b = findViewById(R.id.activity_chooser_view_content);
        this.c = this.b.getBackground();
        this.e = (FrameLayout) findViewById(R.id.default_activity_button);
        this.e.setOnClickListener(this.j);
        this.e.setOnLongClickListener(this.j);
        this.f = (ImageView) this.e.findViewById(R.id.image);
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.expand_activities_button);
        frameLayout.setOnClickListener(this.j);
        frameLayout.setAccessibilityDelegate(new AccessibilityDelegate() {
            public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
                super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                ja a2 = ja.a(accessibilityNodeInfo);
                if (VERSION.SDK_INT >= 19) {
                    a2.a.setCanOpenPopup(true);
                }
            }
        });
        frameLayout.setOnTouchListener(new cd(frameLayout) {
            public final bg a() {
                return ActivityChooserView.this.c();
            }

            public final boolean b() {
                ActivityChooserView activityChooserView = ActivityChooserView.this;
                if (!activityChooserView.b() && activityChooserView.i) {
                    activityChooserView.g = false;
                    activityChooserView.a(activityChooserView.h);
                }
                return true;
            }

            public final boolean c() {
                ActivityChooserView.this.a();
                return true;
            }
        });
        this.d = frameLayout;
        this.k = (ImageView) frameLayout.findViewById(R.id.image);
        this.k.setImageDrawable(drawable);
        this.a = new a();
        this.a.registerDataSetObserver(new DataSetObserver() {
            /* JADX WARNING: type inference failed for: r1v3, types: [bn, android.graphics.drawable.Drawable] */
            /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r1v3, types: [bn, android.graphics.drawable.Drawable]
              assigns: [?[int, float, boolean, short, byte, char, OBJECT, ARRAY]]
              uses: [bn, android.graphics.drawable.Drawable]
              mth insns count: 38
            	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
            	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
            	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
            	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
            	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
            	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$0(DepthTraversal.java:13)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:13)
            	at jadx.core.ProcessClass.process(ProcessClass.java:30)
            	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
            	at jadx.api.JavaClass.decompile(JavaClass.java:62)
            	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
             */
            /* JADX WARNING: Unknown variable types count: 1 */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void onChanged() {
                /*
                    r6 = this;
                    super.onChanged()
                    androidx.appcompat.widget.ActivityChooserView r0 = androidx.appcompat.widget.ActivityChooserView.this
                    androidx.appcompat.widget.ActivityChooserView$a r1 = r0.a
                    int r1 = r1.getCount()
                    r2 = 0
                    r3 = 1
                    if (r1 <= 0) goto L_0x0015
                    android.widget.FrameLayout r1 = r0.d
                    r1.setEnabled(r3)
                    goto L_0x001a
                L_0x0015:
                    android.widget.FrameLayout r1 = r0.d
                    r1.setEnabled(r2)
                L_0x001a:
                    androidx.appcompat.widget.ActivityChooserView$a r1 = r0.a
                    r1 = 0
                    int r4 = r1.a()
                    androidx.appcompat.widget.ActivityChooserView$a r5 = r0.a
                    int r5 = r1.c()
                    if (r4 == r3) goto L_0x0036
                    if (r4 <= r3) goto L_0x002e
                    if (r5 <= 0) goto L_0x002e
                    goto L_0x0036
                L_0x002e:
                    android.widget.FrameLayout r2 = r0.e
                    r3 = 8
                    r2.setVisibility(r3)
                    goto L_0x0052
                L_0x0036:
                    android.widget.FrameLayout r3 = r0.e
                    r3.setVisibility(r2)
                    androidx.appcompat.widget.ActivityChooserView$a r2 = r0.a
                    android.content.pm.ResolveInfo r2 = r1.b()
                    android.content.Context r3 = r0.getContext()
                    android.content.pm.PackageManager r3 = r3.getPackageManager()
                    android.widget.ImageView r4 = r0.f
                    android.graphics.drawable.Drawable r2 = r2.loadIcon(r3)
                    r4.setImageDrawable(r2)
                L_0x0052:
                    android.widget.FrameLayout r2 = r0.e
                    int r2 = r2.getVisibility()
                    if (r2 != 0) goto L_0x0062
                    android.view.View r1 = r0.b
                    android.graphics.drawable.Drawable r0 = r0.c
                    r1.setBackgroundDrawable(r0)
                    return
                L_0x0062:
                    android.view.View r0 = r0.b
                    r0.setBackgroundDrawable(r1)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActivityChooserView.AnonymousClass5.onChanged():void");
            }
        });
        Resources resources = context.getResources();
        this.l = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
    }

    /* access modifiers changed from: 0000 */
    public final void a(int i2) {
        a aVar = this.a;
        throw new IllegalStateException("No data model. Did you call #setDataModel?");
    }

    public final boolean a() {
        if (c().p.isShowing()) {
            c().d();
            ViewTreeObserver viewTreeObserver = getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeGlobalOnLayoutListener(this.n);
            }
        }
        return true;
    }

    public final boolean b() {
        return c().p.isShowing();
    }

    /* access modifiers changed from: 0000 */
    public final ListPopupWindow c() {
        if (this.o == null) {
            this.o = new ListPopupWindow(getContext());
            this.o.a((ListAdapter) this.a);
            ListPopupWindow listPopupWindow = this.o;
            listPopupWindow.k = this;
            listPopupWindow.a(true);
            ListPopupWindow listPopupWindow2 = this.o;
            b bVar = this.j;
            listPopupWindow2.l = bVar;
            listPopupWindow2.a((OnDismissListener) bVar);
        }
        return this.o;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        a aVar = this.a;
        this.i = true;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a aVar = this.a;
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.n);
        }
        if (b()) {
            a();
        }
        this.i = false;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        this.b.layout(0, 0, i4 - i2, i5 - i3);
        if (!b()) {
            a();
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i2, int i3) {
        View view = this.b;
        if (this.e.getVisibility() != 0) {
            i3 = MeasureSpec.makeMeasureSpec(MeasureSpec.getSize(i3), 1073741824);
        }
        measureChild(view, i2, i3);
        setMeasuredDimension(view.getMeasuredWidth(), view.getMeasuredHeight());
    }
}
