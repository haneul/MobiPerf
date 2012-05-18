package com.mobiperf.speedometer;

import android.util.Log;

public class AndroidLogger implements LoggerInterface{
	private static boolean LOGGING_ENABLED = true;
	private final static String TAG = "MobiPerf";
	
	public  void d(String msg) {
		if (LOGGING_ENABLED) {
			Log.d(TAG, msg);
		}
	}

	public  void d(String msg, Throwable t) {
		if (LOGGING_ENABLED) {
			Log.d(TAG, msg, t);
		}
	}

	public  void e(String msg) {
		if (LOGGING_ENABLED) {
			Log.e(TAG, msg);
		}
	}

	public  void e(String msg, Throwable t) {
		if (LOGGING_ENABLED) {
			Log.e(TAG, msg, t);
		}
	}

	public  void i(String msg) {
		if (LOGGING_ENABLED) {
			Log.i(TAG, msg);
		}
	}

	public  void i(String msg, Throwable t) {
		if (LOGGING_ENABLED) {
			Log.i(TAG, msg, t);
		}
	}

	public  void v(String msg) {
		if (LOGGING_ENABLED) {
			Log.v(TAG, msg);
		}
	}

	public  void v(String msg, Throwable t) {
		if (LOGGING_ENABLED) {
			Log.v(TAG, msg, t);
		}
	}

	public  void w(String msg) {
		if (LOGGING_ENABLED) {
			Log.w(TAG, msg);
		}
	}

	public  void w(String msg, Throwable t) {
		if (LOGGING_ENABLED) {
			Log.w(TAG, msg, t);
		}
	}
}
