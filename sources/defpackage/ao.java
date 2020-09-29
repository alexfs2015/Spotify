package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff.Mode;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.SubMenu;
import android.view.View;
import com.spotify.mobile.android.core.internal.AudioDriver;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: ao reason: default package */
public final class ao extends MenuInflater {
    static final Class<?>[] a;
    static final Class<?>[] b;
    final Object[] c;
    final Object[] d = this.c;
    Context e;
    Object f;

    /* renamed from: ao$a */
    static class a implements OnMenuItemClickListener {
        private static final Class<?>[] a = {MenuItem.class};
        private Object b;
        private Method c;

        public a(Object obj, String str) {
            this.b = obj;
            Class cls = obj.getClass();
            try {
                this.c = cls.getMethod(str, a);
            } catch (Exception e) {
                StringBuilder sb = new StringBuilder("Couldn't resolve menu item onClick handler ");
                sb.append(str);
                sb.append(" in class ");
                sb.append(cls.getName());
                InflateException inflateException = new InflateException(sb.toString());
                inflateException.initCause(e);
                throw inflateException;
            }
        }

        public final boolean onMenuItemClick(MenuItem menuItem) {
            try {
                if (this.c.getReturnType() == Boolean.TYPE) {
                    return ((Boolean) this.c.invoke(this.b, new Object[]{menuItem})).booleanValue();
                }
                this.c.invoke(this.b, new Object[]{menuItem});
                return true;
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }

    /* renamed from: ao$b */
    class b {
        private String A;
        private CharSequence B;
        private CharSequence C;
        private ColorStateList D = null;
        private Mode E = null;
        boolean a;
        hu b;
        private Menu c;
        private int d;
        private int e;
        private int f;
        private int g;
        private boolean h;
        private boolean i;
        private int j;
        private int k;
        private CharSequence l;
        private CharSequence m;
        private int n;
        private char o;
        private int p;
        private char q;
        private int r;
        private int s;
        private boolean t;
        private boolean u;
        private boolean v;
        private int w;
        private int x;
        private String y;
        private String z;

        public b(Menu menu) {
            this.c = menu;
            a();
        }

        private static char a(String str) {
            if (str == null) {
                return 0;
            }
            return str.charAt(0);
        }

        private <T> T a(String str, Class<?>[] clsArr, Object[] objArr) {
            try {
                Constructor constructor = Class.forName(str, false, ao.this.e.getClassLoader()).getConstructor(clsArr);
                constructor.setAccessible(true);
                return constructor.newInstance(objArr);
            } catch (Exception unused) {
                new StringBuilder("Cannot instantiate class: ").append(str);
                return null;
            }
        }

        private void a(MenuItem menuItem) {
            boolean z2 = false;
            menuItem.setChecked(this.t).setVisible(this.u).setEnabled(this.v).setCheckable(this.s > 0).setTitleCondensed(this.m).setIcon(this.n);
            int i2 = this.w;
            if (i2 >= 0) {
                menuItem.setShowAsAction(i2);
            }
            if (this.A != null) {
                if (!ao.this.e.isRestricted()) {
                    ao aoVar = ao.this;
                    if (aoVar.f == null) {
                        aoVar.f = aoVar.a(aoVar.e);
                    }
                    menuItem.setOnMenuItemClickListener(new a(aoVar.f, this.A));
                } else {
                    throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
                }
            }
            if (this.s >= 2) {
                if (menuItem instanceof az) {
                    ((az) menuItem).a(true);
                } else if (menuItem instanceof ba) {
                    ba baVar = (ba) menuItem;
                    try {
                        if (baVar.e == null) {
                            baVar.e = baVar.d.getClass().getDeclaredMethod("setExclusiveCheckable", new Class[]{Boolean.TYPE});
                        }
                        baVar.e.invoke(baVar.d, new Object[]{Boolean.TRUE});
                    } catch (Exception unused) {
                    }
                }
            }
            String str = this.y;
            if (str != null) {
                menuItem.setActionView((View) a(str, ao.a, ao.this.c));
                z2 = true;
            }
            int i3 = this.x;
            if (i3 > 0 && !z2) {
                menuItem.setActionView(i3);
            }
            hu huVar = this.b;
            if (huVar != null) {
                ib.a(menuItem, huVar);
            }
            CharSequence charSequence = this.B;
            boolean z3 = menuItem instanceof gu;
            if (z3) {
                ((gu) menuItem).a(charSequence);
            } else if (VERSION.SDK_INT >= 26) {
                menuItem.setContentDescription(charSequence);
            }
            CharSequence charSequence2 = this.C;
            if (z3) {
                ((gu) menuItem).b(charSequence2);
            } else if (VERSION.SDK_INT >= 26) {
                menuItem.setTooltipText(charSequence2);
            }
            char c2 = this.o;
            int i4 = this.p;
            if (z3) {
                ((gu) menuItem).setAlphabeticShortcut(c2, i4);
            } else if (VERSION.SDK_INT >= 26) {
                menuItem.setAlphabeticShortcut(c2, i4);
            }
            char c3 = this.q;
            int i5 = this.r;
            if (z3) {
                ((gu) menuItem).setNumericShortcut(c3, i5);
            } else if (VERSION.SDK_INT >= 26) {
                menuItem.setNumericShortcut(c3, i5);
            }
            Mode mode = this.E;
            if (mode != null) {
                if (z3) {
                    ((gu) menuItem).setIconTintMode(mode);
                } else if (VERSION.SDK_INT >= 26) {
                    menuItem.setIconTintMode(mode);
                }
            }
            ColorStateList colorStateList = this.D;
            if (colorStateList != null) {
                if (z3) {
                    ((gu) menuItem).setIconTintList(colorStateList);
                } else if (VERSION.SDK_INT >= 26) {
                    menuItem.setIconTintList(colorStateList);
                }
            }
        }

        public final void a() {
            this.d = 0;
            this.e = 0;
            this.f = 0;
            this.g = 0;
            this.h = true;
            this.i = true;
        }

        public final void a(AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = ao.this.e.obtainStyledAttributes(attributeSet, defpackage.o.a.bj);
            this.d = obtainStyledAttributes.getResourceId(defpackage.o.a.bl, 0);
            this.e = obtainStyledAttributes.getInt(defpackage.o.a.bn, 0);
            this.f = obtainStyledAttributes.getInt(defpackage.o.a.bo, 0);
            this.g = obtainStyledAttributes.getInt(defpackage.o.a.bp, 0);
            this.h = obtainStyledAttributes.getBoolean(defpackage.o.a.bm, true);
            this.i = obtainStyledAttributes.getBoolean(defpackage.o.a.bk, true);
            obtainStyledAttributes.recycle();
        }

        public final void b() {
            this.a = true;
            a(this.c.add(this.d, this.j, this.k, this.l));
        }

        public final void b(AttributeSet attributeSet) {
            cp a2 = cp.a(ao.this.e, attributeSet, defpackage.o.a.bq);
            this.j = a2.g(defpackage.o.a.bt, 0);
            this.k = (a2.a(defpackage.o.a.bw, this.e) & -65536) | (a2.a(defpackage.o.a.bx, this.f) & AudioDriver.SPOTIFY_MAX_VOLUME);
            this.l = a2.c(defpackage.o.a.by);
            this.m = a2.c(defpackage.o.a.bz);
            this.n = a2.g(defpackage.o.a.br, 0);
            this.o = a(a2.d(defpackage.o.a.bA));
            this.p = a2.a(defpackage.o.a.bH, 4096);
            this.q = a(a2.d(defpackage.o.a.bB));
            this.r = a2.a(defpackage.o.a.bL, 4096);
            if (a2.f(defpackage.o.a.bC)) {
                this.s = a2.a(defpackage.o.a.bC, false) ? 1 : 0;
            } else {
                this.s = this.g;
            }
            this.t = a2.a(defpackage.o.a.bu, false);
            this.u = a2.a(defpackage.o.a.bv, this.h);
            this.v = a2.a(defpackage.o.a.bs, this.i);
            this.w = a2.a(defpackage.o.a.bM, -1);
            this.A = a2.d(defpackage.o.a.bD);
            this.x = a2.g(defpackage.o.a.bE, 0);
            this.y = a2.d(defpackage.o.a.bG);
            this.z = a2.d(defpackage.o.a.bF);
            if ((this.z != null) && this.x == 0 && this.y == null) {
                this.b = (hu) a(this.z, ao.b, ao.this.d);
            } else {
                this.b = null;
            }
            this.B = a2.c(defpackage.o.a.bI);
            this.C = a2.c(defpackage.o.a.bN);
            if (a2.f(defpackage.o.a.bK)) {
                this.E = ca.a(a2.a(defpackage.o.a.bK, -1), this.E);
            } else {
                this.E = null;
            }
            if (a2.f(defpackage.o.a.bJ)) {
                this.D = a2.e(defpackage.o.a.bJ);
            } else {
                this.D = null;
            }
            a2.a.recycle();
            this.a = false;
        }

        public final SubMenu c() {
            this.a = true;
            SubMenu addSubMenu = this.c.addSubMenu(this.d, this.j, this.k, this.l);
            a(addSubMenu.getItem());
            return addSubMenu;
        }
    }

    static {
        Class[] clsArr = {Context.class};
        a = clsArr;
        b = clsArr;
    }

    public ao(Context context) {
        super(context);
        this.e = context;
        this.c = new Object[]{context};
    }

    private void a(XmlPullParser xmlPullParser, AttributeSet attributeSet, Menu menu) {
        String str;
        b bVar = new b(menu);
        int eventType = xmlPullParser.getEventType();
        while (true) {
            str = "menu";
            if (eventType != 2) {
                eventType = xmlPullParser.next();
                if (eventType == 1) {
                    break;
                }
            } else {
                String name = xmlPullParser.getName();
                if (name.equals(str)) {
                    eventType = xmlPullParser.next();
                } else {
                    StringBuilder sb = new StringBuilder("Expecting menu, got ");
                    sb.append(name);
                    throw new RuntimeException(sb.toString());
                }
            }
        }
        int i = eventType;
        String str2 = null;
        boolean z = false;
        boolean z2 = false;
        while (!z) {
            if (i != 1) {
                String str3 = "item";
                String str4 = "group";
                if (i != 2) {
                    if (i == 3) {
                        String name2 = xmlPullParser.getName();
                        if (z2 && name2.equals(str2)) {
                            str2 = null;
                            z2 = false;
                        } else if (name2.equals(str4)) {
                            bVar.a();
                        } else if (name2.equals(str3)) {
                            if (!bVar.a) {
                                if (bVar.b == null || !bVar.b.c()) {
                                    bVar.b();
                                } else {
                                    bVar.c();
                                }
                            }
                        } else if (name2.equals(str)) {
                            z = true;
                        }
                    }
                } else if (!z2) {
                    String name3 = xmlPullParser.getName();
                    if (name3.equals(str4)) {
                        bVar.a(attributeSet);
                    } else if (name3.equals(str3)) {
                        bVar.b(attributeSet);
                    } else if (name3.equals(str)) {
                        a(xmlPullParser, attributeSet, bVar.c());
                    } else {
                        str2 = name3;
                        z2 = true;
                    }
                }
                i = xmlPullParser.next();
            } else {
                throw new RuntimeException("Unexpected end of document");
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public Object a(Object obj) {
        while (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) {
            obj = ((ContextWrapper) obj).getBaseContext();
        }
        return obj;
    }

    public final void inflate(int i, Menu menu) {
        String str = "Error inflating menu XML";
        if (!(menu instanceof gt)) {
            super.inflate(i, menu);
            return;
        }
        XmlResourceParser xmlResourceParser = null;
        try {
            xmlResourceParser = this.e.getResources().getLayout(i);
            a(xmlResourceParser, Xml.asAttributeSet(xmlResourceParser), menu);
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
        } catch (XmlPullParserException e2) {
            throw new InflateException(str, e2);
        } catch (IOException e3) {
            throw new InflateException(str, e3);
        } catch (Throwable th) {
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
            throw th;
        }
    }
}
