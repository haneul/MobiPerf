package com.mobiperf.speedometer;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.text.DateFormat;
import java.util.Date;

import com.mobiperf.util.PhoneUtils;

import android.content.Context;

public class FileLogger implements LoggerInterface {

	File logFile = null;
	
	FileLogger() {
	}
    	
    private void writeString(String level, String msg)
    {
    	if(logFile == null)
    	{
    		Context ctx = PhoneUtils.getGlobalContext();
    		if(ctx != null) {
	    		File root = ctx.getDir("logs", Context.MODE_PRIVATE);	
	    		//File root = Environment.getExternalStorageDirectory();
	    		logFile = new File(root, "log.txt");
    		}
    		else
    		{
    			logFile = new File("/data/data/edu.uw.mobiperfuw/app_logs/log.txt");
    		}
    	}
    	try {
            FileWriter logWriter = new FileWriter(logFile, true);
            BufferedWriter out = new BufferedWriter(logWriter);
            String currentDateTimeString = DateFormat.getDateTimeInstance().format(new Date());
            out.write("["+currentDateTimeString+"]\t"+level + "\t" + msg + "\n");
            out.close();
            logWriter.close();
    	}
    	catch(Exception e)
    	{
    		
    	}
    }
    	
    
	


	@Override
	public void d(String msg) {
		// TODO Auto-generated method stub
		writeString("D", msg);
	}

	@Override
	public void d(String msg, Throwable t) {
		// TODO Auto-generated method stub
		writeString("D", msg);
	}

	@Override
	public void e(String msg) {
		// TODO Auto-generated method stub
		writeString("E", msg);
	}

	@Override
	public void e(String msg, Throwable t) {
		// TODO Auto-generated method stub
		writeString("E", msg);
	}

	@Override
	public void i(String msg) {
		// TODO Auto-generated method stub
		writeString("I", msg);
	}

	@Override
	public void i(String msg, Throwable t) {
		// TODO Auto-generated method stub
		writeString("I", msg);

	}

	@Override
	public void v(String msg) {
		// TODO Auto-generated method stub
		writeString("V", msg);

	}

	@Override
	public void v(String msg, Throwable t) {
		// TODO Auto-generated method stub
		writeString("V", msg);

	}

	@Override
	public void w(String msg) {
		// TODO Auto-generated method stub
		writeString("W", msg);

	}

	@Override
	public void w(String msg, Throwable t) {
		// TODO Auto-generated method stub
		writeString("W", msg);

	}

}
