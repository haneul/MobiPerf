package com.mobiperf.speedometer;

import android.util.Log;

public interface LoggerInterface {
	public void d(String msg);
	public void d(String msg, Throwable t);
	public void e(String msg);
	public  void e(String msg, Throwable t) ;
	public  void i(String msg) ;
	public  void i(String msg, Throwable t);
	public  void v(String msg) ;
	public  void v(String msg, Throwable t) ;
	public  void w(String msg) ;
	public  void w(String msg, Throwable t) ;
}
