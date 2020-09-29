package defpackage;

import android.database.Cursor;
import android.os.Build.VERSION;
import com.moat.analytics.mobile.MoatAdEvent;
import com.spotify.music.lyrics.model.TrackLyrics;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/* renamed from: po reason: default package */
public final class po {
    private String a;
    private Map<String, a> b;
    private Set<b> c;
    private Set<d> d;

    /* renamed from: po$a */
    public static class a {
        private String a;
        private String b;
        private int c;
        private boolean d;
        private int e;

        public a(String str, String str2, boolean z, int i) {
            this.a = str;
            this.b = str2;
            this.d = z;
            this.e = i;
            int i2 = 5;
            if (str2 != null) {
                String upperCase = str2.toUpperCase(Locale.US);
                if (upperCase.contains("INT")) {
                    i2 = 3;
                } else if (upperCase.contains("CHAR") || upperCase.contains("CLOB") || upperCase.contains(TrackLyrics.KIND_TEXT)) {
                    i2 = 2;
                } else if (!upperCase.contains("BLOB")) {
                    i2 = (upperCase.contains("REAL") || upperCase.contains("FLOA") || upperCase.contains("DOUB")) ? 4 : 1;
                }
            }
            this.c = i2;
        }

        private boolean a() {
            return this.e > 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && getClass() == obj.getClass()) {
                a aVar = (a) obj;
                if (VERSION.SDK_INT >= 20) {
                    if (this.e != aVar.e) {
                        return false;
                    }
                } else if (a() != aVar.a()) {
                    return false;
                }
                if (this.a.equals(aVar.a) && this.d == aVar.d && this.c == aVar.c) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return (((((this.a.hashCode() * 31) + this.c) * 31) + (this.d ? 1231 : 1237)) * 31) + this.e;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Column{name='");
            sb.append(this.a);
            sb.append('\'');
            sb.append(", type='");
            sb.append(this.b);
            sb.append('\'');
            sb.append(", affinity='");
            sb.append(this.c);
            sb.append('\'');
            sb.append(", notNull=");
            sb.append(this.d);
            sb.append(", primaryKeyPosition=");
            sb.append(this.e);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: po$b */
    public static class b {
        private String a;
        private String b;
        private String c;
        private List<String> d;
        private List<String> e;

        public b(String str, String str2, String str3, List<String> list, List<String> list2) {
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = Collections.unmodifiableList(list);
            this.e = Collections.unmodifiableList(list2);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            if (this.a.equals(bVar.a) && this.b.equals(bVar.b) && this.c.equals(bVar.c) && this.d.equals(bVar.d)) {
                return this.e.equals(bVar.e);
            }
            return false;
        }

        public final int hashCode() {
            return (((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ForeignKey{referenceTable='");
            sb.append(this.a);
            sb.append('\'');
            sb.append(", onDelete='");
            sb.append(this.b);
            sb.append('\'');
            sb.append(", onUpdate='");
            sb.append(this.c);
            sb.append('\'');
            sb.append(", columnNames=");
            sb.append(this.d);
            sb.append(", referenceColumnNames=");
            sb.append(this.e);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: po$c */
    static class c implements Comparable<c> {
        final int a;
        final String b;
        final String c;
        private int d;

        c(int i, int i2, String str, String str2) {
            this.a = i;
            this.d = i2;
            this.b = str;
            this.c = str2;
        }

        public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
            c cVar = (c) obj;
            int i = this.a - cVar.a;
            return i == 0 ? this.d - cVar.d : i;
        }
    }

    /* renamed from: po$d */
    public static class d {
        private String a;
        private boolean b;
        private List<String> c;

        public d(String str, boolean z, List<String> list) {
            this.a = str;
            this.b = z;
            this.c = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            d dVar = (d) obj;
            if (this.b != dVar.b || !this.c.equals(dVar.c)) {
                return false;
            }
            String str = "index_";
            return this.a.startsWith(str) ? dVar.a.startsWith(str) : this.a.equals(dVar.a);
        }

        public final int hashCode() {
            String str = "index_";
            return ((((this.a.startsWith(str) ? str.hashCode() : this.a.hashCode()) * 31) + (this.b ? 1 : 0)) * 31) + this.c.hashCode();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Index{name='");
            sb.append(this.a);
            sb.append('\'');
            sb.append(", unique=");
            sb.append(this.b);
            sb.append(", columns=");
            sb.append(this.c);
            sb.append('}');
            return sb.toString();
        }
    }

    public po(String str, Map<String, a> map, Set<b> set, Set<d> set2) {
        this.a = str;
        this.b = Collections.unmodifiableMap(map);
        this.c = Collections.unmodifiableSet(set);
        this.d = set2 == null ? null : Collections.unmodifiableSet(set2);
    }

    private static List<c> a(Cursor cursor) {
        int columnIndex = cursor.getColumnIndex("id");
        int columnIndex2 = cursor.getColumnIndex("seq");
        int columnIndex3 = cursor.getColumnIndex("from");
        int columnIndex4 = cursor.getColumnIndex("to");
        int count = cursor.getCount();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < count; i++) {
            cursor.moveToPosition(i);
            arrayList.add(new c(cursor.getInt(columnIndex), cursor.getInt(columnIndex2), cursor.getString(columnIndex3), cursor.getString(columnIndex4)));
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    /* JADX INFO: finally extract failed */
    private static d a(pt ptVar, String str, boolean z) {
        StringBuilder sb = new StringBuilder("PRAGMA index_xinfo(`");
        sb.append(str);
        sb.append("`)");
        Cursor b2 = ptVar.b(sb.toString());
        try {
            int columnIndex = b2.getColumnIndex("seqno");
            int columnIndex2 = b2.getColumnIndex("cid");
            int columnIndex3 = b2.getColumnIndex("name");
            if (!(columnIndex == -1 || columnIndex2 == -1)) {
                if (columnIndex3 != -1) {
                    TreeMap treeMap = new TreeMap();
                    while (b2.moveToNext()) {
                        if (b2.getInt(columnIndex2) >= 0) {
                            int i = b2.getInt(columnIndex);
                            treeMap.put(Integer.valueOf(i), b2.getString(columnIndex3));
                        }
                    }
                    ArrayList arrayList = new ArrayList(treeMap.size());
                    arrayList.addAll(treeMap.values());
                    d dVar = new d(str, z, arrayList);
                    b2.close();
                    return dVar;
                }
            }
            b2.close();
            return null;
        } catch (Throwable th) {
            b2.close();
            throw th;
        }
    }

    public static po a(pt ptVar, String str) {
        return new po(str, c(ptVar, str), b(ptVar, str), d(ptVar, str));
    }

    private static Set<b> b(pt ptVar, String str) {
        HashSet hashSet = new HashSet();
        StringBuilder sb = new StringBuilder("PRAGMA foreign_key_list(`");
        sb.append(str);
        sb.append("`)");
        Cursor b2 = ptVar.b(sb.toString());
        try {
            int columnIndex = b2.getColumnIndex("id");
            int columnIndex2 = b2.getColumnIndex("seq");
            int columnIndex3 = b2.getColumnIndex("table");
            int columnIndex4 = b2.getColumnIndex("on_delete");
            int columnIndex5 = b2.getColumnIndex("on_update");
            List<c> a2 = a(b2);
            int count = b2.getCount();
            for (int i = 0; i < count; i++) {
                b2.moveToPosition(i);
                if (b2.getInt(columnIndex2) == 0) {
                    int i2 = b2.getInt(columnIndex);
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    for (c cVar : a2) {
                        if (cVar.a == i2) {
                            arrayList.add(cVar.b);
                            arrayList2.add(cVar.c);
                        }
                    }
                    b bVar = new b(b2.getString(columnIndex3), b2.getString(columnIndex4), b2.getString(columnIndex5), arrayList, arrayList2);
                    hashSet.add(bVar);
                }
            }
            return hashSet;
        } finally {
            b2.close();
        }
    }

    private static Map<String, a> c(pt ptVar, String str) {
        StringBuilder sb = new StringBuilder("PRAGMA table_info(`");
        sb.append(str);
        sb.append("`)");
        Cursor b2 = ptVar.b(sb.toString());
        HashMap hashMap = new HashMap();
        try {
            if (b2.getColumnCount() > 0) {
                int columnIndex = b2.getColumnIndex("name");
                int columnIndex2 = b2.getColumnIndex(MoatAdEvent.EVENT_TYPE);
                int columnIndex3 = b2.getColumnIndex("notnull");
                int columnIndex4 = b2.getColumnIndex("pk");
                while (b2.moveToNext()) {
                    String string = b2.getString(columnIndex);
                    hashMap.put(string, new a(string, b2.getString(columnIndex2), b2.getInt(columnIndex3) != 0, b2.getInt(columnIndex4)));
                }
            }
            return hashMap;
        } finally {
            b2.close();
        }
    }

    private static Set<d> d(pt ptVar, String str) {
        StringBuilder sb = new StringBuilder("PRAGMA index_list(`");
        sb.append(str);
        sb.append("`)");
        Cursor b2 = ptVar.b(sb.toString());
        try {
            int columnIndex = b2.getColumnIndex("name");
            int columnIndex2 = b2.getColumnIndex("origin");
            int columnIndex3 = b2.getColumnIndex("unique");
            if (!(columnIndex == -1 || columnIndex2 == -1)) {
                if (columnIndex3 != -1) {
                    HashSet hashSet = new HashSet();
                    while (b2.moveToNext()) {
                        if ("c".equals(b2.getString(columnIndex2))) {
                            String string = b2.getString(columnIndex);
                            boolean z = true;
                            if (b2.getInt(columnIndex3) != 1) {
                                z = false;
                            }
                            d a2 = a(ptVar, string, z);
                            if (a2 == null) {
                                b2.close();
                                return null;
                            }
                            hashSet.add(a2);
                        }
                    }
                    b2.close();
                    return hashSet;
                }
            }
            return null;
        } finally {
            b2.close();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        po poVar = (po) obj;
        String str = this.a;
        if (str == null ? poVar.a != null : !str.equals(poVar.a)) {
            return false;
        }
        Map<String, a> map = this.b;
        if (map == null ? poVar.b != null : !map.equals(poVar.b)) {
            return false;
        }
        Set<b> set = this.c;
        if (set == null ? poVar.c != null : !set.equals(poVar.c)) {
            return false;
        }
        Set<d> set2 = this.d;
        if (set2 != null) {
            Set<d> set3 = poVar.d;
            if (set3 != null) {
                return set2.equals(set3);
            }
        }
        return true;
    }

    public final int hashCode() {
        String str = this.a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        Map<String, a> map = this.b;
        int hashCode2 = (hashCode + (map != null ? map.hashCode() : 0)) * 31;
        Set<b> set = this.c;
        if (set != null) {
            i = set.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TableInfo{name='");
        sb.append(this.a);
        sb.append('\'');
        sb.append(", columns=");
        sb.append(this.b);
        sb.append(", foreignKeys=");
        sb.append(this.c);
        sb.append(", indices=");
        sb.append(this.d);
        sb.append('}');
        return sb.toString();
    }
}
