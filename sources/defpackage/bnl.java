package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: bnl reason: default package */
public final class bnl extends bxf {
    public static final Creator<bnl> CREATOR = new brd();
    private static final String[] b = {null, "String", "int", "double", "ISO-8601 date String"};
    private static final a c = new a().a("com.google.android.gms.cast.metadata.CREATION_DATE", "creationDateTime", 4).a("com.google.android.gms.cast.metadata.RELEASE_DATE", "releaseDate", 4).a("com.google.android.gms.cast.metadata.BROADCAST_DATE", "originalAirdate", 4).a("com.google.android.gms.cast.metadata.TITLE", "title", 1).a("com.google.android.gms.cast.metadata.SUBTITLE", "subtitle", 1).a("com.google.android.gms.cast.metadata.ARTIST", "artist", 1).a("com.google.android.gms.cast.metadata.ALBUM_ARTIST", "albumArtist", 1).a("com.google.android.gms.cast.metadata.ALBUM_TITLE", "albumName", 1).a("com.google.android.gms.cast.metadata.COMPOSER", "composer", 1).a("com.google.android.gms.cast.metadata.DISC_NUMBER", "discNumber", 2).a("com.google.android.gms.cast.metadata.TRACK_NUMBER", "trackNumber", 2).a("com.google.android.gms.cast.metadata.SEASON_NUMBER", "season", 2).a("com.google.android.gms.cast.metadata.EPISODE_NUMBER", "episode", 2).a("com.google.android.gms.cast.metadata.SERIES_TITLE", "seriesTitle", 1).a("com.google.android.gms.cast.metadata.STUDIO", "studio", 1).a("com.google.android.gms.cast.metadata.WIDTH", "width", 2).a("com.google.android.gms.cast.metadata.HEIGHT", "height", 2).a("com.google.android.gms.cast.metadata.LOCATION_NAME", "location", 1).a("com.google.android.gms.cast.metadata.LOCATION_LATITUDE", "latitude", 3).a("com.google.android.gms.cast.metadata.LOCATION_LONGITUDE", "longitude", 3).a("com.google.android.gms.cast.metadata.SECTION_DURATION", "sectionDuration", 5).a("com.google.android.gms.cast.metadata.SECTION_START_TIME_IN_MEDIA", "sectionStartTimeInMedia", 5).a("com.google.android.gms.cast.metadata.SECTION_START_ABSOLUTE_TIME", "sectionStartAbsoluteTime", 5).a("com.google.android.gms.cast.metadata.SECTION_START_TIME_IN_CONTAINER", "sectionStartTimeInContainer", 5).a("com.google.android.gms.cast.metadata.QUEUE_ITEM_ID", "queueItemId", 2).a("com.google.android.gms.cast.metadata.BOOK_TITLE", "bookTitle", 1).a("com.google.android.gms.cast.metadata.CHAPTER_NUMBER", "chapterNumber", 2).a("com.google.android.gms.cast.metadata.CHAPTER_TITLE", "chapterTitle", 1);
    public final List<bwd> a;
    private final Bundle d;
    private int e;

    /* renamed from: bnl$a */
    static class a {
        private final Map<String, String> a = new HashMap();
        private final Map<String, String> b = new HashMap();
        private final Map<String, Integer> c = new HashMap();

        public final a a(String str, String str2, int i) {
            this.a.put(str, str2);
            this.b.put(str2, str);
            this.c.put(str, Integer.valueOf(i));
            return this;
        }

        public final String a(String str) {
            return (String) this.b.get(str);
        }

        public final int b(String str) {
            Integer num = (Integer) this.c.get(str);
            if (num != null) {
                return num.intValue();
            }
            return 0;
        }
    }

    bnl(List<bwd> list, Bundle bundle, int i) {
        this.a = list;
        this.d = bundle;
        this.e = i;
    }

    public bnl() {
        this(0);
    }

    public bnl(int i) {
        this(new ArrayList(), new Bundle(), i);
    }

    private void b() {
        this.d.clear();
        this.a.clear();
    }

