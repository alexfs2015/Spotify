package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.appcompat.app.AlertController;
import androidx.appcompat.app.AlertController.RecycleListView;
import androidx.appcompat.app.AlertController.c;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.widget.NestedScrollView;
import androidx.core.widget.NestedScrollView.b;
import com.spotify.music.R;

/* renamed from: p reason: default package */
public class p extends u implements DialogInterface {
    public final AlertController a = new AlertController(getContext(), this, getWindow());

    /* renamed from: p$a */
    public static class a {
        public final androidx.appcompat.app.AlertController.a a;
        private final int b;

        public a(Context context) {
            this(context, p.a(context, 0));
        }

        public a(Context context, int i) {
            this.a = new androidx.appcompat.app.AlertController.a(new ContextThemeWrapper(context, p.a(context, i)));
            this.b = i;
        }

        public final a a(CharSequence charSequence) {
            this.a.d = charSequence;
            return this;
        }

        public final a a(int i, OnClickListener onClickListener) {
            androidx.appcompat.app.AlertController.a aVar = this.a;
            aVar.g = aVar.a.getText(i);
            this.a.h = onClickListener;
            return this;
        }

        public final a b(int i, OnClickListener onClickListener) {
            androidx.appcompat.app.AlertController.a aVar = this.a;
            aVar.i = aVar.a.getText(i);
            this.a.j = onClickListener;
            return this;
        }

        public final a a(View view) {
            androidx.appcompat.app.AlertController.a aVar = this.a;
            aVar.p = view;
            aVar.o = 0;
            aVar.q = false;
            return this;
        }

        public final p a() {
            int i;
            ListAdapter listAdapter;
            p pVar = new p(this.a.a, this.b);
            androidx.appcompat.app.AlertController.a aVar = this.a;
            AlertController alertController = pVar.a;
            if (aVar.e != null) {
                alertController.G = aVar.e;
            } else {
                if (aVar.d != null) {
                    alertController.a(aVar.d);
                }
                if (aVar.c != null) {
                    Drawable drawable = aVar.c;
                    alertController.C = drawable;
                    alertController.B = 0;
                    if (alertController.D != null) {
                        if (drawable != null) {
                            alertController.D.setVisibility(0);
                            alertController.D.setImageDrawable(drawable);
                        } else {
                            alertController.D.setVisibility(8);
                        }
                    }
                }
            }
            if (aVar.f != null) {
                CharSequence charSequence = aVar.f;
                alertController.f = charSequence;
                if (alertController.F != null) {
                    alertController.F.setText(charSequence);
                }
            }
            if (aVar.g != null) {
                alertController.a(-1, aVar.g, aVar.h, null, null);
            }
            if (aVar.i != null) {
                alertController.a(-2, aVar.i, aVar.j, null, null);
            }
            if (aVar.m != null) {
                RecycleListView recycleListView = (RecycleListView) aVar.b.inflate(alertController.L, null);
                if (aVar.r) {
                    i = alertController.N;
                } else {
                    i = alertController.O;
                }
                if (aVar.m != null) {
                    listAdapter = aVar.m;
                } else {
                    listAdapter = new c(aVar.a, i, 16908308, null);
                }
                alertController.H = listAdapter;
                alertController.I = aVar.s;
                if (aVar.n != null) {
                    recycleListView.setOnItemClickListener(new OnItemClickListener(alertController) {
                        private /* synthetic */ AlertController a;

                        {
                            this.a = r2;
                        }

                        public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                            a.this.n.onClick(this.a.b, i);
                            if (!a.this.r) {
                                this.a.b.dismiss();
                            }
                        }
                    });
                }
                if (aVar.r) {
                    recycleListView.setChoiceMode(1);
                }
                alertController.g = recycleListView;
            }
            if (aVar.p != null) {
                alertController.h = aVar.p;
                alertController.i = 0;
                alertController.n = false;
            }
            pVar.setCancelable(this.a.k);
            if (this.a.k) {
                pVar.setCanceledOnTouchOutside(true);
            }
            pVar.setOnCancelListener(null);
            pVar.setOnDismissListener(null);
            if (this.a.l != null) {
                pVar.setOnKeyListener(this.a.l);
            }
            return pVar;
        }

