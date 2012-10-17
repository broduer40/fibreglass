package org.fibreglass.utils;

public class Log {
	public static void error(String message) {
		android.util.Log.e("FibreglassError", message);
	}
	
	public static void debug(String message) {
		android.util.Log.d("FibreglassDebug", message);
	}
	
	public static void warning(String message) {
		android.util.Log.w("FibreglassWarning", message);
	}
	
	public static void info(String message) {
		android.util.Log.i("FibreglassInfo", message);
	}
}