    public final void a(JSONObject jSONObject) {
        JSONObject jSONObject2 = jSONObject;
        String str = "metadataType";
        b();
        this.e = 0;
        try {
            this.e = jSONObject2.getInt(str);
        } catch (JSONException unused) {
        }
        JSONArray optJSONArray = jSONObject2.optJSONArray("images");
        if (optJSONArray != null) {
            eie.a(this.a, optJSONArray);
        }
        ArrayList arrayList = new ArrayList();
        int i = this.e;
        String str2 = "com.google.android.gms.cast.metadata.RELEASE_DATE";
        String str3 = "com.google.android.gms.cast.metadata.SUBTITLE";
        String str4 = "com.google.android.gms.cast.metadata.ARTIST";
        String str5 = "com.google.android.gms.cast.metadata.TITLE";
        if (i == 0) {
            Collections.addAll(arrayList, new String[]{str5, str4, str3, str2});
        } else if (i == 1) {
            Collections.addAll(arrayList, new String[]{str5, "com.google.android.gms.cast.metadata.STUDIO", str3, str2});
        } else if (i == 2) {
            Collections.addAll(arrayList, new String[]{str5, "com.google.android.gms.cast.metadata.SERIES_TITLE", "com.google.android.gms.cast.metadata.SEASON_NUMBER", "com.google.android.gms.cast.metadata.EPISODE_NUMBER", "com.google.android.gms.cast.metadata.BROADCAST_DATE"});
        } else if (i == 3) {
            Collections.addAll(arrayList, new String[]{str5, "com.google.android.gms.cast.metadata.ALBUM_TITLE", str4, "com.google.android.gms.cast.metadata.ALBUM_ARTIST", "com.google.android.gms.cast.metadata.COMPOSER", "com.google.android.gms.cast.metadata.TRACK_NUMBER", "com.google.android.gms.cast.metadata.DISC_NUMBER", str2});
        } else if (i == 4) {
            Collections.addAll(arrayList, new String[]{str5, str4, "com.google.android.gms.cast.metadata.LOCATION_NAME", "com.google.android.gms.cast.metadata.LOCATION_LATITUDE", "com.google.android.gms.cast.metadata.LOCATION_LONGITUDE", "com.google.android.gms.cast.metadata.WIDTH", "com.google.android.gms.cast.metadata.HEIGHT", "com.google.android.gms.cast.metadata.CREATION_DATE"});
        } else if (i == 5) {
            Collections.addAll(arrayList, new String[]{"com.google.android.gms.cast.metadata.CHAPTER_TITLE", "com.google.android.gms.cast.metadata.CHAPTER_NUMBER", str5, "com.google.android.gms.cast.metadata.BOOK_TITLE", str3});
        }
        if (eht.b) {
            Collections.addAll(arrayList, new String[]{"com.google.android.gms.cast.metadata.SECTION_DURATION", "com.google.android.gms.cast.metadata.SECTION_START_TIME_IN_MEDIA", "com.google.android.gms.cast.metadata.SECTION_START_ABSOLUTE_TIME", "com.google.android.gms.cast.metadata.SECTION_START_TIME_IN_CONTAINER"});
        }
        Collections.addAll(arrayList, new String[]{"com.google.android.gms.cast.metadata.QUEUE_ITEM_ID"});
        HashSet hashSet = new HashSet(arrayList);
        try {
            Iterator keys = jSONObject.keys();
            while (keys.hasNext()) {
                String str6 = (String) keys.next();
                if (!str.equals(str6)) {
                    String a2 = c.a(str6);
                    if (a2 == null) {
                        Object obj = jSONObject2.get(str6);
                        if (obj instanceof String) {
                            this.d.putString(str6, (String) obj);
                        } else if (obj instanceof Integer) {
                            this.d.putInt(str6, ((Integer) obj).intValue());
                        } else if (obj instanceof Double) {
                            this.d.putDouble(str6, ((Double) obj).doubleValue());
                        }
                    } else if (hashSet.contains(a2)) {
                        try {
                            Object obj2 = jSONObject2.get(str6);
                            if (obj2 != null) {
                                int b2 = c.b(a2);
                                if (b2 != 1) {
                                    if (b2 != 2) {
                                        if (b2 == 3) {
                                            double optDouble = jSONObject2.optDouble(str6);
                                            if (!Double.isNaN(optDouble)) {
                                                this.d.putDouble(a2, optDouble);
                                            }
                                        } else if (b2 != 4) {
                                            if (b2 == 5) {
                                                Bundle bundle = this.d;
                                                double optLong = (double) jSONObject2.optLong(str6);
                                                Double.isNaN(optLong);
                                                bundle.putLong(a2, (long) (optLong * 1000.0d));
                                            }
                                        } else if ((obj2 instanceof String) && eie.a((String) obj2) != null) {
                                            this.d.putString(a2, (String) obj2);
                                        }
                                    } else if (obj2 instanceof Integer) {
                                        this.d.putInt(a2, ((Integer) obj2).intValue());
                                    }
                                } else if (obj2 instanceof String) {
                                    this.d.putString(a2, (String) obj2);
                                }
                            }
                        } catch (JSONException unused2) {
                        }
                    }
                }
            }
        } catch (JSONException unused3) {
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bnl)) {
            return false;
        }
        bnl bnl = (bnl) obj;
        return a(this.d, bnl.d) && this.a.equals(bnl.a);
    }

    public final int hashCode() {
        int i = 17;
        for (String str : this.d.keySet()) {
            i = (i * 31) + this.d.get(str).hashCode();
        }
        return (i * 31) + this.a.hashCode();
    }

    public final boolean a() {
        List<bwd> list = this.a;
        return list != null && !list.isEmpty();
    }

    private final boolean a(Bundle bundle, Bundle bundle2) {
        if (bundle.size() != bundle2.size()) {
            return false;
        }
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            Object obj2 = bundle2.get(str);
            if ((obj instanceof Bundle) && (obj2 instanceof Bundle) && !a((Bundle) obj, (Bundle) obj2)) {
                return false;
            }
            if (obj == null) {
                if (obj2 != null || !bundle2.containsKey(str)) {
                    return false;
                }
            } else if (!obj.equals(obj2)) {
                return false;
            }
        }
        return true;
    }

    public final String a(String str) {
        if (!TextUtils.isEmpty(str)) {
            int b2 = c.b(str);
            if (b2 == 1 || b2 == 0) {
                return this.d.getString(str);
            }
            String str2 = b[1];
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 21 + String.valueOf(str2).length());
            sb.append("Value for ");
            sb.append(str);
            sb.append(" must be a ");
            sb.append(str2);
            throw new IllegalArgumentException(sb.toString());
        }
        throw new IllegalArgumentException("null and empty keys are not allowed");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = bxg.a(parcel, 20293);
        bxg.b(parcel, 2, this.a, false);
        bxg.a(parcel, 3, this.d, false);
        bxg.b(parcel, 4, this.e);
        bxg.b(parcel, a2);
    }
}