        public final p b() {
            p a2 = a();
            a2.show();
            return a2;
        }
    }

    protected p(Context context, int i) {
        super(context, a(context, i));
    }

    static int a(Context context, int i) {
        if ((i >>> 24) > 0) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        this.a.a(charSequence);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        boolean z;
        View view;
        View view2;
        super.onCreate(bundle);
        AlertController alertController = this.a;
        int i = alertController.K;
        alertController.b.setContentView(alertController.J);
        View findViewById = alertController.c.findViewById(R.id.parentPanel);
        View findViewById2 = findViewById.findViewById(R.id.topPanel);
        View findViewById3 = findViewById.findViewById(R.id.contentPanel);
        View findViewById4 = findViewById.findViewById(R.id.buttonPanel);
        ViewGroup viewGroup = (ViewGroup) findViewById.findViewById(R.id.customPanel);
        int i2 = 0;
        View view3 = alertController.h != null ? alertController.h : alertController.i != 0 ? LayoutInflater.from(alertController.a).inflate(alertController.i, viewGroup, false) : null;
        boolean z2 = view3 != null;
        if (!z2 || !AlertController.a(view3)) {
            alertController.c.setFlags(131072, 131072);
        }
        if (z2) {
            FrameLayout frameLayout = (FrameLayout) alertController.c.findViewById(R.id.custom);
            frameLayout.addView(view3, new LayoutParams(-1, -1));
            if (alertController.n) {
                frameLayout.setPadding(alertController.j, alertController.k, alertController.l, alertController.m);
            }
            if (alertController.g != null) {
                ((LinearLayoutCompat.LayoutParams) viewGroup.getLayoutParams()).g = 0.0f;
            }
        } else {
            viewGroup.setVisibility(8);
        }
        View findViewById5 = viewGroup.findViewById(R.id.topPanel);
        View findViewById6 = viewGroup.findViewById(R.id.contentPanel);
        View findViewById7 = viewGroup.findViewById(R.id.buttonPanel);
        ViewGroup a2 = AlertController.a(findViewById5, findViewById2);
        ViewGroup a3 = AlertController.a(findViewById6, findViewById3);
        ViewGroup a4 = AlertController.a(findViewById7, findViewById4);
        alertController.A = (NestedScrollView) alertController.c.findViewById(R.id.scrollView);
        alertController.A.setFocusable(false);
        alertController.A.setNestedScrollingEnabled(false);
        alertController.F = (TextView) a3.findViewById(16908299);
        if (alertController.F != null) {
            if (alertController.f != null) {
                alertController.F.setText(alertController.f);
            } else {
                alertController.F.setVisibility(8);
                alertController.A.removeView(alertController.F);
                if (alertController.g != null) {
                    ViewGroup viewGroup2 = (ViewGroup) alertController.A.getParent();
                    int indexOfChild = viewGroup2.indexOfChild(alertController.A);
                    viewGroup2.removeViewAt(indexOfChild);
                    viewGroup2.addView(alertController.g, indexOfChild, new LayoutParams(-1, -1));
                } else {
                    a3.setVisibility(8);
                }
            }
        }
        alertController.o = (Button) a4.findViewById(16908313);
        alertController.o.setOnClickListener(alertController.R);
        if (!TextUtils.isEmpty(alertController.p) || alertController.r != null) {
            alertController.o.setText(alertController.p);
            if (alertController.r != null) {
                alertController.r.setBounds(0, 0, alertController.d, alertController.d);
                alertController.o.setCompoundDrawables(alertController.r, null, null, null);
            }
            alertController.o.setVisibility(0);
            z = true;
        } else {
            alertController.o.setVisibility(8);
            z = false;
        }
        alertController.s = (Button) a4.findViewById(16908314);
        alertController.s.setOnClickListener(alertController.R);
        if (!TextUtils.isEmpty(alertController.t) || alertController.v != null) {
            alertController.s.setText(alertController.t);
            if (alertController.v != null) {
                alertController.v.setBounds(0, 0, alertController.d, alertController.d);
                alertController.s.setCompoundDrawables(alertController.v, null, null, null);
            }
            alertController.s.setVisibility(0);
            z |= true;
        } else {
            alertController.s.setVisibility(8);
        }
        alertController.w = (Button) a4.findViewById(16908315);
        alertController.w.setOnClickListener(alertController.R);
        if (!TextUtils.isEmpty(alertController.x) || alertController.z != null) {
            alertController.w.setText(alertController.x);
            if (alertController.r != null) {
                alertController.r.setBounds(0, 0, alertController.d, alertController.d);
                view = null;
                alertController.o.setCompoundDrawables(alertController.r, null, null, null);
            } else {
                view = null;
            }
            alertController.w.setVisibility(0);
            z |= true;
        } else {
            alertController.w.setVisibility(8);
            view = null;
        }
        Context context = alertController.a;
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogCenterButtons, typedValue, true);
        if (typedValue.data != 0) {
            if (z) {
                AlertController.a(alertController.o);
            } else if (z) {
                AlertController.a(alertController.s);
            } else if (z) {
                AlertController.a(alertController.w);
            }
        }
        if (!(z)) {
            a4.setVisibility(8);
        }
        if (alertController.G != null) {
            a2.addView(alertController.G, 0, new LayoutParams(-1, -2));
            alertController.c.findViewById(R.id.title_template).setVisibility(8);
        } else {
            alertController.D = (ImageView) alertController.c.findViewById(16908294);
            if (!(!TextUtils.isEmpty(alertController.e)) || !alertController.P) {
                alertController.c.findViewById(R.id.title_template).setVisibility(8);
                alertController.D.setVisibility(8);
                a2.setVisibility(8);
            } else {
                alertController.E = (TextView) alertController.c.findViewById(R.id.alertTitle);
                alertController.E.setText(alertController.e);
                if (alertController.B != 0) {
                    alertController.D.setImageResource(alertController.B);
                } else if (alertController.C != null) {
                    alertController.D.setImageDrawable(alertController.C);
                } else {
                    alertController.E.setPadding(alertController.D.getPaddingLeft(), alertController.D.getPaddingTop(), alertController.D.getPaddingRight(), alertController.D.getPaddingBottom());
                    alertController.D.setVisibility(8);
                }
            }
        }
        boolean z3 = (viewGroup == null || viewGroup.getVisibility() == 8) ? false : true;
        int i3 = (a2 == null || a2.getVisibility() == 8) ? 0 : 1;
        boolean z4 = (a4 == null || a4.getVisibility() == 8) ? false : true;
        if (!z4 && a3 != null) {
            View findViewById8 = a3.findViewById(R.id.textSpacerNoButtons);
            if (findViewById8 != null) {
                findViewById8.setVisibility(0);
            }
        }
        if (i3 != 0) {
            if (alertController.A != null) {
                alertController.A.setClipToPadding(true);
            }
            if (alertController.f == null && alertController.g == null) {
                view2 = view;
            } else {
                view2 = a2.findViewById(R.id.titleDividerNoCustom);
            }
            if (view2 != null) {
                view2.setVisibility(0);
            }
        } else if (a3 != null) {
            View findViewById9 = a3.findViewById(R.id.textSpacerNoTitle);
            if (findViewById9 != null) {
                findViewById9.setVisibility(0);
            }
        }
        if (alertController.g instanceof RecycleListView) {
            RecycleListView recycleListView = (RecycleListView) alertController.g;
            if (!z4 || i3 == 0) {
                recycleListView.setPadding(recycleListView.getPaddingLeft(), i3 != 0 ? recycleListView.getPaddingTop() : recycleListView.a, recycleListView.getPaddingRight(), z4 ? recycleListView.getPaddingBottom() : recycleListView.b);
            }
        }
        if (!z3) {
            View view4 = alertController.g != null ? alertController.g : alertController.A;
            if (view4 != null) {
                if (z4) {
                    i2 = 2;
                }
                int i4 = i3 | i2;
                View findViewById10 = alertController.c.findViewById(R.id.scrollIndicatorUp);
                View findViewById11 = alertController.c.findViewById(R.id.scrollIndicatorDown);
                if (VERSION.SDK_INT >= 23) {
                    ip.a(view4, i4, 3);
                    if (findViewById10 != null) {
                        a3.removeView(findViewById10);
                    }
                    if (findViewById11 != null) {
                        a3.removeView(findViewById11);
                    }
                } else {
                    if (findViewById10 != null && (i4 & 1) == 0) {
                        a3.removeView(findViewById10);
                        findViewById10 = view;
                    }
                    if (findViewById11 != null && (i4 & 2) == 0) {
                        a3.removeView(findViewById11);
                        findViewById11 = view;
                    }
                    if (!(findViewById10 == null && findViewById11 == null)) {
                        if (alertController.f != null) {
                            alertController.A.a = new b(findViewById10, findViewById11) {
                                private /* synthetic */ View a;
                                private /* synthetic */ View b;

                                {
                                    this.a = r2;
                                    this.b = r3;
                                }

                                public final void a(NestedScrollView nestedScrollView) {
                                    AlertController.a(nestedScrollView, this.a, this.b);
                                }
                            };
                            alertController.A.post(new Runnable(findViewById10, findViewById11) {
                                private /* synthetic */ View a;
                                private /* synthetic */ View b;

                                {
                                    this.a = r2;
                                    this.b = r3;
                                }

                                public final void run() {
                                    AlertController.a(AlertController.this.A, this.a, this.b);
                                }
                            });
                        } else if (alertController.g != null) {
                            alertController.g.setOnScrollListener(new OnScrollListener(findViewById10, findViewById11) {
                                private /* synthetic */ View a;
                                private /* synthetic */ View b;

                                public final void onScrollStateChanged(AbsListView absListView, int i) {
                                }

                                {
                                    this.a = r2;
                                    this.b = r3;
                                }

                                public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
                                    AlertController.a(absListView, this.a, this.b);
                                }
                            });
                            alertController.g.post(new Runnable(findViewById10, findViewById11) {
                                private /* synthetic */ View a;
                                private /* synthetic */ View b;

                                {
                                    this.a = r2;
                                    this.b = r3;
                                }

                                public final void run() {
                                    AlertController.a(AlertController.this.g, this.a, this.b);
                                }
                            });
                        } else {
                            if (findViewById10 != null) {
                                a3.removeView(findViewById10);
                            }
                            if (findViewById11 != null) {
                                a3.removeView(findViewById11);
                            }
                        }
                    }
                }
            }
        }
        ListView listView = alertController.g;
        if (listView != null && alertController.H != null) {
            listView.setAdapter(alertController.H);
            int i5 = alertController.I;
            if (i5 >= 0) {
                listView.setItemChecked(i5, true);
                listView.setSelection(i5);
            }
        }
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        AlertController alertController = this.a;
        if (alertController.A != null && alertController.A.a(keyEvent)) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        AlertController alertController = this.a;
        if (alertController.A != null && alertController.A.a(keyEvent)) {
            return true;
        }
        return super.onKeyUp(i, keyEvent);
    }
}
