package com.barunsw.ojt.yjkim.day11;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimerTask;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class TestTimerTask extends TimerTask {
	private static final Logger LOGGER = LogManager.getLogger(TestThread.class);
	
	private int id;
	
	private SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.KOREAN);
	
	public TestTimerTask() {
	}
	
	@Override
	public void run() {
		String currentTime = sdf.format(Calendar.getInstance().getTime());
		
		LOGGER.debug(String.format("Timer task started [%d]%s", id, currentTime));
		
		try {
			//20초
			Thread.sleep(20000);
		}
		catch (InterruptedException e) {
			LOGGER.error(e.getMessage(), e);
		}
		currentTime = sdf.format(Calendar.getInstance().getTime());
		
		LOGGER.debug(String.format("Timer task finished [%d]%s", id, currentTime));
	
	}
}
