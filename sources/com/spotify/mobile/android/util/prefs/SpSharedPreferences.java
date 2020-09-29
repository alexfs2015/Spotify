package com.spotify.mobile.android.util.prefs;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import io.reactivex.Observable;
import io.reactivex.ObservableOnSubscribe;
import java.util.Collections;
import java.util.HashSet;
import java.util.NoSuchElementException;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

public class SpSharedPreferences<S> {
    public final SharedPreferences a;

    public static class Update<T> {
        public final T a;
        public final Type b;

        public enum Type {
            CHANGED,
            NOT_IN_PREFS,
            SET_TO_NULL
        }

        public Update(Type type, T t) {
            this.b = (Type) fbp.a(type);
            this.a = t;
        }
    }

    public static class a<S> {
        private boolean a = false;
        private Editor b;

        protected a(Editor editor) {
            this.b = editor;
        }

        public final a<S> a(b<S, ?> bVar) {
            fbp.a(bVar);
            this.b.remove(bVar.a);
            return this;
        }

        public final a<S> a(b<S, Integer> bVar, int i) {
            fbp.a(bVar);
            this.b.putInt(bVar.a, i);
            return this;
        }

        public final a<S> a(b<S, Long> bVar, long j) {
            fbp.a(bVar);
            this.b.putLong(bVar.a, j);
            return this;
        }

        public final a<S> a(b<S, String> bVar, String str) {
            fbp.a(bVar);
            this.b.putString(bVar.a, str);
            return this;
        }

        public final a<S> a(b<S, Set<String>> bVar, Set<String> set) {
            fbp.a(bVar);
            this.b.putStringSet(bVar.a, set);
            return this;
        }

        public final a<S> a(b<S, JSONArray> bVar, JSONArray jSONArray) {
            fbp.a(bVar);
            this.b.putString(bVar.a, jSONArray.toString());
            return this;
        }

        public final a<S> a(b<S, JSONObject> bVar, JSONObject jSONObject) {
            fbp.a(bVar);
            this.b.putString(bVar.a, jSONObject.toString());
            return this;
        }

        public final a<S> a(b<S, Boolean> bVar, boolean z) {
            fbp.a(bVar);
            this.b.putBoolean(bVar.a, z);
            return this;
        }

        public final void a() {
            if (!this.a) {
                this.b.commit();
                this.a = true;
                return;
            }
            String str = "ttseodnciote asmt   eceh a tEsuiinwr euMnst";
            throw new IllegalStateException("Must not use the same Editor instance twice");
        }

        public final void b() {
            if (!this.a) {
                this.b.apply();
                this.a = true;
                return;
            }
            throw new IllegalStateException("Must not use the same Editor instance twice");
        }
    }

    public static final class b<S, T> {
        private static Set<String> b = new HashSet(64);
        public final String a;

        private b(String str) {
            this.a = str;
        }

        public static synchronized <U> b<Object, U> a(String str) {
            b<Object, U> c;
            synchronized (b.class) {
                try {
                    c = c(str);
                } finally {
                }
            }
            return c;
        }

        public static synchronized <U> b<Object, U> b(String str) {
            b<Object, U> c;
            Class<b> cls = b.class;
            synchronized (b.class) {
                try {
                    c = c(str);
                } finally {
                }
            }
            return c;
        }

        private static <S, U> b<S, U> c(String str) {
            fbp.a(str);
            String str2 = "__";
            if (str.startsWith("__")) {
                String str3 = " ystCcrpi anotkete pamrendoee ctennsa ac";
                throw new AssertionError("Cannot create key in protected namespace");
            } else if (!b.contains(str)) {
                b.add(str);
                return new b<>(str);
            } else {
                StringBuilder sb = new StringBuilder("Requesting same string for a key previously defined somewhere else: ");
                sb.append(str);
                throw new AssertionError(sb.toString());
            }
        }
    }

    public SpSharedPreferences(Context context, String str) {
        this.a = context.getSharedPreferences(str, 0);
    }

    public static <T> T a(T t, T t2, T[] tArr) {
        for (T equals : tArr) {
            if (t.equals(equals)) {
                return t;
            }
        }
        return t2;
    }

    private void g(b<S, ?> bVar) {
        if (!e(bVar)) {
            String str = "y ke";
            StringBuilder sb = new StringBuilder("key ");
            sb.append(bVar.a);
            sb.append(" has no value");
            throw new NoSuchElementException(sb.toString());
        }
    }

    public int a(b<S, Integer> bVar, int i) {
        return this.a.getInt(bVar.a, i);
    }

    public long a(b<S, Long> bVar, long j) {
        return this.a.getLong(bVar.a, j);
    }

    public a<S> a() {
        return new a<>(this.a.edit());
    }

    public String a(b<S, String> bVar, String str) {
        return this.a.getString(bVar.a, str);
    }

    public Set<String> a(b<S, Set<String>> bVar, Set<String> set) {
        Set stringSet = this.a.getStringSet(bVar.a, set);
        if (stringSet == null) {
            return null;
        }
        return Collections.unmodifiableSet(stringSet);
    }

    public final JSONArray a(b<S, JSONArray> bVar, JSONArray jSONArray) {
        String str = null;
        try {
            str = this.a.getString(bVar.a, null);
        } catch (ClassCastException unused) {
        }
        return str == null ? jSONArray : new JSONArray(str);
    }

    public boolean a(b<S, Boolean> bVar) {
        g(bVar);
        return a(bVar, false);
    }

    public boolean a(b<S, Boolean> bVar, boolean z) {
        return this.a.getBoolean(bVar.a, z);
    }

    public int b(b<S, Integer> bVar) {
        g(bVar);
        return a(bVar, 0);
    }

    public final String b(b<S, String> bVar, String str) {
        return (String) fbp.a(this.a.getString(bVar.a, str));
    }

    public String c(b<S, String> bVar) {
        g(bVar);
        return a(bVar, (String) null);
    }

    public final JSONObject d(b<S, JSONObject> bVar) {
        g(bVar);
        int i = 5 >> 0;
        return new JSONObject((String) fbp.a(this.a.getString(bVar.a, null)));
    }

    public final boolean e(b<S, ?> bVar) {
        return this.a.contains(bVar.a);
    }

    public final Observable<Update<Boolean>> f(b<S, Boolean> bVar) {
        return Observable.a((ObservableOnSubscribe<T>) new jyf<T>(this, bVar, $$Lambda$d5EelHM6djP3oP9On9gLdRFWZU4.INSTANCE));
    }
}
