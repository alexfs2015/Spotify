package com.google.ads.mediation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

@Deprecated
public class MediationServerParameters {

    public static final class MappingException extends Exception {
        public MappingException(String str) {
            super(str);
        }
    }

    @Target({ElementType.FIELD})
    @Retention(RetentionPolicy.RUNTIME)
    public @interface a {
        String a();

        boolean b() default true;
    }

    public final void a(Map<String, String> map) {
        Field[] fields;
        String str = "Server option \"";
        HashMap hashMap = new HashMap();
        for (Field field : getClass().getFields()) {
            a aVar = (a) field.getAnnotation(a.class);
            if (aVar != null) {
                hashMap.put(aVar.a(), field);
            }
        }
        if (hashMap.isEmpty()) {
            cow.a(5);
        }
        for (Entry entry : map.entrySet()) {
            Field field2 = (Field) hashMap.remove(entry.getKey());
            if (field2 != null) {
                try {
                    field2.set(this, entry.getValue());
                } catch (IllegalAccessException unused) {
                    String str2 = (String) entry.getKey();
                    StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 49);
                    sb.append(str);
                    sb.append(str2);
                    sb.append("\" could not be set: Illegal Access");
                    sb.toString();
                    cow.a(5);
                } catch (IllegalArgumentException unused2) {
                    String str3 = (String) entry.getKey();
                    StringBuilder sb2 = new StringBuilder(String.valueOf(str3).length() + 43);
                    sb2.append(str);
                    sb2.append(str3);
                    sb2.append("\" could not be set: Bad Type");
                    sb2.toString();
                    cow.a(5);
                }
            } else {
                String str4 = (String) entry.getKey();
                String str5 = (String) entry.getValue();
                StringBuilder sb3 = new StringBuilder(String.valueOf(str4).length() + 31 + String.valueOf(str5).length());
                sb3.append("Unexpected server option: ");
                sb3.append(str4);
                sb3.append(" = \"");
                sb3.append(str5);
                sb3.append("\"");
                sb3.toString();
                cow.a(3);
            }
        }
        StringBuilder sb4 = new StringBuilder();
        for (Field field3 : hashMap.values()) {
            if (((a) field3.getAnnotation(a.class)).b()) {
                String str6 = "Required server option missing: ";
                String valueOf = String.valueOf(((a) field3.getAnnotation(a.class)).a());
                if (valueOf.length() != 0) {
                    str6.concat(valueOf);
                } else {
                    new String(str6);
                }
                cow.a(5);
                if (sb4.length() > 0) {
                    sb4.append(", ");
                }
                sb4.append(((a) field3.getAnnotation(a.class)).a());
            }
        }
        if (sb4.length() > 0) {
            String str7 = "Required server option(s) missing: ";
            String valueOf2 = String.valueOf(sb4.toString());
            throw new MappingException(valueOf2.length() != 0 ? str7.concat(valueOf2) : new String(str7));
        }
    }
}
