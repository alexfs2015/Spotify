package com.spotify.music.builtinauth.model;

import com.spotify.mobile.android.util.Assertion;

public class FieldValidator {

    public static class ValidationException extends Exception {
        private static final long serialVersionUID = 0;

        public ValidationException(String str) {
            super(str);
        }

        public ValidationException(String str, Throwable th) {
            super(str, th);
        }
    }

    public static void a(int i, int i2, int i3, String str) {
        if (i3 < i || i3 > i2) {
            StringBuilder sb = new StringBuilder("\"");
            sb.append(str);
            sb.append("\" ");
            sb.append(i3);
            sb.append(" is not within range ");
            sb.append(i);
            sb.append(" to ");
            sb.append(i2);
            throw new ValidationException(sb.toString());
        }
    }

    public static void a(Object obj, Object obj2, String str) {
        if (!obj.equals(obj2)) {
            StringBuilder sb = new StringBuilder("Expected \"");
            sb.append(str);
            sb.append("\" to be ");
            sb.append(obj);
            sb.append(", but was ");
            sb.append(obj2);
            throw new ValidationException(sb.toString());
        }
    }

    public static void a(Object obj, String str) {
        if (obj == null) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(" can't be null");
            throw new ValidationException(sb.toString());
        }
    }

    public static void a(Object obj, String str, String str2) {
        String str3 = " Error validating ";
        String str4 = "\" has no value for key \"";
        String str5 = "\"";
        try {
            try {
                if (obj.getClass().getField(str).get(obj) == null) {
                    StringBuilder sb = new StringBuilder(str5);
                    sb.append(str2);
                    sb.append(str4);
                    sb.append(str);
                    sb.append('\"');
                    throw new ValidationException(sb.toString());
                }
            } catch (IllegalAccessException e) {
                StringBuilder sb2 = new StringBuilder(str3);
                sb2.append(str2);
                Assertion.b(sb2.toString());
                StringBuilder sb3 = new StringBuilder(str5);
                sb3.append(str2);
                sb3.append(str4);
                sb3.append(str);
                sb3.append('\"');
                throw new ValidationException(sb3.toString(), e);
            }
        } catch (NoSuchFieldException e2) {
            StringBuilder sb4 = new StringBuilder(str3);
            sb4.append(str2);
            Assertion.b(sb4.toString());
            StringBuilder sb5 = new StringBuilder(str5);
            sb5.append(str2);
            sb5.append(str4);
            sb5.append(str);
            sb5.append('\"');
            throw new ValidationException(sb5.toString(), e2);
        }
    }

    public static void a(String str, String str2) {
        if (fbo.a(str)) {
            StringBuilder sb = new StringBuilder("\"");
            sb.append(str2);
            sb.append("\" can not be empty");
            throw new ValidationException(sb.toString());
        }
    }

    public static void a(String[] strArr, String str) {
        if (strArr == null || strArr.length == 0) {
            StringBuilder sb = new StringBuilder("\"");
            sb.append(str);
            sb.append("\" can not be empty");
            throw new ValidationException(sb.toString());
        }
    }
}
